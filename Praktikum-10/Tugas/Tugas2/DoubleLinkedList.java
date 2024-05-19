public class DoubleLinkedList {
    Film head;

    DoubleLinkedList() {
        this.head = null;
    }

    void addFirst(int id, String judul, double rating) {
        Film newNode = new Film(null, id, judul, rating, head);
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
    }

    void addLast(int id, String judul, double rating) {
        if (head == null) {
            addFirst(id, judul, rating);
            return;
        }
        Film temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Film newNode = new Film(temp, id, judul, rating, null);
        temp.next = newNode;
    }

    void addIndexOf(int index, int id, String judul, double rating) {
        if (index == 0) {
            addFirst(id, judul, rating);
            return;
        }
        Film temp = head;
        for (int i = 0; i < index - 2; i++) {
            if (temp != null) {
                temp = temp.next;
            }
        }
        if (temp == null || temp.next == null) {
            addLast(id, judul, rating);
            return;
        }
        Film newNode = new Film(temp, id, judul, rating, temp.next);
        temp.next.prev = newNode;
        temp.next = newNode;
    }

    void removeFirst() {
        if (head != null) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
        }
    }

    void removeLast() {
        if (head != null) {
            if (head.next == null) {
                head = null;
            } else {
                Film temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.prev.next = null;
            }
        }
    }

    void removeIndexOf(int index) {
        if (index == 0) {
            removeFirst();
            return;
        }
        Film temp = head;
        for (int i = 0; i < index; i++) {
            if (temp != null) {
                temp = temp.next;
            }
        }
        if (temp != null && temp.prev != null) {
            temp.prev.next = temp.next;
            if (temp.next != null) {
                temp.next.prev = temp.prev;
            }
        }
    }

    void Print() {
        Film temp = head;
        while (temp != null) {
            System.out.println("ID : " + temp.id);
            System.out.println("Judul Film : " + temp.judul);
            System.out.println("Rating : " + temp.rating);
            System.out.println();
            temp = temp.next;
        }
    }

    void cariIDFilm(int id) {
        Film temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.id == id) {
                System.out.println("Data ID Film : " + id + " berada di node ke- " + (index + 1));
                System.out.println("IDENTITAS :");
                System.out.println("ID : " + temp.id);
                System.out.println("Judul Film : " + temp.judul);
                System.out.println("Rating : " + temp.rating);
                return;
            }
            temp = temp.next;
            index++;
        }
        System.out.println("Film dengan ID " + id + " tidak ditemukan");
    }

    void sortingRatingDesc() {
        if (head == null) {
            return;
        }
        Film current, index;
        int tempId;
        String tempJudul;
        double tempRating;

        for (current = head; current.next != null; current = current.next) {
            for (index = current.next; index != null; index = index.next) {
                if (current.rating < index.rating) {
                    tempId = current.id;
                    tempJudul = current.judul;
                    tempRating = current.rating;

                    current.id = index.id;
                    current.judul = index.judul;
                    current.rating = index.rating;

                    index.id = tempId;
                    index.judul = tempJudul;
                    index.rating = tempRating;
                }
            }
        }
    }
}