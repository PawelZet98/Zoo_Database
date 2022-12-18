package com.project.ZooApp;

import org.springframework.stereotype.Service;

@Service
public class Animal {
    private long id;
    private String name;
    private String zoneName;
    private int food;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getZoneName() {
        return zoneName;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", zoneName='" + zoneName + '\'' +
                ", food=" + food +
                '}';
    }
}
