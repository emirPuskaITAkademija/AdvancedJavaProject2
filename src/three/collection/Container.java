package three.collection;

import java.util.Iterator;

public class Container
        implements Iterable<Number> {

    public Container() {
        //
    }

    @Override
    public Iterator<Number> iterator() {
        Iterator<Number> mojIterator = new ContainerIterator();
        return mojIterator;
    }

    class ContainerIterator implements Iterator<Number> {
        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Number next() {
            return null;
        }
    }
}
