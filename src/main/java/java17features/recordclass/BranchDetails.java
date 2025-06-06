package java17features.recordclass;

import java.util.Objects;

final class Bank {

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", interestRate=" + interestRate +
                ", location='" + location + '\'' +
                '}';
    }

    String name;
    Double interestRate;
    String location;

    public Bank(String name, Double interestRate, String location) {
        this.name = name;
        this.interestRate = interestRate;
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bank bank = (Bank) o;
        return name.equals(bank.name) && interestRate.equals(bank.interestRate) && location.equals(bank.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, interestRate, location);
    }

    public String getName() {
        return name;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public String getLocation() {
        return location;
    }

}

public class BranchDetails {
    public static void main(String[] args) {
        Bank cbeSbiBranch = new Bank("SBI", 6.7, "Coimbatore");
        Bank cbeSbiBranch2 = new Bank("SBI", 6.7, "Coimbatore");
        System.out.println(cbeSbiBranch.equals(cbeSbiBranch2));
        System.out.println(cbeSbiBranch2);
    }
}

