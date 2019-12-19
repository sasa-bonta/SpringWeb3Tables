package com.bike.demo.Bike;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bike")
public class BikeWebShop {
    @Autowired
    public BikeRepository bikeRepository;

    @GetMapping
    public List<Bike> findAll(){
        return bikeRepository.findAll();
    }

    @GetMapping("/{id}")
    public Bike findById(@PathVariable long id){
        return bikeRepository.findById(id);
    }

    @PostMapping
    public void save(@RequestBody Bike bike) {
        bikeRepository.save(bike);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable long id, @RequestBody Bike bike) {
        bikeRepository.update(id, bike);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        bikeRepository.delete(id);
    }
}
