class Robot: 
    def __init__(self, name, birthdate, color):
        self.name = name
        self.birthdate = birthdate
        self.color = color
        


    def introduce_self(self): 
        print("My name is "+ self.name)

    def age(self): 
        return 2025- self.birthdate




r2 = Robot("Tom", 2006,"red")

print(r2.age())
print(r2.name)