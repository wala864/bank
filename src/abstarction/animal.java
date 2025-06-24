package abstarction;

public  abstract class animal {
private int age;
protected String env;
public String fullname;
String type;


void eat() {
	System.out.println("animal eat");
}
 public void printanimals() {
	 System.out.println("animal ");
 }
 public abstract void printsound();
 public abstract int printvaccount();
 
 
}
