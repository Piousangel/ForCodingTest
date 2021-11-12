import java.util.*;

public class 신규아이디추천 {

	// id = id.replaceAll("[^-_.a-z0-9]","");
	// id = id.replaceAll("[.]{2,}", ".");
	// id = id.replaceAll("^[.]|[.]$","");

    public String solution(String new_id) {
        String id = new_id.toLowerCase(); 
        
        id = id.replaceAll("[^-_.a-z0-9]", ""); //-_. 영문자 숫자만 남김 
        id = id.replaceAll("[.]{2,}", "."); // .2개 이상 .으로 
        id = id.replaceAll("^[.]|[.]$", ""); // 처음과 끝 . 제거 

        if(id.equals("")) // 빈 문자열이라면 a 추가 
            id += "a";
            
        if(id.length() >= 16){ // 16자 이상이면 15자로 
            id = id.substring(0, 15);
            id = id.replaceAll("^[.]|[.]$", ""); // 끝 . 제거 
        }
        if(id.length() <= 2){
            while(id.length() < 3){
                id += id.charAt(id.length() - 1);
            }
        } // 2자 이하라면 3자까지 마지막 문자추가 
        return id;
    }

	// 	new_id = new_id.toLowerCase();

	// 	String id = "";
	// 	for(int i = 0; i < new_id.length(); i++) {
	// 		char ch = new_id.charAt(i);

	// 		if(ch >= 'a' && ch <= 'z') {
	// 			id += String.valueOf(ch);
	// 		} else if(ch >= '0' && ch <= '9') {
	// 			id += String.valueOf(ch);
	// 		} else if(ch == '.' || ch == '-' || ch == '_') {
	// 			id += String.valueOf(ch);
	// 		}
	// 	}

	// 	for(int i = 0; i < id.length(); i++) {
	// 		if(id.charAt(i) == '.') {
	// 			int j = i+1;
	// 			String dot = ".";

	// 			while(j != id.length() && id.charAt(j) == '.') {
	// 				dot += ".";
	// 				j++;
	// 			}

	// 			if(dot.length() > 1)
	// 				id = id.replace(dot, ".");
	// 		}
	// 	}

	// 	if(id.startsWith(".") ) {
	// 		id = id.substring(1, id.length());
	// 	} else if(id.endsWith(".")) {
	// 		id = id.substring(0, id.length()-1);
	// 	}

	// 	if(id.length() == 0) {
	// 		id += "a";
	// 	}

	// 	if(id.length() >= 16) {
	// 		id = id.substring(0, 15);
	// 	}
        
	// 	if(id.endsWith(".")) {
	// 		id = id.substring(0, id.length()-1);
	// 	}

	// 	String last = id.charAt(id.length()-1) + "";
	// 	if(id.length() == 2) {
	// 		id = id + last;
	// 	} else if(id.length() == 1) {
	// 		id = id + last + last;
	// 	}

	// 	return id;


    // }
}
