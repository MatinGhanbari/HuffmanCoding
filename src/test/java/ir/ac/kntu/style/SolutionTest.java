package ir.ac.kntu.style;

import ir.ac.kntu.Huffman;
import ir.ac.kntu.utils.Node;
import org.junit.Before;
import org.junit.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.Vector;

import static org.junit.Assert.*;

public class SolutionTest {

    private Huffman huffman;

    @Before
    public void setUp() throws Exception {
        huffman = new Huffman();
    }

    @Test
    public void test0() {
        int n = 6;
        char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f'};
        int[] charFreq = {5, 9, 12, 13, 16, 45};
        Node code = huffman.calcHuffman(n, charArray, charFreq);
        String answer = "f:0\n" +
                "c:100\n" +
                "d:101\n" +
                "a:1100\n" +
                "b:1101\n" +
                "e:111";

        assertEquals(huffman.codeToString(code, ""), answer);
    }
}