import java.util.Scanner;

public class StudentQ5
{
    
    String name;
    int age;
    String address;
    StudentQ5()
    {
        name="Unknown";
        age=0;
        address="Not available";
    }
    public void setinfo(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public void setinfo(String name,int age,String address)
    {
        this.name=name;
        this.age=age;
        this.address=address;
    }
}
class StudentQ5Main
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        StudentQ5 arr[]=new StudentQ5[n];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i]=new StudentQ5();
        }
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println("Enter 1 for three inputs, 2 for two inputs 3 for no inputs:");
            int c=s.nextInt();
            if (c==1)
                arr[i].setinfo(s.next(),s.nextInt(),s.next());
            else if (c==2)
                arr[i].setinfo(s.next(),s.nextInt());
        }
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i].name+" "+arr[i].age+" "+arr[i].address);
        }
    }
}
