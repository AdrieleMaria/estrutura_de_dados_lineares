package pilharubronegra;
/**
 *
 * @author Adriele
 */
public class PilhaDupla {
    public Object[] pilhaD; //array que irá armazenar as duas pilhas
    public int topoVermelho; //ultimo elemento inserido vermelho
    public int topoPreto; //ultimo elemento inserido preto
    public int tam; //MAX do array

    public PilhaDupla(int t){
        tam = t - 1;
        topoVermelho = -1;
        topoPreto = tam;
        pilhaD = new Object[t];        
    }
    
    //método isEmpty - Confirma se a pilha esta vazia
    public boolean isEmptyVermelho() {
        return topoVermelho == -1;
    }
    
    public boolean isEmptyPreto() {
        return topoPreto == tam;
    }    
    
    //método Size - retorna o numero de elementos armazenados
    public int sizeVermelho() {
        if (isEmptyVermelho()) {
            return 0;
        }
        return topoVermelho + 1;
    }
    
    public int sizePreto() {
        if (isEmptyPreto()) {
            return 0;
        }
        return pilhaD.length - (topoPreto + 1);
    }
    
    //método top - retorna o elemento do topo
    public Object topVermelho() {
        if (isEmptyVermelho()) {
            return null;
        }
        return pilhaD[topoVermelho];
    }
    
    public Object topPreto() {
        if (isEmptyPreto()) {
            return null;
        }
        return pilhaD[topoPreto];
    }
    
    //métodos Pop - remove e retorna o último elemento do topo
    public Object popVermelho() {
        if (isEmptyVermelho()) {
            return null;
        }
        return pilhaD[topoVermelho--];
    }
    
    public Object popPreto() {
        if (isEmptyPreto()) {
            return null;
        }
        return pilhaD[topoPreto++];
    }
    
    //método Push - insere um elemento na pilha
    public void pushVermelho(Object e){
        if ((topoPreto - topoVermelho) == 1 ) {
            pilhaD[++topoVermelho] = e;
            ++topoVermelho;
        }
        pilhaD[++topoVermelho] = e;
    }
    
    public void pushPreto(Object e){
        if ((topoPreto - topoVermelho) == 1 ) {            
            pilhaD[--topoPreto] = e;
            --topoPreto;
        }         
        pilhaD[--topoPreto] = e;        
    } 
    
    // quantidade soma dos sizes(preto e vermelho)
    public int qtd(){
        return ((topoVermelho + 1)+ (pilhaD.length - (topoPreto + 1)));
    }
    
    //imprimir elemento bonitinho!!!
    public String imprimir(){
        String retorno = " ";
        for (int i =  tam; i >= 0; i--){
           retorno += pilhaD[i] + "\n ";
        }
        return retorno;
    }     
    
}
