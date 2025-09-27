public class TaskSix{
	public static void main(String [] args){
     
	int count = 1;
               
         while(count <= 10){
         		 if( count % 4 == 0)
         		 System.out.printf( "%d %d %d %d %d %n", count, (count * count), (count * count * count ),(count * count * count * count),(count * count * count* count *count));
                          
           	 		count++;

          	}
        
	       

   }
}