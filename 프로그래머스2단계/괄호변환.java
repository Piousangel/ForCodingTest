import java.util.*;

//2.9

class Solution {
    public String solution(String p) {
        String answer = "";
        
        for(int i=0; i < p.length(); i++){
         
        }
        return answer;
    }
    
    public int splitString(String p){
	    String[] splitString = p.split("");
	    int count = 0;
	    int index = 0;
	    for(int i = 0; i < splitString.length; i++){
	        if(splitString[i].equals("(")) count++;
	        else count--;
	
	        if(count == 0){
	            index = i + 1;
	            break;
	        }
	    }
	    return index;
	}
    
    int index = splitString(p);
    String u = p.substring(0, index);
    String v = p.substring(index);
    
    public boolean validateString(String p){
      String[] split = p.split("");
      int count = 0;
      for(String s : split){
          if(s.equals("(")) count++;
          else count--;

          if(count < 0) return false;
      }
      return true;
  }
    
    public String setValidateGrammer(String p){
      String[] split = p.split("");
      StringBuilder sb = new StringBuilder();
      for(int i = 1; i < split.length - 1; i++){
          if(split[i].equals("(")) sb.append(")");
          else sb.append("(");
      }
      return sb.toString();
  }
    
    public String getValidateString(String p){
        int index = splitString(p);
        String u = p.substring(0, index);
        String v = p.substring(index);

        if(validateString(u)) sb.append(u);
        else {
            sb.append("(");
            if(!v.equals("")){
               getValidateString(v);
               v = "";
            }
            sb.append(")");
            sb.append(setValidateGrammer(u));
        }
        if(!v.equals("")){
            getValidateString(v);
        }

        return sb.toString();
    }
}