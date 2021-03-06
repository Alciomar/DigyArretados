/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package birdpoint.titulacao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Adriano Lima
 */
@Entity
public class Titulacao {

    @Id
    @GeneratedValue
    private int idTitulacao;

    @Column(length = 100, nullable = false)
    private String nome;

    @Column(length = 100, nullable = false)
    private double valorTitulacao;

    /**
     * @return the idTitulacao
     */
    public int getIdTitulacao() {
        return idTitulacao;
    }

    /**
     * @param idTitulacao the idTitulacao to set
     */
    public void setIdTitulacao(int idTitulacao) {
        this.idTitulacao = idTitulacao;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the valorTitulacao
     */
    public double getValorTitulacao() {
        return valorTitulacao;
    }

    /**
     * @param valorTitulacao the valorTitulacao to set
     */
    public void setValorTitulacao(double valorTitulacao) {
        this.valorTitulacao = valorTitulacao;
    }

   
}
