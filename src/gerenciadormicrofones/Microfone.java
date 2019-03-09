/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciadormicrofones;

/**
 *
 * @author MarcosB
 */
public class Microfone {
    private static int cont=0;
    private String nomePessoa;
    private String Cor;
    private int id;
    private int numero;

    public Microfone(String nomePessoa, String Cor, int numero) {
        this.nomePessoa = nomePessoa;
        this.Cor = Cor;
        this.numero = numero;
        this.cont++;
        this.id=cont;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String Cor) {
        this.Cor = Cor;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getId(){
        return id;
    }
    public boolean equals(Microfone m){
        if(this.id==m.getId()&&this.Cor.equalsIgnoreCase(m.getCor())&&this.numero==m.getNumero())
            return true;
        else
        return false;        
    }
}
