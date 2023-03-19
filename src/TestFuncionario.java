public class TestFuncionario {
    public static void main(String[]args){
        Funcionario Diego = new Contador();
        Diego.setDocumento("Diego");
        Diego.setDocumento("123154648");
        Diego.setSalario(25000);
        Diego.setTipo(0);

        System.out.println(Diego.getSalario());
        System.out.println(Diego.getBonificacion());
    }
}
