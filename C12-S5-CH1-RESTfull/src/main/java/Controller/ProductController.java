package Controller;

import Domain.Product;
import Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product/v1")
public class ProductController {
    ProductService productService;
    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @PostMapping("/product")
    public ResponseEntity<?> saveProduct(@RequestBody Product product){
        return new ResponseEntity<>(productService.addProduct(product), HttpStatus.CREATED);
    }
    @GetMapping("/product")
    public ResponseEntity<?> getProduct(){
        return new ResponseEntity<>(productService.getAllProduct(),HttpStatus.CREATED);
    }
}
