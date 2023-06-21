package ICar;

public class Renault extends Carros{

    public Renault(String marca, int ano, double valor, String cor, int portas) {
        super(marca, ano, valor, cor, portas);
    }

    @Override
    public void darPartida() {
        setVelocidade(0);
        System.out.println("Iniciando o motor.. Minha velocidade está em " + getVelocidade() + "km/h");
    }

    @Override
    public void acelerar() {
        setVelocidade(getVelocidade() + 10);
        System.out.println("Acelerando... Minha velocidade está em " + getVelocidade() + "km/h");
    }

    @Override
    public void freiar() {
        if (getVelocidade() > 0){
            setVelocidade(getVelocidade() - 5);
            System.out.println("Freiando! Minha velocidade está em " + getVelocidade() + "km/h");
        } else {
            System.out.println("Já estamos parados.");
        }
    }
}
