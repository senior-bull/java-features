package org.test.newfeatures;

import java.util.ArrayList;
import java.util.List;

public class HelpfulNPETest {

    private static class Node {

        private final Node next;

        private Node(Node next) {
            this.next = next;
        }

        public Node next() {
            return next;
        }
    }

    public static void main(String[] args) {
        List<Node> list = new ArrayList<>();
        list.add(new Node(null));
        list.add(null);

        System.out.println(list.get(1).next());
    }
}
