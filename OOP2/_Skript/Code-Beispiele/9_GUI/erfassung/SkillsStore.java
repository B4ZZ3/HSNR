import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

// Controller
public class SkillsStore {
	private List<Skill> skills = new ArrayList<>();

	public void add(Skill skill) {
		skills.add(skill);
	}

	public void store(String filename) throws IOException {
		PrintWriter out = new PrintWriter(new FileWriter(filename, true), true);

		for (Skill skill : skills) {
			StringBuilder sb = new StringBuilder();
			sb.append(skill.getName());
			sb.append(";");
			sb.append(skill.getVorname());
			sb.append(";");
			sb.append(skill.getGeschlecht());
			sb.append(";");
			sb.append(skill.getSprache());
			out.println(sb.toString());
		}

		out.close();
	}
}
