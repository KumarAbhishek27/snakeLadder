package com.forest.black.snakeLadder.model;

import lombok.Getter;

@Getter
public class Board {
    private int size;
    private int start;
    private int end;

    public Board(int size) {
        this.size = size;
        this.start = 1;
        this.end = start + size - 1;
    }
}
