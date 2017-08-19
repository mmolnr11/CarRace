package com.company;

public class Truck {
    private String name;   //Truck drivers are boring. They call all their trucks a random number between 0 and 1000.
    private int normalspeed;
    private int distanceTraveled; //speed: 100km/h. 5% chance of breaking down for 2 hours.
    private boolean breakdownTurnsLeft;
    private int speed;

    public void setSpeed(int speed) {
        this.normalspeed = speed;
    }

    public int getNormalspeed() {
        return normalspeed;
    }

    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    public void setBreakdownTurnsLeft(boolean breakdownTurnsLeft) {
        this.breakdownTurnsLeft = breakdownTurnsLeft;
    }

    public boolean getBreakdownTurnsLeft() {
        return breakdownTurnsLeft;
    }

    public void setDistanceTraveled(int distanceTraveled) {
        this.distanceTraveled += distanceTraveled;
    }

    public Truck() {
        String selectTruckName = selectTruckName();
        this.name = selectTruckName;
        this.normalspeed = 0;
        this.distanceTraveled = 0;

        this.breakdownTurnsLeft = false;

    }

    public String getName() {
        return name;
    }

    public static String selectTruckName() {
        int selectednumber = Main.randomrandint(0, 1000);
        String mystring = "";
        mystring = Integer.toString(selectednumber);
        return mystring;
    }
    public  void moveForAnHour(){
        isBreakingDown();
    };

    public void isBreakingDown() {
        if (Truck.this.getBreakdownTurnsLeft()) {
            Truck.this.setSpeed(0);
            Truck.this.setDistanceTraveled(0);
            Truck.this.setBreakdownTurnsLeft(false);

            System.out.println(Truck.this.getName() + " korabban at lett lerobbant es igy meg all " +
            Truck.this.getNormalspeed() + " -el megy es " + Truck.this.getDistanceTraveled() +
                    " ennyit ment" );
        } else {
            int likelyhoodOfBreakingDown = Main.randomrandint(0, 100);
            if (likelyhoodOfBreakingDown <= 5) {
                Truck.this.setSpeed(0);
                Truck.this.setDistanceTraveled(0);
                Truck.this.setBreakdownTurnsLeft(true);
                System.out.println(Truck.this.getName() + " most robbant le es atallitottam h meg egy orat alljon " +
                Truck.this.getNormalspeed() + " -el megy es " + Truck.this.getDistanceTraveled() +
                        " ennyit ment");
            } else {
                Truck.this.setSpeed(100);
                Truck.this.setDistanceTraveled(100);
                Truck.this.setBreakdownTurnsLeft(false);
                System.out.println(Truck.this.getName() + " nem robbant le es nem is fog " + Truck.this.getNormalspeed() + " -el megy es " + Truck.this.getDistanceTraveled() +
                        " ennyit ment");
            }
        }


    }

};



