/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicesar.p2.u3.practica1.ejercicioCircunferencia;

/**
 *
 * @author jairo
 */
public class Circunferencia {
    
    // definicion atributos
    
    private double x; // coordenada x del centro
    private double y; // coordenada y del centro
    private double r; // radio de la circunferencia
    
     // definicion constructor
    
    public Circunferencia(){
        /*
        this.x=0;
        this.y=0;
        this.r=0;*/
        this(0,0,0);
    }
    
    public Circunferencia(double x, double y, double r){
        this.x = x;
        this.y = y;
        this.r = r;
    }
    
    // metodos getter
    
    public double getX(){return this.x;}
    public double getY(){return this.y;}
    public double getR(){return this.r;}
    
    // metodo setter
    
    public void setX(double x){this.x=x;}
    public void setY(double y){this.y=y;}
    public void setR(double r){this.r=r;}
    
    // metodos miembros
    
    public double calcularArea(){
        //AC = PI * R^2
        return Math.PI * Math.pow(this.r, 2);
    }
    
    public double calcularLongitud(){
        // LC = 2 * PI * R           LC = PI * D
        return 2 * Math.PI * this.r;
    }
    
    public Circunferencia compArea(Circunferencia b){
        if(this.calcularArea()>b.calcularArea()){
            return this;
        }
        else if(this.calcularArea()<b.calcularArea()){
            return b;
        }
        else{
            return null;
        }
    }
    
    public Circunferencia compLongitud(Circunferencia b){
       if(this.calcularLongitud() > b.calcularLongitud()){
           return this;
       }
       else if(this.calcularLongitud() < b.calcularLongitud()){
           return b;
       }
       else{
           return null;
       }
    }
    
}
