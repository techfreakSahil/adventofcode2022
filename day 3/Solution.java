import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args)throws Exception{
        
        BufferedReader br = new BufferedReader(new FileReader("input3.txt"));

        HashMap<Character,Integer> words = new HashMap<>();
        words.put('a',1);
        words.put('b',2);
        words.put('c',3);
        words.put('d',4);
        words.put('e',5);
        words.put('f',6);
        words.put('g',7);
        words.put('h',8);
        words.put('i',9);
        words.put('j',10);
        words.put('k',11);
        words.put('l',12);
        words.put('m',13);
        words.put('n',14);
        words.put('o',15);
        words.put('p',16);
        words.put('q',17);
        words.put('r',18);
        words.put('s',19);
        words.put('t',20);
        words.put('u',21);
        words.put('v',22);
        words.put('w',23);
        words.put('x',24);
        words.put('y',25);
        words.put('z',26);
        words.put('A',27);
        words.put('B',28);
        words.put('C',29);
        words.put('D',30);
        words.put('E',31);
        words.put('F',32);
        words.put('G',33);
        words.put('H',34);
        words.put('I',35);
        words.put('J',36);
        words.put('K',37);
        words.put('L',38);
        words.put('M',39);
        words.put('N',40);
        words.put('O',41);
        words.put('P',42);
        words.put('Q',43);
        words.put('R',44);
        words.put('S',45);
        words.put('T',46);
        words.put('U',47);
        words.put('V',48);
        words.put('W',49);
        words.put('X',50);
        words.put('Y',51);
        words.put('Z',52);

        String line;
        int answer = 0;

        while((line=br.readLine())!=null){
           String compartments = line.trim();
           int len = compartments.length();
           HashMap<Character,Integer> map = new HashMap<>();
           for(int i=0;i<len/2;i++){
            if(!map.containsKey(compartments.charAt(i))){
            map.put(compartments.charAt(i),i);
            }
           }
           for(int i=len/2;i<len;i++){
            if(map.containsKey(compartments.charAt(i))){
                answer+=(words.get(compartments.charAt(i)));
                break;
            }
           }
        }

        System.out.println(answer);

    }
}
