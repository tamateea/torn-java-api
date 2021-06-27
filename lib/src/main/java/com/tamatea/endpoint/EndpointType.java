package com.tamatea.endpoint;

public interface EndpointType {

    String type();

    default boolean canuse() {
        return false;
    }

}
