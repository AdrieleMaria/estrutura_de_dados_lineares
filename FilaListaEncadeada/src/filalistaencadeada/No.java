package filalistaencadeada;
/**
 *
 * @author Adriele
 */
public class No {
    private Object elemento;
    private No proxNo;
    
    //Cria um nó com um dado elemento e o proximo nó
    public No (Object elemento, No proxNo) {
        this.elemento = elemento;
        this.proxNo = proxNo;
    }
    
    //Metodo modificador set
    public void setElemento (Object novoElemento){
        this.elemento = novoElemento;
    }
    
    public void setProxNo (No novoProx) {
        this.proxNo = novoProx;
    }
    
    //Metodo de acesso get
    public Object getElemento () {
        return this.elemento;
    }   
    
    public No getProxNo () {
        return this.proxNo;
    }
}
