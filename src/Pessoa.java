import java.util.function.DoubleToIntFunction;

public class Pessoa extends Animal {
    // Atributos da pessoa
    public String sobrenome;

    //Métodos da pessoa
    public void falar(){
        System.out.println("falei");
    }

    //sobrecarga do metodo falar ()
    public String falar(String volume){
        return "falei" + volume;
    }
    //sobrescrita do metodo
    public void comer (){
        System.out.println("comeu como pessoa ");
    }

}
