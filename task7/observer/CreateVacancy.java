package JavaOOP.task7.observer;

public interface CreateVacancy {

    public default String createVacancy(){
        Vacancy vacancy = new Vacancy();
         return vacancy.nameVacancy;
    } 
}