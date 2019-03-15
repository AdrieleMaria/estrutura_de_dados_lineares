 package filaarray;
/**
 *
 * @author Adriele
 */
public class FilaArray {

    private Object A[]; //array de objetos
    private int frente; // indice que guarda o primeiro elemento da fila ou seja, o da frente
    private int proxLivre; // indice para a proxima posição livre
        
    public int tamanho() {
        return (A.length - frente + proxLivre)%A.length;
    }

    public boolean estaVazia() {
        return frente == proxLivre;
    }

    public Object inicio() {
        if (estaVazia())
            System.out.println("Fila vazia");
        return A[frente];
    }

    public void enfileirar(Object o) {
        Object aux[];
        int cont;
        
        if (tamanho() == A.length-1){
            aux = new Object[A.length*2];
        
            for (cont = 0; cont < tamanho(); cont++) {
                aux[cont] = A[(this.frente + cont) % A.length];
            }
        
            this.frente = 0;
            this.proxLivre = cont;
            A = aux;
        }
        
        A[proxLivre] = o;
        //quando acrescenta um elemento, armazena em A[f] e incrementa f para indicar a proxima celula livre em A
        proxLivre = (proxLivre+1)%A.length;//implementar o array circular, quando incrementa f calcula como (f+1)mod N
        
    }

    public Object desenfileirar(){
        Object temp;
        if(estaVazia()){ System.out.println("Fila vazia");} 
        
        temp = A[frente]; 
        //quando remove um elemento da frente incrementa para indicar a próxima celula da frente
        frente = (frente+1)%A.length;//implementar o array circular, quando incrementa frente calcula como (frente+1)mod N        
        return temp;
    }
    
}
