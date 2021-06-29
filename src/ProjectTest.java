
public class ProjectTest {

	public static void main(String[] args) {
		
		Project p1 = new Project();
		p1.setName("Talento Digital");
		p1.setDescription("Formar en Programación");
		System.out.println(p1.elevatorPitch());
		System.out.println(p1.getName());
		System.out.println(p1.getDescription());
		
		Project p2 = new Project("Inforcap");
		p2.setDescription("Gran Proyecto");
		System.out.println(p2.elevatorPitch());
		System.out.println(p2.getName());
		System.out.println(p2.getDescription());

		Project p3 = new Project("Corfo", "Super Proyecto");
		System.out.println(p3.elevatorPitch());
		System.out.println(p3.getName());
		System.out.println(p3.getDescription());
	}

}
