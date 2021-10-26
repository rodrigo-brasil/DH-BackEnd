package Flyweight.Roupas;

import java.util.Objects;

public class Roupa {
    private String tamanho;
    private String tipo;
    private boolean eNova;
    private boolean importado;

    public Roupa(String tamanho, String tipo, boolean eNova, boolean importado) {
        this.tamanho = tamanho;
        this.tipo = tipo;
        this.eNova = eNova;
        this.importado = importado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Roupa)) return false;
        Roupa roupa = (Roupa) o;
        return eNova == roupa.eNova && importado == roupa.importado && Objects.equals(tamanho, roupa.tamanho) && Objects.equals(tipo, roupa.tipo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tamanho, tipo, eNova, importado);
    }
}
