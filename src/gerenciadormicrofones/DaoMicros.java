/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciadormicrofones;

import java.util.LinkedList;

/**
 *
 * @author MarcosB
 */
public class DaoMicros {
    public int alterado=0;
    private LinkedList<Microfone> mic=new LinkedList<>();
    public void addMic(Microfone m){
        mic.add(m);
        alterado=1;
    }
    public Microfone getMic(int num){
        for(int i=0;i<mic.size();i++){
            if(mic.get(i).getNumero()==num)
                return mic.get(i); 
        }
        return null;
    }
    
    public Microfone getMic(String nome){
        for(int i=0;i<mic.size();i++){
            if(mic.get(i).getNomePessoa().equalsIgnoreCase(nome))
                return mic.get(i); 
        }
        return null;    
    }
    
    public void delMic(Microfone m){
        for(int i=0;i<mic.size();i++){
            if(mic.get(i).equals(m))
                mic.remove(i);
        }        
    }
    public LinkedList<Microfone> getLista(){
        return mic;
    }

}
