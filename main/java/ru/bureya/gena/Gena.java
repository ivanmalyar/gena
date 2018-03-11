package ru.bureya.gena;

public class Gena {

    public static void main(String[] args) {
        Gena gena = new Gena();
        System.out.println(gena.plus(5, 1));

    }

    public  int plus(int firstInt, int secondInt){
        return firstInt + secondInt;
    }

    public  int minus(int firstInt, int secondInt){
        return firstInt - secondInt;
    }
}
