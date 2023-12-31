import com.google.gson.GsonBuilder;
import com.google.gson.Gson;

public class Programm {
    public static void main( String[] args )
    {

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        Person person = new Person("Vasiliy", "Ivanov", 19);

        // Сериализуем в JSON

        String gsonPerson = gson.toJson(person);
        System.out.println(gsonPerson);

        // Десериализуем из JSON
        Person personGson = gson.fromJson(gsonPerson, Person.class);
        System.out.println(personGson);

        System.out.println("person hashCode = " + personGson.hashCode());

    }
}
