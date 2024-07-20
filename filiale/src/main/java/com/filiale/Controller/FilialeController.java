package com.filiale.Controller;

import com.filiale.Model.FilialeModel;
import com.filiale.Service.FilialeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/filiale")
public class FilialeController {
    @Autowired
    FilialeService filialeService;

    @PostMapping("/add")
    public ResponseEntity<FilialeModel> saveFiliale(@RequestBody FilialeModel filiale){
        return ResponseEntity.accepted().body(filialeService.save(filiale));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<FilialeModel>> findFiliale(@PathVariable("id") int id){
        return ResponseEntity.accepted().body(filialeService.findById(id));
    }
    @GetMapping("/all")
    public ResponseEntity<List<FilialeModel>> findAllFiliales(){
        return ResponseEntity.accepted().body(filialeService.findAll());
    }
    @DeleteMapping("/delete/{id}")
    public void deleteFiliale(@PathVariable("id") int id){
        filialeService.deleteById(id);
    }
}
