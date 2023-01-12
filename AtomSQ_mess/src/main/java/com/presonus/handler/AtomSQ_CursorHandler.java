package com.presonus.handler;


import com.bitwig.extension.api.util.midi.ShortMidiMessage;
import com.bitwig.extension.controller.api.CursorDevice;
import com.bitwig.extension.controller.api.CursorDeviceFollowMode;
import com.bitwig.extension.controller.api.CursorRemoteControlsPage;
import com.bitwig.extension.controller.api.CursorTrack;
import com.bitwig.extension.controller.api.Track;
import com.bitwig.extension.controller.api.TrackBank;

public class AtomSQ_CursorHandler
{

    // private final CursorTrack cursorTrack;
    // private final  CursorDevice cursorDevice;

    //private final CursorRemoteControlsPage remoteControlsBank;

    public void CursorHandler (final CursorDevice cursorDevice, final CursorTrack cursorTrack)
    {
        this.cursorTrack = cursorTrack;
        this.cursorDevice = cursorDevice;
      

    var followMode = CursorDeviceFollowMode.FOLLOW_SELECTION;
    cursorTrack = host.createCursorTrack(2, 0);
    cursorDevice = cursorTrack.createCursorDevice("Current", "Current", 8, followMode);
    remoteControlsBank = cursorDevice.createCursorRemoteControlsPage("CursorPage1", 8, "");

    cursorDevice.isEnabled ().markInterested ();
    cursorDevice.isWindowOpen ().markInterested ();
    cursorTrack.solo().markInterested();
    cursorTrack.mute().markInterested();
    cursorTrack.arm().markInterested();
    cursorTrack.volume().markInterested();
    cursorTrack.pan().markInterested();
    cursorTrack.isActivated ().markInterested();
    cursorTrack.color ().markInterested();
    }
}

