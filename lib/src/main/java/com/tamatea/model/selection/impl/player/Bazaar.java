package com.tamatea.model.selection.impl.player;

import com.tamatea.model.entity.impl.user.User;
import com.tamatea.model.entity.objects.BazaarItem;
import com.tamatea.model.selection.Selection;

public class Bazaar extends Selection<User> {


    BazaarItem[] bazaar;

    @Override
    public String selectionName() {
        return "bazaar";
    }
}
