package com.tamatea.model.selection.impl.player;

import com.tamatea.model.entity.impl.user.User;
import com.tamatea.model.selection.Selection;

public class Medals extends Selection<User> {

    int[] medals_awarded;
    int[] medals_time;

    @Override
    public String selectionName() {
        return "medals";
    }
}
