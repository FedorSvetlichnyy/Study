package Part4.Person;

class Person {
    private String name;
    private String family;
    private Integer age;
    private Sex sex;

    public Person(String name, String family, int age, Sex sex) {
        this.name = name;
        this.family = family;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }

    public Integer getAge() {
        return age;
    }

    public Sex getSex() {
        return sex;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}