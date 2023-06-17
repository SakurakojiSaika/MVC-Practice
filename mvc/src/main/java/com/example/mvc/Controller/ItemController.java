package com.example.mvc.Controller;
import com.example.mvc.Entity.Product;
import org.springframework.web.bind.annotation.*;

@RestController
public class ItemController {
    @GetMapping("product/{id}")
    public Product GetProduct(@PathVariable int id, @RequestParam("name") String name) {
        Product product = new Product();
        product.setId(id);
        product.setName("Helloworld");
        return product;
    }

    @PostMapping("products")
    public Product CreateProduct(@RequestBody Product product) {
        product.setName("returned"+product.getName());
        return product;
    }
}
