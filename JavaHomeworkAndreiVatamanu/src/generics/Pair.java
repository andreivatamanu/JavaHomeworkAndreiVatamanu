/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

/**
 *
 * @author Samsung
 */

//2. What is the following class converted to after "type erasure"?

public class Pair<K, V> {
    public Pair(K key, V value) {
        this.key = key;
        this.value = value;

    }
    //public K getKey(); static {}
    //public V getValue(); static {}
    public void setKey(K key)     { this.key = key; }
    public void setValue(V value) { this.value = value; }
    private K key;
    private V value;
}

//Answer: Is no bound specified so the compiler will and replace them with each type parameter with type Objecs
/* public class Pair {

    public Pair(Object key, Object value) {
        this.key = key;
        this.value = value;
    }

    public Object getKey()   { return key; }
    public Object getValue() { return value; }

    public void setKey(Object key)     { this.key = key; }
    public void setValue(Object value) { this.value = value; }

    private Object key;
    private Object value;
}*/