package ru.synergy.innernested;

public class Parcel {
    private String recepient;
    private int mass;
    //static int count;

    class Destination {
        private String street;
        private int nomeNumber;
        private int flatNumber;

        public void doSmth(){
            System.out.println(mass);
        }
    }
}


