package com.tamatea.model.selection.impl.player;

import com.tamatea.model.entity.impl.user.User;
import com.tamatea.model.entity.objects.AmmoSize;
import com.tamatea.model.entity.objects.AmmoType;
import com.tamatea.model.selection.Selection;

public class Ammo extends Selection<User> {

    com.tamatea.model.entity.objects.Ammo[] ammo;

    @Override
    public String selectionName() {
        return "ammo";
    }
}
