import java.util.Scanner;

public class MaiinRunner {

	public static void main(String[] args) {
		String movieTitle, rating;
		int year, runTime;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter your faburate movie name :  ");
		movieTitle = scanner.next();
		System.out.println("Please Enter your faburate movie rating :  ");
		rating = scanner.next();
		System.out.println("Please Enter your faburate movie year :  ");
		year = scanner.nextInt();
		System.out.println("Please Enter your faburate movie runTime :  ");
		runTime = scanner.nextInt();
		Movie faburateMovie = new Movie(movieTitle, rating, year, runTime);
		System.out.println(faburateMovie.toString());
	}
}
