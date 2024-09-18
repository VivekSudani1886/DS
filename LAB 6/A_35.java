import java.util.Scanner;

class Student_detail{

    long Enrollment_No;
    String Name;
    int Semester;
    float CPI;

    Student_detail[] st = new Student_detail[5];

    public void setData(){

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 2; i++){

            st[i] = new Student_detail();
        }

        for(int i = 0; i < 2; i++){

            System.out.print("\nEnter "+(i+1)+" Student's Enrollment No. : ");
            st[i].Enrollment_No = sc.nextLong();

            System.out.print("Enter "+(i+1)+" Student's Name : ");
            st[i].Name = sc.next();

            System.out.print("Enter "+(i+1)+" Student's Semester : ");
            st[i].Semester = sc.nextInt();

            System.out.print("Enter "+(i+1)+" Student's CPI : ");
            st[i].CPI = sc.nextFloat();
        }
    }

    public void getData(){

        for(int i = 0; i < 2; i++){

            System.out.print((i+1)+" Student's Enrollment No. : "+st[i].Enrollment_No+"\n");

            System.out.print((i+1)+" Student's Name : "+st[i].Name+"\n");

            System.out.print((i+1)+" Student's Semester : "+st[i].Semester+"\n");

            System.out.print((i+1)+" Student's CPI : "+st[i].CPI+"\n");
        }
    }
    }

public class A_35 {
 
    public static void main(String[] args) {
        
        Student_detail st = new Student_detail();

        st.setData();
        st.getData();
    }
}