import java.util.*;
public class Program3 {
    public static List<String> generateParenthesis(int n) {
        List<String> combs = new ArrayList<>();
        generate(n, n, new StringBuilder(), combs);
        return combs;
    }
    
    public static void generate(int open, int close, StringBuilder sb, List<String> combs){
        if(open == 0 && close == 0){
            combs.add(sb.toString());
            return;
        }
        if(open > 0){
            sb.append("(");
            generate(open - 1, close, sb, combs);
            sb.delete(sb.length() - 1, sb.length());
        }
        
        if(close > 0 && open < close){
            sb.append(")");
            generate(open, close - 1, sb, combs);
            sb.delete(sb.length() - 1, sb.length());
        }
    }
   
    public static void printList(List<String> arr)
    {
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int input1 = 2;
        List<String> output1 = generateParenthesis(input1);
        printList(output1);
        
        int input2 = 1;
        List<String> output2 = generateParenthesis(input2);
        printList(output2);
    }
}
