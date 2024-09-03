package HashMap;

import java.util.ArrayList;
import java.util.LinkedList;

public class HashMapLL<K,V> {

    private class Entity{
        private K key;
        private V value;

        public Entity(K key,V value){
            this.key = key;
            this.value = value;
        }
    }

    ArrayList<LinkedList<Entity>> list;
    int size = 0;
    float lf = 0.5f;

    public HashMapLL(){
        list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new LinkedList<>());
        }
    }
    public void put(K key,V value){
        int hash = Math.abs(key.hashCode() % list.size());
        LinkedList<Entity> entites = list.get(hash);
        for(Entity entity : entites){
            if(entity.key.equals(key)){
                // updated entity value
                entity.value = value;
                return;
            }
        }
        if(((float)(size) / list.size()) >= lf){
            rehash();
        }
        entites.add(new Entity(key, value));
        size++;
    }

    private void rehash() {
        ArrayList<LinkedList<Entity>> old = list;
        list = new ArrayList<>();
        size = 0;
        for (int i = 0; i < old.size() * 2; i++) {
            list.add(new LinkedList<>());
        }
        for (LinkedList<Entity> entites : old){
            for (Entity entity : entites){
                put(entity.key, entity.value);
            }
        }
    }
    public V get(K key){
        int hash = Math.abs(key.hashCode() % list.size());
        LinkedList<Entity> entites = list.get(hash);
        for(Entity entity : entites){
            if(entity.key.equals(key)){
                return entity.value;
            }
        }
        return null;
    }
    public void remove(K key){
        int hash = Math.abs(key.hashCode() % list.size());
        LinkedList<Entity> entites = list.get(hash);
        for(Entity entity : entites){
            if(entity.key.equals(key)){
                entites.remove(entity);
                break;
            }
        }
        size--;
    }
    public boolean containsKey(K key){
        return get(key)!=null;
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for(LinkedList<Entity> entites : list){
            for(Entity entity : entites){
                sb.append(entity.key);
                sb.append(" = ");
                sb.append(entity.value);
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public static void main(String[] args) {
        HashMapLL<String,String> map = new HashMapLL<>();
        map.put("a","apple");
        map.put("b","ball");
        map.put("c","cat");
        System.out.println(map.get("c"));
        map.remove("c");
        System.out.println(map.get("c"));
        System.out.println(map);
    }
}
