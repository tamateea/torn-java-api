package com.tamatea.model.selection.impl.player;

import com.tamatea.model.entity.impl.user.User;
import com.tamatea.model.entity.objects.bar.ChainBar;
import com.tamatea.model.entity.objects.bar.DefaultBar;
import com.tamatea.model.selection.Selection;

public class Bars extends Selection<User> {

    long server_time;
    DefaultBar happy;
    DefaultBar life;
    DefaultBar energy;
    DefaultBar nerve;
    ChainBar chain;

    @Override
    public String selectionName() {
        return "bars";
    }
}
