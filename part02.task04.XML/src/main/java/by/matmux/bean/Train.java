package by.matmux.bean;

/**
 *     <complexType name="Train">
 *         <complexContent>
 *             <extension base="tns:Transport">
 *                 <attribute name="railwayCar" use="optional" default="second-class">
 *                     <simpleType>
 *                         <restriction base="string">
 *                             <enumeration value="second-class"/>
 *                             <enumeration value="first-class"/>
 *                             <enumeration value="business-class"/>
 *                         </restriction>
 *                     </simpleType>
 *                 </attribute>
 *             </extension>
 *         </complexContent>
 *     </complexType>
 */
public class Train extends Transport {
    private String railwayCar;

    public Train() {
    }

    public String getRailwayCar() {
        return railwayCar;
    }

    public void setRailwayCar(String railwayCar) {
        this.railwayCar = railwayCar;
    }
}
