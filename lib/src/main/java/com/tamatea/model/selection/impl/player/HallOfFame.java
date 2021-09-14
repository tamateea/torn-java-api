package com.tamatea.model.selection.impl.player;

import com.tamatea.model.entity.impl.user.User;
import com.tamatea.model.entity.objects.HallOfFameEntry;
import com.tamatea.model.selection.Selection;

import java.util.Map;

public class HallOfFame extends Selection<User> {

    Map<String, HallOfFameEntry> halloffame;//string is name of type

    @Override
    public String selectionName() {
        return "hof";
    }
}
