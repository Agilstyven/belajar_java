/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kitakanbeda;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Agilstyven Thumo
 */
public class KitaKanBeda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan Angka Max : ");
        int angka = scanner.nextInt();
        int data[] = new int[angka];
        
        for (int i = 0; i <data.length; i++){
            boolean isRunning = true;
            while(isRunning){
                isRunning = false;
                int acakAngka = KitaKanBeda.getRandom(1, angka);
                for(int j = 0; j < i; j++){
                    if(acakAngka == data[j]){
                        isRunning = true;
                        break;
                    }
                }
                if(isRunning == false){
                    data[i] = acakAngka;
                }
            }
        }
        System.out.println(Arrays.toString(data));
    }
    
    private static int getRandom(int max, int min){
        if(min > max){
            int temp = min;
            min = max;
            max = temp;
        }
        Random r = new Random();
        return r.nextInt((max-min) + 1) + min;
    }
    
}
