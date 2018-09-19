package ejercicio1.ll;

public class ListaLigada 
{
    private NodoDoble cab, ult, x;
    public ListaLigada() //costructor
    {
        cab = new NodoDoble(0);
        ult = x = cab;
    }
    public void Ingresar(int pNum)
    {
        NodoDoble p = new NodoDoble(pNum);
        p.AsignaLDer(cab);
        p.AsignaLIzq(ult);
        ult.AsignaLDer(p);
        ult = p;      
        cab.AsignaLIzq(p);
    }
    public int MostrarLista()
    {
        x = x.RetornaLDer();
        return x.GetNumero();        
    }
    public void BorraParam(int param)
    {
        NodoDoble p = cab.RetornaLDer();
        while(p.GetNumero() != 0){
            if(p.GetNumero() == param){
                NodoDoble auxI = p.RetornaLIzq();
                NodoDoble auxD = p.RetornaLDer();
                auxI.AsignaLDer(auxD);
                auxD.AsignaLIzq(auxI);
            }
            p = p.RetornaLDer();
        }
    }
     public void PenUlt()
    {
        NodoDoble p = ult.RetornaLIzq();
            if(p.GetNumero() % 2 == 0)
            p.SetNumero(100);    
            else{
                p = p.RetornaLIzq();
                p.AsignaLDer(ult);
                ult.AsignaLIzq(p.RetornaLDer());
            }
    }
    public void IntercambiarInfo()
    {
        int aux;
        NodoDoble segundo;
        segundo = cab.RetornaLDer().RetornaLDer();
        aux = segundo.GetNumero();
        segundo.SetNumero(segundo.RetornaLDer().RetornaLDer().GetNumero());
        segundo.RetornaLDer().RetornaLDer().SetNumero(aux);
    }    
}