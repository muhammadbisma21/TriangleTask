package com.javaprogram;

public class Tugas1Segitiga {

    public static void main(String[] args) {
        for(int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                System.out.print("* ");
                if (i==j){
                    break;
                }else if((i+j)==9){
                    break;
                }
            }
            System.out.print("\n");

        }
    }
}
