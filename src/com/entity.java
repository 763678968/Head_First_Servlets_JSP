package com;

public class entity {
    private int id;
    private String name;
    private boolean isChina;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public boolean isChina() { // boolean类型的属性 isXXX()等价于getXXX();
        return true;
    }
    public void setChina(boolean isChaina) {
        this.isChina = isChina;
    }
}
