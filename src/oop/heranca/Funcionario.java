
package oop.heranca;

import java.time.LocalDate;

public class Funcionario extends Pessoa {
    
    private LocalDate dataAdmissao;
    private String registro;

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }
    
    
    
}
