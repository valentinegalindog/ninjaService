package com.konoha.ninja.model;

import lombok.Data;
import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "ninjas")
public class Ninja {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Rank rank;

    private Integer attack;
    private Integer defense;
    private Integer chakra;

    private Long villageId;

    @ElementCollection
    @CollectionTable(name = "ninja_jutsus", joinColumns = @JoinColumn(name = "ninja_id"))
    private List<String> jutsus;

    public Ninja() {}

    public Ninja(String name, Rank rank, Integer attack, Integer defense, Integer chakra, Long villageId) {
        this.name = name;
        this.rank = rank;
        this.attack = attack;
        this.defense = defense;
        this.chakra = chakra;
        this.villageId = villageId;
    }
}