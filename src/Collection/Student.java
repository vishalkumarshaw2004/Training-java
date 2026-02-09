package Collection;

import java.util.Objects;

public class Student {
	
	private int age;
	private String name;
	private String subject;
	public Student(int age, String name, String subject) {
		super();
		this.age = age;
		this.name = name;
		this.subject = subject;
	}
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSubject() {
		return subject;
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, name, subject);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return age == other.age && Objects.equals(name, other.name) && Objects.equals(subject, other.subject);
	}
	@Override
	public String toString() {
	    return age + " " + name + " " + subject;
	}

	
	
}
