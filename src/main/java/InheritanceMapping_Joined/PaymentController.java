package InheritanceMapping_Joined;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
    @Autowired
    PaymentRepository paymentRepository;

    @GetMapping("/payment/cheque")
    public void addCheque(){
        Cheque cheque=new Cheque();
        cheque.setId(123);
        cheque.setAmount(10000.0);
        cheque.setChequeNumber(123456789L);
        paymentRepository.save(cheque);
    }

    @GetMapping("/payment/card")
    public void addCreditCard(){
        CreditCard card=new CreditCard();
        card.setId(124);
        card.setAmount(20000.0);
        card.setCardNumber(987654321L);
        paymentRepository.save(card);
    }
}
