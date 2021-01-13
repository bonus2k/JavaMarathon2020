package day18;

public class Node {
    private Integer value;
    private Node left;
    private Node right;
    private Integer length = 0;

    public Node(Integer value) {
        this.value = value;
    }

    public boolean add(Integer value) {
        if (addNode(value) != null) {
            length++;
            return true;
        } else return false;
    }

    private Node addNode(Integer value) {
        if (value < this.value) {
            left = (left == null) ? new Node(value) : left.addNode(value);
        } else right = (right == null) ? new Node(value) : right.addNode(value);

        return this;
    }

    public Integer length() {
        return length;
    }


    public void dfs(Node node) {
        if (node.left != null) {
            dfs(node.left);

        }

        System.out.print(node.value + " ");

        if (node.right != null) {
            dfs(node.right);
        }
    }
}
