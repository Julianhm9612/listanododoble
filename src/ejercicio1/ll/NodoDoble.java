package ejercicio1.ll;

public class NodoDoble{
    private int numero;
    private NodoDoble ligaDer, ligaIzq;
    
    public NodoDoble(int pNum){ //constructor
        numero = pNum;
        ligaDer = ligaIzq = null;
    }
    public int GetNumero(){
        return numero;
    }
    public void SetNumero(int pNum){
        numero = pNum;
    }
    public NodoDoble RetornaLDer(){
        return ligaDer;
    }
    public void AsignaLDer(NodoDoble pLDer){
        ligaDer = pLDer;
    }
     public NodoDoble RetornaLIzq(){
        return ligaIzq;
    }
        public void AsignaLIzq(NodoDoble pLIzq){
        ligaIzq = pLIzq;
    }
}