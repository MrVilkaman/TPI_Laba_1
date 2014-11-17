package donnu.zolotarev.tpi.lab1;

import java.util.ArrayList;

public class ArrayProcessor {

    public static int[] SortAndFilter( int[] a ){
        if (a != null){
            ArrayList<Integer> ints = new ArrayList<Integer>();
            for (int val :a){
                if (0<=val || (val < 0  && !ints.contains(val))){
                    ints.add(val);
                }
            }
            int[] ints1 = new int[ints.size()];
            for (int i = 0; i< ints.size();i++){
                ints1[i] = ints.get(i);
            }
            return ints1;
        }else{
            return null;
        }
    }

}
