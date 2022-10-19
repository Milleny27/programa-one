console.log("Trabalhando com atribuição de variáveis");

const idade = 24;
const nome = "Ricardo";
const sobrenome = "Bugan";

console.log(nome + sobrenome); // junta, sem espaço
console.log('Meu nome é ${nome}'); // era pra aparecer certinho
console.log(nome, sobrenome); // junta, colocando espaço

// nome = nome + sobrenome;
// pra fazer a atribuição, precisaria trocar o const para let
const nomeCompleto = nome + sobrenome; // atribuindo a uma variável a concatenação
console.log(nomeCompleto);

let contador = 0;
contador = contador + 1;
console.log(contador);