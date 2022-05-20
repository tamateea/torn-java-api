package com.tamatea.model.entity.impl.company;

import java.nio.file.Path;

public enum CompanyType {


    ADULT_NOVELTIES("Adult Novelties"),
    FIREWORK_STAND("Firework Stand"),
    ;
    private String name;

    CompanyType(String name) {
        this.name = name;
    }

}
