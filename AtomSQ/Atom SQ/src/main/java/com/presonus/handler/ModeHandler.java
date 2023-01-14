package com.presonus.handler;

import com.presonus.AtomSQHardware;
import com.presonus.handler.CursorHandler;
import com.bitwig.extension.api.Host;
import com.bitwig.extension.api.util.midi.ShortMidiMessage;
import com.bitwig.extension.controller.api.Transport;
import com.bitwig.extension.controller.api.Application;
import com.bitwig.extension.controller.api.ControllerHost;
import com.bitwig.extension.controller.api.CursorDevice;
import com.bitwig.extension.controller.api.CursorTrack;

public class ModeHandler 
{
    ControllerHost host;
    CursorTrack cursorTrack;
    CursorDevice cursorDevice;
   static AtomSQHardware hardware;
//     this.application = application;
//    application.setPanelLayout("ARRANGE");

//    this.application.panelLayout().markInterested();


    public boolean handleMidi (ShortMidiMessage msg)
    {
     //shiftOn = hardware.shiftOn;
    // println(shiftOn + " in handle midi");
    // return uf a button is released (would remove if there is a need for momentary commands, like Shift)

    // if (msg.getData2() == 0)
    //    return true;
    // else 
    //     return false;
        if (msg.isControlChange() && msg.getData2() == 127)
        {
            switch (msg.getData1())
            {
                
                case AtomSQHardware.ASQ_SONG:
                    //  modeHandler.Song();
                    //  menumode = ASQ_SONG;
                    //  encodermode = ASQ_SONG;
                    //  application.setPanelLayout("MIX");
                    //  modeHandler.displayButtonLightsOn();
                    this.updateLED();
                    return true;
                case AtomSQHardware.ASQ_INST:
                    //  modeHandler.Inst();
                    //  menumode = ASQ_INST;
                    //  application.setPanelLayout("ARRANGE");
                    return true;
                case AtomSQHardware.ASQ_EDIT:
                    //  println ("the Editor button has been disabled in this build.")
                    //FIX editmode. disabling as the settings are too much for this round. 
                    // modeHandler.Edit();
                    // menumode = ASQ_EDIT;
                    // application.setPanelLayout("EDIT")
                    return true;
                case AtomSQHardware.ASQ_USER:
                    //  modeHandler.User();
                    //  menumode = ASQ_USER;
                    //as this menu now hosts the keyboard controls, it is probably not necessary to force Arranger mode.
                    //application.setPanelLayout("ARRANGE");
                    return true;

                    default:
                        // host.errorln ("Command " + data1 + " is not supported");
                        return false;
            }
        }
         else 
            return false;
}
            //   case AtomSQHardware.ASQ_BTN_1:
            //      modeHandler.displayButtons(menumode, ASQ_BTN_1);
            //      return true;
            //   case AtomSQHardware.ASQ_BTN_2:
            //      modeHandler.displayButtons(menumode, ASQ_BTN_2);
            //      return true;
            //   case AtomSQHardware.ASQ_BTN_3:
            //      modeHandler.displayButtons(menumode, ASQ_BTN_3);
            //      return true;
            //   case AtomSQHardware.ASQ_BTN_4:
            //      modeHandler.displayButtons(menumode, ASQ_BTN_4);
            //      return true;
            //   case AtomSQHardware.ASQ_BTN_5:
            //      modeHandler.displayButtons(menumode, ASQ_BTN_5);
            //      return true;
            //   case AtomSQHardware.ASQ_BTN_6:
            //      modeHandler.displayButtons(menumode, ASQ_BTN_6);
            //      return true;
            //   case AtomSQHardware.ASQ_AUP:
            //         if(shiftOn)
            //         {
            //            application.focusPanelAbove();
            //            println (application.panelLayout);
            //            return true;
            //         }
            //         else 
            //         {
            //            application.arrowKeyUp()
            //            return true;
            //         }
  
            //   case AtomSQHardware.ASQ_ADWN:
            //      if(shiftOn)
            //      {
            //         application.focusPanelBelow();
            //         println (application.panelLayout);
            //         return true;
            //      }
            //      else 
            //      {
            //         println ("shift + arrow down");
            //         application.arrowKeyDown();
            //         return true;
            //      }
 
            //   case AtomSQHardware.ASQ_ALFT:
            //      if(shiftOn)
            //      {
            //         application.focusPanelToLeft();
            //         //cursorTrack.selectPrevious();
            //         return true;
            //      }
            //      else 
            //      {
            //         println ("shift + arrow left");
            //         application.arrowKeyLeft();
            //         return true;
            //      }
              
            //   case AtomSQHardware.ASQ_ARGT:
            //      if(shiftOn)
            //      {
            //         application.focusPanelToRight();
            //         //cursorTrack.selectNext();
            //         return true;
            //      }
            //      else 
            //      {
            //         application.arrowKeyRight();
            //         return true;
            //      }   
           
            // 




        
public void updateLED ()
    {
        //ControllerHost host;
       // println ("ModeHandler: track state")
            hardware.updateLED(AtomSQHardware.ASQ_BTN_1, cursorTrack.solo().get());
           
           // println ("- solo = " + cursorTrack.solo().get());
            hardware.updateLED(AtomSQHardware.ASQ_BTN_2, cursorTrack.mute().get());
           // println ("- Mute = " + cursorTrack.mute().get());
            hardware.updateLED(AtomSQHardware.ASQ_BTN_3, cursorTrack.arm().get());
           // println ("- Arm = " + cursorTrack.arm().get());
            hardware.updateLED(AtomSQHardware.ASQ_BTN_4, cursorDevice.isEnabled().get());
            //println ("- Enabled = " + cursorDevice.isEnabled().get());
            hardware.updateLED(AtomSQHardware.ASQ_BTN_5, cursorDevice.isWindowOpen().get());
            //println ("- Wndw = " + cursorDevice.isWindowOpen().get());
            hardware.updateLED(AtomSQHardware.ASQ_BTN_6, cursorTrack.isActivated().get());
            //println ("- Active = " + cursorTrack.isActivated().get());

    }





}
