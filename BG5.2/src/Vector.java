import java.util.*;
public class Vector {
	ArrayList<Float> vec1= new ArrayList<Float>();
	
	private Vector() {
		vec1.add((float)10.0);
		vec1.add((float)20.0);
		vec1.add((float)30.0);
		vec1.add((float)40.0);
		vec1.add((float)50.0);
	}
	
	void modify(int a) {
		Scanner sc= new Scanner(System.in);
		float b=0;
		System.out.println("What do you modify position "+a+" to");
		b= sc.nextFloat();
		vec1.set(a, b);
		System.out.println(vec1);
		sc.close();
	}
	void multiply(int a) {
		for(int i=0;i<vec1.size(); i++) {
			vec1.set(i,(float)vec1.get(i)*a );
		}
		System.out.println(vec1);
	}
	void display() {
		for(int i=0; i<vec1.size(); i++) {
			System.out.print(vec1.get(i)+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector obj1=new Vector();
		obj1.modify(3);
		obj1.multiply(2);
		obj1.display();
		

	}

}
