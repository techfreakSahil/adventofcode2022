import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public static void main(String args[])throws Exception{
    int rock = 1;
    int paper = 2;
    int scissor = 3;

    int win = 6;
    int draw = 3;
    int loss = 0;

    int score = 0;

    Map<String,Integer> map = new HashMap<>();
    map.put("A",rock);
    map.put("B",paper);
    map.put("C",scissor);
    map.put("X",rock);
    map.put("Y",paper);
    map.put("Z",scissor);


    BufferedReader br = new BufferedReader(new FileReader("input2.txt"));

    String line;

    while((line=br.readLine())!=null){
        String[] chances = line.trim().split(" ");


        if(map.get(chances[0]) == map.get(chances[1])){
            score+=draw;
        }
        else if(map.get(chances[0])==1 && map.get(chances[1])==2){
            score += win;
        }
        else if(map.get(chances[0])==2 && map.get(chances[1])==3){
            score += win;
        }
        else if(map.get(chances[0])==3 && map.get(chances[1])==1){
            score += win;
        }
        else{
            score += loss;
        }
        score+=map.get(chances[1]);
    }

    System.out.println(score);

    }
}
