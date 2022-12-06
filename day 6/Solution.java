import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Solution {
    public static void main(String[] args)throws Exception {
        

        BufferedReader br = new BufferedReader(new FileReader("input6.txt"));

        String line;

        while((line=br.readLine())!=null){
            String[] ch = line.split("");
            int idx = 0;
            List<String> st = new ArrayList<>();

            for(String s: ch){
                if(st.size() > 13){ //3 for puzle 1, 13 for puzzle 2
                    if(st.size()== new HashSet<>(st).size()){
                        break;
                    }
                    st.add(s);
                    st.remove(0);
                }
                else{
                    st.add(s);
                }
                idx++;
            }
            System.out.println(idx);
        }
    }
}
