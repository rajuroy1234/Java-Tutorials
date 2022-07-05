
public class PolymorphismClass {
		//Overloading
		public void print(){ //Fn1
			System.out.println("Hello from print()");
		}
		public void print(int x){ //Fn2: Case 2: different number of parameters with fn1
			System.out.println("Hello from print(int x), x: " + x);
		}
		public void print(int x, double y){ //Fn 3: Case 2: different number of parameters with fn1, fn2
			System.out.println("Hello from print(int x, double y), x: " + x + " , y: " +y);
		}
		public void print(double x, int y){ //Fn 4: Case 3: d
			
		}
}