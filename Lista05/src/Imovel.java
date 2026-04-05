public class Imovel {

    private String endereco;
    private int area;
    private Bairro bairro;
    private Finalidade finalidade;

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getArea() {
        return area;
    }
    public void setArea(int area){
        this.area = area;
    }

    public Bairro getBairro(){
        return bairro;
    }
    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    public Finalidade getFinalidade(){
        return this.finalidade;
    }
    public void setFinalidade(Finalidade finalidade){
        this.finalidade = finalidade;
    }

    public double calcularIptu(){

        return 0;
    }







}
