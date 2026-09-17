package observation;

// Main Execution Class (File Name MUST be BankUpi.java)
public class BankUpi {

    //==========================================
    // 1. PaymentService Interface
    //==========================================
    interface PaymentService {
        void pay(String upiId, double amount)
                throws InvalidUPIException, InvalidAmountException, InsufficientBalanceException;

        double checkBalance();
    }

    //==========================================
    // 2. Nested Custom Exceptions
    //==========================================
    static class InsufficientBalanceException extends Exception {
        private static final long serialVersionUID = 1L;

        InsufficientBalanceException(String message) {
            super(message);
        }
    }

    static class InvalidUPIException extends Exception {
        private static final long serialVersionUID = 1L;

        InvalidUPIException(String message) {
            super(message);
        }
    }

    static class InvalidAmountException extends Exception {
        private static final long serialVersionUID = 1L;

        InvalidAmountException(String message) {
            super(message);
        }
    }

    //==========================================
    // 3. Nested Wallet Class
    //==========================================
    static class Wallet {
        private String userName;
        private String mobileNumber;
        private String upiId;
        private double balance;

        Wallet(String userName, String mobileNumber, String upiId) {
            this.userName = userName;
            this.mobileNumber = mobileNumber;
            this.upiId = upiId;
            this.balance = 0;
        }

        void addMoney(double amount) throws InvalidAmountException {
            if (amount <= 0) {
                throw new InvalidAmountException("Amount must be greater than zero.");
            }
            balance += amount;
            System.out.println("Money added successfully: " + amount);
        }

        void deductMoney(double amount) {
            balance -= amount;
        }

        double getBalance() {
            return balance;
        }

        void displayWalletDetails() {
            System.out.println("\n===== WALLET DETAILS =====");
            System.out.println("User Name     : " + userName);
            System.out.println("Mobile Number : " + mobileNumber);
            System.out.println("UPI ID        : " + upiId);
            System.out.println("Balance       : " + balance);
        }
    }

    //==========================================
    // 4. Nested UPI Payment Service Implementation
    //==========================================
    static class UPIPaymentProcessor implements PaymentService {
        private Wallet wallet;

        UPIPaymentProcessor(Wallet wallet) {
            this.wallet = wallet;
        }

        @Override
        public void pay(String upiId, double amount)
                throws InvalidUPIException, InvalidAmountException, InsufficientBalanceException {

            if (upiId == null || !upiId.contains("@") || upiId.startsWith("@") || upiId.endsWith("@")) {
                throw new InvalidUPIException("Invalid UPI ID.");
            }

            if (amount <= 0) {
                throw new InvalidAmountException("Payment amount must be greater than zero.");
            }

            if (amount > wallet.getBalance()) {
                throw new InsufficientBalanceException("Insufficient wallet balance.");
            }

            wallet.deductMoney(amount);
            System.out.println("Payment of " + amount + " sent successfully to " + upiId);
        }

        @Override
        public double checkBalance() {
            return wallet.getBalance();
        }
    }

    //==========================================
    // 5. Main Execution Method
    //==========================================
    public static void main(String[] args) {

        // Create Wallet
        Wallet wallet = new Wallet("Sashank", "9876543210", "sashank@upi");

        // Create UPI Payment Service Object
        UPIPaymentProcessor payment = new UPIPaymentProcessor(wallet);

        try {
            // Add Money
            wallet.addMoney(10000);

            // Check Balance
            System.out.println("\nAvailable Balance: " + payment.checkBalance());

            // Make UPI Payment
            payment.pay("rahul@upi", 2500);

            System.out.println("Transaction completed successfully.");

        } catch (InvalidUPIException e) {
            System.out.println("UPI Error: " + e.getMessage());

        } catch (InvalidAmountException e) {
            System.out.println("Amount Error: " + e.getMessage());

        } catch (InsufficientBalanceException e) {
            System.out.println("Balance Error: " + e.getMessage());

        } finally {
            System.out.println("\nTransaction process completed.");
        }

        // Final Wallet Details
        wallet.displayWalletDetails();

        // Final Balance
        System.out.println("\nFinal Balance: " + payment.checkBalance());
    }
}
