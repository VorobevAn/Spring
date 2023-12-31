import com.google.gson.GsonBuilder;
import com.google.gson.Gson;

/**
 * 1. Создайте новый Maven или Gradle проект, следуя инструкциям из блока 1 или блока 2.
 * 2. Добавьте зависимости org.apache.commons:commons-lang3:3.12.0 и com.google.code.gson:gson:2.8.6.
 * 3. Создайте класс Person с полями firstName, lastName и age.
 * 4. Используйте библиотеку commons-lang3 для генерации методов toString, equals и hashCode.
 * 5. Используйте библиотеку gson для сериализации и десериализации объектов класса Person в формат JSON.
 *
 */

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

        System.out.println("hashCode = " + personGson.hashCode());

    }
}
