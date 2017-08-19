package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static ArrayList<Car> carlist = new ArrayList();
    public static ArrayList<Motorcycle> motolist = new ArrayList();
    public static ArrayList<Truck> trucklist = new ArrayList();

    public static void main(String[] args) {
        // write your code here

        createVehicles();
        System.out.println(carlist.get(2).getNormalSpeed());
        simulateRace();
        printresult(trucklist);




    }

    public static int randomrandint(int lower, int upper){
        Random random = new Random();
        int r = (int) (Math.random() * (upper - lower)) + lower;
        return r;
    }


    public static boolean isRaining(){
        int number = randomrandint(0,100);
        if (number<30) {
            return true;
        }
            return false;
    }
    public static int printresult(ArrayList<Truck>){
        int max = Integer.MIN_VALUE;
        for (Truck mytruck : trucklist) {
            int distance = mytruck.getDistanceTraveled();
        }
    };

    public static void createVehicles() {
        String name;
        for (int i = 0; i < 10; i++) {

            Car mycar = new Car();
            carlist.add(mycar);

            name = "Motorcycle " + (i + 1);
            Motorcycle mymoto = new Motorcycle(name);
            motolist.add(mymoto);
            //System.out.println(motolist.get(i).getName());

            Truck mytruck = new Truck();
            trucklist.add(mytruck);
            //System.out.println(trucklist.get(i).getName());
            //print();

            //System.out.println(mycar.getName() + " with speed of: " + mycar.getNormalSpeed());

//            Motorcycle mymotor = new Motorcycle();
//            motorlist.add(mymotor);
//
//            Truck mytruck = new Truck();
//            trucklist.add(mytruck);
        }
    }
    public static void simulateRace(){
        for (int i = 0; i<50; i++){
            Car.moveForAnHour();
            Motorcycle.moveForAnHour();
            for (Truck mytruck : trucklist){
                mytruck.moveForAnHour();
            }

        }
    }

//    public static void print(){
//        for (int i = 0; i<10; i++)
//        System.out.println(motolist.get(i));
//    }


}




