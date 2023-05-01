package JavaOOP.task5.presenters;

import java.util.Collection;
import java.util.Date;

import JavaOOP.task5.models.Table;

public interface Model {


    Collection<Table> loadTables();


    int reservationTable(Date reservationDate, int tableNo, String name);

    int changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name);

    void deleteReservation(int oldReservation);


}
