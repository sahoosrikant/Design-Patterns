package org.example.facade_layer;
//FacadeClass
import org.example.adaptee_class.MarriotAPI;
import org.example.adaptee_class.OyoAPI;
import org.example.adaptee_class.TajAPI;
import org.example.adapter_class.MarriotAdapter;
import org.example.adapter_class.OyoAdapter;
import org.example.adapter_class.TajAdapter;
import org.example.target_interface.HotelService;

public class HotelBookingFacade {

    private HotelService oyoService;
    private HotelService tajService;
    private HotelService marriotService;

    public HotelBookingFacade() {
        this.oyoService = new OyoAdapter(new OyoAPI());
        this.tajService = new TajAdapter(new TajAPI());
        this.marriotService = new MarriotAdapter(new MarriotAPI());
    }

    public void bookOyo(String customerName){
        oyoService.bookRoom(customerName);
    }

    public void bookTaj(String customerName){
        tajService.bookRoom(customerName);
    }

    public void bookMarriot(String customerName){
        marriotService.bookRoom(customerName);
    }
}
