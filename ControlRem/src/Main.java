import javax.naming.ldap.Control;

public class Main {
    public static void main(String[] args) {
        Cont controle = new Cont();
        controle.ligar();
        controle.maisVolume();
        controle.menosVolume();
        controle.setVolume(70);
        controle.play();
        controle.abrirMenu();

    }
}