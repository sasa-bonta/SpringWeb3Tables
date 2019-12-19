package com.bike.demo.Groupset;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/groupset")
public class GroupsetWebShop {
    @Autowired
    public GroupsetRepository groupsetRepository;

    @GetMapping("")
    public List<Groupset> findAllGroupset(){
        return groupsetRepository.findAllGroupset();
    }

    @GetMapping("/{id}")
    public Groupset findGroupsetById(@PathVariable long id){
        return groupsetRepository.findGroupsetById(id);
    }

    @PostMapping
    public void save(@RequestBody Groupset groupset) {
        groupsetRepository.save(groupset);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable long id, @RequestBody Groupset groupset) {
        groupsetRepository.update(id, groupset);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        groupsetRepository.delete(id);
    }
}
