package patterns.clone.comparison;

public class CompareCopyStrategies {

	public static void main(String[] args) {
		final int SIZE = 10000;
		final int NOFCLONES = 1000;

		Dictionary dict = new Dictionary("german", SIZE);
		DictionarySerial dict2 = new DictionarySerial("german", SIZE);


		long start = System.currentTimeMillis();
		for (int i = 0; i < NOFCLONES; i++) {
			dict.clone();
		}
		long end = System.currentTimeMillis();
		double t = (end - start) / 1000.0;
		System.out.println("Time used: " + t);

		long start2 = System.currentTimeMillis();
		for (int i = 0; i < NOFCLONES; i++) {
			dict2.clone();
		}
		long end2 = System.currentTimeMillis();
		double t2 = (end2 - start2) / 1000.0;
		System.out.println("Time used: " + t2);
		
	}

}
