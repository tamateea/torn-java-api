package com.tamatea.model.entity.objects;

public class Ammo {
    int ammoID;//todo why is this camelCase when the rest of the api is snake_case?
    int typeID;//todo why is this camelCase when the rest of the api is snake_case?
    AmmoSize size;
    AmmoType type;
    int quantity;
    boolean equipped;
}
