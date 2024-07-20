package com.enterprise.Controller;

import com.enterprise.Model.Enterprise;
import com.enterprise.Service.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/enterprise")
public class EnterpriseController {
    @Autowired
    EnterpriseService enterpriseService;

    @PostMapping("/add")
    public ResponseEntity<Enterprise> saveEnterprise(@RequestBody Enterprise enterprise){
        return ResponseEntity.accepted().body(enterpriseService.save(enterprise));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Enterprise>> findEnterprise(@PathVariable("id") int id){
        return ResponseEntity.accepted().body(enterpriseService.findById(id));
    }
    @GetMapping("/all")
    public ResponseEntity<List<Enterprise>> findAllEnterprise(){
        return ResponseEntity.accepted().body(enterpriseService.findAll());
    }
    @DeleteMapping("/delete/{id}")
    public void deleteEnterprise(@PathVariable("id") int id){
        enterpriseService.deleteById(id);
    }
}
