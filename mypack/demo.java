import mypack.main;
public class demo{
	public static void main(String[] args){
		main m=new main();
		access a=new access();
		m.display();
		System.out.print("private :"+a.getd());
		m.show();

}
}
class access{
	
	int c=3;
	private int d=4;
	
	int getd(){
	return d;
	}

}