### CalculatewithWords
A Java-based command-line calculator tool that interprets/Analyze Natural-language commands/statements and performs a wide range of mathematical operations on them

### Usage : 
Users can write commands about simple mathematical operations in simple language. Screenshots are attached to get Sample Commands.
Special Keywords:
Use then to write mutliple commands and use it to refer to previous reuslt.

### For Developers:

### Project Structure: 
#### src:
- Main.java: Contains the main class to run the calculator.
- analyzerv2.java: Implements the analyzer class that interprets user input and calls the corresponding operations.
- operations.java: Defines the core mathematical operations available in the calculator.

#### Working of Code : 

In the project's architecture, we begin by defining a set of mathematical operations within the "operations" class.
Next, in the "analyzerv2" class, we establish specific keywords to invoke these operations based on user input. 
When a particular keyword from the designated array matches user input, the corresponding operation is executed.

There's a special keyword, "then," which serves as a delimiter to split the input statement. This allows us to perform operations on each part of the statement sequentially. 
Moreover, the "result" variable retains the outcome of the previous statement. To reference this result in subsequent statements, we employ the keyword "it."
This approach enables a step-by-step calculation process, enhancing the calculator's flexibility and functionality.


### Screenshots : 
![Screenshot 2023-09-17 180622](https://github.com/tareeb/CalculatewithWords/assets/67794123/38df2a30-2653-42ba-b98c-1b242445d64b)
![Screenshot 2023-09-17 181414](https://github.com/tareeb/CalculatewithWords/assets/67794123/9cd2844e-c659-4f5f-98ba-150b33919e41)






