package com.company;

public class Mustang implements Horse
{
    private String name;
    private int weight;
    private int spaces;
    public Mustang(String name, int weight)
    {
        this.name = name;
        this.weight = weight;
        this.spaces = spaces;
    }
    public String getName()
    {
        return name;
    }
    public int getWeight()
    {
        return weight;
    }
    public int getSpaces()
    {
        return spaces;
    }
    public String toString()
    {
        String output = "";
        output += this.getName() + "," + " weighs: " + this.getWeight();
        return output;
    }
}
