# ES204 Basic Simulation Lab file

## Index
1. Creating a One and Two-Dimensional Array (Row / Column Vector) (Matrix of given size) then, 
    1. Performing Arithmetic Operations:
        1. Addition
        2. Subtraction
        3. Multiplication
        4. Exponentiation.  
    2. Performing Matrix operations: 
        1. Inverse 
        2. Transpose
        3. Rank with plots
   
2. Perform:
    1. Matrix Manipulations: 
        1. Concatenating 
        2. Indexing 
        3. Sorting
        4. Shifting 
        5. Reshaping 
        6. Resizing and 
        7. Flipping about a vertical axis / horizontal axis; 
    
    2. Creating Arrays X & Y of given size (1 x N) and Performing
        1. Relational Operations - >, <, ==, <=, >=, ~=
        2. Logical Operations - ~, &, |, XOR

3. Generating a set of Commands on a given Vector (Example: X = [1 8 3 9 0 1]) to
    1. Add up the values of the elements (Check with sum)
    2. Compute the Running Sum (Check with sum), where Running Sum for element j = the sum of the elements from 1 to j, inclusive.
    3. Generating a Random Sequence using rand() / randn() functions and plotting them.

4. Evaluating a given expression and rounding it to the nearest integer value using Round, Floor, Ceil and Fix functions; Also, generating and Plots of
    1. Trigonometric Functions - sin(t),cos(t), tan(t), sec(t), cosec(t) and cot(t) for a given duration, ‘t’.
    2. Logarithmic and other Functions – log(A), log10(A), Square root of A, Real nth root of A.

5. Creating a vector X with elements, Xn = (-1)n+1/(2n-1) and ddding up 100 elements of the vector, X; and, plotting the functions, x, x3, ex, exp(x2) over the interval 0 < x < 4 (by choosing appropriate mesh values for x to obtain smooth curves), on a rectangular plot

6. Generating a Sinusoidal signal of a given frequency with Titling, Labelling, Adding Text, Adding Legends, Printing Text in Greek Letters, Plotting as Multiple and Subplot. Time scale the generated signal for different values. E.g. 2X, 4X, 0.25X, 0.0625X.

7. Solving first, second and third order ordinary differential equations using built-in functions and plot.

8. Writing brief scripts starting each script with a request for input (using input) to evaluate the function h(T) using if-else statement, where, 
    1. h(T) = (T – 10) for 0 < T < 100 
    2. h(T) = (0.45 T + 900) for T > 100. 
    - Exercise: Testing the Scripts written using
        -  T = 5, h = -5 and 
        - T = 110, h = 949.5

9. Generating a square wave from the sum of Sine waves of certain amplitude and frequencies.

10. Basic 2D and 3D plots: parametric space curve, polygons with vertices, 3D contour lines and pie and bar charts.

---

## Experiment 1
### Aim:
Creating a One and Two-Dimensional Array (Row / Column Vector) (Matrix of given size) then, 
    Performing Arithmetic Operations:
    1. Addition
    2. Subtraction
    3. Multiplication
    4. Exponentiation
    Performing Matrix operations: 
    1. Inverse 
    2. Transpose
    3. Rank with plots

### Procedure:
```matlab
% Creating the vectors
>> row_vec = [1 2 3 4 5];

>> col_vec = [6; 7; 8; 9; 10];

>> sum_vec = row_vec + col_vec;

>> diff_vec = row_vec - col_vec;

>> mult_vec = row_vec .* col_vec;

>> exponent_vec = row_vec .^ 2;

% Following operations on the sum matrix because it's a square matrix
>> inv_sum = inv(sum_vec);

>> trans_sum = transpose(sum_vec);

>> rank_sum = rank(sum_vec);
```

### Output:
#### Sum of the two vectors
![sum_vec](assets/01%20sum_vec.png)

#### Difference of the two vectors
![diff_vec](assets/01%20diff_vec.png)

#### Multiplication of the two vectors
![mult_vec](assets/01%20mult_vec.png)

#### Expoentiation of the first vector
![exponent_vec](assets/01%20exponent_vec.png)

#### Inverse of the sum matrix
![inv_sum](assets/01%20inv_sum.png)

#### Transpose of the sum matrix
![trans_sum](assets/01%20trans_sum.png)

#### Rank of the sum matrix
![rank_sum](assets/01%20rank_sum.png)

## Experiment 2
### Aim:
2. Perform:
    1. Matrix Manipulations: 
        1. Concatenating 
        2. Indexing 
        3. Sorting
        4. Shifting 
        5. Reshaping 
        6. Resizing and 
        7. Flipping about a vertical axis / horizontal axis; 
    
    2. Creating Arrays X & Y of given size (1 x N) and Performing
        1. Relational Operations - >, <, ==, <=, >=, ~=
        2. Logical Operations - ~, &, |, XOR

### Procedure:
```matlab
>> A = [1 2 3; 4 5 6];

>> B = [7 8 9; 10 11 12];

% Concatenating horizontally
>> horzcat_AB = horzcat(A,B);

% Concatenating vertically
>> vertcat_AB = vertcat(A,B);

% Linear indexing
>> l_index = A(4);

% All elements of the second row
>> sec_row = A(2,:);

% Subscript indexing
>> s_index = A(2,3);

% Logical indexing
>> logic_index = A(A>5);

% Generating a random matrix
>> rand_mat = rand(3,3);

% Sorting the matrix
>> sort_mat = sort(rand_mat);

% Circular shifting
>> circ_shift = circshift(A, 1);

% Reshaping the matrix
>> reshape_mat = reshape(A, 1, 6);

% Double the size of A using nearest-neighbor interpolation
>> resized_mat = imresize(A, 2);

% Flip A vertically
>> vert_flip = flipud(A);

% Flip A horizontally
>> horz_flip = fliplr(A);


```

### Output: