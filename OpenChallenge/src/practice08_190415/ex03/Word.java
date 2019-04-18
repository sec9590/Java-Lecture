package practice08_190415.ex03;

public class Word implements Comparable<Word> {
	private String name;
	private int count;

	public Word(String name, int count) {
		super();
		this.name = name;
		this.count = count;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	@Override
	public String toString() {
		return "Word [name=" + name + ", count=" + count + "]";
	}

	@Override
	public int compareTo(Word w) {		
		if (count < w.count)
			return 1;
		else if (count > w.count)
			return -1;
		return name.compareTo(w.name); //중복체크
	}

}
