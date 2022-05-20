package com.tamatea.model.selection.impl.player;

import com.tamatea.model.entity.impl.company.CompanyPoints;
import com.tamatea.model.entity.impl.company.JobType;
import com.tamatea.model.entity.impl.user.User;
import com.tamatea.model.entity.objects.bar.ChainBar;
import com.tamatea.model.entity.objects.bar.DefaultBar;
import com.tamatea.model.selection.Selection;

import java.util.Map;

public class JobPoints extends Selection<User> {

    JobType[] jobs;
    Map<Integer, CompanyPoints> companies;//the integer i believe is an id for the company type.

    @Override
    public String selectionName() {
        return "jobpoints";
    }
}
