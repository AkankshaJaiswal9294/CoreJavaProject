package com.corejava.variable.String;

import java.util.Date;
import java.util.HashMap;

public final class ImmutableClass {
    private final Integer id;
    private final String name;
    private final HashMap<Integer,String> map;
    private final Date date;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public HashMap<Integer,String> getMap() {
        return (HashMap<Integer,String>) map.clone();
    }

    public Date getDate() {
        return (Date) date.clone();
    }

    public ImmutableClass(Integer id, String name, HashMap<Integer,String> map, Date date) {
    this.id = id;
    this.name = name;
    this.map = new HashMap<> (map);
    this.date = new Date(date.getTime());
    }

}
