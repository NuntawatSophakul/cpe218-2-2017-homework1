


import java.util.Stack;


public class Homework1 {
	public static  Node tree ;
	public static Stack<Character> Cat =new Stack<Character>();
	public static void main(String[] args) {

		//String input = "251-*32*+";

		String posfix = args[0];
		for(int i=0;i<posfix.length();i++){
			Cat.add(posfix.charAt(i));
		}
		tree = new Node(Cat.pop());
		Infix(tree);
		iNorder(tree);
		System.out.print("="+Calculate(tree));

	}
	public static void Infix(Node Nuntawat){
		if(Nuntawat.Aun == '+' || Nuntawat.Aun == '-' || Nuntawat.Aun == '*' || Nuntawat.Aun == '/'){
			Nuntawat.right = new Node(Cat.pop());
			Infix(Nuntawat.right);
			Nuntawat.left = new Node(Cat.pop());
			Infix(Nuntawat.left);
		}
	}
	public static int Calculate(Node Alcohol){
		if(Alcohol.Aun == '+')
		{
			return Calculate(Alcohol.left)+Calculate(Alcohol.right);
		}
		else  if(Alcohol.Aun == '-')
		{
			return Calculate(Alcohol.left)-Calculate(Alcohol.right);
		}
		else  if(Alcohol.Aun == '*')
		{
			return Calculate(Alcohol.left)*Calculate(Alcohol.right);
		}
		else  if(Alcohol.Aun == '/')
		{
			return  Calculate(Alcohol.left)/Calculate(Alcohol.right);
		}
		else return Integer.parseInt(Alcohol.Aun.toString());
	}

	public static void iNorder(Node Beer) {
		if(Beer.Aun == '+' || Beer.Aun == '-' || Beer.Aun == '*' || Beer.Aun == '/'){
			if(Beer!=tree)System.out.print("(");
			iNorder(Beer.left);
			System.out.print(Beer.Aun);
			iNorder(Beer.right);
			if(Beer!=tree)System.out.print(")");
		}else
		{
			System.out.print(Beer.Aun);
		}
	}


}
//upไม่ได้
