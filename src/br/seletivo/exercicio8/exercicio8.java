package br.seletivo.exercicio8;
public class exercicio8 {
	
	public static void main(String[] args) {
		
		int a = 135;
		int b = 246;
		
		int lengthA = Integer.toString(a).toCharArray().length;
		int lengthB = Integer.toString(b).toCharArray().length;
		
		String auxiliar = "";
				
				
		for (int i = 0; i <= Integer.max(lengthA, lengthB); i++) {
			
			if(i < lengthA) {
				auxiliar += (Integer.toString(a).charAt(i));
			}
			
			if(i < lengthB) {
				auxiliar += (Integer.toString(b).charAt(i));
			}
		}
		
		int c = Integer.valueOf(auxiliar);
		
		if(c > 1000000) {
			System.out.println(-1);
		} else {
			System.out.println("Valor de A: " + a);	
			System.out.println("Valor de B: " + b);	
			System.out.println("Valor de C: " + c);	
		}		
	}
}