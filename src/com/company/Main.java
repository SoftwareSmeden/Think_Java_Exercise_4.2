package com.company;

public class Main {
    // Exercise 4.2 (1 / 2)                                Steps:
    public static void main(String[] args) {               //1
        zippo("rattle", 13);                    //2
    }                                                      //18


    public static void baffle(String blimp) {              //8
        System.out.println(blimp);                         //9
        zippo("ping", -5);                      //10
    }                                                      //14


    public static void zippo(String quince, int flag) {    //3 //11
        if (flag < 0) {                                    //4 //12
            System.out.println(quince + " zoop");          //13
        } else {                                           //5
            System.out.println("ik");                      //6
            baffle(quince);                                //7
            System.out.println("boo-wa-ha-ha");            //15
        }                                                  //16
    }                                                      //17
}

            // (3) Værdien af "Blimp", må være "Rattle".

            // (4) Output er:
            // ik
            //rattle
            //ping zoop
            //boo-wa-ha-ha
