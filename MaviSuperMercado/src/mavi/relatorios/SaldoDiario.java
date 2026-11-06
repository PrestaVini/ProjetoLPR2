


package mavi.relatorios;

public class SaldoDiario {

    private double VendaDiaria;
    private double CompraDiaria;

    public double getVendaDiaria() {
        return VendaDiaria;
    }

    public void setVendaDiaria(double VendaDiaria) {
        this.VendaDiaria = VendaDiaria;
    }

    public double getCompraDiaria() {
        return CompraDiaria;
    }

    public void setCompraDiaria(double CompraDiaria) {
        this.CompraDiaria = CompraDiaria;
    }

    public void Resetar() {
        this.VendaDiaria = 0;
        this.CompraDiaria = 0;
    }


}
