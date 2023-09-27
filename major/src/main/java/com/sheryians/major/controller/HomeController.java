package com.sheryians.major.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.sheryians.major.global.GlobalData;
import com.sheryians.major.service.CategoryService;
import com.sheryians.major.service.ProductService;

@Controller
public class HomeController {
    @Autowired
    CategoryService categoryService;
    @Autowired
    ProductService productService;
    //home page
    @GetMapping({"/","/home"})
    public String home(Model model){
         //cartCount below line
         model.addAttribute("cartCount", GlobalData.cart.size());
         return "index";
    }
     //shop page 
    @GetMapping("/shop")
    public String shop(Model model){
        model.addAttribute("categories",categoryService.getAllCategory());
        model.addAttribute("products", productService.getAllProduct());
        model.addAttribute("cartCount", GlobalData.cart.size());
        return "shop";
    }
     //category vise products
     @GetMapping("/shop/category/{id}")
     public String shopByCategory(Model model, @PathVariable int id){
        model.addAttribute("categories",categoryService.getAllCategory());
        model.addAttribute("products", productService.getAllProductsByCategoryId(id));
        model.addAttribute("cartCount", GlobalData.cart.size());
        return "shop";
    } 

    //view all product information
     @GetMapping("/shop/viewproduct/{id}")
     public String viewProduct(Model model, @PathVariable int id){
        model.addAttribute("product",productService.getProductById(id).get());
        model.addAttribute("cartCount", GlobalData.cart.size());
        
        return "viewProduct";
    }

    // About Page
    @GetMapping("/about")
    public String about(Model model){
         //cartCount below line
        //  model.addAttribute("cartCount", GlobalData.cart.size());
         return "about";
    }

    // Contact Page
    @GetMapping("/contact")
    public String contact(Model model){
         //cartCount below line
        //  model.addAttribute("cartCount", GlobalData.cart.size());
         return "contact";
    }
     
 
}
