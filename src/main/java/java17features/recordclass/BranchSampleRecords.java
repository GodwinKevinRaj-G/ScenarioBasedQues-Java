package java17features.recordclass;

record BranchSampleRecord(String name, Double interestRate, String location) {

}

public class BranchSampleRecords {
    public static void main(String[] args) {
        BranchSampleRecord record = new BranchSampleRecord("SBI", 6.7, "Coimbatore");
        BranchSampleRecord record2 = new BranchSampleRecord("SBI", 6.7, "Coimbatore");
        System.out.println(record.equals(record2));
    }
}
