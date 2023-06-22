public class Student {
    String name, surname, address;
    int id;

    public Student(String name, String surname, String address, int id){
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.id = id;
    }

    public String toString(){
        return  String.format("%s %s Адрес: %s id: %s",name,surname,address,id);
    }
}
