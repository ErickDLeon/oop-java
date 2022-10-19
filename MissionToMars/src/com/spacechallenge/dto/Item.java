package com.spacechallenge.dto;

public class Item {
    private String name;
    private int weigth;

    public Item() {
    }

    public Item(String name, int weigth) {
        this.name = name;
        this.weigth = weigth;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeigth() {
        return this.weigth;
    }

    public void setWeigth(int weigth) {
        this.weigth = weigth;
    }

    public Item name(String name) {
        setName(name);
        return this;
    }

    public Item weigth(int weigth) {
        setWeigth(weigth);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
                " name='" + getName() + "'" +
                ", weigth='" + getWeigth() + "'" +
                "}";
    }
}
