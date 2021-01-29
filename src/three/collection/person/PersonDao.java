package three.collection.person;

import java.io.FileReader;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * KAKO implementirati u JAvi ono što ste naučili na SQL
 * <p>Tri su koraka</p>
 * <li>1. Connection connection -> DriverManager</li>
 * <li>2. Statement statement -> connection</li>
 * <li>3. ResultSet resultSet -> koji ima podatke</li>
 */
public class PersonDao {

    static final String URL = "jdbc:mysql://localhost:3306/human_resource?useSSL=false";
    static final String USERNAME = "root";
    static final String PASSWORD = "Admin2021!";


    //CREATE
    public void create(Person person) {
        //vezu s bazom
    }

    //RETRIEVE
    public Person get(int id) {
        //retrieve
        return null;
    }

    //UPDATE
    public void update(Person person) {
        //UPDATZE
    }

    //DELETE
    public void delete(Person person) {
        //
    }

    public List<Person> retrieveAll() {
        List<Person> personList = new ArrayList<>();

        try(Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement statement = connection.createStatement();){

            ResultSet resultSet = statement.executeQuery("SELECT *FROM person;");
            //IŠČUPATI PODATKE IZ ResultSet
            while(resultSet.next()){
                Person person = new Person();
                person.setId(resultSet.getInt("id"));
                person.setName(resultSet.getString(2));
                person.setSurname(resultSet.getString("surname"));
                Date birthday = resultSet.getDate("birthday");
                person.setBirthday(birthday.toLocalDate());
                String spol = resultSet.getString("gender");
                person.setGender(spol.equals("MALE")? Gender.MALE: Gender.FEMALE);
                personList.add(person);
            }

        }catch (SQLException e){
            System.err.println(e.getMessage());
        }
        return personList;
    }
}
