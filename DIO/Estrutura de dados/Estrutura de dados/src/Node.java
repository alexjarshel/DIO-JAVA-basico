public class Node<T> {
    
   private T content;
   private Node nextNode = null;

   public Node(T content){
      this.nextNode = null;
      this.content = content;
   }

   public Node getNextNode() {
      return nextNode;
   }

   public void setNextNode(Node nextNode) {
      this.nextNode = nextNode;
   }

   public T getContent() {
      return content;
   }

   public void setContent(T content) {
      this.content = content;
   }

   @Override
   public String toString(){
      return "Node {"+ "content : " + content + "}"; 
   }

   
}
