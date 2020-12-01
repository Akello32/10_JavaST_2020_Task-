package by.matmux.bean;

/**
 *     <complexType name="Room">
 *         <sequence>
 *             <element name="TV" type="boolean"/>
 *             <element name="conditioner" type="boolean"/>
 *         </sequence>
 *         <attribute name="typeRoom" use="optional" default="Coach" type="string"/>
 *         <attribute name="persons" use="required" type="int"/>
 *     </complexType>
 */

public class Room {
    private String typeRoom;
    private int persons;
    private boolean tv;
    private boolean conditioner;

    public Room() {
    }

    public String getTypeRoom() {
        return typeRoom;
    }

    public void setTypeRoom(String typeRoom) {
        this.typeRoom = typeRoom;
    }

    public int getPersons() {
        return persons;
    }

    public void setPersons(int persons) {
        this.persons = persons;
    }

    public boolean isTv() {
        return tv;
    }

    public void setTv(boolean tv) {
        this.tv = tv;
    }

    public boolean isConditioner() {
        return conditioner;
    }

    public void setConditioner(boolean conditioner) {
        this.conditioner = conditioner;
    }
}

