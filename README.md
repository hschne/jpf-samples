# A simple JPF Example

This repository contains samples on how to use JPF to Test your Programs or Modules. JPF can be executed 
- using the command line.
- from within JUnit Test Cases.
- using plain old Java.

Here samples for execution from the command line and JUnit are provided. Two systems to test are provided, namely *Racer* and *Ringbuffer*.
For detailed information regarding JPF see [the JPF Wiki](https://babelfish.arc.nasa.gov/trac/jpf/wiki).

## Getting Started

In order to use JPF you must first set it up on your machine. It is recommended that you just download the source and build using Ant. The provided samples require only *jpf-core* which can be downloaded from [http://babelfish.arc.nasa.gov/hg/jpf/jpf-core](http://babelfish.arc.nasa.gov/hg/jpf/jpf-core).
Additionally, just must set up a *site.properties* file. Instructions on how to do that can be found [here](https://babelfish.arc.nasa.gov/trac/jpf/wiki/install/site-properties).

Use ant to build the examples: 

    ant compile

To run the *Racer* example you need only execute:

    path-to-jpf-core/bin/jpf src/racer.jpf

To build and run the *RingBuffer* example from your IDE you need to add at *jpf.jar* to your classpath. 
If you use ant, you might have to adjust *jpf.lib.dir* to point to your JPF installation. 
Now you can execute *RingBufferTest* from your IDE or using
    
    ant test


