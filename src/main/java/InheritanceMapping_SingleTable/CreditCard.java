package InheritanceMapping_SingleTable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "cardSingle")
@DiscriminatorValue(value = "cc")
public class CreditCard extends Payment{
    private Long cardNumber;

    public Long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(Long cardNumber) {
        this.cardNumber = cardNumber;
    }
}
