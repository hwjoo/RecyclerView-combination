package com.saviorj.recyclerview_combination;

/**
 * Created by hwjoo on 2016-12-15.
 */

public class RecyclerViewItem {
    private int drawableId;
    private String name;

    public RecyclerViewItem(int drawableId, String name) {
        this.drawableId = drawableId;
        this.name = name;
    }

    public int getDrawableId() {
        return this.drawableId;
    }

    public String getName() {
        return this.name;
    }
}
