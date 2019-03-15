package PilhaComArray;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Augusto
 */
public class PilhaArray {
   Object S[] = new Object[3];
   int topo = -1;
//O topo controla qual posição ta o ultimo elemento armazenado
   
   public void push(Object o){
       if(topo==S.length-1){
           Object A[];
           A = new PilhaArray[S.length*2];
           for (int i=0; i<=topo; i++){
               A[i] = S[i];
               S = A;
           }
           topo++;
           S[topo] = o;
       }
   }
//inseri elementos na pilha
   
   public Object pop(){
       if(isEmpty()){
           System.out.println("A pilha está vazia");
           return null;
       }else{
           Object temp = S[topo];
           S[topo] = null;
           topo--;
           return temp;
       }
   }
//metodo que vai retornar objeto
   
   public boolean isEmpty(){
       return (topo == -1);
   }
//metodo que indica se a pilha ta vazia
   
   /*public boolean isFull(){
       return(topo==S.length -1);
   }*/
 //metodo que indica se a pilha ta cheia
   public Object top(){
       if(isEmpty()){
           System.out.println("A pilha está vazia");
           return null;
       }else{
           return S[topo];
       }
//retorna o elemento do topo
    }
   
   public int size(){
       return topo +1; 
   }
//retorna o tamanho da pilha
   String imprimir(){
       String retorno = " ";
       for (int i =  topo; i >= 0; i--){
           retorno += S[i] + " ";
       }
       return retorno;
   }
}