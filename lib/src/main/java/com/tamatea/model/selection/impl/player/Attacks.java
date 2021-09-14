package com.tamatea.model.selection.impl.player;

import com.tamatea.model.entity.impl.user.User;
import com.tamatea.model.entity.objects.Attack;
import com.tamatea.model.selection.Selection;

import java.util.Map;

public class Attacks extends Selection<User> {

    Map<Integer, Attack> attacks;

    @Override
    public String selectionName() {
        return "attacks";
    }
}
