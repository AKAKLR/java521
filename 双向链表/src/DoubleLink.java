class DoubleList{
    public int val;
    public DoubleList prev;//是定义Doublefangfa；
    public DoubleList next;
    public  DoubleList(int val){
        this.val=val;
    }
}
public class DoubleLink {
    public DoubleList head;//用DoubleList方法定义一个head和list对象；
    public DoubleList last;

    public void display() {
        if (head == null) {
            return;
        }
        DoubleList cur = this.head;
        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    public int sizeof() {
        DoubleList cur = this.head;
        int count = 0;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }

    public boolean countain(int date) {
        DoubleList cur = this.head;
        while (cur != null) {
            if (cur.val == date) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    public void First(int date) {
        DoubleList node = new DoubleList(date);
        if (head == null) {
            this.head = node;
            this.last = node;
            return;
        }
        node.next = head;
        head.prev = node;
        head = node;
    }

    public void Last(int date) {
        DoubleList node = new DoubleList(date);
        if (last == null) {
            this.last = node;
            this.head = node;
        }
        DoubleList cur = this.last;
        last.next = node;
        node.prev = last;
        last = node;
    }

    public void remove(int date) {
        DoubleList node = new DoubleList(date);
        DoubleList cur = this.head;
        while (cur != null) {
            cur = cur.next;
            if (cur.val == date) {
                if (head == cur) {
                    head = head.next;
                    if (head!=null){
                    }else {
                        last=null;
                    }
                    head.prev = null;
                } else {
                    cur.prev.next = cur.next;
                    if (cur.next != null) {
                        cur.next.prev = cur.prev;
                    } else {
                        last = last.prev;
                    }
                }
                return;
            }
        }
    }
}
