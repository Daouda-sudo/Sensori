import java.time.LocalDate;
public class Sensore {
    //attributi
    private String ip;
    private LocalDate sostituzioneBatteria;
    private LocalDate ultimaSostituzioneBatteria;
    //costruttori
    public Sensore(String ip, LocalDate sostituzioneBatteria, LocalDate ultimaSostituzioneBatteria) {
      this.ip=ip;
      this.sostituzioneBatteria=sostituzioneBatteria;
      this.ultimaSostituzioneBatteria=ultimaSostituzioneBatteria;
    }
    //metodi get e set

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public LocalDate getSostituzioneBatteria() {
        return sostituzioneBatteria;
    }

    public void setSostituzioneBatteria(LocalDate sostituzioneBatteria) {
        this.sostituzioneBatteria = sostituzioneBatteria;
    }

    public LocalDate getUltimaSostituzioneBatteria() {
        return ultimaSostituzioneBatteria;
    }

    public void setUltimaSostituzioneBatteria(LocalDate ultimaSostituzioneBatteria) {
        this.ultimaSostituzioneBatteria = ultimaSostituzioneBatteria;
    }

    //toString
    public String ToString() {
        return "sensore[ip: " + ip + "la batteria è stata sostituita il: " + sostituzioneBatteria + "la batteria è stata sostituita l'ultima volta il " + ultimaSostituzioneBatteria + "]";
    }
}
