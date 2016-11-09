/*
 *Learning about Sockets
 */
package guibasedsockets;

import java.io.Serializable;


public class Place implements Serializable {
    
    private String city;
    private String state;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return city + " " + state;
    }
    
    
    
} //end class
