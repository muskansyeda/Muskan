import java.util.*;
public class Program1 {
    public static List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if(digits.length() ==0) return res;
        HashMap<String,String> map = new HashMap<>();
           map.put("2","abc");
           map.put("3","def");
           map.put("4","ghi");
           map.put("5","jkl");
           map.put("6","mno");
           map.put("7","pqrs");
           map.put("8","tuv");
           map.put("9","wxyz");
          
          Deque<String> dq = new ArrayDeque();
          dq.add("");
          for(int i=0;i<digits.length();i++){
              String d = digits.substring(i,i+1);
              String fromMap = map.get(d);
              int  n = dq.size();
              for(int j=0;j<n;j++){
                  String pull = dq.pollFirst();
                  for(int k =0;k<fromMap.length();k++){
                      String temp = pull.concat(fromMap.charAt(k)+"");
                      dq.add(temp);
                  }

              }

          }
           while(!dq.isEmpty()){
               res.add(dq.poll());
           }
           return res;  
    }
    public static void printList(List<String> arr)
    {
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String input1 = "23";
        List<String> output1 = letterCombinations(input1);
        printList(output1);

        String input2 = "";
        List<String> output2 = letterCombinations(input2);
        printList(output2);

        String input3 = "2";
        List<String> output3 = letterCombinations(input3);
        printList(output3);

        
    }
}
