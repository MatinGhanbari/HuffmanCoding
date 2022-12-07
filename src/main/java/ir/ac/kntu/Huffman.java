package ir.ac.kntu;

import ir.ac.kntu.utils.*;

import java.util.PriorityQueue;


public class Huffman {
    public Node calcHuffman(int n, char[] charArray, int[] charFreq) {

        PriorityQueue<Node> q = new PriorityQueue<Node>(n, new Comparator());
        for (int i = 0; i < n; i++) {
            Node hn = new Node();
            hn.c = charArray[i];
            hn.data = charFreq[i];
            hn.left = null;
            hn.right = null;
            q.add(hn);
        }

        Node root = null;

        while (q.size() > 1) {
            Node x = q.peek();
            q.poll();
            Node y = q.peek();
            q.poll();
            Node f = new Node();
            f.data = x.data + y.data;
            f.c = '-';
            f.left = x;
            f.right = y;
            root = f;
            q.add(f);
        }
        return root;

    }

    public String codeToString(Node root, String s) {
        if (root.left == null && root.right == null && Character.isLetter(root.c))
            return root.c + ":" + s;
        String s1 = codeToString(root.left, s + "0");
        String s2 = codeToString(root.right, s + "1");
        return s1 + "\n" + s2;
    }
}