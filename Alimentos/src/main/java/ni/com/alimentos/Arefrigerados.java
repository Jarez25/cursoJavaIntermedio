package ni.com.alimentos;

import java.util.Date;

public class Arefrigerados extends Alimento{

    private Integer codigo;

    public Arefrigerados(String nombre, Date fecha_de_vecimiento, Integer numero_lote, Integer codigo) {
        super(nombre, fecha_de_vecimiento, numero_lote);
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
}
