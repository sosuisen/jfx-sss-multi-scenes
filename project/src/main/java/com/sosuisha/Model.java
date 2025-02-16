package com.sosuisha;

import lombok.Getter;

@Getter
public class Model {
    private String message;

    public Model() {
        this.message = "hello, world!";
    }
}
