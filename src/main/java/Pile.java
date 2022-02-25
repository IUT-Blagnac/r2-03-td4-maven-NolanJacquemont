/**
 * The type Pile.
 *
 * @param <T> the type parameter
 */
public class Pile<T> {

    private int size;
    private T[] tab;

    /**
     * Instantiates a new Pile.
     */
    public Pile() {
        this.tab = (T[]) new Object[100];
        this.size = 0;
    }

    /**
     * Instantiates a new Pile.
     *
     * @param maxSize the max size
     */
    public Pile(int maxSize) {
        this.tab = (T[]) new Object[maxSize];
        this.size = 0;
    }

    /**
     * Gets size.
     *
     * @return size
     */
    public int getSize() {
        return this.size;
    }

    /**
     * Top t.
     *
     * @return top element
     * @throws RuntimeException the runtime exception
     */
    public T top() throws RuntimeException {
        if(this.isEmpty()) throw new RuntimeException("La pile est vide...");
        return this.tab[size-1];
    }

    /**
     * Is empty boolean.
     *
     * @return the boolean
     */
    public boolean isEmpty() {
        return this.size == 0;
    }

    /**
     * Push.
     *
     * @param elem the elem
     */
    public void push(T elem) {
        this.tab[this.size] = elem;
        this.size++;
    }

    /**
     * Unpush.
     *
     * @throws RuntimeException the runtime exception
     */
    public void unpush() throws RuntimeException {
        if(this.isEmpty()) throw new RuntimeException("La pile est vide...");
        this.size--;
    }
}