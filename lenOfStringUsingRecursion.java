class Solution {
    
    int length(String s) {
        
//base
        if(s.equals("")) return 0;
        
      //recusion logic
        return 1 + length(s.substring(1));
    }
}
