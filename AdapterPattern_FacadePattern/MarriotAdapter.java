package org.example.adapter_class;
//AdapterClass
import org.example.adaptee_class.MarriotAPI;
import org.example.target_interface.HotelService;

public class MarriotAdapter implements HotelService {

    private MarriotAPI marriotAPI;

    public MarriotAdapter(MarriotAPI marriotAPI) {
        this.marriotAPI = marriotAPI;
    }

    @Override
    public void bookRoom(String customerName) {
        marriotAPI.bookStay(customerName);
    }
}
