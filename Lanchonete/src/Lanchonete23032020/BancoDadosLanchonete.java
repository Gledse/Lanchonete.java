/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lanchonete23032020;

/**
 *
 * @author Gledse_Jamisse
 */
public class BancoDadosLanchonete {
    
    private String nome;
    private String sexo;
    private int codigo;
    private String cardapio;
    
    // nao foram usados no sistema
    private double saldo;
    private double preco;
    
    public BancoDadosLanchonete(){
    }
    public BancoDadosLanchonete(String nome,String sexo,int codigo, String cardapio,double saldo, double preco){
        
        this.nome = nome;
        this.sexo = sexo;
        this.codigo = codigo;
        this.cardapio = cardapio;
        this.saldo = saldo;
        this.preco = preco;
    }
    public String getNome() { return nome;}
    public String getSexo() { return sexo;}
    public int getCodigo() { return codigo;}
    public String getCardapio() { return cardapio;}
    
    // nao foram usados no sistema
    public double getSaldo() { return saldo;}
    public double getPreco() { return preco;}
    
    public void setNome(String nome) { this.nome = nome;}
    public void setSexo(String sexo) { this.sexo = sexo;}
    public void setCodigo(int codigo) { this.codigo = codigo;}
    public void setCardapio(String cardapio) { this.cardapio = cardapio;}
    
    // nao foram usados no sistema
    public void setSaldo(double saldo) { this.saldo = saldo;}
    public void setPreco(double preco) { this.preco = preco;}
    
}
