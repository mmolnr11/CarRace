package com.company;

import java.util.Random;

public class Car {
    private String name;
    private int normalSpeed;
    private int distanceTraveled;

    private static String[] possiblenamelist = {"Grit","Gallop",
            "Raven",
            "Hollo",
            "Chase",
            "Parallel",
            "Starlight",
            "Lightning",
            "Baron",
            "Universe"};

    public int getNormalSpeed() {
        return normalSpeed;
    }
    public String getName() {
        return name;
    }

    public void setNormalSpeed(int normalSpeed) {
        this.normalSpeed = normalSpeed;
    }

    public void setSpeedLimit(int speedLimit) {
        this.normalSpeed = speedLimit;
    }

    public void setDistanceTraveled(int distanceTraveled) {

        this.distanceTraveled += distanceTraveled;
    }
    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    public Car() {

        String randomName = randomnamegenerator();
        this.name = randomName;
        this.normalSpeed = 0;
        this.distanceTraveled = 0;


    }
    public String randomnamegenerator() {
        int len = possiblenamelist.length;
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(len);
        String firstname =possiblenamelist[randomInt];
        randomInt = randomGenerator.nextInt(len);
        String lastname =possiblenamelist[randomInt];

        return firstname + " " + lastname;
    }
    public int randomnormalspeed(int lowestspeed, int highestspeed){
        Random randomGenerator = new Random();

        int randomInt = randomGenerator.nextInt(highestspeed);
        while (randomInt<lowestspeed){
            randomInt = randomGenerator.nextInt(highestspeed);
        }
            return randomInt;


    }




    public static void moveForAnHour(){
        if (Main.isRaining()){
            for (Car mycar: Main.carlist ){
                mycar.setSpeedLimit(70);
                mycar.setDistanceTraveled(70);
                //System.out.println("itt esik es " + mycar.getName() + " going " + mycar.getNormalSpeed() + " setDistanceTraveled" + " " + mycar.getDistanceTraveled() );

            }
        } else {
            for (Car mycar: Main.carlist ) {
                int speed = Main.randomrandint(80,110);
                mycar.setNormalSpeed(speed);
                mycar.setDistanceTraveled(speed);
                //System.out.println("sut a nap es "+ mycar.getName() + " going " + mycar.getNormalSpeed()
                      //  + " setDistanceTraveled" + " " + mycar.getDistanceTraveled());
            }
        }
    }


}
