interface paymentgateway {
    boolean processpayment(double amunt);
    String getTransctionId(String transctionId);
}
class CreditCardPayment(double amount) {
    System.out.println("processing payment" + amount);
    returntrue;
    ]
    public String getTranscationId(String transcationid) {
        return "Credit Card Transction Id"