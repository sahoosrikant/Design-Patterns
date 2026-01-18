package org.example.adapter_class;
//AdapterClass
import org.example.adaptee_class.TajAPI;
import org.example.target_interface.HotelService;

public class TajAdapter implements HotelService {

    private TajAPI tajAPI;

    public TajAdapter(TajAPI tajAPI) {
        this.tajAPI = tajAPI;
    }

    @Override
    public void bookRoom(String customerName) {
        tajAPI.makeBooking(customerName);
    }
}
