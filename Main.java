class A{
	int i;
	A(int i){  //constructor to pass in i's value
		this.i = i;
	}
	A(){ //to make a generic A with i as 100
		this.i = 100;
	}
	public void setI(int i){
		this.i = i; //we can change the i after the constructor
	}
	public String toString(){ //to display info
		return "A i=" + i;
	}
}

class Main {
  public static void main(String[] args) {
    A a = new A();
		System.out.println(a); //what are we expecting?
		A b = a;
		System.out.println(b); 
		b.setI(50);
		System.out.println(a);
  }
}