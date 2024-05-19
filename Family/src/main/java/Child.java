/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeParseException;
import java.util.Locale;

public class Child implements Person {
    private String name;
    private String birthPlace;
    private String birthDate;
    private String occupation;
    private String residence;
    private String phoneNumber;
    private String gender;  
    private int age;

    public Child(String name, String birthPlace, String birthDate, String occupation, String residence, String phoneNumber, String gender) {
        this.name = name;
        this.birthPlace = birthPlace;
        this.birthDate = birthDate;
        this.occupation = occupation;
        this.residence = residence;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.age = calculateAge(birthDate);
    }

    private int calculateAge(String birthDate) {
        try {
            DateTimeFormatter formatter = new DateTimeFormatterBuilder()
                .parseCaseInsensitive()
                .appendPattern("dd MMMM yyyy")
                .toFormatter(new Locale("id", "ID"));
            LocalDate birth = LocalDate.parse(birthDate, formatter);
            LocalDate now = LocalDate.now();
            return Period.between(birth, now).getYears();
        } catch (DateTimeParseException e) {
            e.printStackTrace();
            return -1;
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getBirthPlace() {
        return birthPlace;
    }

    @Override
    public String getBirthDate() {
        return birthDate;
    }

    @Override
    public String getOccupation() {
        return occupation;
    }

    @Override
    public String getResidence() {
        return residence;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getDetails() {
        return String.format(
            "Nama: %s\n" +
            "Tempat Lahir: %s\n" +
            "Tanggal Lahir: %s\n" +
            "Umur: %d tahun\n" +
            "Jenis Kelamin: %s\n" +
            "Pekerjaan: %s\n" +
            "Tempat Tinggal: %s\n" +
            "Nomor HP: %s",
            getName(), getBirthPlace(), getBirthDate(), getAge(), getGender(), getOccupation(), getResidence(), getPhoneNumber()
        );
    }
}
