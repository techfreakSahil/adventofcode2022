import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

class Solution{
    public static void main(String args[]) throws Exception{
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
            int calories = 0;
            int maxCalories = 0;

            ArrayList<Integer> calList = new ArrayList<Integer>();

            String l;
            
            while((l= br.readLine())!=null){
                String strCal = l.trim();
                if(strCal.isBlank()){
                    if(maxCalories<calories){
                        maxCalories = calories;
                    }
                    calList.add(calories);
                   calories =0;
                   continue;
                }
                calories += Integer.parseInt(strCal);
            }
            if(calories>maxCalories){
                maxCalories = calories;
            }

            System.out.println(maxCalories);
            calList.sort((a,b)->b-a);
            System.out.println(calList.get(0) + calList.get(1) + calList.get(2));
        }

    }
}