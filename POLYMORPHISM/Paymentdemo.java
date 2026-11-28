public class Paymentdemo {
    public static void main(String[] args) {
        payment Payment;   //HERE payment is user defined data type. Payment is variable
        Payment = new cardpayment();
        Payment.pay(1500000);
    }
}

class payment {
    void pay(double amount) {
        System.out.println("Generic payment: " + amount);
    }
}

class cardpayment extends payment {
    @Override
    void pay(double amount) {
        System.out.println("Paid by card: " + amount);
    }
}

class upipayment extends payment {
    @Override
    void pay(double amount) {
        System.out.println("Paid by upi: " + amount);
    }
}