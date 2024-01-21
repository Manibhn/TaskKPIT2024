import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class PeriodicTable
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//TreeSet<Elements> chemicalElement=new TreeSet<Elements>();
		ArrayList<Elements> chemicalElement=new ArrayList<Elements>();

chemicalElement.add(new Elements(1,2,"Hydrogen"));
chemicalElement.add(new Elements(2,4,"Helium"));
chemicalElement.add(new Elements(3,7,"Lithium"));
chemicalElement.add(new Elements(4,8,"Berellium"));
chemicalElement.add(new Elements(5,11,"Boron"));
chemicalElement.add(new Elements(6,12,"Carbon"));
chemicalElement.add(new Elements(7,15,"Nitrogen"));
chemicalElement.add(new Elements(8,16,"Oxygen"));
chemicalElement.add(new Elements(9,19,"Florine"));
chemicalElement.add(new Elements(10,20,"Neon"));


Iterator<Elements> elementItetrator = chemicalElement.iterator(); //STRAW

while(elementItetrator.hasNext()) {
	Elements theElement = elementItetrator.next();
	System.out.println("Elements : "+theElement);
}
	}

}
class Elements{
	int atomicNumber;
	int atomicMass;
	String atomicName;
	
	public Elements(int atomicNumber, int atomicMass, String atomicName) {
		super();
		this.atomicNumber = atomicNumber;
		this.atomicMass = atomicMass;
		this.atomicName = atomicName;
	}
	
	@Override
	public String toString() {
		return "Elements [atomicNumber=" + atomicNumber + ", atomicMass=" + atomicMass + ", atomicName=" + atomicName
				+ "]";
	}
	
	public int compareTo(Elements o) {
		System.out.println("Comparing "+atomicNumber+ " with "+o.atomicNumber);
		return Integer.compare(atomicNumber, o.atomicNumber);
	}
	
}
