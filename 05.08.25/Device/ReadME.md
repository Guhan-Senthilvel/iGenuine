Created a package name Device.

1)Created a abstract class named SmartDevice.
created a instance variable deviceName in private.
created a parameterized constructor and passed string devicename.
then created getter and setter for string devicename as it is in private mode.
created a abstract method named performfunction.

2)Created a Light class which extends SmartDevice class.
created a instance variable int brightnesslevel in private.
created a method setbrightness and passed int level argument to assign value to instance variable brightnesslevel.
created a constructor and passed devicename as parameter.using super devicename is passed to respective class.
overridden method performfunction to print devicename and its brightness level.

3)Created a Thermostat class which extends SmartDevice.
created a instance variable in double datatype named temperature.
created a constructor same as light.
created a method settemperature and passed double temp to assign temp value to temperature.
overridden method performfunction to print devicename and its temperature level.

4)Created Room class.
created instance variables string roomName, then used smartdevice class as datatype and created device1 and device2 variables.
created a constructor and passed arguments roomname,device1,device2.
created a method showroomdevice which prints roomname,device1 name using device1.getDevicename method and device 2 .
then created a method named controldevices.inside it created called performfunction for device1 and device2.

5)Created a House class.
here created two instance variables room1 and room2 whose datatype is class room.
created a constructor and passed arguments room1 and room2.
created a method showalldevices and called showroomdevices using room1 and room2.
created a method controlalldevices and called controldevices using room1 and room2.

6)Created a Main class.this is the main part of this program.
created a l1 object for light class and passed devicename.
using l1 object setbrightness method is called and assigned value.
same as for l2.
created a t1 object for thermostat class and passed devicename.
using t1 object settemperature method is called and assigned with value.
same as for t2.
created a r1 object for room class and passed arguments roomname,l1 and t1
same as for r2.
created a house object for House class and passed arguments r1 and r2.
the called showalldevices and controlalldevices using house object.