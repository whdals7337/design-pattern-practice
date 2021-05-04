package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Node {
    private List<Node> nodes = new ArrayList<>();

    public Directory(String name) {
        super(name);
    }

    public void addNode(Node node) {
        nodes.add(node);
    }

    public void removeNode(Node node) {
        nodes.remove(node);
    }

    @Override
    public int getSize() {
        int size = 0;
        for (Node node : nodes) {
            size+= node.getSize();
        }
        return size;
    }

    public void ls() {
        for (Node node : nodes) {
            System.out.println(" " + node.getName() + " : " + node.getSize());
        }
    }
}
