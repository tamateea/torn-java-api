package com.tamatea.model.selection.impl.player;

import com.tamatea.model.entity.impl.user.User;
import com.tamatea.model.selection.Selection;

public class BattleStats extends Selection<User> {

    long strength;
    long speed;
    long dexterity;
    long defense;
    long total;
    int strength_modifier;
    int defense_modifier;
    int speed_modifier;
    int dexterity_modifier;
    String[] strength_info;//this is bad
    String[] defense_info;//this is bad
    String[] speed_info;//this is bad
    String[] dexterity_info;//this is bad

    @Override
    public String selectionName() {
        return "battlestats";
    }
}
