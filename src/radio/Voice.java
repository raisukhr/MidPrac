/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radio;

/****
 * a class to model a user's voice. A voice has a key word
 * that can be recognized by the radio.
 * @author sivagamasrinivasan
 */
public class Voice 

{
private String keyword;
public static final String Word= "low music";

    public String getKeyword() 
    {
        return keyword;
    }

    public void setKeyword(String keyword)
    {
        this.keyword = keyword;
    }
    
}
