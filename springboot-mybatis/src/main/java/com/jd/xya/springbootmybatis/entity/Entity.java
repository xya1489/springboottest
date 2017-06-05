package com.jd.xya.springbootmybatis.entity;

public abstract class Entity<T> {
    T id ;
    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }
}
