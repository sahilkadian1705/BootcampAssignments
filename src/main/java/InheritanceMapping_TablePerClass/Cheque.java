package InheritanceMapping_TablePerClass;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "chequePerClass")
public class Cheque extends Payment {
    private Long chequeNumber;

    public Long getChequeNumber() {
        return chequeNumber;
    }

    public void setChequeNumber(Long chequeNumber) {
        this.chequeNumber = chequeNumber;
    }
}
