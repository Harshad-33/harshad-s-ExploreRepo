import java.net.Socket;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

class Employe {
    private
     int empno;
     String ename;
     int salary;
    Employe(int empno , String ename , int salary){
        this.empno = empno;
        this.ename = ename;
        this.salary = salary;
    }
    public int getEmpno(){
        return empno;
    }
    public int getSalary(){
        return salary;
    }
    public String getEname(){
        return ename;
    }
    public String toString(){
        return empno+" "+ename+" "+salary;
    }
}


public class EmployeSystem {
    public static void main(String[] args) {
        ArrayList<Employe> c = new ArrayList<Employe>();
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        int ch ;
        do{
            System.out.println("1.INSERT");
            System.out.println("2.DISPLAY");
            System.out.println("3.SEARCH");
            System.out.println("4.DELETE");
            System.out.println("5.UPDATE");
            System.out.print("Enter Your Choice : ");
            ch = sc.nextInt();
            switch(ch){

                case 1: 
                System.out.print("Enter Empno : ");
                int eno = sc.nextInt();
                System.out.print("enter empname : ");
                String ename = sc1.nextLine();
                System.out.print("enter salary : ");
                int salary = sc.nextInt();
                c.add(new Employe(eno, ename, salary));
                break ;

                case 2:
                System.out.println("-----------------------------");
                Iterator<Employe> i = c.iterator();
                while(i.hasNext()){
                    Employe e = i.next();
                    System.out.println(e);
                }
                System.out.println("-----------------------------");
                break;

                case 3:
                boolean found = false;
                System.out.print("enter empno to search : ");
                int empno = sc.nextInt();
                System.out.println("-----------------------------");
                 i = c.iterator();
                while(i.hasNext()){
                    Employe e = i.next();
                    if(e.getEmpno() == empno){
                    System.out.println(e);
                    found = true;
                    }
                }
                if(!found){
                    System.out.println("Record not found");
                }
                System.out.println("------------------------------");
                break;

                case 4:
                found = false;
                System.out.print("enter empno to Delete : ");
                empno = sc.nextInt();
                System.out.println("-----------------------------");
                 i = c.iterator();
                while(i.hasNext()){
                    Employe e = i.next();
                    if(e.getEmpno() == empno){
                    i.remove();
                    found = true;
                    }
                }
                if(!found){
                    System.out.println("Record not found");
                }else{
                    System.out.println("Record deleted succefully..");
                }
                System.out.println("------------------------------");
                break;

                case 5:
                found = false;
                System.out.print("enter empno to update : ");
                empno = sc.nextInt();
                System.out.println("-----------------------------");
                ListIterator<Employe>li = c.listIterator();
                while(li.hasNext()){
                    Employe e = li.next();
                    if(e.getEmpno() == empno){
                    System.out.print("Enter new name :");
                    ename = sc1.nextLine();
                    System.out.print("Enter new salary : ");
                    salary = sc.nextInt();
                    li.set(new Employe(empno, ename, salary));
                    found = true;
                    }
                }
                if(!found){
                    System.out.println("Record not found");
                }else{
                    System.out.println("Record updated succefully..");
                }
                System.out.println("-----------------------------");
                break;
            }
        }while(ch != 0);
    }
}