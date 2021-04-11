
public class prePostIncDecrement {
	
	int i;
	int j;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prePostIncDecrement obj = new prePostIncDecrement();
		obj.preIncrementOp();
		obj.postIncrementOp();
		obj.preDecrementOp();
		obj.postDecrementOp();
		
			
	}
	
		void preIncrementOp(){
			 i =1;
			 j = ++i;
			System.out.println("Preincrement return:" +System.lineSeparator() + "Value of i is :" +i+  System.lineSeparator() +"Value of j is :"+j);
			System.out.println("===========");

		}
		
		void postIncrementOp() {
			i = 1;
			j = i++;
			System.out.println("Postincrement return:"  +System.lineSeparator()+ "Value of i is :" +i+  System.lineSeparator() +"Value of j is :"+j);
			System.out.println("===========");
		}
		
		void preDecrementOp(){
			 i =1;
			 j = --i;
			System.out.println("preDecrementOp return:"+System.lineSeparator()+ "Value of i is :" +i+  System.lineSeparator() +"Value of j is :"+j);
			System.out.println("===========");

		}
		
		void postDecrementOp() {
			i = 1;
			j = i--;
			System.out.println("postDecrementOp return:"+System.lineSeparator()+"Value of i is :" +i+  System.lineSeparator() +"Value of j is :"+j);
			System.out.println("===========");
		}
		
	}
