package com.tamatea.model.entity.impl.user;

import com.tamatea.model.entity.Entity;
import com.tamatea.model.entity.impl.property.PropertyType;

import java.util.Date;

public class User implements Entity {

    String rank;
    int level;
    String gender;
    PropertyType property;
    Date signup;
    int awards;
    int friends;
    int enemies;
    int forum_posts;
    int karma;
    int age;
    UserRole userRole;
    int donator;
    int player_id;
    String name;
    int property_id;
    String competition;
    Life life;


    @Override
    public int id() {
        return player_id;
    }
}
