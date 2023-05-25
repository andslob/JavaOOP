package JavaOOP.task7.observer;

public class Midle implements Observer {
    private  String name;
    private double salary;

    public Midle(String name) {
        this.name = name;
        salary = 40000;
    }

    @Override
        public void receiveOffer(String companyName, double salary, String nameVacancy) {
        if (this.salary < salary){
            System.out.printf("Среднячок %s >>> Мне нужна эта работа! [%s - %f]\n", name, companyName, salary, nameVacancy);
            this.salary = salary;
        }
        else {
            System.out.printf("Среднячок %s >>> Я найду работу получше! [%s - %f]\n", name, companyName, salary, nameVacancy);
        }
    }
}