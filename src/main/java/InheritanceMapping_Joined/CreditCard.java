package InheritanceMapping_Joined;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "cardJoined")
@PrimaryKeyJoinColumn(name = "id")
public class CreditCard extends Payment {
    private Long cardNumber;

    public Long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(Long cardNumber) {
        this.cardNumber = cardNumber;
    }
}
