/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package telas;

public class Carro {
    private final String marca;
    private final int ano;
    private final String modelo;
    private final int quilometragem;
    private final String cor;
    private final double preco;

    // Construtor
    public Carro(String marca, int ano, String modelo, int quilometragem, String cor, double preco) {
        this.marca = marca;
        this.ano = ano;
        this.modelo = modelo;
        this.quilometragem = quilometragem;
        this.cor = cor;
        this.preco = preco;
    }

    // Getters para cada atributo
    public String getMarca() { return marca; }
    public int getAno() { return ano; }
    public String getModelo() { return modelo; }
    public int getQuilometragem() { return quilometragem; }
    public String getCor() { return cor; }
    public double getPreco() { return preco; }
}