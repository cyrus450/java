package multipleinterface;

class Employee implements Personal,offcial{
	String name;
    int age;
    String designation;
    String department;
    Employee (String name, int age, String designation, String department){
    	this.name=name;
    	this.age=age;
    	this.designation = designation;
    	this.department = department;
    }
    public void displayPersonalDetails() {
    	System.out.println("Name:" + name);
    	System.out.println("Age:" + age);
    }
    public void displayOfficialDetails() {
    	System.out.println("designation:" + designation);
    	System.out.println("department:" + department);
    }
    
    }

