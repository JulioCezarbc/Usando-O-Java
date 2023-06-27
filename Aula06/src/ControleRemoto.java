public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;
    public int canal;

    public ControleRemoto(){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
        this.canal =5;
    }

    private int getVolume(){
        return volume;
    }
    private void setVolume(int v){
        this.volume = v;
    }

    private boolean getligado(){
        return ligado;
    }
    private void setLigado(boolean l){
        this.ligado = l;
    }

    private boolean getTocando(){
        return tocando;
    }
    private void setTocando(boolean t){
        this.tocando = t;
    }

    private int getCanal(){
        return canal;
    }
    private void setCanal(int c){
        this.canal = c;
    }


    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("--------------MENU---------------");
        System.out.println("Esta ligado? " + this.getligado());
        System.out.println("Esta tocando? " + this.getTocando());
        System.out.println("Canal: " + this.canal);
        System.out.print("Volume: " + this.getVolume() + " ");
        for (int i =10; i<=this.getVolume(); i+=10){
            System.out.print("|");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu! ");
    }

    @Override
    public void maisVolume() {
        if (getligado()){
            setVolume(getVolume() + 5);
        }
    }

    @Override
    public void menosVolume() {
        if (getligado()){
            setVolume(getVolume() - 5);
        }
    }

    @Override
    public void ligarMudo() {
        if (getligado() && getVolume() >0){
            setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (getligado() && getVolume()  == 0){
                setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.getligado() && !(this.getTocando())){
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if (this.getligado() && this.getTocando()){
            this.setTocando(false);
        }
    }

    @Override
    public void menosCanal() {
        if (this.getligado()){
            this.canal -= 1;
        }
    }

    @Override
    public void maisCanal() {
        if (this.getligado()){
            this.canal +=1;
        }
    }
}
