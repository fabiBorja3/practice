from functools import reduce


numbers = [1, 2, 3, 4, 5]
#el metodo reduce calcula la suma usando la funcion de flecha
sum = lambda a, b: a + b
result = reduce(sum, numbers)

print("Sum:", result)