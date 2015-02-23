import java.util.*;
/**
 * problem class
 * 
 * @author (Eammon msetfi) 
 * @version ()
 */
public class Problem
{
    // instance variables - replace the example below with your own
    private int [] [] startValues;

    /**
     * Constructor for objects of class Problem.Within this project, create a class called Problem. 
     * This has one field (instance variable) a 2-dimensional int array called  startValues.
     * Use the constructor of Problem to initialise startValues to the values of the following Sudoku problem:
     */
    public Problem()
    {
        startValues = new int [ ] [ ]{{0,0,0,9,0,3,0,0,0}, //starts at 0
            {0,1,0,0,8,0,0,6,0}, 
            {0,0,9,4,0,6,2,0,0},
            {0,2,4,0,0,0,8,3,0}, 
            {3,0,0,0,0,0,0,0,5},
            {0,5,7,0,0,0,4,2,0},
            {0,0,5,8,0,2,1,0,0}, 
            {0,7,0,0,3,0,0,5,0},
            {0,0,0,5,0,7,0,0,0}};
    }

    /**
     * 
     */
    public boolean usedInRow(int inNumber, int cellNoPos){

        int row = cellNoPos / startValues.length;               

        if((cellNoPos > 80) || (cellNoPos < 0)){
            System.out.println(cellNoPos + " is out of bounds");
            return false;
        }
        for(int i=0; i< startValues.length; i++){                     
            if(inNumber == startValues[row][i]) {
                return true;    // number already in row
            }
        }  
        return false;
    }

    /**
     * 
     */
    public boolean usedInCol(int inNumber, int cellNoPos){
        //int row = cellNoPos / startValues.length;               
        int col = cellNoPos % startValues.length; // possible redundancy of code
        if((cellNoPos > 80) || (cellNoPos < 0)){
            System.out.println(cellNoPos + " is out of bounds");
            return false;
        }
        for(int i=0; i< startValues.length; i++){                     
            if(inNumber == startValues[col][i]) {
                return true;    // number already in row

            }
        }  
        return false;
    }

    public boolean usedInBlock(int number, int cellNoPos){
        int l = (cellNoPos/9)/3;
        int s = (cellNoPos%9)%3;
        int boxUn = 3*l;
        int boxDu = 3*s;
        if((cellNoPos > 80) || (cellNoPos < 0)){
            System.out.println(cellNoPos + " is out of bounds");
            return false;
        }
        for(int i= boxUn; i< boxUn+3; i++){
            for(int j = boxUn; j< boxUn+3; j++){           
                if(number == startValues[i][j]) 
                    return true;            
            }
        }
        return false; 

    }

    public boolean numberNotUsed (int inNumber, int cellNoPos){
        if(usedInRow(inNumber, cellNoPos)){ 
            return false;}
        if(usedInCol(inNumber, cellNoPos)){
            return false;}
        if(usedInBlock(inNumber, cellNoPos)){
            return false;}
        return true;
    }

    //Function: isNull - entry is null
    public boolean isNull(String entry, int cellNo) {
        return (entry == null);
    }
    //Function: notCorrectLength - entry not single character
    public boolean notCorrectLength(String entry, int cellNo) {
        return (entry.length()!= 1);
    }
    //Function: notDigit - entry not digit
    public boolean notDigit(String entry, int cellNo) {
        return (!(Character.isDigit(entry.charAt(0))));
    }
    //Function: notZero - entry not zero
    public boolean notZero(String entry, int cellNo) {
        return (entry.charAt(0)!='0');
    }

    public boolean validEntry(String inNum, int cellNo )
    {

        if(!(inNum.length() == 1)){
            System.out.println("Please enter a character between 1 and 9.");
            return false;}
        char x = inNum.charAt(0);
        if(!(Character.isDigit(x))){
            System.out.println("Please enter a numeric character");
            return false;}
        Integer y = Integer.parseInt(inNum);
        if((y <= 0) || ((y >= 10))){
            System.out.println("Out of bounds");
            return false;
        }
        return true;
    }
}
