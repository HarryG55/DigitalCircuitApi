package DescriptionForLogicFunction;

public class OperationSymbol {  //�����
	int A,B;
	public static int and(int a,int b) {  //ͬ
		if(a==1&&b==1) return 1;
		else return 0;
	}
	public static int or(int a,int b) { //��
		if(a==0&&b==0) return 0;
		else return 1;
	}
	public static int not(int a) { //��
		if(a==1) return 0;
		else return 1;
	}
	
	public static int nand(int a,int b) { //���
		return not(and(a,b));
	}
	public static int nor(int a,int b) { //���
		return not(or(a,b));
	}
	public static int AndNor(int a,int b,int c,int d) { //����
		return not(or(and(a,b),and(c,d)));
	}
	
	public static int ExclusiveOr(int a,int b) { //���
		//return or(and(a,not(b)),and(not(a),b));
		if(a==b) return 0;
		else return 1;
	}
	public static int ExclusiveNor(int a,int b) {  //ͬ��
		//return or(and(a,b),and(not(a),not(b));
		if(a==b) return 1;
		else return 0;
	}
}