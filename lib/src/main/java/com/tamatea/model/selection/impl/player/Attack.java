package com.tamatea.model.selection.impl.player;

import com.tamatea.model.entity.impl.user.User;
import com.tamatea.model.entity.objects.AttackModifier;
import com.tamatea.model.entity.objects.AttackType;
import com.tamatea.model.selection.Selection;

//these are retrieved as a map<Integer, Attack>
public class Attack extends Selection<User> {

    String code;
    long timestamp_start;
    long timestamp_ended;
    int attacker_id;
    String attacker_name;
    int attacker_faction;
    String attacker_factionname;
    int defender_id;
    String defender_name;
    int defender_faction;
    String defender_factionname;
    AttackType result;
    boolean stealthed;
    double respect;
    int chain;
    int raid;
    double respect_gain;
    double respect_loss;
    AttackModifier modifiers;

    @Override
    public String selectionName() {
        return "attacks";
    }
}
