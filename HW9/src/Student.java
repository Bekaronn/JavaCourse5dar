public class Student {
    private String name;
    private int id;
    private int year;
    public Student(String name, int id, int year){
        this.name = name;
        this.id = id;
        this.year = year;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }
}
