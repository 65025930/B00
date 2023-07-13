class Student{
    Integer ID;
    String Name;
    Integer addmissionYear;
    Integer GPA;
}
class Stu extends Student {
    private Integer ID;
    private Integer GPA;
    public Stu(Integer ID,String Name,Integer addmissionYear,Integer GPA) {
        this.ID = ID;
        this.Name = Name;
        this.addmissionYear = addmissionYear;
        this.GPA = GPA;
    }
    public void GPAchage(Integer GPA){
        this.GPA = GPA;
    }
    public void showDetails(){
        System.out.println("ID: "+this.ID);
        System.out.println("Name: "+this.Name);
        System.out.println("AddmissionYear: "+this.addmissionYear);
        System.out.println("GPA: "+this.GPA);
    }
}
class Lab{
    public static void main(String[]args){
        Stu S1 = new Stu(1111,"bas"2023,3.00);
        S1.showDetails();
        S1.Name ="B01";
        S1.GPAchage(4);
        S1.showDetails();
    }
}