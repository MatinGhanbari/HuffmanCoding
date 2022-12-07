package ir.ac.kntu;

import ir.ac.kntu.utils.*;

public class Main {

    public static void main(String[] args) {
        Huffman huffman = new Huffman();
        int n = 6;
        char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f'};
        int[] charFreq = {5, 9, 12, 13, 16, 45};
        Node code = huffman.calcHuffman(n, charArray, charFreq);
        System.out.println(huffman.codeToString(code, ""));
    }
}
