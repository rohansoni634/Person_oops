package learning;

public class Solution {

	public static void main(String[] args) {
		Person person1=new Person();
		person1.setFirstName("");
		person1.setLastName("");
		person1.setAge(10);
		System.out.println("fullname is="+person1.getFullname());
		System.out.println("teen= "+person1.isTeen());
		person1.setFirstName("john");
		person1.setAge(18);
		System.out.println("fullname= "+person1.getFullname());
		System.out.println("teen= "+person1.isTeen());
		person1.setLastName("smith");
		System.out.println("fullname= "+person1.getFullname());

	}

}
