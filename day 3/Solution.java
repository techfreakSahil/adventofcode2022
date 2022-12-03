import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public static void main(String[] args)throws Exception{
        
        BufferedReader br = new BufferedReader(new FileReader("input3.txt"));

        String words ="0abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

        String line;
        int answer = 0;

        List<Set<Integer>> l = new ArrayList<>();
        l.add(new HashSet<>());
        l.add(new HashSet<>());
        l.add(new HashSet<>());

        int lIndex = 0;

        while((line=br.readLine())!=null){
           for(String a: line.split(" ")){
            for(int i=0;i<a.length();i++){
            l.get(lIndex).add(words.indexOf(a.charAt(i)));
            }
           }
           lIndex++;
           if(lIndex < 3){
            continue;
           }

           l.get(0).retainAll(l.get(1));
           l.get(0).retainAll(l.get(2));

           answer += l.get(0).stream().reduce((a, b) -> a + b).get();

           l = new ArrayList<>();
           l.add(new HashSet<>());
           l.add(new HashSet<>());
           l.add(new HashSet<>());

           lIndex = 0;

           /*HashMap<Character,Integer> map = new HashMap<>();
           for(int i=0;i<len/2;i++){
            if(!map.containsKey(compartments.charAt(i))){
            map.put(compartments.charAt(i),i);
            }
           }
           for(int i=len/2;i<len;i++){
            if(map.containsKey(compartments.charAt(i))){
                answer+=(words.indexOf(compartments.charAt(i)));
                break;
            }
           }*/
        }

        System.out.println(answer);

    }
}
