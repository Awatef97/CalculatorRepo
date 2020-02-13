/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author awatef
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    //awtef start
    
    //awatef end
    //ziad start
    public static float subtract(float firstNum,float secondNum)
    {
        float result = firstNum - secondNum ;
        return result;
    }
    
    public static float multiply(float firstNum,float secondNum)
    {
        float result = firstNum * secondNum ;
        return result;
    } 
    //ziad end
    //wagdy start
    
    //wagdy end
   
    public static void main(String[] args) {
        // TODO code application logic here
        
        //awtef start
        
        //awatef end
        //ziad start
        System.out.println(subtract(5f,2f));
        System.out.println(multiply(2f,2f));
        //ziad end
        //wagdy start
        
        //wagdy end
        
    }
    
}
