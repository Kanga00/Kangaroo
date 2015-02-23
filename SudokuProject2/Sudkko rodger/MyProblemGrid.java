
/**
 * Write a description of class MyProblemGrid here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyProblemGrid extends ProblemGrid
{
    private Problem problem = new Problem(); 

    public void enterNumber(int cellNo)
    {
        //             int row = cellNo / 9;                               		//Identify row position
        //             int col   = cellNo % 9;                               		//Identify column position
        //             if(problem.getStartValues(row, col)!= 0){
        //                 problem.setStartValues(row, col, 0);
        //                 cellEntry(cellNo, null, "black");  
        //             }else{
        //                 String number = obtainEntry(cellNo);
        //                 if(problem.validEntry(number, cellNo)){    	//Check entry
        //                     problem.setStartValues(row, col, Integer.parseInt(number)); 								//Store valid entry
        //                     cellEntry(cellNo, number, "blue");		//Display entry blue on pink
        //                 }else{
        //                     cellEntry(cellNo, null, "black");      //Clearing cell and resetting format
        //                 }
        //             }
    }

    public boolean validEntry (String entry, int cellNo){
         if(problem.validEntry (entry, cellNo)){
             return true; 

        }
         return false;
    }
    }