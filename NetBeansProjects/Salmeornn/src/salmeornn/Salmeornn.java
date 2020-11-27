/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salmeornn;

import java.io.DataOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.Charset;

public class Salmeornn {

    BigInteger p;
    BigInteger q;
    BigInteger producto;
    BigInteger fi;
    BigInteger coprimo;
    BigInteger cprivada;
    BigInteger E;
    BigInteger P;
    int tam;
    int b;

    public void generarPrimos(int a) {
        tam = a;
        p = new BigInteger(a, 12, new java.util.Random());
        do {
            q = new BigInteger(a, 12, new java.util.Random());
        } while (q.compareTo(p) == 0);
    }

    public void generarClaves() {
        producto = p.multiply(q);
        BigInteger aux = q.subtract(BigInteger.valueOf(1));
        BigInteger aux2 = p.subtract(BigInteger.valueOf(1));
        fi = aux.multiply(aux2);
        System.out.println(p+" * "+q+" = "+producto);
        do {
            coprimo = new BigInteger(5, 10,new java.util.Random());
            System.out.println("Intento de coprimo: "+coprimo);
        } while ((coprimo.compareTo(fi) != -1) || (coprimo.gcd(fi).compareTo(BigInteger.valueOf(1)) != 0));
        System.out.println("Coprimo final: "+coprimo);
        cprivada = coprimo.modInverse(fi);
        b = coprimo.intValue();
        System.out.println(cprivada);
    }

    public BigInteger cifrar(String texto) {
        P = new BigInteger(texto);
        System.out.println(P+"---------"+b);
        BigInteger aux = P.pow(coprimo.intValue());
        System.out.println(aux+"-----mod------"+producto);
        aux = aux.mod(producto);
        System.out.println(aux);
        return aux;
    }

    public String descifrar(BigInteger cifrado) {
        E = cifrado;
        BigInteger aux2 = E.pow(cprivada.intValue());
        aux2 = aux2.mod(producto);
        return aux2.toString();
    }
}
//    public BigInteger[] cifrar(String texto){
//        text = texto;
//        P = new BigInteger(text.getBytes());
//        byte[] temporal = new byte[1];
//        byte[] digitos = text.getBytes();
//        BigInteger[] bigDigitos = new BigInteger[digitos.length];
//        for(int i = 0; i < bigDigitos.length; i++){
//            temporal[0] = digitos[1];
//            bigDigitos[i] = new BigInteger(temporal);
//        }
//        BigInteger[] cifrado = new BigInteger[bigDigitos.length];
//        for(int i = 0; i < bigDigitos.length; i++){
//            cifrado[i] = bigDigitos[i].modPow(cp1, n);
//        }
//        return cifrado;
//    }
//    public void imprimir(){
//        System.out.println(p);
//        System.out.println(q);
//        System.out.println(n);
//        System.out.println(z);
//        System.out.println(cp1);
//        System.out.println(cprivada);
//        System.out.println(P);
//    }  
//    public String decifrar(BigInteger[] cifrado){
//        BigInteger[] decifrado = new BigInteger[cifrado.length];
//        for(int i = 0; i < decifrado.length; i++){
//            decifrado[i] = cifrado[i].modPow(cprivada, n);
//        }
//        char[] chars = new char[decifrado.length];
//        for(int i = 0; i < chars.length; i++){
//            chars[i] = (char)(decifrado[i].intValue());
//        }
//        return (new String(chars));
//    }
//    public void claves(){
//        n = p.multiply(q);
//        z = p.subtract(BigInteger.valueOf(1));
//        z = z.multiply(q.subtract(BigInteger.valueOf(1)));
//        do {
//            cp1 = new BigInteger(2 * tam, new java.util.Random());
//        } while ((cp1.compareTo(z) != -1) || (cp1.gcd(z).compareTo(BigInteger.valueOf(1)) != 0));
//        cprivada = cp1.modInverse(z);
//    }

    
