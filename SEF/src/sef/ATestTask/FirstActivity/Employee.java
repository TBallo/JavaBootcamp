package sef.ATestTask.FirstActivity;

public class Employee extends Person {

    private int empId;
    private String jobTitle;
    private String companyName;
    private double salary;

    //TODO 1 create different constructors
    public Employee(){
        this.empId = empId;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;
    }
    public Employee(int empId, String jobTitle, String companyName,double salary){
        this.empId = empId;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;
    }

    public Employee(String firstName, String secondName, int age,int empId, String jobTitle, String companyName,double salary){
        this.setFirstName(firstName) = firstName;
        this.setSecondName(secondName) = secondName;
        this.setAge(age) = age;
        this.empId = empId;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;}

    public String getjobTitle (){
         return jobTitle;
              }

    public void setJobTitle(String jobTitle){
        this.jobTitle = jobTitle;
        }

    public int getempId() {
         return empId;
        }

    public void setempId(int empId){
        this.empId = empId;
            }

    public String getcompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName){
        this.companyName = companyName;
        }

    public double getsalary() {
            return salary;
        }

    public void setsalary( double salary){
        this.salary = salary;
        }

    public String getFirstName() {
        return firstName;
    }
    public int getAge() {
        return age;}

    public void personintroduce (){
        System.out.println("My mame is" + firstName + "and I am" + age + "years old. I am work as" + jobTitle + "in" + companyName);
    }

        //TODO 2 add getters and setters


    }