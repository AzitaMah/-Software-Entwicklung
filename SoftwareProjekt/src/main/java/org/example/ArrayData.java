package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.io.IOException;
import java.util.InputMismatchException;

public class ArrayData {

    //Creating Array for SDR Data
    private String [] []SDR = new String[39][2];


    //path to the .txt file
    FileReader fr = new FileReader("C:\\Software_HDM\\software-entwicklung\\SoftwareProjekt\\src\\main\\java\\org\\example\\SDR.txt");
    //reading only the first line
    BufferedReader br = new BufferedReader(fr);

    //Filling the Array ; Exception for Buffer reader ?
    public void fillingArray() throws IOException {
        for (int i =0; i< SDR.length;i++){
            for (int j=0;j<SDR[0].length;j++){
                SDR[i][j]= br.readLine();
            }
        }
    }

    //Searching for the right input values
    public void searchInput(String a){
        for (int i =0; i< SDR.length;i++){
            for (int j=0;j<SDR[0].length;j++){
                if (Arrays.binarySearch(SDR,a)>=0){
                    System.out.println(Arrays.binarySearch(SDR,a));
                }
            }
        }
    }


        /** for(int i =0;i<SDR.length;i++){
         for (int j=0;j<SDR[i].length;j++){
         if(Arrays.binarySearch(SDR,i,i+1,s)>=0){
         System.out.println(SDR[i][0]);
         }

         }
         }**/

    public void giveString(){                                       // Persönliches check up. Vor Abgabe Löschen
        System.out.println(SDR[3][0]);
    }



    public ArrayData() throws FileNotFoundException {
    }
}
