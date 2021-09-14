package com.tamatea.model.selection.impl.player;

import com.tamatea.model.entity.impl.user.User;
import com.tamatea.model.selection.Selection;

public class Gym extends Selection<User> {

    int active_gym;

    @Override
    public String selectionName() {
        return "gym";
    }
}
