class Ordenamiento:
    def __init__(self, lista):
        self.lista = lista

    def ordenar(self):
        n = len(self.lista)
        for i in range(n):
            for j in range(0, n-i-1):
                if self.lista[j] > self.lista[j+1]:
                    self.lista[j], self.lista[j+1] = self.lista[j+1], self.lista[j]
        return self.lista


numeros = [23,5,12,7,1]
ordenamiento = Ordenamiento(numeros)
resultado = ordenamiento.ordenar()
print("Lista ordenada:", resultado)