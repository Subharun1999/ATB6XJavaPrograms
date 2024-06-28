package ex_27062024_DifferentPatterns;

public class BuilderPattern {

	public BuilderPattern groundFloor() {
		System.out.println("Task performing on ground Floor ");
		return this;
	}

	public BuilderPattern firstFloor(String name) {
		System.out.println("Task performing on First Floor " + name);
		return this;
	}

	public BuilderPattern secondFloor(String name, String color) {
		System.out.println("Task performing on Second Floor " + name + color);
		return this;
	}

	public static void main(String[] args) {
		BuilderPattern bp = new BuilderPattern();
		bp.groundFloor().firstFloor("FF").secondFloor("SF","Brown");
	}


}
