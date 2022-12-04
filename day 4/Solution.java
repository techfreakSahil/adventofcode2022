import java.io.BufferedReader;
import java.io.FileReader;

class Solution{
    public static void main(String[] args) throws Exception {
        


        BufferedReader br = new BufferedReader(new FileReader("input4.txt"));

        String line;

        int score = 0;

        String test = """
            2-4,6-8
            2-3,4-5
            5-7,7-9
            2-8,3-7
            6-6,4-6
            2-6,4-8
                """;

        //for(String ae: test.split("\n")){
            while((line=br.readLine())!=null){
            String first = (line.substring(0,line.indexOf(",")));
            String second = (line.substring(line.indexOf(",")+1,line.length()));
            String[] a = first.split("-");
            String[] b = second.split("-");

            int x1 = Integer.parseInt(a[0]);
            int y1 = Integer.parseInt(a[1]);
            int x2 = Integer.parseInt(b[0]);
            int y2 = Integer.parseInt(b[1]);

            if(x1<=x2 && y2<=y1 || x2<=x1 && y1<=y2){
                score += 1;
            }
        }

        System.out.println(score);
    }
}