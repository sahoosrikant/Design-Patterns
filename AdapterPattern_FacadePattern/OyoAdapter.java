package org.example.adapter_class;
//AdapterClass
import org.example.adaptee_class.OyoAPI;
import org.example.target_interface.HotelService;

public class OyoAdapter implements HotelService {

    private OyoAPI oyoAPI;

    public OyoAdapter(OyoAPI oyoAPI) {
        this.oyoAPI = oyoAPI;
    }

    @Override
    public void bookRoom(String customerName) {
        oyoAPI.reserve(customerName);
    }
}
