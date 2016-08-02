import java.util.ArrayList;
import java.util.List;

public class TestandoListas {

	public static void main(String[] args) {

		String curso1 = "Java 8";
		String curso2 = "Servelets: Fundamentos de Java na Web";
		String curso3 = "Designer Ptters";

		List<String> cursos = new ArrayList<>();
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);

		System.out.println(cursos);

	}
}
