package three.collection.person;
//ENUM -> enumerated
public enum Gender {

    MALE("M"), FEMALE("F");
    private String name;

    private Gender(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
