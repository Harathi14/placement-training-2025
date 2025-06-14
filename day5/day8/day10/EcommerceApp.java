public class EcommerceApp {
    public static void main(String[] args) {
        CreditCardPayment cc = new CreditCardPayment();
        cc.processpayment(1000);
        System.out.println(cc.getTranscationId(transcation:"Tnx000123"));
    }
    
}
