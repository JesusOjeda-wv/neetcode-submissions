class DynamicArray:

    def __init__(self, capacity: int):
        self.capacity = capacity
        self.length = 0
        self.arr = [0] * self.capacity

    def get(self, i: int) -> int:
        return self.arr[i]


    def set(self, i: int, n: int) -> None:
        if i > self.capacity:
            self.resize()

        self.arr[i] = n


    def pushback(self, n: int) -> None:
        if self.length == self.capacity:
            self.resize()
        self.arr[self.length] = n
        self.length += 1


    def popback(self) -> int:
        popped = self.arr[self.length - 1]
        self.length -= 1
        return popped
 

    def resize(self) -> None:
        self.capacity *= 2
        self.arrclone = [0] * self.capacity
        for i in range(self.length):
            self.arrclone[i] = self.arr[i]

        self.arr = self.arrclone


    def getSize(self) -> int:
        return self.length
        
    
    def getCapacity(self) -> int:
        return self.capacity
