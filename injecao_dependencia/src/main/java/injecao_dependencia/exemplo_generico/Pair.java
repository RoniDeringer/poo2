package injecao_dependencia.exemplo_generico;

/**
 * A construcao do objeto Pair só é permitida se for passado dois objetos
 * K que será chamado de key dentro da classe V que será chamdo de value
 * dentro da classe. K e V são desconhecidos para a classe Pair.
 * @author roni.aviz
 */
public class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.setKey(key);
        this.setValue(value);
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
    
}
