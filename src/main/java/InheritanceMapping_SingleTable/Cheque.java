package InheritanceMapping_SingleTable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "chequeSingle")
@DiscriminatorValue(value = "ch")
public class Cheque extends Payment{
    private Long chequeNumber;

    public Long getChequeNumber() {
        return chequeNumber;
    }

    public void setChequeNumber(Long chequeNumber) {
        this.chequeNumber = chequeNumber;
    }
}
