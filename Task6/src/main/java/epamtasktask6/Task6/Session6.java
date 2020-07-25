package epamtasktask6.Task6;
import java.util.*;
import java.lang.*;
class Sess
{
	Scanner s=new Scanner(System.in);
	public void fun(ArrayList<Integer> list)
    {
	    boolean f=true;
	    do
	    {
	        System.out.println("Menu");
	        System.out.println("1.Fetch the element from the particular position");
	        System.out.println("2.Add the element to the array list");
	        System.out.println("3.Remove the element from the particular poition");
	        System.out.println("4.Print the array list");
	        System.out.println("5.Exit");
	        System.out.print("Please enter your choice:");
	        int k=s.nextInt();
	        if(k!=5)
	        {
	            fun1(list,k);
	            f=true;
	        }
	        else
	        {
	        	f=false;
	        }
	        	
	    }while(f);
    }
	    public void fun1(ArrayList<Integer> list,int k)
	    {
	        if(k==1)
	        {
	            System.out.print("Enter the index from 0 to "+list.size()+":");
	            int m=s.nextInt();
	            System.out.println("The value at the position "+m+" is : "+list.get(m));
	            //return true;
	        }
	        if(k==2)
	        {
	            System.out.print("Enter the element to add to the array list:");
	            int m=s.nextInt();
	            list.add(m);
	            //return true;
	        }
	        if(k==3)
	        {
	            System.out.print("Enter the index from 0 to "+list.size()+":");
	            int m=s.nextInt();
	            int x=list.get(m);
	            System.out.println("The value removed from the array list is : "+x);
	            list.remove(m);
	            //return true;
	        }
	        if(k==4)
	        {
	            System.out.println("The array list is: "+list);
	            //return true;
	        }
	    }
    }
public class Session6 
{
	public static void main(String args[])
    {
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,3,7,9,4,6,66,77,33,555,666));
        Sess c=new Sess();
        c.fun(numbers);
    }
}