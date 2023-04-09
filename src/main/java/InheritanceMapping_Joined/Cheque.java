package InheritanceMapping_Joined;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "chequeJoined")
@PrimaryKeyJoinColumn(name = "id")
public class Cheque extends Payment {
    private Long chequeNumber;

    public Long getChequeNumber() {
        return chequeNumber;
    }

    public void setChequeNumber(Long chequeNumber) {
        this.chequeNumber = chequeNumber;
    }
}
