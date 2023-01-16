package Lesson6.Task3;

import lombok.Getter;

@Getter
public class Address {
    String street;
    String suite;
    String city;
    String zipcode;
    Location geo;


    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", suite='" + suite + '\'' +
                ", city='" + city + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", geo=" + geo +
                '}';
    }
}
