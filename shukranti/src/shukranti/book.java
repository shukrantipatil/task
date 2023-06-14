package shukranti;

class book 
{
String author=" "; String title=" ";
String   publisher=" ";
book(String a, String b,String c)
{
author =a; 
title=b; 
publisher=c;
}
void display()
{
System.out.println("Book author is : "+author);
 System.out.println("Book title is : "+title); 
System.out.println("Book Publisher is : "+publisher);
}
}
class bookinfo extends book  {
int price,stock;
bookinfo(String a, String b,String c,int z, int q)
{
 super(a,b,c); 
price=z; 
stock=q;
}
void display() {
super.display();
System.out.println("Book price is : "+price); 
System.out.println("Book Stock Position is : "+stock);
}
public static void main(String args[]) {
bookinfo b1=new bookinfo("Tech-max","JAVA","AJ",123,25);
b1.display(); 
System.out.println("\n");
bookinfo b2=new bookinfo("Bal Guru","OOPS","Tata",350,50);
b2.display(); 
System.out.println("\n");
bookinfo b3=new bookinfo("Nirali","HARDWARE","AJ",50,2);
b3.display();
}  } 

