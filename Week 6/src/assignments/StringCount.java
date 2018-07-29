package assignments;

public class StringCount {

    public static void stringCount(int n){
        
        
        StringBuilder str = new StringBuilder("0");
        for (int i = 1; i < n ; i++){
            str.append(i);
            }
        System.out.println(str.toString());
          
    }
    
    public static void main(String[] args) {
      
          stringCount(6);
          
    }
}