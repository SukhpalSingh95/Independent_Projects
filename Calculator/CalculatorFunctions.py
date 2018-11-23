import math
from math import log, sin, cos, tan
import tkinter

def Addition():

    """

    Adding numbers
    """

    a = input("Enter the first number: ")
    b = input("Enter the second number: ")
    equation = a + " + " + b + " = "
    print(equation)
    Answer=float(a)+float(b)
    print(Answer)

def Subtraction():

    """

    Subtracting numbers
    """

    a = input("Enter the first number: ")
    b = input("Enter the second number: ")
    equation = a + " - " + b + " = "
    print(equation)
    Answer=float(a)-float(b)
    print(Answer)

def Multiplication():

    """

    Multiplying numbers
    """

    a = input("Enter the first number: ")
    b = input("Enter the second number: ")
    equation = a + " * " + b + " = "
    print(equation)
    Answer=float(a)*float(b)
    print(Answer)

def Division():

    """

    Dividing numbers - this doesn't deal with dividing by zero
    """

    a = input("Enter the first number: ")
    b = input("Enter the second number: ")
    equation = a + " / " + b + " = "
    print(equation)
    Answer=float(a)/float(b)
    print(Answer)


def Exponent():

    """

    Exponential
    """

    a = input("Enter the first number: ")
    b = input("Enter the second number: ")
    equation = a + " ^ (" + b + ") = "
    print(equation)
    Answer=float(a)**float(b)
    print(Answer)


def Logirthm():

    """

    Log
    """

    a = input("Enter the base number: ")
    b = input("Enter the logging number: ")
    equation = "log"+a + "( " + b + ") = "
    print(equation)
    Answer=log(float(b),float(a))
    print(Answer)


def SquareRoot():

    """

    Sqrt
    """

    a = input("Enter the first number: ")
    equation = "sqrt(" + a + ") = "
    print(equation)
    Answer=float(a)**(1/2)
    print(Answer)
