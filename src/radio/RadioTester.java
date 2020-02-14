/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radio;

/**
 * a test class to simulate creating and radio and
 *  carrying out our use case under construction (lower volume
 *  in response to talking).
 *  Hello Sukhreet Singh Rai boy
 * @author sivagamasrinivasan
 */
public class RadioTester
{
public static void main(String args[])
    {
 Radio radio = new Radio();
  radio.setOn();
  radio.setVolume(Radio.Max_volume);
  System.out.println("Is radio on ? " +radio.isOn()+  " and volume is" + " " +radio.getVolume());
  Voice John = new Voice();
  radio.setDriver(John); //connect the Radio and the driver's voice
  System.out.println("keyword \'low music\' to lower volume :"); 
  John.setKeyword("low music");
  System.out.println("keyword said by driver:" +John.getKeyword());
  VoiceRecognizer vr = new VoiceRecognizer(radio); //connect the Radio and the  voice recognizer
    if(vr.recognize(John))
        {
            System.out.println("printing the volume after driver speaks:" +radio.getVolume());
        }

    
    }
}
