package com.tamatea.model.entity.objects;

public class Attack {
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

}
