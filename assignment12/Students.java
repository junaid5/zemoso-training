package assignment12;

public class Students {
    public int id;
    public String name;
    public int age;
    public String gender;
    public String engDepartment;
    public int yearOfEnrollment;
    public double perTillDate;
    Students(int id,String name,int age,String gender,String engDepartment,int yearOfEnrollment,double perTillDate){
        this.id=id;
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.engDepartment=engDepartment;
        this.yearOfEnrollment=yearOfEnrollment;
        this.perTillDate=perTillDate;
    }
    String getEngDepartment(){
        return engDepartment;
    }
    public void printDetails(){
        System.out.print("\nid:"+this.id+"\nname:"+this.name+"\nage:"+this.age+"\ngender:"+this.gender);
        System.out.println("\nengDepartment:"+this.engDepartment+"\nyearOfEnrollment:"+this.yearOfEnrollment+"\nperTilldate:"+this.perTillDate);
    }
    public int getAge(){
        return age;
    }
    public String getGender(){
        return gender;
    }
    public double getPerTillDate(){
        return perTillDate;
    }
}
