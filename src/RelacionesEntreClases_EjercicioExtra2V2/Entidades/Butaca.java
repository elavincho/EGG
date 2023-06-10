/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RelacionesEntreClases_EjercicioExtra2V2.Entidades;

/**
 *
 * @author elavincho
 */
public class Butaca {
    private String numero;
    private String letra;
    private String estado;

    public Butaca() {
    }

    public Butaca(String numero, String letra, String estado) {
        this.numero = numero;
        this.letra = letra;
        this.estado = estado;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return numero + letra + estado + "|";
    }
}