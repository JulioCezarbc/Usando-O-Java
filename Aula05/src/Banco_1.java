public class Banco_1 {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    private Usuario usuario;
    public Banco_1(Usuario usuario){
        this.setSaldo(0);
        this.setStatus(false);
        this.usuario = usuario;
    }
    public void estadoAtual(){
        System.out.println("-----------------------------");
        System.out.println("Conta: " + this.getnumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Stauts: "+ this.getStatus());
        System.out.println("----------------------------");
    }
    public void realizarAutenticacao (String nomeUsuario, String senha){
        if (usuario != null && usuario.getNomeUsuario().equals(nomeUsuario) && usuario.getSenha().equals(senha)){
            System.out.println("Autenticação bem sucedida");
        }
        else{
            System.out.println("Credenciais invalidas");
        }
    }
    public void abrirConta(String tp){
        this.setTipo(tp);
        this.setStatus(true);
        if (tp.equals("CC")){
            this.setSaldo(50);
        }
        else if (tp.equals("CP")) {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }
    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("Conta nao pode ser fechada");
        }
        else if (this.getSaldo() <0) {
            System.out.println("Conta nao pode ser fechada, pois conta nao tem debito");
        }else {
            this.setStatus(false);
            System.out.println("Conta fechada!");
        }
    }
    public void depositar(float v){
        if (this.getStatus()){
            this.setSaldo((int) (this.getSaldo() + v));
            System.out.println("Deposito realizado na conta de " + this.getDono());
        }
        else {
            System.out.println("Impossivel depositar!");
        }
    }
    public void sacar(float v){
        if (this.getStatus()){
            if (this.getSaldo() >= v){
                saldo = saldo - v;
                System.out.println("Saque realizado na conta de " + this.getDono());
            }else {
                System.out.println("Saldo insuficiente!");
            }
        }else{
            System.out.println("Impossivel detectar a conta!");
        }
    }
    public void pagarMensal(){
        int v = 0;
        if (this.getTipo().equals("CC")){
            v =12;
        }else if (this.getTipo().equals("CP")){
            v = 20;
        }
        if (this.getStatus()){
            saldo = saldo - v;
            System.out.println("Mensalidade paga por " + this.getDono());
        }else {
            System.out.println("Impossivel realizar o pagamento");
        }
    }


    public void setnumConta(int nm){this.numConta = nm;}
    public int getnumConta(){
        return this.numConta;
    }


    public void setTipo(String tp){this.tipo = tp;}
    public String getTipo(){return this.tipo;}

    public void setDono(String dn){this.dono = dn;}
    public String getDono(){return this.dono;}

    public void setSaldo(int sl){this.saldo = sl;}
    public float getSaldo() {return this.saldo;}

    public void setStatus(boolean st){this.status = st;}
    public boolean getStatus(){return this.status;}
}
