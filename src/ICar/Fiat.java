package ICar;

public class Fiat extends Carros {

    public Fiat(String marca, int ano, double valor, String cor, int portas) {
        super(marca, ano, valor, cor, portas);
    }

    @Override
    public void darPartida() {
        setVelocidade(3);
        System.out.println("Iniciando o motor.. Minha velocidade está em " + getVelocidade() + "km/h");
    }

    @Override
    public void acelerar() {
        setVelocidade(getVelocidade() + 12);
        System.out.println("Acelerando... Minha velocidade está em " + getVelocidade() + "km/h");
    }

    @Override
    public void freiar() {
        if (getVelocidade() > 3){
            setVelocidade(getVelocidade() - 6);
            System.out.println("Freiando! Minha velocidade está em " + getVelocidade() + "km/h");
        } else {
            System.out.println("Já estamos parados.");
        }
    }

}
