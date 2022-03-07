import java.util.*;
class deleteLL
{
    public static void main(String args[])
    {
        ArrayList<Integer> ll=new ArrayList<Integer>();
        ll.add(12);
        ll.add(16);
        ll.add(25);
        ll.add(35);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number you wanted to delete");
        int x=sc.nextInt();
        
        if(ll.contains(x)==false)
        {
            System.out.println("Number not found");
        }
        else
        {
            Object z=x;
            ll.remove(z);
        }
        System.out.println(ll);


    }
}