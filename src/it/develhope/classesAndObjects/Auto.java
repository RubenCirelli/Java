package it.develhope.classesAndObjects;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Auto {

    private float cilindrata;
    private String marca, modello, targa;

    //inizio cilindrata
    public float getCilindrata(){
        return this.cilindrata;
    };
    public void setCilindrata(float cilindrata){
        this.cilindrata = cilindrata;
    };
    //fine cilindrata

    //Inizio Marca
    public String getMarca(){
        return this.marca;
    };
    public void setMarca(String marca){
        this.marca = marca;
    };
    //fine marca
    //Inizio Modello
    public String getModello(){
        return this.modello;
    };
    public void setModello(String modello){
        this.modello = modello;
    };//fine modello
    //inizio targa
    public String getTarga(){
        return this.targa;
    };
    public void setTarga(String targa){
        this.targa = targa;
    };
    //fine targa


    @Override
    public String toString() {
        return "Auto{" +
                "cilindrata=" + cilindrata +
                ", marca='" + marca + '\'' +
                ", modello='" + modello + '\'' +
                ", targa='" + targa + '\'' +
                '}';
    }
}