public class CuentaAhorros extends Cuenta{

    public CuentaAhorros(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor) {
        super.saldo+= valor;
    }

    @Override
    public boolean saca(double valor) {
        double Comsion = 0.5;
        return super.saca(valor + Comsion);
    }
}
