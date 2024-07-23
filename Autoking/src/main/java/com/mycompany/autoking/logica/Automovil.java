
package com.mycompany.autoking.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Automovil implements Serializable {
    //Atributos
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private int numeroPuertas;
    private String marca;
    private String modelo;
    private String color;
    private String placa;
    private String motor;
    
    //Constructores (Vacío, Por parametros)
    public Automovil() { //El constructor vacio permite crear un automovil con los atributos del constructor lleno pero sin ingún valor asignado
    }
    //Al contructor por parametros le pasamos y asignamos el valor que le quiero pasar
    public Automovil(int id, int numeroPuertas, String marca, String modelo, String color, String placa, String motor) {
        this.id = id;
        this.numeroPuertas = numeroPuertas;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.placa = placa;
        this.motor = motor;
    }
 
    //Metodos (Getters and Setters)

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }
    
}
