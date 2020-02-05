/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gm.mundopc;

/**
 *
 * @author ine-1
 */
public class Orden {

    private int idOrden;
    private Computadora[] computadoras;
    private static int contadorComputadoras;

    private int contadorOrdenes;
    private static int maxComputadoras = 10;

    public Orden() {
        contadorOrdenes++;
        idOrden = contadorOrdenes;
        computadoras = new Computadora[maxComputadoras];
    }

    public void agregarComputadora(Computadora computadora) {

        if (contadorComputadoras < maxComputadoras) {

            computadoras[contadorComputadoras] = computadora;
            contadorComputadoras++;
        }
        else{
            System.out.println("Se ha superado el maximo de productos: " +  maxComputadoras);
        }
    }

    public double calcularTotal() {

        return 0;
    }

    public void mostrarOrden() {
        System.out.println("ORDEN");
        for (int i = 0; i < contadorComputadoras; i++) {
            System.out.println(computadoras[i]);
        }
        

    }

    public int getIdOrden() {
        return idOrden;
    }

    public Computadora[] getComputadoras() {
        return computadoras;
    }

    public static int getContadorComputadoras() {
        return contadorComputadoras;
    }

    public int getContadorOrdenes() {
        return contadorOrdenes;
    }

    public int getMaxComputadoras() {
        return maxComputadoras;
    }

    public void setIdOrden(int idOrden) {
        this.idOrden = idOrden;
    }

    public void setComputadoras(Computadora[] computadoras) {
        this.computadoras = computadoras;
    }

    public static void setContadorComputadoras(int contadorComputadoras) {
        Orden.contadorComputadoras = contadorComputadoras;
    }

    public void setContadorOrdenes(int contadorOrdenes) {
        this.contadorOrdenes = contadorOrdenes;
    }

    public void setMaxComputadoras(int maxComputadoras) {
        this.maxComputadoras = maxComputadoras;
    }

}
