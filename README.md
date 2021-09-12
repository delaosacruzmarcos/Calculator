# Calculator

This project was implemented utilizing only object oriented programming. It’s a basic calculator application that supports simple mathematical operations. Due to it’s oop nature I implemented it without using control flow or loops. The state pattern for this program can be slightly confusing. Hence I will provide a brief overview in the next section.


**Disclaimer I did not write all the code in this repository!**
More on accreditation in the acknowledgment section.
## Calculator & State Classes

## Left Hand Side
LHS is the state after a number is pressed but before an operand is pressed. It utilizes state variables to store numbers to present on the gui. Some of it’s method calls in particular the operands will send the calculator over into the RHS.

## Right Hand Side
RHS is entered after an operand is pressed. This Class will calculate the appropriate operation and return it to the gui. After a successful completion of an operation (upon equals pressed) the calculator will return to the LHS

## Interstate

Inter is used to deal with a decimal being pressed in either the LHS or the RHS.




## Acknowledgment section
I made this project as part of UB’s CSE 116 curriculum. I utilized office hours and course notes to create the code I wrote. I am only posting this thanks to Dr. Hartloff leniency towards past students. Any other code not explicitly stated was written by him and the CSE 116 staff as part of the handout. That being said, I have a good understanding of how the code they wrote works. Since it’s comprehension was necessary for completion of the assignment.

## I endorse test driven development
Please feel free to take a look at my unit testing. I believe that test driven development is a critical part of software engineering. Therefore I write test cases for all of my functions. I found that this is helpful for incremental development. It’s a critical part of the way I develop code.

## Author's note
I coded this project rather early on in my software development career. Therefore my choice of data structures and algorithms may not have been the most efficient. I have since improved my development skills. I may periodically revise this project to update it with more efficient algorithms and structures.

 - Marcos De La Osa Cruz
