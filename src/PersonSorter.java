import java.util.Arrays;

public class PersonSorter {

    public void start(){
        Person[]names = new Person[3];
        names[2]= new Person("Cem","Akay");
        names[1]= new Person("Sami","Faik");
        names[0]= new Person("Esila","Helin");

        System.out.println("før sortering " + Arrays.toString(names));
        Arrays.sort(names);
        System.out.println("efter sortering" +Arrays.toString(names));
    }

    public static void main(String[] args) {
        PersonSorter app = new PersonSorter();
        app.start();

    }
}
