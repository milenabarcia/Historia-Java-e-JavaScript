// Exemplo 1
public class ExemploFunções {
	public static void saudacao() { 
		System.out.println("Olá de uma função em Java!"); 
	}
	public static void main(String[] args) {
		saudacao(); // Chamando o método 
	}
}
// Exemplo 2
public class ExemploPessoa { 
	String nome; public ExemploPessoa(String nome) {
		this.nome = nome; 
	}
	public void saudacao() {
		System.out.println("Olá, meu nome é " + nome); 
	} 
	public static void main(String[] args) {
		ExemploPessoa exemploPessoa = new ExemploPessoa("Carlos");
		exemploPessoa.saudacao(); 
	}
}
// Exemplo 3
public class ExemploTerminalPrint {
	public static void main(String[] args) {
		System.out.println("Olá, Mundo!"); // Saída no console
	}
}
// Exemplo 4
public class ExemploThread extends Thread {
	public void run() {
		System.out.println("Tarefa emsegundo plano em Java!"); 
	}
	public static void main(String[] args) {
		ExemploThread tarefa = new ExemploThread();
		tarefa.start(); // Inicia a thread 
	}
}
// Exemplo 5
public class ExemploTipagem {
	public static void main(String[] args) {
		int numero = 10; // Declaração de uma variável inteira
		System.out.println(numero);
		// Não é possível fazer isso: número = "dez";
		// Erro, pois "numero" é do tipo int
	}
}