class ReduceToOne:
    def __init__(self) -> None:
        pass

    def add_one(self, s):
        i = len(s)-1
        while i >= 0 and s[i] == "1":
            s[i] = "0"
            i-=1
        if i < 0:
            s.insert(0, "1")
        else:
            s[i] = "1"
    
    def divide_by_two(self, s):
        s.pop()

    def numSteps(self, s: str) -> int:
        s = list(s)
        operation = 0

        while (len(s) > 1) :
            if s[len(s)-1] == "1":
                self.add_one(s)
            else:
                self.divide_by_two(s)
            operation+=1
        
        return operation
    
def main():
    s = "1101"
    reducer = ReduceToOne()
    print(reducer.numSteps(s))

if __name__ == "__main__":
    main()
            