/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciadormicrofones;

import EasySocket.EasyMultServer;
import EasySocket.nsocket;
import Interface.MainI;
import java.io.BufferedReader;
import java.io.IOException;

/**
 *
 * @author MarcosB
 */
public class GerenciadorMicrofones {
    /**
     * @param args the command line arguments
     */
    static String dados="";
    static BufferedReader in;
    public static void main(String[] args) throws IOException {
        Runnable r=new Runnable() {
            @Override
            public void run() {
                MainI main=new MainI();
                main.setVisible(true);
            }
        };
        Thread Gui = new Thread(r);
        Gui.setName("Inicializador de Interface");
        Gui.run();
        EasyMultServer server=new EasyMultServer(25565);
        nsocket.refresh=1;
        server.start();
        while(true){
            if(server.getOrdem().size()!=0){
                String[] st;
                st=server.getConID(server.getOrdem().getFirst()).getEntrada().split(",");
                Microfone novo=new Microfone(st[0], " ", Integer.parseInt(st[1]));
                MainI.microfones.addMic(novo);
                server.getOrdem().removeFirst();
            }
            System.out.print("");
        }
    }
}