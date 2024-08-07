import java.util.StringTokenizer;

public class method3 {
	

	 static char[][] board = {
			    {'.', 'S', 'S', 'S', '.', '.', '.', '.', '.', '.'},
			    {'.', '.', '.', '.', '.', '.', '.', '.', '.', '.'},
			    {'.', '.', '.', '.', '.', '.', '.', '.', '.', '.'},
			    {'*', '*', '.', 'S', '*', '.', '.', '.', '.', '.'},
			    {'.', '.', '.', '.', '.', '*', '*', '*', '*', '*'},
			    {'.', '.', '.', '.', '.', '.', '.', '.', '.', '.'},
			    {'.', '.', '.', '.', '.', '.', '.', '.', '.', '.'},
			    {'.', '.', '.', '*', '*', '*', '*', '.', '.', '.'},
			    {'.', '.', '.', '.', '.', '.', '*', '*', '*', '*'},
			    {'.', '.', '.', '.', '.', '.', '.', '.', '.', '.'}
			};
	   
	 public static int Q3_NumberSunk(char board[][]) {
        int count = 0;
        int count2 = -1;
       
        int something=0;
     
        String token2;
        String token;
        for (int i = 0; i < 10; i++) {
            String row = new String(board[i]);
            StringTokenizer tokenizer = new StringTokenizer(row, ".");
            while(tokenizer.hasMoreTokens()) {
                 token = tokenizer.nextToken(); 
                if (!token.isEmpty() && !token.contains("S") && !(token.length()==1) && token.contains("*") )  {         	
                    count++;
                }
           
               
            }}

        for (int i = 0; i < 10; i++) {
            String row = new String(board[i]);
            StringTokenizer tokenizer7 = new StringTokenizer(row);
            while(tokenizer7.hasMoreTokens()) {
                 token2 = tokenizer7.nextToken();    
                
               if (!token2.isEmpty() &&  !(token2.contains("S")) && !(token2.contains("*")) && token2.contains("."))  {         	
            	 
					something++;
                }
           
               
            }}
   
        if(something == 10 ) {  
        	return count2;
        }
        		
       
        return count;
        
    }
       
	public static void main(String[] args) {
		System.out.println(Q3_NumberSunk(board));
	}
	


}
