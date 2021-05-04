package structural.composite;

import java.util.Objects;

public abstract class Node {
    private String name;

    public Node(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Node) {
            return this.name.equalsIgnoreCase(((Node) o).name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    public abstract int getSize();
}
