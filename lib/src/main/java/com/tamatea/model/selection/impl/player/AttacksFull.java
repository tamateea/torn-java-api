package com.tamatea.model.selection.impl.player;

import com.tamatea.model.entity.impl.user.User;
import com.tamatea.model.entity.objects.AttackSummary;
import com.tamatea.model.selection.Selection;

import java.util.Map;

public class AttacksFull extends Selection<User> {

    Map<Long, AttackSummary> attacks;

    @Override
    public String selectionName() {
        return "attacksfull";
    }
}
