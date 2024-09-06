package com.template;

public class Elevator {
    int pisoActual;
    int pisoMax;
    int pisoMin;
    int cantPersonas;
    int capMax;

    public Elevator(int pisoMin, int pisoMax, int capMax) {
        this.pisoMin = pisoMin;
        this.pisoMax = pisoMax;
        this.capMax = capMax;
    }

    public int getCurrentFloor() {
        return pisoActual;
    }

    public int setCurrentFloor(int nuevoPiso) {
        if (nuevoPiso <= pisoMax && nuevoPiso >= pisoMin) {
            this.pisoActual = nuevoPiso;
            }
        return pisoActual;
    }

    public void moveToFloor(int donde) {
        pisoActual = setCurrentFloor(donde);
    }

    public int getPassengerCount() {
        return cantPersonas;
    }

    public int setPassengerCount(int masPersonas) {
        if ((getPassengerCount() + masPersonas) <= capMax) {
            this.cantPersonas += masPersonas;
        }return cantPersonas;
    }

    public void addPassenger() {
        cantPersonas = setPassengerCount(1);
    }
    public void removePassenger( ){
        cantPersonas = setPassengerCount(-1);
    }
}
