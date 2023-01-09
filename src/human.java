public class human {
    public String name;
    public String city;
    public int yearOfBirth;
    public String post;

    public human(String name,String city, int yearOfBirth, String post) {
        if (name == null || name.isEmpty()) {
            this.name = "Информация не укзана";
        }else{
            this.name = name;
        }
        if (city == null || city.isEmpty()) {
            this.city = "Информация не укзана";
        }else {
            this.city = city;
        }
        if (yearOfBirth > 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = Math.abs(yearOfBirth);
        }
        if (post == null || post.isEmpty()) {
            this.post = "Информация не укзана";
        } else {
            this.post = post;
        }
    }

    @Override
    public String toString() {
        return
                "Привет! Меня зовут " + name +
                ". Я из города " + city +
                ". Я родился в " + yearOfBirth +
                " году. Я работаю на должности " + post +
                ". Будем знакомы!";
    }
}
