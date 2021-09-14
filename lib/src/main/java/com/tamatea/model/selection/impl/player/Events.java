package com.tamatea.model.selection.impl.player;

import com.tamatea.model.entity.impl.user.User;
import com.tamatea.model.entity.objects.AttackSummary;
import com.tamatea.model.entity.objects.Event;
import com.tamatea.model.selection.Selection;

import java.util.Map;

public class Events extends Selection<User> {

    Map<Long, Event> events;//long param is the hash or uid of the event

    @Override
    public String selectionName() {
        return "events";
    }
}
