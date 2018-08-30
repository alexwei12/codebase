
public class Count1 {

	private static int c(int i) {
		int in = i;
		int count = 0;
		while(in != 0) {
			count++;

			in = in & (in - 1);
			System.out.println("step : " + in);
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(c(1));
		System.out.println(c(2));
		System.out.println(c(3));
		System.out.println(c(15));
		System.out.println(c(32));
		System.out.println(c(2345));
	}}



