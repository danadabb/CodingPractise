package datastructures;

/**
 * Created by Dana
 */
class CustomHashTable<T>
{
	private KeyValue table[][];
	private int m_size = 1000;

	public CustomHashTable(int size)
	{
		table = new KeyValue[size][size];
		m_size = size;
	}

	CustomHashTable()
	{
		table = new KeyValue[m_size][m_size];
	}

	private int hash(T key)
	{
		return key.hashCode() % m_size;
	}

	void put(T key, T value)
	{
		int hash = hash(key);
		int i = 0;
		for (i = 0; table[hash][i] != null; i++) ;

		table[hash][i] = new KeyValue<>(key, value);
	}

	KeyValue get(T key)
	{
		int hash = hash(key);
		int i;
		for (i = 0; table[hash][i] != null; i++)
		{
			if (table[hash][i].key.equals(key))
			{
				return table[hash][i];
			}
		}

		return null;
	}

	private class KeyValue<K, V>
	{
		K key;
		V value;

		private KeyValue(K key, V value)
		{
			this.key = key;
			this.value = value;
		}


		@Override
		public String toString()
		{
			return key.toString() + "->" + value.toString();
		}
	}

}
