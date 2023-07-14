import java.util.*;

public class Main{
    public static boolean isWeekDay(String weekday) {
        if (weekday == "Saturday" || weekday == "Sunday") {
            return false;
        }
        return true;
    }

    public static boolean isHoliday(String weekday) {
        if (isWeekDay(weekday) == false) {
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        //#1
        for (Colors colors : Colors.values()) {
            System.out.println(colors);
        }

        //#2
        for (Weekday weekday : Weekday.values()) {
            if (isWeekDay(weekday.toString()) == true) {
                System.out.println(String.format("%s is weekday", weekday));
            }
            if (isHoliday(weekday.toString()) == true) {
                System.out.println(String.format("%s is holiday", weekday));
            }
        }
        //#3
        HelloWorld helloworld = new HelloWorld();
        helloworld.HelloW();

        //#4
        ArrayList<Integer> grade = new ArrayList<Integer>();
        grade.add(4);
        grade.add(3);
        grade.add(5);

        Iterator<Integer> iter = grade.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        //#5
        HashMap<String, String> phone = new HashMap<String, String>();
        phone.put("Beka","87078508269");
        phone.put("Alan","87768483232");
        phone.put("Dias","87008473013");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя контакта который хотите добавить:");
        String name = scanner.nextLine();
        System.out.println("Номер контакта:");
        String phoneNumber = scanner.nextLine();

        phone.put(name, phoneNumber);

        System.out.println(phone);

        System.out.println("Чей номер хотите изменить?:");
        name = scanner.nextLine();
        if(phone.containsKey(name)){
            System.out.println("На какой номер хотите поменять?");
            phoneNumber = scanner.nextLine();
            phone.replace(name, phoneNumber);
        } else {
            System.out.println("Контакт не найден");
        }

        //#6
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("red");
        colors.add("blue");
        colors.add("green");
        for (String color : colors) {
            System.out.println(color);
        }

        //#7
        ArrayList<String> fruit1 = new ArrayList<>();
        fruit1.add("apple");
        fruit1.add("pineapple");
        fruit1.add("banana");
        fruit1.add("grape");
        ArrayList<String> fruit2 = new ArrayList<>();
        fruit2.add("apple");
        fruit2.add("orange");
        fruit2.add("qiwi");
        fruit2.add("banana");
        if (fruit1 == fruit2) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        for (int i = 0; i < fruit1.size(); i++) {
            for (int j = 0; j < fruit2.size(); j++) {
                if (fruit1.get(i) == fruit2.get(j)) {
                    System.out.println(fruit1.get(i) + " has a pair");
                }
            }
        }

        //#8
        ArrayList<String> str = new ArrayList<String>();
        str.add("eeee");
        str.add("wwww");
        str.add("qqqq");
        str.set(1, "uuuu");
        for (String strs : str) {
            System.out.println(strs);
        }

        //#9
        LinkedList<String> cities = new LinkedList<>();
        cities.add("Almaty");
        cities.add("Astana");
        cities.add("Aktau");
        cities.add("Shymkent");
        cities.add("Semei");
        System.out.println(cities.getFirst());
        System.out.println(cities.getLast());
        //#10
        cities.set(2, "Almaty");
        cities.set(3, "Astana");
        for (String city : cities) {
            System.out.println(city);
        }
        //#11
        HashSet<String> animals1 = new HashSet<>();
        HashSet<String> animals2 = new HashSet<>();
        animals1.add("monkey");
        animals1.add("gorilla");
        animals1.add("cow");
        animals1.add("horse");
        animals1.add("capybara");

        animals2.add("chicken");
        animals2.add("monkey");
        animals2.add("pig");
        animals2.add("gorilla");
        animals2.add("capybara");

        HashSet<String> ans = new HashSet<>();

        for (String animal : animals1) {
            if (animals2.contains(animal)) {
                ans.add(animal);
            }
        }

        for (String answ : ans) {
            System.out.println(answ);
        }

        //#12
        System.out.println(ans.isEmpty());
        ans.clear();
        System.out.println(ans.isEmpty());

        //#13
        HashMap<String, String> capital = new HashMap<>();
        capital.put("USA", "Washington");
        capital.put("Kazakhstan", "Astana");
        capital.put("Russia", "Moscow");
        capital.put("Germany", "Berlin");
        System.out.println(capital);

        HashMap<String, String> capital_copy = new HashMap<>();
        capital_copy.putAll(capital);
        System.out.println(capital_copy);
        //#14
        if(capital.containsKey("USA")){
            System.out.println(capital.get("USA"));
        } else {
            System.out.println("doesn't contains");
        }

        if(capital.containsKey("Netherlands")){
            System.out.println(capital.get("Netherlands"));
        } else {
            System.out.println("doesn't contains");
        }
    }
}