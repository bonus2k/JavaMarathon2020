package day18;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Node root = new Node(20);
        root.add(14);
        root.add(23);
        root.add(11);
        root.add(16);
        root.add(22);
        root.add(27);
        root.add(5);
        root.add(15);
        root.add(18);
        root.add(24);
        root.add(150);
        root.add(8);

//        Random random = new Random();
//        for (int i = 0; i < 20; i++) {
//
//            root.add(random.nextInt(100));
//        }

        root.dfs(root);

    }
}