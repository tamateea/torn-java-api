package com.tamatea.model.selection.impl.player;

import com.tamatea.model.entity.impl.user.User;
import com.tamatea.model.entity.objects.Cooldown;
import com.tamatea.model.selection.Selection;

public class Cooldowns extends Selection<User> {


    Cooldown cooldowns;


    @Override
    public String selectionName() {
        return "cooldowns";
    }
}
