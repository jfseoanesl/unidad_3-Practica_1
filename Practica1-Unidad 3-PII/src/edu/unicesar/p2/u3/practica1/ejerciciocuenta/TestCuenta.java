/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicesar.p2.u3.practica1.ejerciciocuenta;

/**
 *
 * @author jairo
 */
public class TestCuenta {
    
    public static void main(String[] arg){
        
        Cuenta a = new Cuenta();
        Cuenta b = new Cuenta(1000);
        
        if(a.ejecutarTransaccion(TipoTransaccion.CONSIGNAR, 500)){
            System.out.println("COnsignacion exitosa");
        }
        else{
            System.out.println("No es posible consgnar");
        }
        
        if(b.ejecutarTransaccion(TipoTransaccion.RETIRAR, 1500)){
            System.out.println("Retiro exitoso");
        }
        else{
            System.out.println("No es posible retirar");
        }
        
        if(b.transferir(500, a)){
            System.out.println("Tranferencia exitosa");
        }
        else{
            System.out.println("No es posible tranferir");
        }
        
        System.out.println("Saldo a: " + a.getSaldo());
        System.out.println("Saldo b: " + b.getSaldo());
        
    }
}
