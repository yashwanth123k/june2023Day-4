class Employe{
int id;
String name;
float salary;

void insert(int i,String n,float s)
{
id=i;
name=n;
salary=s;
}
void display(){
System.out.println(id+" "+name+" "+salary);
}
}
public class TestEmploye{
public static void main(String args[]){
Employe e1=new Employe();
Employe e2=new Employe();
Employe e3=new Employe();
e1.insert(11,"Ravi",6575767);
e2.insert(11,"Raviteja",65756);
e3.insert(11,"bhanu",657788);
e1.displayRecords();
e2.displayRecords();
e3.displayRecords();

}
}