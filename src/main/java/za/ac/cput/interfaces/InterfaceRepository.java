package za.ac.cput.interfaces;

public interface InterfaceRepository<T, ID> {
    T create(T t);
    T read(ID id);
    T update(T t);
    T delete(T t);
}
