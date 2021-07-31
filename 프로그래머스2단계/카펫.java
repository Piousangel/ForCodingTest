public class 카펫 {
    
        public int[] solution(int brown, int yellow) {
            
            int width = 0;
            int height = 0;
            
            for(height = 3; height <= (int)(brown+4)/2 ; height++){
                
                width = (int)(brown+4)/2 - height;
                if(height > width){
                    break;
                }
                int yellowCount = (width-2)*(height-2);
                if(yellow == yellowCount){
                    //yellow = yellowCount;
                    break;
                }
            }
            
            int[] answer = {width, height};
            return answer;
        }
    
}
