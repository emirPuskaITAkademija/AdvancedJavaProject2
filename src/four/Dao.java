package four;
// CRUD

import java.util.List;

/**
 * <li>Create</li>
 * <li>Retrieve</li>
 * <li>Update </li>
 * <li>Delete</li>
 * @param <T>
 */
public interface Dao<T> {

    public void insert(T record);

    public T update(T record);

    public void delete(T record);

    public T retrieve(int id);

    public List<T> retrieveAll();
}
