public class SistemaInt {

    private String Clave="123456";
    public boolean autentica(FuncionarioAutentic gerente){
        boolean PuedeIniciarseion= gerente.IniciarSesion(Clave);
        if (PuedeIniciarseion){
            System.out.println("Login exitoso");
            return true;
        }else{
            System.out.println("Error en login");
            return false;
        }
    }
}
