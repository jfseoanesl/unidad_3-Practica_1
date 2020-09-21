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
public class Cuenta {

    private double saldo;

    public Cuenta(double saldo) {
        this.saldo = saldo;
    }
    
    public Cuenta(){
        this(0);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
   
    public boolean ejecutarTransaccion(TipoTransaccion tipo, double m){
        boolean res=false;
        switch(tipo){
            case RETIRAR: res = this.retirar(m); break;
            case CONSIGNAR: res = this.consignar(m); break;
        }
        return res;
    }
    
    public boolean retirar(double m){
        if(this.saldo>=m && m>0){
            this.saldo-=m;
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean consignar(double m){
        if(m>0){
            this.saldo+=m;
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean transferir(double m, Cuenta c){
        if(this.retirar(m)){
            return c.consignar(m);
        }
        else{
            return false;
        }
    }
}
