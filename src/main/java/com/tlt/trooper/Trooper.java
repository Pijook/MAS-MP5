package com.tlt.trooper;

import lombok.Data;

@Data
public class Trooper {

    private static Trooper trooper = null;

    private String name;
    private Double damage;

    public Trooper(String name, Double damage) {
        this.name = name;
        this.damage = damage;

        if(trooper == null) {
            trooper = this;
        }
        else {
            if(!trooper.name.equals(name) || !trooper.damage.equals(damage)) {
                throw new IllegalArgumentException("Cannot create different trooper!");
            }
        }
    }
}
