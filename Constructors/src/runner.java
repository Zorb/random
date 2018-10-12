
public class runner {
	public class Person {
		private int age;
		private String fname;
		private String lname;
		private String nameString;

		public Person(String firstName, String lastName, int age) {
			this.setAge(age);
			this.setFname(firstName);
			this.setLname(lastName);
			nameString = firstName + " " + lastName;
		}

		public String getLname() {
			return lname;
		}

		public void setLname(String lname) {
			this.lname = lname;
		}

		public String getFname() {
			return fname;
		}

		public void setFname(String fname) {
			this.fname = fname;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

	}
}