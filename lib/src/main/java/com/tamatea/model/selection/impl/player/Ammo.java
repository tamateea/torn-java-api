package com.tamatea.model.selection.impl.player;

import com.tamatea.model.entity.impl.user.User;
import com.tamatea.model.entity.objects.AmmoSize;
import com.tamatea.model.entity.objects.AmmoType;
import com.tamatea.model.selection.Selection;

//these are retrieved as an array Ammo[]
public class Ammo extends Selection<User> {

    int ammoID;//todo why is this camelCase when the rest of the api is snake_case?
    int typeID;//todo why is this camelCase when the rest of the api is snake_case?
    AmmoSize size;
    AmmoType type;
    int quantity;
    boolean equipped;

    @Override
    public String selectionName() {
        return "ammo";
    }
}
