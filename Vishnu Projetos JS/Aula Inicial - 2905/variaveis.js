var nome = "Diego" //Declarando a variável

console.log(nome)

var nome = "Telles" //Recriando a variável

console.log(nome)

nome = "Diego Telles" // Reatribuindo o valor

console.log(nome)

/*Bloco do let*/
function getNome(){
    let nome = 'Vishnu'

    if (nome === 'Vishnu') {
        let nome = 'Priya Celestrino';
        console.log('Dentro de if: '+ nome)
}
console.log('Fora do if: '+ nome)
}
getNome()

/*Bloco do Const*/
const nome = "Vishnu"
console.log(nome)

const nome = "Priya"
console.log(nome)

