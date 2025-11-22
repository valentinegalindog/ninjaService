package com.konoha.ninja.repository;

import com.konoha.ninja.model.Ninja;
import com.konoha.ninja.model.Rank;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface NinjaRepository extends JpaRepository<Ninja, Long> {
    List<Ninja> findByRank(Rank rank);
    List<Ninja> findByVillageId(Long villageId);
}