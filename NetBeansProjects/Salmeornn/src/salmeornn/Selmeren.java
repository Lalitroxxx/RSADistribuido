/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salmeornn;

import java.math.BigInteger;
import java.net.ServerSocket;

public class Selmeren {

    public static void main(String[] args) {
//        BigInteger[] yeah;
//        Jimbo jimbo = new Jimbo(11);
//        jimbo.generarPrimos();
//        jimbo.generarClaves();
//        yeah = jimbo.encriptar("2018096601");
//        System.out.println(jimbo.descifrar(yeah));
        BigInteger cifrado;
        Salmeornn ornn = new Salmeornn();
        ornn.generarPrimos(10);
        ornn.generarClaves();
        cifrado = ornn.cifrar("490000");
        System.out.println("Wotefok "+ornn.descifrar(cifrado));
    }
}
