package com.company;

public class Ejercicio12 {
    int[][] matriz;
     public Ejercicio12(){
         matriz = new int[5][15];
     }
     public void ejecutar(){
         for (int i = 0; i < matriz.length; i++){
             for (int j = 0; j < matriz[i].length; j++){
                 if (i == 0 ){
                     matriz[i][j] = 1;
                 }
                 else if (i == 4){
                     matriz[i][j] = 1;
                 }
                 else if (j == 0){
                     matriz[i][j] = 1;
                 }
                 else if (j == 14){
                     matriz[i][j] = 1;
                 }

                 else{
                     matriz[i][j] = 0;
                 }
             }
         }
         for (int i = 0; i < matriz.length; i++){
             for (int j = 0; j < matriz[i].length; j++){
                 System.out.print(matriz[i][j]);
             }
            System.out.println();
         }
     }





}
