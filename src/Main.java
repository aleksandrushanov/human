public class Main {
    public static void main(String[] args) {

        human maxim = new human("Максим","Новосибирск",1996,"менеджер по работе с клиентами");
        human anna = new human("Аня","Москва",2003,"дизайнер");
        human katya = new human("Катя","Санкт-Петербург",1999,"Java-разработчик");
        human artem = new human("Артём","Казань",2001,"управлющий персоналом");

        System.out.println(maxim);
        System.out.println(anna);
        System.out.println(katya);
        System.out.println(artem);
    }
}