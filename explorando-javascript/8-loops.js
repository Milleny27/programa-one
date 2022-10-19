console.log("Trabalhando com Loops");

const listaDeDestinos = new Array(`Salvador`, `São Paulo`, `Rio de Janeiro`);
console.log("Destinos possíveis: " + listaDeDestinos);

const idadeComprador = 18;
const estaAcompanhado = true;
let temPassagemComprada = false;
let destinoExiste = false;
const destino = "Salvador";
let contador = 0;

const podeComprar = idadeComprador >=18 || estaAcompanhado == true;

while (contador < 3) {
    if (podeComprar && listaDeDestinos[contador] == destino) {
        console.log("Boa viagem!");
        temPassagemComprada = true;
        destinoExiste = true;
        break;
    } else {
        console.log("Desculpe, tivemos um erro.")
    }

    contador += 1;
}

console.log("Destino existe: ", destinoExiste);

// Loop FOR
for(let i = 0; i < 3; i++) {
    if (listaDeDestinos[contador] == destino) {
        destinoExiste = true;
        break;
    }
}

console.log("Destino existe: ", destinoExiste);