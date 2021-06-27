package com.tamatea.endpoint.impl;

import com.tamatea.endpoint.EndpointType;

public class User implements EndpointType {

    @Override
    public String type() {
        return "user";
    }




}
