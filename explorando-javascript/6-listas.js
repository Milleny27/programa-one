console.log("Trabalhando com listas");

const listaDeDestinos = new Array(`Salvador`, `São Paulo`, `Rio de Janeiro`);
console.log(listaDeDestinos);

// adicionando novo item na lista
listaDeDestinos.push(`Curitiba`);
console.log(listaDeDestinos);

// excluindo item
listaDeDestinos.splice(1, 1); // onde começar(índice), quantos itens excluir
console.log(listaDeDestinos);

// acessando um item pelo índice
console.log(listaDeDestinos[1]); 