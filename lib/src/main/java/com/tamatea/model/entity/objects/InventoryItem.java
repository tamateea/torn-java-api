package com.tamatea.model.entity.objects;

public class InventoryItem {

    int ID;//todo why is this camelCase when the rest of the api is snake_case
    String name;
    ItemType type;
    int quantity;
    int market_price;
    boolean equipped;
}
