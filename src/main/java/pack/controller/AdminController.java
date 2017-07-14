package pack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import pack.entity.Order;
import pack.entity.Product;
import pack.service.ProductService;
//import pack.service.editors.OrderEditor;

/**
 * Created by Artem on 12.07.2017.
 */
@Controller
@RequestMapping("/admin/")
public class AdminController {


    @Autowired
    ProductService productService;

//    @Autowired
//    OrderEditor orderEditor;

    @GetMapping("/")
    public String adminIndex(){
        return "index";
    }

    @RequestMapping("admin_page")
    public String adminPage(Model model){
        model.addAttribute("product", new Product());
        return "adminPage";
    }


//    @PostMapping("saveProduct")
//    public String saveProduct(@ModelAttribute("product")Product product){
//        productService.save(product);
//        return "redirect:/";
//    }
//
//    @InitBinder("product")
//    public void binder(WebDataBinder webDataBinder) {
//        webDataBinder.registerCustomEditor(Order.class, orderEditor);
//    }

}
