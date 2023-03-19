public class TestGerente {

    public static void main(String[]args){
        Gerente gerente=new Gerente();
        //gerente.setSalario(5000.0);
        //Funcionario gerente = new Funcionario();
        gerente.setClave("AluraCursosOnline");
        gerente.setSalario(60000);
        gerente.setTipo(1);

        System.out.println(gerente.getBonificacion());
        System.out.println(gerente.IniciarSesion("AluraCursosOnline"));

    }
}
