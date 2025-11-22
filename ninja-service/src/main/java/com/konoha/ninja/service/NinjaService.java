package com.konoha.ninja.service;

import com.konoha.ninja.model.Ninja;
import com.konoha.ninja.model.Rank;
import com.konoha.ninja.repository.NinjaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class NinjaService {

    @Autowired
    private NinjaRepository ninjaRepository;

    public List<Ninja> findAll() {
        return ninjaRepository.findAll();
    }

    public Ninja findById(Long id) {
        return ninjaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Ninja no encontrado con ID: " + id));
    }

    public Ninja save(Ninja ninja) {
        return ninjaRepository.save(ninja);
    }

    public Ninja update(Long id, Ninja ninjaDetails) {
        Ninja ninja = findById(id);
        ninja.setName(ninjaDetails.getName());
        ninja.setRank(ninjaDetails.getRank());
        ninja.setAttack(ninjaDetails.getAttack());
        ninja.setDefense(ninjaDetails.getDefense());
        ninja.setChakra(ninjaDetails.getChakra());
        ninja.setVillageId(ninjaDetails.getVillageId());
        ninja.setJutsus(ninjaDetails.getJutsus());
        return ninjaRepository.save(ninja);
    }

    public void delete(Long id) {
        ninjaRepository.deleteById(id);
    }

    public List<Ninja> findByRank(Rank rank) {
        return ninjaRepository.findByRank(rank);
    }

    public List<Ninja> findByVillageId(Long villageId) {
        return ninjaRepository.findByVillageId(villageId);
    }
}