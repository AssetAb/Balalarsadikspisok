package com.company;


import java.util.*;

public class BalalarList {
    private List<Balalar>studentsList= new ArrayList<>();
    public void addStudent(Balalar a){
        studentsList.add(a);
    }

    public void groupPrint(String group){
        System.out.println("Список детей группы "+group);
        for(Balalar st:studentsList){
            if(st.getGroup().equals(group)){
                System.out.println(st.toString());
            }
        }
    }
    public void yearOfBirthPrint(String year){
        System.out.println("Список детей, родившихся после "+year+" года");
        for(Balalar st:studentsList){
            if(parseYear(st.getDateOfBirth().substring(6))>parseYear(year)){
                System.out.println(st.toString());}
        }
    }
    public void yearOfBirthPrint(){
        System.out.println("Список детей, независимо от года рождения");
        for(Balalar st:studentsList){
            System.out.println(st.toString());}
    }


    public int parseYear(String years){
        return Integer.parseInt(years);
    }

}