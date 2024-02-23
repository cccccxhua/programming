package com.cxh;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World");
        List<dog> list = new ArrayList<>();
        list.add(new dog("yellow",1));
        list.add(new dog("blue", 6));
        list.add(new dog("green", 3));
        Collections.sort(list,new Comparator<dog>(){

            @Override
            public int compare(dog o1, dog o2) {
                return o2.color.compareTo(o1.color);
            }

        });
        System.out.println(list);
    }

}
class dog{
    String  color;
    int name;

    @Override
    public String toString() {
        return "dog{" +
                "color=" + color +
                ", name=" + name +
                '}';
    }

    public dog(String color, int name) {
        this.color = color;
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }
}