/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Otavio
 */
public class Calculo {
   
    public double fatorial(int n){
	int x = n;
        double fat = 1;
        while (x>1){
            fat = fat * x;
            x--;
        }
        return fat;
    }

    public double combinacao(double fatN, double fatX, double fatNX){
	double comb=0;
	comb=(fatN / (fatX * fatNX));
	return comb;
    }
    
}
