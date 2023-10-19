package Singleton;

public class Test {
    public static void main(String[] args) {
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);


        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        lazy = SingletonLazy.getInstancia();
        System.out.println(eager);
        
        SingletonLazyHolder Holder = SingletonLazyHolder.getInstancia();
        System.out.println(Holder);
        lazy = SingletonLazy.getInstancia();
        System.out.println(Holder);
   
    }

    
}
