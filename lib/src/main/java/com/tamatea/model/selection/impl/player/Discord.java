package com.tamatea.model.selection.impl.player;

import com.tamatea.model.entity.impl.user.User;
import com.tamatea.model.entity.objects.DiscordUser;
import com.tamatea.model.selection.Selection;

public class Discord extends Selection<User> {

    DiscordUser discord;

    @Override
    public String selectionName() {
        return "discord";
    }
}
