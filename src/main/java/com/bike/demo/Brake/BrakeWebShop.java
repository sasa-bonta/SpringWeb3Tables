package com.bike.demo.Brake;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/brake")
public class BrakeWebShop {
    @Autowired
    public BrakeRepository brakeRepository;

    @GetMapping
    public List<Brake> findAllBrakes(){
        return brakeRepository.findAllBrakes();
    }

    @GetMapping("/{id}")
    public Brake findBrakesById(@PathVariable long id){
        return brakeRepository.findBrakesById(id);
    }

    @PostMapping
    public void save(@RequestBody Brake brake) {
        brakeRepository.save(brake);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable long id, @RequestBody Brake brake) {
        brakeRepository.update(id, brake);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        brakeRepository.delete(id);
    }
}
