package com.mycompany.tracker;

import java.util.ArrayList;
import java.util.Objects;

public class Tracker {

    private final ArrayList<Item> items = new ArrayList<>();
    private int ids = 1;

    public Item add(Item item) {
        item.setId(ids++);
        items.add(item);
        return item;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < items.size(); index++) {
            Item item = items.get(index);
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    public ArrayList <Item> returnItem(int id, Item itemD) {
        
     for (int index = 0; index < items.size(); index++) {
          Item item1 = items.get(index);
            if (item1.getId() == id) {
                items.set(index, itemD);
                break;

            }
 
        }
    
        return items;
    }

    public void deleteItem(int id) {
        Item rsl = null;
        for (Item it : items) {

            if (it.getId() == id) {
                items.remove(it);
                break;

            }

        }
    }

    public ArrayList<Item> findByName(String key) {
        ArrayList<Item> st = new ArrayList();
        for (int index = 0; index < items.size(); index++) {
            Item item2 = items.get(index);
            if (item2.getName().contains(key)) {
                st.add(item2);

            }

        }
        return st;
    }

    public ArrayList<Item> findAll() {
        ArrayList<Item> allItem = new ArrayList();
        for (Item oo : items) {

            allItem.add(oo);
        }

        return allItem;

    }

    public int getIds() {
        return ids;
    }

    public void setIds(int ids) {
        this.ids = ids;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public Tracker() {
    }

    @Override
    public String toString() {
        return "Tracker{" + "items=" + items + ", ids=" + ids + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.items);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Tracker other = (Tracker) obj;
        return true;
    }

}
