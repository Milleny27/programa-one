console.log("Trabalhando com condicionais");

const listaDeDestinos = new Array(`Salvador`, `São Paulo`, `Rio de Janeiro`);
console.log("Destinos possíveis: " + listaDeDestinos);

const idadeComprador = 18;
const estaAcompanhado = true;
const temPassagemComprada = true;

// if comum
// if (idadeComprador >= 18) {
//   console.log("Comprador maior de idade");
// } else {
//    console.log("Não é maior de idade e não posso vender.");
//}

// console.log(idadeComprador > 18);
// console.log(idadeComprador < 18);
// console.log(idadeComprador >= 18);
// console.log(idadeComprador <= 18);
// console.log(idadeComprador == 18); // atribuição (=) / comparar valores (==)

// if aninhado
// if (idadeComprador >= 18) {
//     console.log("Comprador maior de idade");
//     listaDeDestinos.splice(1, 1);
// } else if(estaAcompanhado){
//     console.log("Comprador está acompanhado");
//     listaDeDestinos.splice(1, 1);
// } else {
//     console.log("Não é maior de idade e não posso vender.");
// }

// O código acima está repetitivo.
if (idadeComprador >= 18 || estaAcompanhado == true) {
    console.log("Boa viagem");
    listaDeDestinos.splice(1, 1);
} else {
    console.log("Não é maior de idade e não posso vender.");
}

console.log("Enbarque");
if (idadeComprador >= 18 && temPassagemComprada) {
    console.log("Boa viagem");
} else {
    console.log("Você mão pode embarcar");
}