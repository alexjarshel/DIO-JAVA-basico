public class Main {

    public static void main(String[] args) {
        Node<String> node1 = new Node<>("Content node1");
        Node<String> node2 = new Node<>("Content node2");

        node1.setNextNode(node2);

        Node<String> node3 = new Node<>("Content node3");
        node2.setNextNode(node3);

        Node<String> node4 = new Node<>("Content node4");
        node3.setNextNode(node4);

        // node1 -> node2 -> node3 -> node;

        /*
         * System.out.println(node1);
         * System.out.println(node1.getNextNode());
         */

        Node<String> currentNode = node1;
        while (node1.getNextNode() != null) {
            System.out.println(currentNode);

            currentNode = currentNode.getNextNode();

        }

    }
}