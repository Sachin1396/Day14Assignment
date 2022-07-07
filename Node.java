   public class Node <K> implements INode <K> {
        K key;
        INode next;


        public K getKey() {
            return key;
        }

        public INode getNext() {
            return next;
        }


        public void setKey(K key) {
            this.key = key;
        }

        public void setNext(INode next) {
            this.next = next;
        }

        public Node(K key) {
            this.key = key;
            this.next = null;
        }
    }

