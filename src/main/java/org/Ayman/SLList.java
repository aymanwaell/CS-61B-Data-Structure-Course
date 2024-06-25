package org.Ayman;

public class SLList<Item> implements List61B<Item> {

    private static class IntNode<Item> {
        public Item item;
        public IntNode<Item> next;

        public IntNode(Item i, IntNode<Item> n) {
            item = i;
            next = n;
        }
    }

    private IntNode<Item> sentinel;
    private int size;

    public SLList() {
        sentinel = new IntNode<>(null, null);
        size = 0;
    }

    public SLList(Item x) {
        sentinel = new IntNode<>(null, null);
        sentinel.next = new IntNode<>(x, null);
        size = 1;
    }

    public void addFirst(Item x) {
        sentinel.next = new IntNode<>(x, sentinel.next);
        size += 1;
    }

    public Item getFirst() {
        return sentinel.next.item;
    }

    @Override
    public void addLast(Item x) {
        IntNode<Item> p = sentinel;
        while (p.next != null) {
            p = p.next;
        }
        p.next = new IntNode<>(x, null);
        size += 1;
    }

    @Override
    public Item getLast() {
        IntNode<Item> p = sentinel;
        while (p.next != null) {
            p = p.next;
        }
        return p.item;
    }

    @Override
    public Item get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException();
        }
        IntNode<Item> p = sentinel.next;
        for (int j = 0; j < i; j++) {
            p = p.next;
        }
        return p.item;
    }

    @Override
    public Item removeLast() {
        if (size == 0) {
            return null;
        }
        IntNode<Item> p = sentinel;
        while (p.next.next != null) {
            p = p.next;
        }
        Item lastItem = p.next.item;
        p.next = null;
        size -= 1;
        return lastItem;
    }

    @Override
    public int size() {
        return size;
    }

}
