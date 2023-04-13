public class Main {
    public static void main(String[] args) {
        // laço enquanto- while
        int cont =0;
        while (cont <10){
            System.out.println("Contador = " + cont);
            //incremento
            cont = cont + 1;
        }
        //laço do para faça - for
        for(int x = 0; x < 10; x++){
            System.out.println("Contador = " + x);
        }
        // laço faça enquanto - do while
        int conte = 1;
        do{
            //processo
            System.out.println(cont);
            conte++; // incremento
        }while (conte <= 10);
    }
}