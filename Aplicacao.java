import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String original = "abcde FGHIJ ABC abc DEFG ";
		//toLowerCase para minúsculas
		String s01 = original.toLowerCase();	
		
		//toUpperCase para maisuculos
		String s02 = original.toUpperCase();
		
		//trim remove o espaço no final
		String s03 = original.trim();
		
		//substring determinina em qual posição da string começa
		String s04 = original.substring(2);
		
		//substring determinina em qual posição da string começa e termina
		String s05 = original.substring(2, 9);
		
		//replace substitui 
		String s06 = original.replace('a', 'x');
		
		//Index of mostra o número da posição da parte selecionada começando do inicio
		String s07 = original.replace("abc", "xy");
		
		//Last index mostra o numero da posição da parte selecionada pelo fim
		int i = original.indexOf("bc");
		
		//Last index mostra o numero da posição da parte selecionada pelo fim
		int j = original.lastIndexOf("bc");

		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring(2): -" + s04 + "-");
		System.out.println("substring(2, 9): -" + s05 + "-");
		System.out.println("replace('a', 'x'): -" + s06 + "-");
		System.out.println("replace('abc', 'xy'): -" + s07 + "-");
		System.out.println("Index of 'bc': " + i);
		System.out.println("Last index of 'bc': " + j);
		
		String s = "potato,apple,lemon,98";
		
		//split determina onde recortar a string e dividir em vetores
		String[] vect = s.split(",");
		String word1 = vect[0];
		String word2 = vect[1];
		String word3 = vect[2];
		String ref = vect[3];
		System.out.println("Split of string: " + word2 + word1 + ref + word3);
		sc.close();
	}

}
