package com.tamatea.model.selection.impl.player;

import com.tamatea.model.entity.impl.user.User;
import com.tamatea.model.entity.objects.BazaarItem;
import com.tamatea.model.entity.objects.Item;
import com.tamatea.model.selection.Selection;

public class DisplayCabinet extends Selection<User> {


    Item[] display;

    @Override
    public String selectionName() {
        return "display";
    }
}
