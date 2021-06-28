package com.tamatea.model.entity.objects;

public class BazaarItem {

    int ID;//todo why is this camelCase when the rest of the api is snake_case
    String name;
    ItemType type;
    int quantity;
    int price;
    int market_price;
}
