package ni.com.alimentos;

import java.util.Date;

public class Acongelados extends Alimento{

    private String temperatura_recomendada;

    public Acongelados(String nombre, Date fecha_de_vecimiento, Integer numero_lote, String temperatura_recomendada) {
        super(nombre, fecha_de_vecimiento, numero_lote);
        this.temperatura_recomendada = temperatura_recomendada;
    }

    public String getTemperatura_recomendada() {
        return temperatura_recomendada;
    }

    public void setTemperatura_recomendada(String temperatura_recomendada) {
        this.temperatura_recomendada = temperatura_recomendada;
    }
}
