public class Party {

	public static void main(String[] args) {
		
		int np; //number of pizzas in total
		int nc; //number of cases in total
		//in general; n = number, s = slice, p = pizza, c = soda can/case
		System.out.println("Input number of people: ");
		int n = IO.readInt();
			System.out.println("Input number slices per person: ");
			int spp = IO.readInt(); //spp = slices of pizza per person
		System.out.println("Input number cans per person: ");
		int cpp = IO.readInt(); //cpp = cans of soda per person
			System.out.println("Input cost of one pizza pie: ");
			double costp = IO.readDouble(); //costp = cost of one pizza pie
			System.out.println("Input number of slices in a pie: ");
			int slices = IO.readInt(); //slices = number of slices in a pie
		System.out.println("Input cost of one case of soda: ");
		double costc = IO.readDouble(); //cost c = cost of a can of soda
		System.out.println("Input number of cans in a case of soda: ");
		int ncc = IO.readInt(); //ncc = number of cans in a case
		
		np = (n * spp)/slices;
		
		if(n * spp%slices > 0)
		{
			np++;
		}
		
		nc = (n * cpp)/ncc;
		
		if((double)n*cpp%ncc > 0)
		{
			nc++;
		}
		IO.outputDoubleAnswer(costp*np + costc*nc);
	}

}
