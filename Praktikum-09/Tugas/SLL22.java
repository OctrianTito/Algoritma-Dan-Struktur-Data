public class SLL22 {
    ListMhs head, tail;
    
    boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }

    void print () {
        if (!isEmpty()) {
            int i = 1;
            ListMhs tmp = head;
            System.out.println("Isi Linked List : ");
            while (tmp != null) {
                System.out.printf("\n| %-3d| %-5s| %-30s|", i, tmp.nim, tmp.nama);
                tmp = tmp.next;
                i++;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    void addFirst(int nim, String nama) {
        ListMhs ndInput = new ListMhs(nim, nama, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }
    
    void addLast(int nim, String nama) {
        ListMhs ndInput = new ListMhs(nim, nama, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(int key, int input, String nama) {
        ListMhs ndInput = new ListMhs(input, nama, null);
        ListMhs temp = head;
        do {
            if (temp.nim == key){
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next != null) {
                    tail = ndInput;
                    break;
                }
            }
            temp = temp.next;
        } while (temp == null);
    }

    void insertAt(int index, int nim, String nama) {
        ListMhs ndInput = new ListMhs(nim, nama, null);
        if (index > 0) {
            ListMhs temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new ListMhs(nim, nama, null);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        } else if (index  == 0) {
            addFirst(nim, nama);
        } else {
            System.out.println("GAGAL!!!");
            System.out.println("PENEMPATAN DATA TIDAK BOLEH PADA INDEX MIN, SILAHKAN COBA LAGI");
        }
    }

    int indexOf(int key) {
        ListMhs tmp = head;
        int index = 0;
        while (tmp != null && tmp.nim != key) {
            tmp = tmp.next;
            index++;
        }
        if (tmp == null) {
            return 1;
        } else {
            return index;
        }
    }
    
    void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong," + " tidak dapat dihapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat dihapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            ListMhs temp = head;
            while (temp.next == null) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }
    

    void remove(int key) {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat dihapus");
        } else {
            if (head.nim == key) {
                removeFirst();
            } else {
                ListMhs temp = head;
                while (temp.next != null) {
                    if (temp.next.nim == key) {
                        temp.next = temp.next.next;
                        if (temp.next == null) {
                            tail = temp;
                        }
                        break;
                    }
                    temp = temp.next;
                }
            }
        }
    }

    void removeAt (int index) {
        if (index == 0) {
            removeFirst();
        } else {
            ListMhs temp = head;
            for (int i = 0; i <= index; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
        }
    }

    int getDataNim(int index) {
        ListMhs temp = head;

        for(int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.nim;
    }

    String getDataNama(int index) {
        ListMhs temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.nama;
    }
}
