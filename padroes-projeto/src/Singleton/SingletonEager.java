package Singleton;

public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager()
;
    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstancia(){

        // SINGLE APRESSADO JA RESOLVE TUDO E O PREGUIÇOSO VERIFICA SE FOR NULA OU NÃO 
        // if(instancia == null){
        //     instancia = new SingletonEager();
        // }
        return instancia;
    }


    
}
