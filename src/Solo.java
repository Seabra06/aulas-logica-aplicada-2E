public class Solo {
    String tipoSolo;
    String cor;
    boolean fertil;
    //metodos
    public Planta gerarPlanta(Semente s1){
        Planta p1 = new Planta(s1);
        return p1;
    }
}
