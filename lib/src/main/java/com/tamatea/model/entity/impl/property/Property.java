package com.tamatea.model.entity.impl.property;

import com.tamatea.model.entity.Entity;

public class Property implements Entity {

    int owner_id;
    PropertyType propertyType;
    int happy;
    int upkeep;
    PropertyUpgrade[] upgrades;
    PropertyStaff[] staff;
    int[] users_living;




    @Override
    public int id() {
        return 0;
    }
}
