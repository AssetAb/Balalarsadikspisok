package com.company;


public class Balalar {

    private int id;
    private static int nextId=0;
    private String name;
    private String middleName;
    private String dateOfBirth;
    private String surname;
    private String phoneNumberRodakov;
    private String course;
    private String group;
    public Balalar(String name, String middleName, String surname, String dateOfBirth, String phoneNumberRodakov, String faculty, String course, String group) {

        this.name=name;
        this.middleName=middleName;
        this.surname=surname;
        this.dateOfBirth=dateOfBirth;
        this.phoneNumberRodakov=phoneNumberRodakov;
        this.course=course;
        this.group=group;
        id=nextId++;
        setName(name);
        setMiddleName(middleName);
        setSurname(surname);
        setDateOfBirth(dateOfBirth);
        setphoneNumberRodakov(phoneNumberRodakov);
        setCourse(course);
        setGroup(group);}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return name;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getphoneNumberRodakov() {
        return phoneNumberRodakov;
    }

    public void setphoneNumberRodakov(String phoneNumberRodakov) {
        this.phoneNumberRodakov = phoneNumberRodakov;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }




    public String toString() {
        return "Student{"+" id " +id+
                ", name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", surname='" + surname + '\'' +
                ", phoneNumberRodakov='" + phoneNumberRodakov + '\'' +
                ", course='" + course + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
    public String fullName(){
        return surname+" "+middleName+" "+name;
    }
}




