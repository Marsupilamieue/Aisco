package aisco.donation.pewallet;
import java.util.Arrays;

import aisco.donation.core.DonationComponent;
import payment.page.core.*;
import payment.page.PaymentPageFactory;

public class DonationImpl extends DonationComponent {
	private List<DonationComponent> donationList;  
    PaymentPage payment;

    public DonationImpl() {
        super();
        this.donationList = new ArrayList<>();  
        this.payment = PaymentPageFactory.createPaymentPage("EWallet");  
        System.out.println("\nDonation via Payment E-Wallet");
    }

    public DonationImpl(String name, String email, String phone, int amount, String paymentMethod) {
        super(name, email, phone, amount, paymentMethod);
        this.donationList = new ArrayList<>();
        this.payment = PaymentPageFactory.createPaymentPage(paymentMethod);  
    }

    @Override
    public void addDonation() {
        donationList.add(new DonationImpl("Anisa", "anisa@jmail.com", "+62878 6654 3321", 2500000, "EWallet"));
        donationList.add(new DonationImpl("Dave", "dave@jmail.com", "+62828 2345 3091", 500000, "EWallet"));
        donationList.add(new DonationImpl("Edo", "edo@jmail.com", "+62828 2345 3091", 300000, "EWallet"));
    }
    
    @Override
    public void getDonations() {
    	System.out.println(Arrays.asList(donationList));
    }

}
