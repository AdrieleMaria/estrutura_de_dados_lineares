/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PilhaComArray;

import javax.swing.JOptionPane;

/**
 *
 * @author Augusto
 */
public class usaPilha {
    public static void main(String args[]){
        PilhaArray p1 = new PilhaArray();
        boolean continuar = true;
        
        while(continuar){
            String op = JOptionPane.showInputDialog("1: Inserir \n " 
                                                  + "2: Remover \n "
                                                  + "3: Exibir \n "
                                                  + "4: Quantidade \n "
                                                  + "5: Topo \n "
                                                  + "6: Sair");
            switch(op){
                case "1":
                        String S = JOptionPane.showInputDialog("Digite um elemento");
                        p1.push(S);
                        break;
                case "2":
                        Object removido = p1.top();
                        JOptionPane.showMessageDialog(null, "Elemento removido: " + removido);
                        break;
                case "3":
                        JOptionPane.showMessageDialog(null, p1.imprimir());
                        break;
                case "4":
                        JOptionPane.showMessageDialog(null, "Quantidade de elementos: " + p1.size());
                        break;
                case "5":
                        JOptionPane.showMessageDialog(null, "Elemento do topo: " + p1.top());
                        break;
                case "6":
                        continuar = false;
                        break;
            }
        }
    }
}
