public class interface_{
    interface Payment {
        void makePayment();
    }
    static class UPI implements Payment {
        @Override
        public void makePayment() {
            System.out.println(
                    "Payment made using UPI."
            );
        }
    }
    static class CreditCard implements Payment {
        @Override
        public void makePayment() {
            System.out.println(
                    "Payment made using Credit Card."
            );
        }
    }
    public static void main(String[] args) {
        Payment payment = new UPI();
        payment.makePayment();
        payment = new CreditCard();
        payment.makePayment();
    }
}