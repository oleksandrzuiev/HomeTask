import java.util.Scanner;
public class StudentTopper {

    public String name;
    public int Percentage;
    StudentTopper(String name,int Percentage)
    {
        this.name=name;
        this.Percentage=Percentage;
    }
}
class StudentTopperMain
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter no. of Students:");
        int n=s.nextInt();
        StudentTopper arr[]=new StudentTopper[n];
        int arr1[]=new int[n];
        for (int i = 0; i < arr.length ; i++)
        {
            System.out.println("Enter name and percentage of student"+(int)(i+1));
         arr[i]=new StudentTopper(s.next(),s.nextInt());
         arr1[i]=arr[i].Percentage;
        }
        int max=0;
        for (int i = 0; i < arr1.length; i++)
        {
            if (arr1[i]>max)
                max=arr1[i];
        }
        int index=0;
        for (int i = 0; i < arr1.length; i++)
        {
         if (arr1[i]==max)
         {
             index=i;
             break;
         }
        }
        System.out.println("Name of Topper is --> "+arr[index].name);
    }
}
