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







## AS-IS

**This code is provided with absolutely no warranty!** I can confirm it has not bricked my Atom SQ, or caused any issues with my Bitwig installation. 