package JavaOOP.task5.views;

import JavaOOP.task5.models.Table;
import JavaOOP.task5.presenters.View;
import JavaOOP.task5.presenters.ViewObserver;

import java.util.Collection;
import java.util.Date;

public class BookingView implements View {


    private ViewObserver observer;
    static int tableNN;
    static String clientName;

    public void showTables(Collection<Table> tables){
        System.out.println("\nДоступные столы для бронирования:");
        for (Table table: tables){
            System.out.println(table);
        }
    }

    @Override
    public void showReservationStatus(int reservationNo) {
        if (reservationNo > 0){
            System.out.printf("\nСтолик %d на имя %s успешно забронирован. Номер брони: #%d\n", tableNN, clientName, reservationNo);
        }
        else {
            System.out.println("\nОшибка бронирования столика.");
        }
    }

    @Override
    public void setObserver(ViewObserver observer) {
        this.observer = observer;
    }

    public void reservationTable(Date orderDate, int tableNo, String name){
        tableNN = tableNo;
        clientName = name;
        observer.onReservationTable(orderDate, tableNo, name);
        
    }

    public void changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name){
        tableNN = tableNo;
        clientName = name;
        observer.onChangeReservationTable(oldReservation, reservationDate, tableNo, name);
    }

    public void deleteReservation(int oldReservation){
        observer.deleteReservation(oldReservation);
    }

}
