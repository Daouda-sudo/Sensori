public class Sensori {
    private Sensore[] sensori;
    private int dim;
    private String ipDaTrovare;
    private String ipDaEliminare;
    //costruttore
    public Sensori() {
        dim = 0;
        sensori = new Sensore[10];
    }

    // metodo aggiungi
    public void aggiungi(Sensore a) {
        sensori[dim] = a;
        dim = dim + 1;
    }
    //metodo ricerca
     public Sensore trovaSensore(String ipDaTrovare){
        for(int i=0; i<dim;i++){
            if (sensori[i].getIp().equals((ipDaTrovare))){
                break;
            }
            return
        }
     }
    //metodo cancellazione
    public void eliminaSensore(String ip){
    if
    }
    //metodo per visulaiizzare i sensori
    public String toString(){
        String b="";
        for(int i=0; i<dim; i++){
            b=b+sensori[i];

        }
        return b;
    }

}
