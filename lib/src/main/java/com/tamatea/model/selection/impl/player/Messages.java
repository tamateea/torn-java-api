package com.tamatea.model.selection.impl.player;

import com.tamatea.model.entity.impl.user.User;
import com.tamatea.model.entity.objects.Message;
import com.tamatea.model.selection.Selection;

import java.util.HashMap;

public class Messages extends Selection<User> {

    HashMap<Long, Message> messages;

    @Override
    public String selectionName() {
        return "messages";
    }
}
