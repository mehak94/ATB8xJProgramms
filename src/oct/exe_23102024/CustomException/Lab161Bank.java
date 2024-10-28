package oct.exe_23102024.CustomException;

public class Lab161Bank {
        private String currency;
        private Integer amount;
public Lab161Bank ( String currency, Integer amount){
    this.currency = currency;
    this.amount= amount;
}
    public Integer getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
    public Integer add(Lab161Bank bankName)throws Exception{
    if(!bankName.currency.equalsIgnoreCase("INR")) {
        throw new Exception("Currency Mismatch, Cannot proceed");
    }
    return bankName.amount +this.amount;

}}

