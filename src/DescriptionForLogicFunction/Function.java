package DescriptionForLogicFunction;
public class Function {
	static int num;
	String simple[][]={{"A","B","C","D"},{"A\'","B\'","C\'","D\'"}};
	//设立A，B，C，D四个变量，A\表示取非
	
	public Function(){
		num=0;
	}
	
	
	String Outer[];
	public static String[] TureListToFunction(int TrueListF[]) {
		String outer[] = null;
		for(int i=0;i<16;i++) {
			if(TrueListF[i]==1) {
				
			}
		}
		return outer;
	}
	/*
	class One{
		int input[] =new int [8];
		public void OneInit() {
			for(int j=0;j<8;j++) {
				input[j]=0;
			}
		}
		public One(int inputTemp[]) {
			OneInit();
			for(int i=0;i<8;i++) {
				input[i]=inputTemp[i];
			}
		}
	}
	public static void initOne(int inputTemp[]) {
		Function f=new Function();
		Function.One o=f.new One(inputTemp);
	}
	public static void print() {
	}
	*/
}
