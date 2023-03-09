package com.dxesoft.exercices;


import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortCharactersByFrequency {

    public String frequencySort(String s) {

        Comparator<Node> nodeComparator = Comparator.comparing(Node::getFreq, Comparator.reverseOrder())
                .thenComparing(Node::getC);

        SortedSet<Node> nodeSet = new TreeSet<>(nodeComparator);
        Map<Character, Node> freqMap = new HashMap<>();

        s.chars().forEach(c -> {

            Node node;
            if (freqMap.containsKey((char)c)) {
                node = freqMap.get((char) c);
                nodeSet.remove(node);
                node.freq = node.freq + 1;
            } else {
                node = new Node();
                node.c = (char) c;
                node.freq = 1;
            }
            nodeSet.add(node);
            freqMap.put((char) c, node);
        });

        StringBuffer sbf = new StringBuffer();

        nodeSet.forEach(n -> {
            for (int i = 0; i < n.getFreq(); i++) {
                sbf.append(n.getC());
            }
        });

        return sbf.toString();
    }

    class Node {
        int freq;
        char c;

        public int getFreq() {
            return freq;
        }

        public void setFreq(int freq) {
            this.freq = freq;
        }

        public char getC() {
            return c;
        }

        public void setC(char c) {
            this.c = c;
        }
    }
}
