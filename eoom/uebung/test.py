class Robot:
    def __init__(self, birthdate, name):
        self.name = name
        self.birthdate = birthdate

    def age(self): 
        return 2025-self.birthdate

    def say(self, subject):
        print(self.name, " says ", subject)




r1 = Robot(2006, "tom")
print(r1.age())
r1.say("hi")



r2 = Robot(1974, "eric")
r2.say("hallo")


