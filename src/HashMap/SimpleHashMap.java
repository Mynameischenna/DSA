package HashMap;

public class SimpleHashMap {
    private class Entity{
        private String key;
        private String value;

        public Entity(String key,String value){
            this.key = key;
            this.value = value;
        }
    }
    private Entity[] entites = new Entity[100];
    public void putEntity(String key,String value){
       int hash = Math.abs(key.hashCode() % entites.length);
        entites[hash] = new Entity(key,value); // not managing collision its just update the value

    }

    public String getEntity(String key) {
        int hash = Math.abs(key.hashCode() % entites.length);
        if(entites[hash] != null && entites[hash].key.equals(key)){
            return entites[hash].value;
        }
        return null;
    }
    public void deleteEntity(String key){
        int hash = Math.abs(key.hashCode() % entites.length);
        if(entites[hash] != null && entites[hash].key.equals(key)){
           entites[hash] = null;
        }
    }

    public static void main(String[] args) {
    SimpleHashMap hashMap = new SimpleHashMap();
    hashMap.putEntity("mango","king of fruits");
    hashMap.putEntity("sdd","aksn");
    System.out.println(hashMap.getEntity("sdd"));
    }
}
