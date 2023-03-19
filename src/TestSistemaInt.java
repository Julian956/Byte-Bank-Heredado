public class TestSistemaInt {
    public static void main(String[] args) {
        SistemaInt sistema = new SistemaInt();
        Gerente gerente1 = new Gerente();
        Administrador Admin = new Administrador();

        sistema.autentica(gerente1);
        sistema.autentica(Admin);
    }
}
