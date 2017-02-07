public class main_class {

	public static void main(String[] args) {

		sub1_class mc = new sub2_class();
		
		mc.test2();
		mc.test1();
		//test11111
		
		a a = new b();
		
		a.x();
		//a.y();
	}

}

class sub1_class {
	void test1(){
		System.out.println(123);
	}
	
	void test2(){
		System.out.println(222);
	}
}

class sub2_class extends sub1_class{
	void test1(){
		System.out.println(111);
	}
	
	void test3(){
		System.out.println(333);
	}
}

class a {
	String x(){
		return "x";
	}
}

class b extends a{
	String y(){
		return "y";
	}
}
