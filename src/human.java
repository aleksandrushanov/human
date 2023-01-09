public class human {
    public String name;
    public String city;
    public int yearOfBirth;
    public String post;

    public human(String name,String city, int yearOfBirth, String post) {
        this.name = name;
        this.city = city;
        this.yearOfBirth = yearOfBirth;
        this.post = post;
    }

    @Override
    public String toString() {
        return
                "Привет! Меня зовут " + name +
                ". Я из города " + city +
                ". Я родился в " + yearOfBirth +
                "году. Я работаю на должности " + post +
                ". Будем знакомы!";
    }
}
