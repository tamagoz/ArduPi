/**
 * File generated by the ThingML IDE
 * /!\Do not edit this file/!\
 * In case of a bug in the generated code,
 * please submit an issue on our GitHub
 **/

package org.thingml.generated;

import org.thingml.java.*;
import org.thingml.java.ext.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChangeDisplayMessageType extends EventType {
public ChangeDisplayMessageType() {name = "changeDisplay";}

public Event instantiate(final Port port) { return new ChangeDisplayMessage(this, port); }
public class ChangeDisplayMessage extends Event implements java.io.Serializable {

@Override
public String toString(){
return "ChangeDisplay ";}

protected ChangeDisplayMessage(EventType type, Port port) {
super(type, port);
}
}

}


