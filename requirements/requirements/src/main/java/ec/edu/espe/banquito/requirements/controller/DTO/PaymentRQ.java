package ec.edu.espe.banquito.requirements.controller.DTO;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PaymentRQ {

    private Integer loanId;
    private Integer loanTransactionId;
    private Integer accountTransactionId;
    private String type;
    private String reference;
    private String status;
    private String creditosBankCode;
    private String creditorAccount;
    private String debtorAccount;
    private String debtorBankCode;

}
