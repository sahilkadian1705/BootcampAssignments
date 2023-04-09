package InheritanceMapping_SingleTable;

import jakarta.persistence.*;

@Entity
@Table(name = "paymentSingle")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "pmode",discriminatorType = DiscriminatorType.STRING)
public class Payment {
    @Id
    int id;
    Double amount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
