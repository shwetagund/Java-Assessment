
public class SingletoneThreadSafe {
   private static SingletoneThreadSafe instance;    //aceessed by only getInstance() method
   
   private SingletoneThreadSafe() {
//	   private contructor
   }
   
   //synchronized method to control all acesss
   synchronized public static SingletoneThreadSafe getInstance() {
	   if(instance == null)
	   {
		   instance = new SingletoneThreadSafe();    //if instance is null the it is initalize
	   }
	   return instance;
   }
   
   
   public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletoneThreadSafe s=new SingletoneThreadSafe();
		System.out.println(s);
	}

}
