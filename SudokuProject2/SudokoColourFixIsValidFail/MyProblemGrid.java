import java.util.*;
/**
 * 
 * 
 * @author (Eammon Msetfi) 
 * @version (6/2/15)
 */
public class MyProblemGrid extends ProblemGrid
{
    private Problem problem;

    public MyProblemGrid(){
        problem = new Problem();
    }

    public void enterNumber(int cellNo)
    {
        int row = cellNo / 9;                               		//Identify row position
        int col = cellNo % 9;                               		//Identify column position

        String number = obtainEntry(cellNo);
        if(problem.validEntry(number, cellNo)){                                               //problem.getStartValues(row, col)!=0)
            problem.setStartValues(row, col, 0); 
            cellEntry(cellNo, number, "blue"); 

        }else
        {     	
            cellEntry(cellNo, null, "black"); 
            //Store valid entry

        }
    }

    /**
     * This boolean function takes two parrameters one of type String that represents the number entered
     * The second parameter is of type int and corresponds with the cell number.
     * 
     */ 
    public boolean validEntry (String entry, int cellNo){
        if(!(problem.validEntry(entry, cellNo))){         // checks whether entry is valid.

            return false;

        }
        return true;
    }

    /**
     * This Static Method takes one parameter of type int 
     * that coresponds with the cell number and is called 
     * from the ProblemGrid Class which this Class inherits.
     */  
    public static String obtainEntry (int cellNo){

        return ProblemGrid.obtainEntry(cellNo);
    }
    // Getting a null Exception error on the Abstarct class of ProblemGrid and rally confusing me now
    // 
    public static void cellEntry(int cellNo, String value, String forColor){

        ProblemGrid.cellEntry(cellNo,  value, forColor);
    }
}

