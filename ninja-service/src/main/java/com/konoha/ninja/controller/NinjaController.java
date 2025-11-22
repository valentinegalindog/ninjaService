package com.konoha.ninja.controller;

import com.konoha.ninja.model.Ninja;
import com.konoha.ninja.model.Rank;
import com.konoha.ninja.service.NinjaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    @Autowired
    private NinjaService ninjaService;

    @GetMapping
    public List<Ninja> getAllNinjas() {
        return ninjaService.findAll();
    }

    @GetMapping("/{id}")
    public Ninja getNinjaById(@PathVariable Long id) {
        return ninjaService.findById(id);
    }

    @PostMapping
    public Ninja createNinja(@RequestBody Ninja ninja) {
        return ninjaService.save(ninja);
    }

    @PutMapping("/{id}")
    public Ninja updateNinja(@PathVariable Long id, @RequestBody Ninja ninja) {
        return ninjaService.update(id, ninja);
    }

    @DeleteMapping("/{id}")
    public void deleteNinja(@PathVariable Long id) {
        ninjaService.delete(id);
    }

    @GetMapping("/rank/{rank}")
    public List<Ninja> getNinjasByRank(@PathVariable Rank rank) {
        return ninjaService.findByRank(rank);
    }

    @GetMapping("/village/{villageId}")
    public List<Ninja> getNinjasByVillage(@PathVariable Long villageId) {
        return ninjaService.findByVillageId(villageId);
    }
}