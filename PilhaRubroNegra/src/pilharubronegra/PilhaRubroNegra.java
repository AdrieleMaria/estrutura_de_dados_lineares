/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilharubronegra;

import javax.swing.JOptionPane;

/**
 *
 * @author Adriele
 */
public class PilhaRubroNegra {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PilhaDupla p1 = new PilhaDupla(10);
        String S;
        Object removido;
        boolean continuar = true;
        
        while(continuar){
            String op = JOptionPane.showInputDialog(" 1: Push vermelho \n "
                                                  + "2: Push preto \n "
                                                  + "3: Pop vermelho \n "
                                                  + "4: Pop preto \n "
                                                  + "5: Top vermelho \n "
                                                  + "6: Top preto \n "
                                                  + "7: Size vermelho \n "
                                                  + "8: Size preto \n "
                                                  + "9: Size total \n "
                                                  + "10: Exibir \n "
                                                  + "11: Sair");
            switch(op){
                case "1":
                        S = JOptionPane.showInputDialog("Digite um elemento vermelho");
                        p1.pushVermelho(S);
                        break;
                case "2":
                        S = JOptionPane.showInputDialog("Digite um elemento preto");
                        p1.pushPreto(S);
                        break;                
                case "3":
                        removido = p1.popVermelho();
                        JOptionPane.showMessageDialog(null, "Elemento removido: " + removido);
                        break;
                case "4":
                        removido = p1.popPreto();
                        JOptionPane.showMessageDialog(null, "Elemento removido: " + removido);
                        break;
                case "5":
                        JOptionPane.showMessageDialog(null, "Elemento do topo: " + p1.topVermelho());
                        break;
                case "6":
                        JOptionPane.showMessageDialog(null, "Elemento do topo: " + p1.topPreto());
                        break;
                case "7":
                        JOptionPane.showMessageDialog(null, "Quantidade de elementos: " + p1.sizeVermelho());
                        break;
                case "8":
                        JOptionPane.showMessageDialog(null, "Quantidade de elementos: " + p1.sizePreto());
                        break;
                case "9":
                        JOptionPane.showMessageDialog(null, "elementos totais: " + p1.qtd());
                        break;
                case "10":                        
                        JOptionPane.showMessageDialog(null, p1.imprimir());
                        break;
                case "11":
                        continuar = false;
                        break;
                
            }
        }
    }    
       
}
