package com.tamatea.model.selection.impl.player;

import com.tamatea.model.entity.impl.user.User;
import com.tamatea.model.entity.objects.Attack;
import com.tamatea.model.selection.Selection;

import java.util.Map;

public class Merits extends Selection<User> {
//lol i know..........
    int Nerve_Bar;
    int Critical_Hit_Rate;
    int Life_Points;
    int Crime_Experience1;
    int Education_Length1;
    int Awareness;
    int Bank_Interest;
    int Masterful_Looting;
    int Stealth;
    int Hospitalizing;
    int Addiction_Mitigation;
    int Employee_Effectiveness;
    int Brawn;
    int Protection;
    int Sharpness;
    int Evasion;
    int Heavy_Artillery_Mastery;
    int Machine_Gun_Mastery;
    int Rifle_Mastery;
    int SMG_Mastery;
    int Shotgun_Mastery;
    int Pistol_Mastery;
    int Club_Mastery;
    int Piercing_Mastery;
    int Slashing_Mastery;
    int Mechanical_Mastery;
    int Temporary_Mastery;

    @Override
    public String selectionName() {
        return "merits";
    }
}
