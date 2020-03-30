
import java.util.Arrays;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Agilstyven Thumo
 */

import java.util.Scanner;
public class MLRandom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan Angka Random : ");
        int angka = scanner.nextInt();
        int data[] = new int[angka];
        
        for(int i = 0; i<data.length; i++){
            boolean isRunn = true;
            while(isRunn){
                isRunn = false;
                int acakAngka = MLRandom.getRandom(1, angka);
                for(int j = 0; j<i; j++){
                    if(acakAngka == data[j]){
                        isRunn = true;
                        break;
                    }
                }
                if(isRunn == false){
                    data[i] = acakAngka;
                }
            }
        }
        System.out.println(Arrays.toString(data));
    }
    
    private static int getRandom(int min, int max){
        if(min > max){
            int temp = min;
            min = max;
            max = temp;
        }
        Random random = new Random();
        return random.nextInt((max - min) + 1 ) + min;
    }
}
