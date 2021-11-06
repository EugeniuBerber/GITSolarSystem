package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        SolarSystem andromeda =new SolarSystem();
        andromeda.Sun=1;
        andromeda.planet=2;
        andromeda.moon=4;

        featureSun fs = new featureSun();
        fs.color="RED";
        fs.heat= "too hot";
        fs.temp = "999999999999999";
        fs.radius = "0.99";
        fs.maritalStatus = "single";

    }
}
