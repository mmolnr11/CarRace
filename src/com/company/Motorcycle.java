package com.company;

public class Motorcycle {

    private String name;
    private int normalSpeed;    // speed is 100km/h. If rains, travels with 5-50km/h slower (randomly).
    private int distanceTraveled;


    public Motorcycle(String name) {
        this.name = name;
        this.normalSpeed = 0;
        this.distanceTraveled = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNormalSpeed() {
        return normalSpeed;
    }

    public void setNormalSpeed(int normalSpeed) {
        this.normalSpeed = normalSpeed;
    }


    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    public void setDistanceTraveled(int distanceTraveled) {
        this.distanceTraveled += distanceTraveled;
    }
    public void setSpeedLimit(int speedlimit){
        this.normalSpeed = speedlimit;
    }
    public static void moveForAnHour(){

        if (Main.isRaining()){ // speed is 100km/h. If rains, travels with 5-50km/h slower (randomly).
            for(Motorcycle mymoto : Main.motolist){
                int speed = 100;
                int newspeed = Main.randomrandint(5, 50);
                speed = speed - newspeed;
                mymoto.setSpeedLimit(speed);
                mymoto.setDistanceTraveled(speed);
//                System.out.println("raining and "+ mymoto.getName() + " is going at speed " + mymoto.getNormalSpeed()
//                        + " all " + mymoto.getDistanceTraveled());
            };
        }
        else {
            for (Motorcycle mymoto: Main.motolist ) {
                //int speed = Main.randomrandint(80,110);
                int speed = 100;
                mymoto.setNormalSpeed(speed);
                mymoto.setDistanceTraveled(speed);
//                System.out.println("sut a nap es "+ mymoto.getName() + " going " + mymoto.getNormalSpeed()
//                 + " setDistanceTraveled" + " " + mymoto.getDistanceTraveled());
            }
        }
    }
};



