import time
import random
import os

def Printing(s):
    for i in s:
        print(i,end="")
        time.sleep(0.1) 
def Choosing():
    a = random.randint(1, 10)
    return a
    
os.system('cls')
t = 1
Welcome_message =  "                  Welcome my Guessing Game"
Printing(Welcome_message)
while t:
    print()
    print("System is Choosing value",end=" ")
    Printing("....................")
    System_choosed_value = Choosing()
    print("System has selected value ")
    print()
    time.sleep(0.5)
    print("               You have 3 Chances........")
    print()
    for i in range(3):
        Printing("Enter your Guessing value in between 1 to 10 : ")
        user_value  = int(input())
        if user_value == System_choosed_value:
            print("Wow... You have guessed value in %d attempt"%(i+1))
            Printing("                You are Winner............")
            print("\n")
            break
        else:
            print("You are Unlucky........")
            Printing("                   Better luck for next time..")
            print("\n")
    print("If you want to play this game again then press \n1) Yes\n2) No")
    ch = int(input())
    if ch==2:
        print("               THANK YOU!")
        t=0
    else:
        os.system('cls')