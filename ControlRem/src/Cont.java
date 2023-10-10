public class Cont implements Door {
    private boolean ligado;
    private boolean tocando;
    private int volume;

    //MÉTODO CONST
    public Cont(){
        this.setVolume(50);
        this.setLigado(true);
        this.setTocando(false);
    }

    //MÉTODO SET
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    //MÉTOOD GET
    public boolean getLigado() {
        return ligado;
    }

    public boolean getTocando() {
        return tocando;
    }

    public int getVolume() {
        return volume;
    }


    //INTERFACE
    @Override
    public void ligar() {this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if (this.getLigado()){
            System.out.println("----- MENU -----");
            System.out.println("Esta ligado? " + this.getLigado());
            System.out.println("Esta tocando algo? " + this.getTocando());
            System.out.print("Volume: " + this.getVolume());
            for (int i=10; i <= this.getVolume(); i+=10){
                System.out.print("|");
            }
            System.out.println("");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando aplicativo...");
    }

    @Override
    public void mudoOn() {
        if (this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }

    }

    @Override
    public void mudoOff() {
        if (this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume() + 10);
        }else{
            System.out.println("Impossível aumentar o volume!");
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume() - 10);
        }else {
            System.out.println("Impossível diminuir o volume!");
        }

    }

    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }
    }

}
