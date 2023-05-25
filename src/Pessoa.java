import java.util.function.DoubleToIntFunction;

public class Pessoa {
    // Atributos da pessoa
    public String nome;
    public String sobrenome;
    //Métodos da pessoa
    public void falar(){
        System.out.println("falei");
    }
    //sobrecarga do metodo falar ()
    public String falar(String volume){
        return "falei" + volume;
    }
}
