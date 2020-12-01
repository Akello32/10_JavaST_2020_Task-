package by.matmux.bean;

/**
 *     <complexType name="Airplane">
 *         <complexContent>
 *             <extension base="tns:Transport">
 *                 <sequence>
 *                     <element name="seat" type="int"/>
 *                     <element name="airlines" type="string"/>
 *                 </sequence>
 *             </extension>
 *         </complexContent>
 *     </complexType>
 */

public class Airplane extends Transport {
    private int seat;
    private String airlines;

    public Airplane() {
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public String getAirlines() {
        return airlines;
    }

    public void setAirlines(String airlines) {
        this.airlines = airlines;
    }
}
