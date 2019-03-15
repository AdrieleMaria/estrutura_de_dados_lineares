package filalistaencadeada;
/**
 *
 * @author Adriele
 */
public class FilaListaEncadeada {

    private No inicio;
    private No fim;
    private int tamanho;

    public void enfileirar(Object o) {
        
          No no = new No(o,null);
          no.setElemento(o);
          no.setProxNo(null);//no sera novo no do final
          
          if(tamanho == 0) 
              inicio = no;// caso para lista vazia
          else
              fim.setProxNo(no);//adiciona no no final da lista
          fim = no; //atualiza referencia ao no do final
          tamanho++;        
    }

    public Object desenfileirar() {
        
        if(estaVazia())
            System.out.println("Fila vazia");
        Object tmp = inicio.getElemento();
        inicio = inicio.getProxNo();
        tamanho--;
        return tmp;
    }

    public Object inicio() {
        if (this.inicio == null)
            System.out.println("Fila vazia");
        return this.inicio.getElemento();
    }

    public int tamanho() {
        return this.tamanho;
    }

    public boolean estaVazia() {
        return this.inicio == null;
    }
     
}

