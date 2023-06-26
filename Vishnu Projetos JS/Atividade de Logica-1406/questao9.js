function numeros(numeros) {
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
  console.log(numeros('9', '8', '7', '8', '9', '5', '4'))