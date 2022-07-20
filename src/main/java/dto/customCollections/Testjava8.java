package dto.customCollections;

import java.util.*;

public class Testjava8 {


    public Testjava8() {
    }

    public static void main(String[] args) {

        ApplicationData applicationData = new ApplicationData("234");

        ArrayList<String> obj = new ArrayList<String>(
                Arrays.asList("Pratap", "Peter", "Harsh"));


        List<LoanApplication> loanApplicationList = new ArrayList<>();
        loanApplicationList.add(new LoanApplication("123","amazonpay"));
        loanApplicationList.add(new LoanApplication("8234","flipka6rt"));
        loanApplicationList.add(new LoanApplication("345","ebay"));

            Data data = new Data(applicationData,loanApplicationList);
        Record record = new Record(data);

        String compute = compute(record);
        Map<String, Object> debugData = new HashMap<>();

        debugData.put("merchant_category", compute);
        System.out.println("--------");
        System.out.printf(compute);
        System.out.println("--------");

        Iterator<String> keySetIterator = debugData.keySet().iterator();

        while(keySetIterator.hasNext()){
            String key = keySetIterator.next();
            System.out.println("key: " + key + " value: " + debugData.get(key)); }

    }

    public static String compute(Record record){
             ApplicationData applicationData = record.getData().getApplicationData();
        return (String)record.getData().getLoanApplicationList().stream().filter((loanApplication) -> {
            return loanApplication.getMerchantId().equals(applicationData.getMerchantId());
        }).map(LoanApplication::getMerchantCategory).filter(Objects::nonNull).findFirst().orElse(null);
    }
}

class Record{
   Data data;

    public Record() {
    }

    public Record(Data data) {
        this.data = data;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}
class Data{
    ApplicationData applicationData ;
    List<LoanApplication> loanApplicationList;

    public Data(ApplicationData applicationData, List<LoanApplication> loanApplicationList) {
        this.applicationData = applicationData;
        this.loanApplicationList = loanApplicationList;
    }

    public List<LoanApplication> getLoanApplicationList() {
        return loanApplicationList;
    }

    public void setLoanApplicationList(List<LoanApplication> loanApplicationList) {
        this.loanApplicationList = loanApplicationList;
    }

    public ApplicationData getApplicationData() {
        return this.applicationData;
    }

    public void setApplicationData(ApplicationData applicationData) {
        this.applicationData = applicationData;
    }

}
class ApplicationData{
    String merchantId;

    public ApplicationData(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }
}
class LoanApplication{
    String merchantId;
    String merchantCategory;

    public LoanApplication(String merchantId, String merchantCategory) {
        this.merchantId = merchantId;
        this.merchantCategory = merchantCategory;
    }

    public String getMerchantCategory() {
        return merchantCategory;
    }

    public void setMerchantCategory(String merchantCategory) {
        this.merchantCategory = merchantCategory;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }
}