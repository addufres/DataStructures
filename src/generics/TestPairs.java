package generics;

public class TestPairs {
	public static void main(String[] args) {
		OrderedPair<Double> latLong = new OrderedPair<Double>();
		latLong.setFirst(39.47);
		latLong.setSecond(-104.56);
		double lat = latLong.getFirst();
		System.out.println(latLong.isEmpty());
		System.out.println(latLong.toString());
		System.out.println(latLong.getFirst().equals(lat));
		System.out.println(latLong.getFirst() == 39.47);
	}
}
