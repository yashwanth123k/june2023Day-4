class Rectangle{
int length;
int width;



void insert(int i,int w)
{
length=i;
width=w;
}
void calculateArea(){
System.out.println(length*width);
}
}
public class TestRectangle1{
public static void main(String args[]){
Rectangle r1=new Rectangle();
Rectangle r2=new Rectangle();

r1.insert(11,5);
r2.insert(3,5);

r1.calculateArea();
r2.calculateArea();

}
}