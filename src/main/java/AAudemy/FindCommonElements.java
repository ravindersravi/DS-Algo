package AAudemy;

import java.util.HashMap;
import java.util.Map;

public class FindCommonElements {
    public static void main(String[] args) {
        char a[] = {'a','b','c','x'};
        char b[] = {'z','y','x'};
        boolean common = findCommon(a, b);
        System.out.println(common);
    }
    static boolean findCommon(char arr1[], char arr2[]){

        if (arr1 != null && arr2 != null) {
            Map arrayMap = new HashMap<>();

            for (int i = 0; i < arr1.length; i++) {
                arrayMap.put(arr1[i], true);
            }

            for (int j = 0; j < arr2.length; j++) {
                if (arrayMap.get(arr2[j]) != null && arrayMap.get(arr2[j]).equals(true)) {
                    return true;
                }
            }
        }
      //  System.out.println(a1);
        return false;

    }
}


// char ch[] = new char[a.length];
//  int a1=0;
       /* for(int i=0;i<a.length;i++){
            for (int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                    a1++;
                    return true;

                   *//* ch[a1]=a[i];
                    a1++;*//*
                }
            }
        }*/
