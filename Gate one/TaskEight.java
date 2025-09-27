public class TaskEight{
	public static void main(String [] args){
     
	int count = 1;
         int sum = 0;      
         while(count <= 10){
         		 if( count % 4 == 0)
         		         System.out.printf( "%d %n", (sum += (count +(count * count) + (count * count * count )+(count * count * count * count)+(count * count * count* count *count)))); 
           	 		count++;

          	}
        
	       

   }
}