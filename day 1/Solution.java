import java.io.BufferedReader;
import java.io.FileReader;

class Solution{
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        int calories = 0;
        int maxCalories = 0;

        String l;

        while((l = br.readLine()) !=null){
            String strCal = l.trim();
            if(strCal.isBlank()){
                if(maxCalories<calories){
                    maxCalories = calories;
                }
               calories =0;
               continue;
            }
            calories += Integer.parseInt(strCal);
        }
        if(calories>maxCalories){
            maxCalories = calories;
        }

        System.out.println(maxCalories);
    }
}