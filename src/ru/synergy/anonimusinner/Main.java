package ru.synergy.anonimusinner;

public class Main {
    public static void main(String[] arg){
        /*ПСЕВДОКОД анонимных вложенных классов:
         * new <ИМЕНИ_НЕТ><класс родительский/реализуемый интерфейс>(параметры конструктора родителя);{
         * }
         */
/*
        GeneralIndicatorMonitoringModule generalIndicatorMonitoringModule = new GeneralIndicatorMonitoringModule();
        ErrorMonitoringModule errorMonitoringModule = new ErrorMonitoringModule();
        SecurityMonitoringModule securityMonitoringModule = new SecurityMonitoringModule();
*/
        //Всё тоже самое, только методом анонимных классов
        MonitoringSystem generalIndicatorMonitoringModule = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Мониторинг общих показателей стартовал!");
            }
        };
        MonitoringSystem errorMonitoringModule = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Мониторинг отслеживания ошибок стартовал!");
            }
        };
        MonitoringSystem securityMonitoringModule = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Мониторинг безопасности стартовал!");
            }
        };

        generalIndicatorMonitoringModule.startMonitoring();
        errorMonitoringModule.startMonitoring();
        securityMonitoringModule.startMonitoring();
        //Мониторинг общих показателей стартовал!
        //Мониторинг отслеживания ошибок стартовал!
        //Мониторинг безопасности стартовал!

        //После метода анонимных классов:
        //Мониторинг общих показателей стартовал!
        //Мониторинг отслеживания ошибок стартовал!
        //Мониторинг безопасности стартовал!



    }
}
/*class GeneralIndicatorMonitoringModule implements MonitoringSystem{
    @Override
    public void startMonitoring() {
        System.out.println("Мониторинг общих показателей стартовал!");
    }
}

class ErrorMonitoringModule implements MonitoringSystem{

    @Override
    public void startMonitoring() {
        System.out.println("Мониторинг отслеживания ошибок стартовал!");
    }
}

class SecurityMonitoringModule implements MonitoringSystem{

    @Override
    public void startMonitoring() {
        System.out.println("Мониторинг безопасности стартовал!");
    }
}
 */