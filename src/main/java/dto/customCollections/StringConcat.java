package dto.customCollections;
//\""+code+"\"
public class StringConcat {
    public static void main(String[] args) {
        String code ="sdfsd";
       String journeyRecordData = "{\"journey_id\":\"b120dc42-9185-41b4-00ea-7287123f73c6\"," +
                " {\"customer_id\":\"" +code+ "\",\"mobile_count\":1 ,\"email_count\":1 ," +
                "\"last_created_on\":\"+lastCreatedOn\"}}}";
        int mobileCount =1;
        int emailCount =1;
        String lastCreatedOn = "2022-04-09T18:50:01.339042+05:30";
        String customer_id = "a290dc42-9185-41b4-bdea-7287619f73c6";
        String s1= journeyRecordData;
        String s2 = String.format(s1, lastCreatedOn);
        System.out.println(s2);
        // String s3 = String.format(s2, lastCreatedOn);

     //   System.out.println(s3);
    }
}
