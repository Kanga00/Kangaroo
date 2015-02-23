import java.util.*;
/**
 * problem class
 * 
 * @author (Eammon msetfi) 
 * @version ()
 */
public class Problem
{
    // 2-D Array instance variable
    private int [] [] startValues;

    /**
     * The constructer for this Class uses a 2-dimentional array which is has 9 rows and 9 collums
     * The Variable is initailized to 0:
     */

    public Problem()
    {
        startValues = new int [9] [9];
    }

    public int getStartValues(int row, int col){
        return startValues[row][col];
    }

    // Mutator method that sets inputs the user deifiend variable into the Instance variable.
    public void setStartValues(int row, int col, int value){
        startValues[row][col] = value;
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

        int col = cellNoPos % startValues.length; 
        if((cellNoPos > 80) || (cellNoPos < 0)){
            System.out.println(cellNoPos + " is out of bounds");
            return false;
        }
        for(int i=0; i< startValues.length; i++){                     
            if(inNumber == startValues[col][i]) {
                return true;   

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

    public boolean validEntry(String entry, int cellNo) {
        if(isNull(entry, cellNo)){ 
            return false;
        }

        if(notCorrectLength(entry, cellNo)){
            System.out.println("Invalid entry – More than one character.");
            return false;
        }

        if(notDigit(entry, cellNo)){
            System.out.println("Invalid entry – Not a digit.");
            return false;
        }
        if(!(notZero(entry, cellNo))){
            System.out.println("Invalid entry – Not a digit 1 - 9 inclusive");
            return false;
        }

        int number = Character.digit(entry.charAt(0),10);
        if(!(numberNotUsed(number, cellNo))){
            System.out.println("Invalid entry – Digit already been used");
        }

        return true;
    }

}
