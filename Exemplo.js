// EXEMPLO 1
let numero = 10; // Variável inicializada como número
console.log(numero)
numero = "dez" // Agora a variável armazena uma string
console.log(numero)

// EXEMPLO 2
console.log("Olá, Mundo!") // Saída no console

// EXEMPLO 3
function saudacao() {
   console.log("Olá de uma função em JavaScript!"); 
}
saudacao(); //Chamando a função   

// EXEMPLO 4
class Pessoa { 
   constructor(nome) {
      this.nome = nome; 
   } 
   saudacao() {
      console.log("Olá,meu nome é " + this.nome);
   }
}
const pessoa = new Pessoa("Carlos");
pessoa.saudacao()

// EXEMPLO 5
function tarefa() {
   return new Promise(resolve => { 
      setTimeout(() => { 
         resolve("Tarefa em segundo plano em JavaScript!");
      }, 1000);
   });
}
async function executarTarefa() {
   const resultado = await tarefa();
   console.log(resultado);
}
executarTarefa();

// EXEMPLO 6
function saudacao() {
   console.log("Olá de uma função em JavaScript!"); 
}
saudacao(); //Chamando a função