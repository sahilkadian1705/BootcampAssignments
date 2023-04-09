package InheritanceMapping_TablePerClass;

import jakarta.persistence.*;

@Entity
@Table(name = "paymentPerClass")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
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
