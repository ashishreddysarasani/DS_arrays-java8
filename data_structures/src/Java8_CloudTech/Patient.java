package Java8_CloudTech;

public class Patient {
	
private String name;
private int age;
private String disease;
private int amt;


public Patient(String name, int age, String disease, int amt) {
	super();
	this.name = name;
	this.age = age;
	this.disease = disease;
	this.amt = amt;
}
@Override
public String toString() {
	return "Patient [name=" + name + ", age=" + age + ", disease=" + disease + ", amt=" + amt + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getDisease() {
	return disease;
}
public void setDisease(String disease) {
	this.disease = disease;
}
public int getAmt() {
	return amt;
}
public void setAmt(int amt) {
	this.amt = amt;
}

}
