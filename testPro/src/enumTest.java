public class enumTest {
	
	public enum City{SEOUL, BUSAN, DAEGU, GWANGJU, DAEJUN}
	
	public enum Season{
		
		SPRING("March through May"),
		SUMMER("June through August"),
		FALL("September through November"),
		WINTER("December through February");
		
		private String span;
		
		Season(String months){
			span = months;
		}
		
		public void getSpan(){
			System.out.println(span);
		}
	}
	
	public static void main(String[] args) {
		City city1 = City.valueOf("SEOUL");
		
//		System.out.println(city1.name());
//		System.out.println(city1.ordinal());
		
		Season season = Season.valueOf("SPRING");
		
		season.getSpan();
		
		
		
	}
}
