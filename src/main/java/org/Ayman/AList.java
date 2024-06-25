package org.Ayman;

public class AList<Item> implements List61B<Item>{
    private Item[] items;
    private int size;

    public AList(){
        items = (Item[]) new Object[100];
        size=0;
    }

    public void resize(int capacity){
        Item[] a = (Item[]) new Object[capacity];
        System.arraycopy(items,0,a,0,size);
        items = a;
    }
    public void addLast(Item x){
        if(size== items.length){
            resize(size*2);
        }
        items[size] = x;
        size ++;
    }

    public Item getLast(){
        return items[size-1];
    }

    public Item get(int i){
        return items[i];
    }

    public Item removeLast() {
        Item x = getLast();
        items[size-1] = null;
        size = size--;
        return x;
    }
    public int size(){
        return size;
    }
}
