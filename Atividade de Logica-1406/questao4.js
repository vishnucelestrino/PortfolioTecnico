
function valor (questao){
    var tipo = typeof entrada
if (questao === Boolean){
return ! entrada
}
 else if (questao === Number){
return - entrada
}
else
return "Booleano ou Número esperados, mas o parâmetro é do tipo  "+ entrada
}
console.log (valor(8))
