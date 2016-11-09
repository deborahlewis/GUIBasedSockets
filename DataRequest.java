/*
 *Learning about Sockets
 */
package guibasedsockets;

import java.io.Serializable;

public class DataRequest implements Serializable {

    private String username;
    private String password;
    private int dataType;

    public static final int NAMES = 0;
    public static final int PLACES = 1;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getDataType() {
        return dataType;
    }

    public static int getNAMES() {
        return NAMES;
    }

    public static int getPLACES() {
        return PLACES;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDataType(int dataType) {
        this.dataType = dataType;
    }

} //end class
