import java.util.*;
class LL1
{
    void print(ArrayList<Integer> ll)
    {
        int i=1;
        while(i>0)
    {
        System.out.println(ll);
        i--;
    }
    }
    public static void main(String args[])
    {
        ArrayList<Integer> ll1=new ArrayList<Integer>();
        ll1.add(3);
        ll1.add(5);
        ll1.add(10);
        LL1 ob=new LL1();
        ob.print(ll1);
        Object[] ob1=ll1.toArray();
        System.out.println(ob1[0]);
    }
    
}
