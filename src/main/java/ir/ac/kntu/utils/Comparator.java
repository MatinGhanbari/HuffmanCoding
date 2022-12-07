package ir.ac.kntu.utils;

public class Comparator implements java.util.Comparator<Node> {

    public int compare(Node x, Node y) {
        return x.data - y.data;
    }

}