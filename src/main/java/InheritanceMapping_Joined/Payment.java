package InheritanceMapping_Joined;

import jakarta.persistence.*;

@Entity
@Table(name = "paymentJoined")
@Inheritance(strategy = InheritanceType.JOINED)
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
