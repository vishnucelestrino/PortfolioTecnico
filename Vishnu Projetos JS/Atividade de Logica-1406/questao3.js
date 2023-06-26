//Crie uma função que receba número de 1 a 12 e retorne o mês correspondente,exemplo se colocar o número 2, o retorno deve ser “Fevereiro”\\
function meses (numeros){
    switch (numeros) { 
        case 1: 
       return console.log('Janeiro'); 
        case 2: 
       return console.log('Fevereiro'); 
        case 3: 
       return console.log('Março'); 
        case 4:
       return  console.log('Abril');
        case 5:
       return console.log('Maio');
         case 6:
       return  console.log('Junho');
        case 7:
     return    console.log('Julho');
        case 8:
       return console.log('Agosto');
        case 9:
       return console.log('Setembro');
        case 10:
       return console.log('Outubro');
        case 11:
      return  console.log('Novembro');
        case 12:
      return  console.log('Dezembro')
    }
}
     meses(9)