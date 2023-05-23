import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;

        Node root = new Node(Integer.parseInt(br.readLine()));
        String input;
        while ((input = br.readLine()) != null) {
            root.insert(Integer.parseInt(input));
        }

        preOrder(root);

    }

    static void preOrder(Node node) {
        // 종료 조건
        if (node == null) return;

        preOrder(node.left);
        preOrder(node.right);
        System.out.println(node.num);
    }

}

class Node {
    int num;

    Node left, right;

    public Node(int num) {
        this.num = num;
    }

    void insert(int num) {
        if (num < this.num) {
            if (this.left == null) {
                this.left = new Node(num);
            } else {
                this.left.insert(num);
            }
        }
        else if (num > this.num) {
            if (this.right == null) {
                this.right = new Node(num);
            }
            else {
                this.right.insert(num);
            }
        }
    }
}