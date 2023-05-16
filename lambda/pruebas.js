const numbers = [1, 2, 3, 4, 5];
//el metodo reduce calcula la suma usando la funcion de flecha
const sum = numbers.reduce((a, b) => a + b, 0);

console.log("Sum:", sum);