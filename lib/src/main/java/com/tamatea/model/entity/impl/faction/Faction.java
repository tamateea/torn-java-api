package com.tamatea.model.entity.impl.faction;

import com.tamatea.model.entity.Entity;

import java.util.HashMap;

public class Faction implements Entity {

    int ID;
    String name;
    String tag;
    int leader;
    int co_leader;//this is a dash
    int respect;
    int age;
    int capacity;
    int best_chain;
    TerritoryWar[] territory_wars;
    RaidWar[] raid_wars;
    FactionPeace[] peace;
    HashMap<Integer, FactionMember> members;//eww


    @Override
    public int id() {
        return 0;
    }
}
