class hellownm{
     public static void main(String args[])
	 {
        try{
		    System.out.println("HELLO "+ args[0]);
        }
        catch(Exception e){
            System.out.println("Please enter something");
        }
	 }		 
}
/*
OUTPUT:-
E:\Devcs5>javac HelloDev.java  
E:\Devcs5> java hellownm
Please enter something
E:\Devcs5> java hellownm DEV
HELLO DEV
*/