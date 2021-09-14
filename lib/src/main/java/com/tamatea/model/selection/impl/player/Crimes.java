package com.tamatea.model.selection.impl.player;

import com.tamatea.model.entity.impl.user.User;
import com.tamatea.model.entity.objects.CriminalRecord;
import com.tamatea.model.selection.Selection;

public class Crimes extends Selection<User> {

    CriminalRecord criminalrecord;//why no naming conventions?

    @Override
    public String selectionName() {
        return "crimes";
    }
}
