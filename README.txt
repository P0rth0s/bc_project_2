--------------------------------------------------------
Readme
--------------------------------------------------------
Antlr bc calculcator Project 2
By : Harry Deffebach
UFID: 6448-5421

I implemented all features assigned for this project.
    Comments: /* ... */
    Basic expressions with variables
    Boolean Expressions
    Precedence
    Special Expression: read and sqrt
    Statements: expressions (print value on the screen when executed), print expressions
    Math library functions: s, c, l, e (no need for a and j)
    
    For Loops
    While Loops
    If Statements
    Function Decleration with scoping, and parameters

I added several additional boolean statements to make testing of the while and for loop easier.

Make sure there are no empty new lines in your input file. White space except for \n is ignored.
\n ; or a line comment # can be used to end expressions. Use /* */ to embed comments within expressions.

Results are automatically printed.

I had a lot of trouble with error handling. If you try to reference and undefined variable it will return 0 and you will get an incorrect answer for example.
Be wary of this.


--------------------------------------------------------
How to Test and Run
--------------------------------------------------------
Navigate to the code directory.
Run code with java Bc test_name.bc

Test files are located in the tests folder.
old_unit_test.bc holds functionality that has been carried over from project 1.
new_unit_test.bc holds new functionality.

Every line of the test file has a #number at the end of it indicating expected output.

The tests folder also contains a keep visitor here file. This is a copy of BcBaseVisitor.java
It is stored here just incase the grammer is rebuilt with antlr and the visitor file wiped.


--------------------------------------------------------
Bugs
--------------------------------------------------------
Recursive functions are not currently working. However scoping and parameter passing is working as demonstrated in new_unit_test.bc

For some reason Not Equal to (!=) boolean isnt working.

My order of operations is messed up a little bit. For example + will always execute before -, instead of (+ | -).
I decided it was more important to work on the ocaml assignment than work on fixing this since I felt like I had
gotten the point of and become comfortable with antlr.