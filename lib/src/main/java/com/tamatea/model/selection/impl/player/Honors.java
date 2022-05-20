package com.tamatea.model.selection.impl.player;

import com.tamatea.model.entity.impl.user.User;
import com.tamatea.model.selection.Selection;

public class Honors extends Selection<User> {

    int[] honors_awarded;
    int[] honors_time;

    @Override
    public String selectionName() {
        return "honors";
    }
}
