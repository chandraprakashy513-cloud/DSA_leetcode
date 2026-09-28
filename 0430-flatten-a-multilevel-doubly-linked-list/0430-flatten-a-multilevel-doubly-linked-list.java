class Solution {
    public Node flatten(Node head) {
        if (head == null)
            return head;

        Node curr = head;

        while (curr != null) {
            if (curr.child == null) {
                curr = curr.next;
            } 
            else {
                Node next = curr.next;

                Node child = flatten(curr.child);

                curr.child = null;

                curr.next = child;
                child.prev = curr;

                Node temp = child;

                while (temp.next != null) {
                    temp = temp.next;
                }

                temp.next = next;

                if (next != null)
                    next.prev = temp;

                curr = next;
            }
        }

        return head;
    }
}