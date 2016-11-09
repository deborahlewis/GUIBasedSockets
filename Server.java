/*
 *Learning about Sockets
 */
package guibasedsockets;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //create socket
        ServerSocket server = new ServerSocket(67);

        while (true) {
            //accept input
            Socket socket = server.accept();
            //read input
            ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
            //write output
            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());

            //read object from DataRequest.java
            DataRequest request = (DataRequest) in.readObject();

            //add data to object
            switch (request.getDataType()) {
                case DataRequest.NAMES:
                    out.writeObject(getNames());
                    out.flush();
                break;
                case DataRequest.PLACES:
                    out.writeObject(getPlaces());
                    out.flush();
                break;
            }
            
            socket.close(); //close socket

        } //end while loop

    } //end main
    
    private static List<Name> getNames() {
        List<Name> names = new ArrayList<Name>();
        Name name = new Name();
        name.setFirstName("Deborah");
        name.setLastName("Lewis");
        names.add(name);
        
        name = new Name();
        name.setFirstName("Christina");
        name.setLastName("Driftmier");
        names.add(name);
        
        return names;        
    } //end getNames method
    
    private static List<Place> getPlaces() {
        List<Place> places = new ArrayList<Place>();
        Place place = new Place();
        place.setCity("Pittsburgh");
        place.setState("Pennsylvania");
        places.add(place);
        
        place = new Place();
        place.setCity("Cleveland");
        place.setState("Ohio");
        places.add(place);
        
        return places;        
    } //end getNames method

}
