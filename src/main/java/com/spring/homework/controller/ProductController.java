package com.spring.homework.controller;

import com.spring.homework.domain.Company;
import com.spring.homework.domain.Product;
import com.spring.homework.service.CompanyService;
import com.spring.homework.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


@Controller
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;
    private final CompanyService companyService;

    @RequestMapping(value = {"/show_product"})
    public String showProduct(Model model) {
        model.addAttribute("products", productService.getAllProduct());
        model.addAttribute("companies", companyService.getAllCompany());
        return "show_product";
    }

    @RequestMapping("/add_product")
    public String newProductForm(Model model) {
        Product product = new Product();
        model.addAttribute("product", product);
        model.addAttribute("companies", companyService.getAllCompany());
        return "add_product";
    }

    @RequestMapping("/edit_product")
    public String editProductForm(@RequestParam long id, Model model) {
        Product product = productService.getProduct(id);
        model.addAttribute("product", product);
        model.addAttribute("companies", companyService.getAllCompany());
        return "edit_product";
    }

    @RequestMapping("/delete_product")
    public String deleteProductForm(@RequestParam long id) {
        productService.deleteProduct(id);
        return "redirect:/api/product/show_product";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveProduct(@ModelAttribute("product") Product product) {
        productService.updateProduct(product);
        return "redirect:/api/product/show_product";
    }

//    @ModelAttribute("allCompany")
//    public List<Company> allCompany() {
//        List<Company> companyList= companyService.getAllCompany();
//        return companyList;
//    }

}
