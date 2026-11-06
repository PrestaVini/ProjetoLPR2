


package mavi.relatorios;

import java.time.LocalDate;
import javax.swing.JOptionPane;

public class Data {
    public LocalDate dataAtual = LocalDate.now();

    public LocalDate getDataAtual() {
        return dataAtual;
    }

    public boolean passarDia() {
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja fechar o dia?");
        if (resposta == JOptionPane.YES_OPTION) {
            this.dataAtual = this.dataAtual.plusDays(1);
            return true;
        }
        return false;
    }
}
