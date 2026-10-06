

public class String {
    public int minAddToMakeValid(String s) {
       int depth=0;
       int count=0;
      for(int i=0; i<s.length(); i++){
        if(s.charAt(i)=='('){
            depth++;
        }else{
            if(depth>0){
                depth--;
            }
            else{
                count++;
            }
        }
      }
      return count+ depth;
        
    }
}
    

