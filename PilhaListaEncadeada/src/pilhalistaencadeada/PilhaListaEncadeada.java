package pilhalistaencadeada;
/**
 *
 * @author Adriele
 */
public class PilhaListaEncadeada {

    private No topo;  //referencia para o nó
    private int qtd;  //quantidade de elementos da pilha
    
    public int size () { //Método size retorna o tamanho da pilha
        return this.qtd;
    }
    
    public boolean isEmpty() { //Método isEmpty se topo == null retorne true, se não, false
        return topo == null;  
    }
    
    public Object top() { //Método top retorna o elemento do topo      
        if (isEmpty()) { System.out.println("Pilha Vazia"); }
        return topo.getElemento();            
    }
    
    public void push (Object elem) { //Médoto push adiciona um novo elemento
        No novoNo = new No(elem, this.topo); //cria e encadeia um novo nó
        this.topo = novoNo;
        this.qtd++;
    }
    
    public Object pop () {    //Método pop retira o elemento do topo e o retorna
        if (isEmpty()) { System.out.println("Pilha Vazia"); }      
        
        Object temp = topo.getElemento();        
        topo = topo.getProxNo(); //desencadeia o nó para o topo
        qtd--;
        return temp;             
    }
       
}

/* Quando se insere um novo elemento na pilha, cria-se um novo nó para o 
elemento inserido e referencia esse elemento a partir do novo nó e insere na 
cabeça da lista

Quando se retira um elemento da pilha, remove o nó da cabeça da lista e retorna 
seu elemento */
