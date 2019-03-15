package implementaçãorb;

public class PilhaRB {
    
    public Object[] pilha;
    public int posiçãoVermelho;
    public int posiçãoPreto;
    public int Tamanho;

    public PilhaRB(int t){
        this.Tamanho = t - 1;
        this.posiçãoVermelho = -1;
        this.posiçãoPreto = this.Tamanho;
        this.pilha = new Object[t];        
    }
    
    //método isEmpty - indica se há ou não elementos na pilha
    public boolean isEmptyVermelho() {
        if (this.posiçãoVermelho == -1) {
            return true;
        }
        return false;
    }
    
    public boolean isEmptyPreto() {
        if (this.posiçãoPreto == this.Tamanho) {
            return true;
        }
        return false;
    }    
    
    //método Size - retorna o numero de elementos armazenados
    public int sizeVermelho() {
        if (this.isEmptyVermelho()) {
            return 0;
        }
        return this.posiçãoVermelho + 1;
    }
    
    public int sizePreto() {
        if (this.isEmptyPreto()) {
            return 0;
        }
        return this.pilha.length - (this.posiçãoPreto + 1);
    }
    
    //método top - retorna o ultimo elemento inserido sem remove-lo
    public Object topVermelho() {
        if (this.isEmptyVermelho()) {
            return null;
        }
        return this.pilha[this.posiçãoVermelho];
    }
    
    public Object topPreto() {
        if (this.isEmptyPreto()) {
            return null;
        }
        return this.pilha[this.posiçãoPreto];
    }
    
    //métodos Pop - remove e retorna o ultimo elemento inserido
    public Object popVermelho() {
        if (isEmptyVermelho()) {
            return null;
        }
        return this.pilha[this.posiçãoVermelho--];
    }
    
    public Object popPreto() {
        if (isEmptyPreto()) {
            return null;
        }
        return this.pilha[this.posiçãoPreto++];
    }
    
    //método Push - insere um elemento
    public void pushVermelho(Object e){
        if ((this.posiçãoPreto - this.posiçãoVermelho) == 1 ) {
            
            Object[] newPilha = new Object[this.pilha.length * 2];
            for(int i = 0; i <= this.posiçãoVermelho; i++ ){
                newPilha[i] = this.pilha[i];
            }
            for(int p = 0; p < this.sizePreto(); p++){
                newPilha[(newPilha.length -1) - p ] = this.pilha[(this.pilha.length - 1) - p];
                this.posiçãoPreto = (newPilha.length -1) - p;
                System.out.println("index da nova pilha: " + ((newPilha.length -1) - p));
                System.out.println("index da pilha velha: " + ((this.pilha.length - 1) - p));
            }
            this.pilha = newPilha;
            this.pilha[++posiçãoVermelho] = e;
        }
        this.pilha[++posiçãoVermelho] = e;
    }
    
    public void pushPreto(Object e){
        if ((this.posiçãoPreto - this.posiçãoVermelho) == 1 ) {
            
            Object[] newPilha = new Object[this.pilha.length * 2];
            for(int i = 0; i <= this.posiçãoVermelho; i++ ){
                newPilha[i] = this.pilha[i];
            }
            for(int p = 0; p < this.sizePreto(); p++){
                newPilha[(newPilha.length -1) - p ] = this.pilha[(this.pilha.length - 1) - p];
                this.posiçãoPreto = (newPilha.length -1) - p;
                System.out.println("index da nova pilha: " + ((newPilha.length -1) - p));
                System.out.println("index da pilha velha: " + ((this.pilha.length - 1) - p));
            }
            this.pilha = newPilha;
            this.pilha[--posiçãoPreto] = e;
        }        
        this.pilha[--posiçãoPreto] = e;        
    } 
    
    
    public static void main(String[] args) {
        PilhaRB p = new PilhaRB(4);
        p.pushPreto("preto");
        p.pushPreto("ultimo preto");
        p.pushPreto("Preto3");
        System.out.println("posição preto: " + p.posiçãoPreto);
        
        p.pushVermelho("elemento vermelho");
        p.pushVermelho("Vermelho");
        p.pushVermelho("Vermelho2");
        System.out.println("posição vermelho: " + p.posiçãoVermelho);        
    }    
}
