/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radio;

/*
 * A voice recognizer class.
 * Used to determine whether the voice we "heard" 
 * is the one we are listening for and calls method to lower the volume
 * @author sivagamasrinivasan
 */
public class VoiceRecognizer 
{
 private Radio r;   
    public boolean recognize(Voice driver)
    {
       if(driver.equals(r.getDriver()))
       {
           r.lowervolumewhentalking();
           return true;
       }
    System.out.println("driver not registered:" +driver);
       return false;
    }
  public VoiceRecognizer(Radio rd)
  {
      this.r=rd;
  }
}
