package com.tamatea.model.selection.impl.player;

import com.tamatea.model.entity.impl.user.User;
import com.tamatea.model.selection.Selection;

public class Education extends Selection<User> {

    int education_current;
    long education_timeleft;
    int[] education_completed;

    @Override
    public String selectionName() {
        return "education";
    }
}
