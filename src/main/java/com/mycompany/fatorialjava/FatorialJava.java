/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fatorialjava;

import java.util.Scanner;

/**
 *
 * @author luisf
 */
public class FatorialJava {

    static int resp = 1;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o número para calcular fatorial: ");
        int num = scanner.nextInt();
        System.out.printf("%s%d%s%d","!",num, " = ",CalcularFatorial(num));
    }
    
    private static int CalcularFatorial(int n){
        
        if(n == 0)
            return resp;
        
        resp = resp * n;
        
        return CalcularFatorial(n - 1);
    }
}
