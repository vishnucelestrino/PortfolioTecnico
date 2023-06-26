/* 
Escreva uma função que mostre na tela um número fornecido pelo usuário, porém invertido.
Por exemplo, o usuário fprnece o número b75 e a função mostra na tela o número 578.
*/

function inverternumero(num) {
  return (
    parseFloat(
      num
        .toString() //transforma o num em string
        .split('') // transforma em array
        .reverse() // inverte
        .join('') // junta tudo
    ) * Math.sign(num)
  )                 
}
console.log(inverternumero(1789))