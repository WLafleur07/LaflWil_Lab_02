/**
 * Name: William Lafleur
 * Date: January 24th, 2022
 * Description: Program to create methods that print or manipulate (Arithmetic) 1D and 2D arrays.
 */

public class Arrays
{
    public static void main(String[] args)
    {
        /*-----------Question #1------------------*/
        displayName();

        /*-----------Question #2------------------*/
        int[] testArray = {1, 2, 3, 4, 5};
        displayArray(testArray);

        /*-----------Question #3------------------*/
        int[][] test2DArray = {{1, 2, 3},
                             {4, 5, 6}};

        display2DArray(test2DArray);

        /*-----------Question #4------------------*/
        int[] firstArray = {3, 4, 5};
        int[] secondArray = {3, 4, 5};
        /*Method that returns a Boolean, True or False depending on if the arrays are equal**/
        System.out.println(AreArraysEqual(firstArray, secondArray));

        /*-----------Question #5------------------*/
        int[][] first2DArray = {{1, 2, 3},{3, 4, 5}};
        int[][] second2DArray = {{3, 4, 5}, {1, 2, 3}};
        /*Method call passing in first2DArray & second2DArray as params, return True or False if they are equal**/
        System.out.println(Are2DArraysEqual(first2DArray, second2DArray) + "\n");

        /*-----------Question #6------------------*/
        /*Method to calculate the total sum of each array element (1D array)**/
        System.out.println(SumOfArray(testArray));

        /*-----------Question #7------------------*/
        /*Method to calculate the total sum of each array element (2D array)**/
        System.out.println(SumOf2DArray(test2DArray));

        /*-----------Question #8------------------*/
        int[][] matA = {{1, 2},
                        {4, 1}};
        int [][] matB = {{2, 2},
                         {2, 2}};

        /*Method to calculate one 2D array multiplied by the other. Then assigning what is returned to matC**/
        int[][] matC = MatrixMulti(matA,matB);
        /*Using previously created function to display resultant Matrix C**/
        display2DArray(matC);

    }

    /**
     * Method to print out my name
     */
    public static void displayName()
    {
        System.out.println("William Lafleur");
    }

    /**
     * Method to print out a 1D array.
     * @param randArray 1D int array
     */
    public static void displayArray(int[] randArray)
    {
        /*Using an enhanced for loop to loop over the array elements*/
        for(int i : randArray)
        {
            if (i < (randArray.length - 1))
                System.out.print(randArray[i] + ", ");
            else
                System.out.println(randArray[i - 1] + "\n");
        }
    }

    /**
     * Method to print out a 2D array.
     * @param randArray 2D int array
     */
    public static void display2DArray(int[][] randArray)
    {
        /*Using variable Size to make the function more dynamic and allow for larger array sizes*/
        int size = randArray.length;
        for(int i = 0; i < size; i++)
        {
            /*Second loop will loop for the amount of elements in "Row i", then prints them*/
            for(int j = 0; j < size; j++)
            {
                System.out.print(randArray[i][j] + ", ");
            }
            System.out.println();
        }

        System.out.println();
    }

    /**
     * Method to compare two 1D arrays
     * @param arrayOne 1D int array
     * @param arrayTwo 1D int array
     * @return Boolean isEqual, True or False
     */
    public static boolean AreArraysEqual(int[] arrayOne, int[] arrayTwo)
    {
        Boolean isEqual = false;

        if (arrayOne == arrayTwo)
            isEqual = true;

        return isEqual;
    }

    /**
     * Method to compare two 2D arrays
     * @param arrayOne 2D int array
     * @param arrayTwo 2D int array
     * @return Boolean isEqual, True or False
     */
    public static boolean Are2DArraysEqual(int[][] arrayOne, int[][] arrayTwo)
    {
        Boolean isEqual = false;

        if (arrayOne == arrayTwo)
            isEqual = true;

        return isEqual;
    }

    /**
     * Method to get the sum of a 1D array
     * @param arrayOne 1D int array
     * @return int sum, the sum of arrayOne elements
     */
    public static int SumOfArray(int[] arrayOne)
    {
        int sum = 0;

        for(int i = 0; i < arrayOne.length; i++)
        {
            /*Adding each array element (@ index i) to variable Sum*/
            sum += arrayOne[i];
        }

        return sum;
    }

    /**
     * Method to get the sum of a 2D array
     * @param arrayOne 2D int array
     * @return int sum, the sum of arrayOne elements
     */
    public static int SumOf2DArray(int[][] arrayOne)
    {
        int sum = 0;

        for(int i = 0; i < arrayOne.length; i++)
        {
            for(int j = 0; j < arrayOne[i].length; j++)
            {
                /*Adding each array element (@ index i and j) to variable Sum*/
                sum += arrayOne[i][j];
            }
        }

        return sum;
    }

    /**
     * Method to multiply to Matrices together
     * @param matrixOne 2D int array
     * @param matrixTwo 2D int array
     * @return int[][] resultantMatrix, the result of matrixOne*matrixTwo
     */
    public static int[][] MatrixMulti(int[][] matrixOne, int[][] matrixTwo)
    {
        /*Using variable Size to make the function more dynamic and allow for larger array sizes*/
        int size = matrixOne.length;
        int[][] resultantMatrix = new int[size][size];

        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
            {
                resultantMatrix[i][j] = 0;

                /*Multiplying two matrix elements at i and j, then assigning them to resultant matrix*/
                resultantMatrix[i][j] += matrixOne[i][j] * matrixTwo[i][j];
            }
        }

        return resultantMatrix;
    }
}

