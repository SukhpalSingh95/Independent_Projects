#This calculator builds on several resources.
#A TkInter tutorial from YouTube: https://www.youtube.com/watch?v=_lSNIrR1nZU

#The calculator still needs to actually be built.

from tkinter import *
import CalculatorFunctions
import sqlite3


BackgroundColour="pink"
ForegroundColour="brown"

#Functions
def SubmitClick():
    entered_text=TextEntry.get() #THis gets the text from the entry box.
    print(entered_text)
    output.delete(0.0, END) #this completely clears the output box
    output.insert(END,entered_text)


#CALLING THE WINDOW TO APPEAR - This is absolutely needed to get a window to work with
window = Tk()
window.title("Calculator")
window.configure(background=BackgroundColour)


def OpenExitDialog():
    def CloseExitPrompt():
        window2.destroy()

    def CloseMain():
        window2.destroy()
        window.destroy()
        exit()

    window2 = Tk()
    window2.title("Exit prompt")

    Label(window2, text="Are you sure you want to close this window?").grid(row=0, columnspan=1, sticky=W)
    Button(window2, text="No", width=6,command=CloseExitPrompt).grid(row=1, column=0, sticky=W)
    Button(window2,text="Yes",width=6,command=CloseMain).grid(row=1, column=1, sticky=W)
    window2.mainloop()

#Importing a file
#photo=PhotoImage(file="")
#Label(window, image=photo, bg="").grid(row=0, column=0, sticky=E)
#To visualise items on the window, you need to use the grid method as above. The grid is used to create a grid that you can put items. Stickies just say where things should be located, i.e. E(ast), W(est) etc.


#Adding labels
Label(window, text="Enter something here", bg=BackgroundColour, fg=ForegroundColour).grid(row=0,column=0,sticky=W)

#TextBook
TextEntry = Entry(window, width=20, bg=BackgroundColour, fg=ForegroundColour)
TextEntry.grid(row=1, column=0, sticky=W)

#Submit text
Button(window, text="Submit", width=6, command=SubmitClick).grid(row=2, column=0, sticky=W)

#Display the entered characters
Label(window, text="\nEntered Characters", bg=BackgroundColour, fg=ForegroundColour,font="none 12 bold").grid(row=3, column=0, sticky=W)
output = Text(window, width=75, height=6, wrap=WORD, bg=BackgroundColour)
output.grid(row=4,column=0, sticky=W)

#Exit button
Button(window, text="Exit", width=6, command=OpenExitDialog).grid(row=5, column=0, sticky=E)

#Make the window appear - This is needed so the window actually shows up.
window.mainloop()