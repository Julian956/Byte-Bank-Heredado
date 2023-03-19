public class FuncionarioAutentic extends Funcionario{

    private String Clave;


    public void setClave(String Clave){
        this.Clave = Clave;

    }
    public boolean IniciarSesion(String Clave){
        return Clave == "AluraCursosOnline";
    }

    @Override
    public double getBonificacion() {
        return 0;
    }
}
