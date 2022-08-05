
public class CalculatorMain {

	public static void main(String[] args) {
		
		Calculator yo = new Calculator(20,10);
		
		System.out.println(yo.getNum1() +" + " +yo.getNum2()+ " : " + yo.sum());
		
		yo.setNum1(75);
		yo.setNum2(5);
		
		System.out.println(yo.getNum1() +" - " +yo.getNum2()+ " : " + yo.sub());
		System.out.println(yo.getNum1() +" * " +yo.getNum2()+ " : " + yo.mul());
		System.out.println(yo.getNum1() +" / " +yo.getNum2()+ " : " + yo.div());
	}

}
