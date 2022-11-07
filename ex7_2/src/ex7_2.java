import com.company.vehicles.Car;
import com.company.professions.Driver;
import com.company.details.Engine;
import com.company.vehicles.Lorry;
import com.company.vehicles.SportCar;

public class ex7_2 {
    public static void main(String[] args) {
        Driver dr1=new Driver("Кирилл", "Шевель", "Павлович", 17);
        Engine  eng= new Engine(1600, "china");
        Car car=new Car("Hyundai", "C", 250.3, dr1, eng);
        car.start();
        System.out.println("Фамилия водителя "+dr1.getSurname());
        System.out.println("Стаж водителя "+dr1.getExp());
        System.out.println("Мощность автомобиля "+car.getBrand()+" : "+eng.getPower()+" лошадок");
        car.stop();

        Engine eng2=new Engine(5000, "РОССИЯ");
        Lorry lor=new Lorry(300, "MAZ", "A", 500, dr1, eng2);
        System.out.println("Грузовик "+ lor.getBrand()+" имеет грузоподъемность "+lor.getLoadCap()+ " кг");
        lor.liftTheLoad();

        SportCar spC1=new SportCar();
        spC1.setBrand("Ламборгини");
        spC1.setMaxSpeed(250);
        System.out.println("Спорткар "+spC1.getBrand()+" разгоняется до "+spC1.getMaxSpeed()+" км/ч");
    }
}