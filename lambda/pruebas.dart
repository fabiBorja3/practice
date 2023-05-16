void main() {
  List<int> numbers = [1, 2, 3, 4, 5];
  //el metodo reduce calcula la suma usando la funcion de flecha
  int sum = numbers.reduce((a, b) => a + b);

  print("Sum: $sum");
}
