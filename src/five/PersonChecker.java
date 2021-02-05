package five;

import three.collection.person.Person;

@FunctionalInterface
public interface PersonChecker {
    public boolean test(Person p);
}
