public class SingleLinkedList {
  private SinglyListNode head;

  public SingleLinkedList() {
    this.head = null;
  }

  public int get(int index) {
    SinglyListNode tempNode = head;
    int count = 0;
    while(tempNode != null) {
      if(count == index) {
        return tempNode.val;
      }
      count++;
      tempNode = tempNode.next;
    }
    return -1;
  }

  public void addAtHead(int val) {
    SinglyListNode newNode = new SinglyListNode(val);
    newNode.next = this.head;
    this.head = newNode;
  }

  public void addAtTail(int val) {
    SinglyListNode tempNode = this.head;
    while(tempNode != null) {
      if(tempNode.next == null) {
        tempNode.next = new SinglyListNode(val);
      }
      tempNode = tempNode.next;
    }
  }

  public void addAtIndex(int index, int val) {
    if(index == 0) {
      this.addAtHead(val);
    } else {
      SinglyListNode cur = this.head;
      int count = 0;
      while(cur != null) {
        if(count == index - 1) {
          SinglyListNode newNode = new SinglyListNode(val);
          newNode.next = cur.next;
          cur.next = newNode;
        }
        count++;
        cur = cur.next;
      }
    }
  }

  public void removeAtIndex(int index) {
    SinglyListNode cur = this.head;
    SinglyListNode pre = null;
    int count = 0;
    while (cur != null) {
      if(count == index) {
        if(count == 0) {
          this.head = cur.next;
        } else {
          pre.next = cur.next;
          return;
        }
      }
      count++;
      pre = cur;
      cur = cur.next;
    }
  }

  public void print() {
    SinglyListNode tempNode = this.head;
    System.out.print("List: ");
    while (tempNode != null) {
      if(tempNode.next != null) {
        System.out.printf("%d -> ", tempNode.val);
      }
      tempNode = tempNode.next;
    }
    System.out.println();
  }
}
