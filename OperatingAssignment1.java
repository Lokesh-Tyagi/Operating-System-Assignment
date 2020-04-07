import java.util.*;

class OperatingAssignment1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        char ch[] = {'a','b','c','d','e','f','g','h','i','j'};
        Student st[] = new Student[10];
        for(int i=0;i<10;i++)
        {
            st[i] = new Student(ch[i],rand.nextInt(15)+1);
        }
        for(int i=1;i<10;i++)
        {
            int j = i-1;
            int temp = st[i].gets_gift_no();
            Student s = st[i];
            while(j>0 && temp<st[j].gets_gift_no())
            {
                st[j+1] = st[j];
                j--;
            }
            st[j+1] = s;

        }
        System.out.println("Billed\tOrder\n\nName\t\tGifts Number");
        for(int i=9;i>0;i--)
        {
            System.out.println(st[i].name+"\t\t"+st[i].gifts_no);
        }
    } 
}
class Student
{   
    char name;
    int gifts_no;
    char gets_name()
    {
        return name;
    }
    int gets_gift_no()
    {
        return gifts_no;
    }
    void sets_name(char name)
    {
        this.name = name;
    }
    void sets_gifts_no(int gifts_no)
    {
        this.gifts_no = gifts_no;
    }
    Student(){};
    Student(char name,int gifts_no)
    {
        this.name = name;
        this.gifts_no = gifts_no;
    }
}