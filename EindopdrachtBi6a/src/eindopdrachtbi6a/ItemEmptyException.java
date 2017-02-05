/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eindopdrachtbi6a;

/**
 *
 * @author Daan
 */
public class ItemEmptyException extends Exception{
    
    public ItemEmptyException(){
        super();
    }
    
    public ItemEmptyException(String err){
        super(err);
    }
}
