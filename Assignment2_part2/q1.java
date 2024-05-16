	public class q1<K, V> 
	{
    private K k;
    private V v;

    public q1(K key, V value)
    {
        this.k = key;
        this.v = value;
    }

    public K get_Key() 
    {
        return k;
    }

    public void setKey(K k)
    {
        this.k= k;
    }

    public V get_Value() {
        return v;
    }

    public void set_Value(V v) {
        this.v = v;
    }

    public static void main(String[] args) 
    {
        q1<Integer, String> a = new q1<>(92, "namaste, everyone");

        System.out.println("Key: " + a.get_Key());
        System.out.println("Value: " +a.get_Value());
    }
}