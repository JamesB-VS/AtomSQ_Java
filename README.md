# Presonus Atom SQ Bitwig Extension

## This is an extension for Bitwig Studio for the Atom SQ Controller by Presonus. 

## Brief Description

This controller extension provides many functions above and beyond the basic Midi Mode implementation. It is written in Java in order to leverage certain advanced features of the Bitwig API that are not available in Javascript, primarily the hardware abstraction. A few key features:
1. Endless Encoders!
2. Several Modes, based on the menu buttons on the side of the display, each with it's own mapping of the display buttons and encoders.
3. Lots of Track and Device controls, such as preset browsing, adding, deleting and moving tracks or devices.
4. Functional and dynamic use of the display. Track, Device and Preset names are shown and updated automagically.
5. Retains native Midi-mode hardware control of the keyboard settings (keyboard mode, Range, Oct, Scale Root, Velocity).


## Why tho?
Because I could not accept that my cool Atom SQ reverted to providing non-endless encoders in Midi Mode, but was clearly capable of this, as it works that way in Live and in Studio One. Once I got that working, things sort of snowballed, and here we are.

## The Gist: More or less how it works in 6 short statements.
- The B-H buttons, pitch bend, mod, and notes work as expected. 
- There are two "modes" currently configured. These are triggered by the **Song** (for Tracks) and **Inst** (for Devices) buttons. 
- The **User button** accesses the controller-native keyboard controls.  
- Extra "pages" of menu are indicated by the Fwd/Bck buttons under the encoder on the right of the screen being lit. 
- Undo/Redo are bound to Shift-Back and Shift-Forward. 
- Based on the mode (including in the preset/device pop-up browser) the encoders do different things. Not always all 8. 

For more detailed information, see the manual document under /docs.
## Bitwig Java Framework
This extension leverages the framework components (for the controller Layers) provided by Bitwig in their Github repo here: 
https://github.com/bitwig/bitwig-extensions/tree/api-17/src/main/java/com/bitwig/extensions/framework
These are covered by an MIT license, which is included for reference in the relevant folder in this repo. 
## AS-IS

**This code is provided with absolutely no warranty!** I can confirm it has not bricked my Atom SQ, or caused any issues with my Bitwig installation. I cannot foresee any potential issues, but you know, just in case, use at your own risk. 