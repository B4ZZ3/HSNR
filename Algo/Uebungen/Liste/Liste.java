package Liste;

public class Liste {
    Data first;
    
    public void appendEnd(Data data) {
        if(!isEmpty()) {
            Data last = first;
            while (last.getNext() != null)
                last = last.getNext();

            last.setNext(data);
        }
        else {
            first = data;
        }
    }

    public void removeEnd() {
        if(!isEmpty()) {
            Data last = first;
            while (last.getNext().getNext() != null)
                last = last.getNext();

            last.setNext(null);
        }
    }

    public void appendFirst(Data data) {
        if(!isEmpty()) {
            Data temp = first;
            data.setNext(temp);
        }

        first = data;
    }

    public boolean delete(int key) {
        if(!isEmpty()) {
            Data del = first;
            do {
                if(del.getKey() == key) { //if first has searched key
                    first = del.getNext();
                    break;
                }
                // else if(del.getNext() == null) {
                //     first = null;
                // }
                else if(del.getNext().getKey() == key) { //if item in the middle has the key
                    Data prev = del; //get previous of searched data
                    Data next = del.getNext().getNext(); //get next of searched node
                    prev.setNext(next);
                }
                else { //get the next element to search for
                    del = del.getNext();
                }
                   
            } while (del.getNext() != null);  
            return true;
        }
        else {
            return false;
        }
        
    }

    public boolean change(int key, Data newdata) {
        if(!isEmpty()) {
            Data old = first;
            do {
                if(old.getKey() == key) {
                    old.setKey(newdata.getKey());
                    old.setValue(newdata.getValue());
                }
                else {
                    old = old.getNext();
                }
            } while(old != null);
            return true;
        }
        else {
            return false;
        }
    }

    private boolean isEmpty() {
        return first == null;
    }
}
