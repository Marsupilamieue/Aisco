package aisco.donation.pcash;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
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
        System.out.println("\nDonation via Payment Cash");
    }

    public DonationImpl(String name, String email, String phone, int amount, String paymentMethod) {
        super(name, email, phone, amount, paymentMethod);
        this.donationList = new ArrayList<>();
    }

    public void addDonation() {
        donationList.add(new DonationImpl("Anisa", "anisa@jmail.com", "+62878 6654 3321", 2500000, "Cash"));
        donationList.add(new DonationImpl("Dave", "dave@jmail.com", "+62828 2345 3091", 500000, "Cash"));
        donationList.add(new DonationImpl("Edo", "edo@jmail.com", "+62828 2345 3091", 300000, "Cash"));
    }
    
    public void getDonation() {
    	System.out.println(Arrays.asList(donationList));
    }
    
    public String toString() {
        return "- Donasi " + name  + ": " + amount + " Payment Method: " + paymentMethod;
    }

}
