/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package performancetest;

/**
 *
 * @author bb0299035
 */
public class PerformanceTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        getTime(1000000);
        getTime(10000000);
        getTime(100000000);
        getTime(1000000000);
        //gets the time
    }
    
    public static void getTime(long n)
    {
        long startTime = System.currentTimeMillis();
        long k = 0;
        for(long i = 1;i <= n; i++ )
        {
            k = k + 5;
            
        }// end of for
        long endTime = System.currentTimeMillis();
        System.out.println("Execution time for n = " + n + " is " + (endTime - startTime) + " milliseconds");
    }// end of method
}
