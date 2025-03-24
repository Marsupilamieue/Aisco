package aisco.donation.core;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


public class DonationImpl extends DonationComponent {
    private List<DonationComponent> donationList;

    public DonationImpl() {
        System.out.println("Donation via AISCO");
        donationList = new ArrayList<>();
    }

    public DonationImpl(String name, String email, String phone, int amount, String paymentMethod) {
        super(name, email, phone, amount, paymentMethod);
    }

    public void getDonation() {
    	System.out.println(Arrays.asList(donationList));
    }

    public void addDonation() {
    }

    public void addDonation(DonationComponent donation) {
        donationList.add(donation);
    }

    public String toString() {
        return "- Donasi " + name  + ": " + amount + " Payment Method: " + paymentMethod;
    }
}
