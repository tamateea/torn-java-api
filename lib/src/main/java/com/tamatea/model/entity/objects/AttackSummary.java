package com.tamatea.model.entity.objects;

public class AttackSummary {
    String code;
    long timestamp_started;
    long timestamp_ended;
    int attacker_id;
    int defender_id;
    int defender_faction;
    AttackType result;
    boolean stealthed;
    double respect;
}
