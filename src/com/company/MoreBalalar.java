package com.company;


public class MoreBalalar {
    public static void main(String[] args) {
        Balalar st1 = new Balalar("Алим", "Еркебұланович", "Алиаскаров", "01.01.2018", "+77066677667", "Развивашка", "2", "100ballkerek");
        Balalar st2 = new Balalar("Асет", "Бақытжанович", "Адамжан", "12.04.2017", "+77789101112", "Танцы", "2", "100ballkerek");
        Balalar st3 = new Balalar("Рахат", "Тұрғанович", "Бақтыбай", "10.07.2016", "+77777777777", "Бастыкболу", "2", "100ballkerek");
        Balalar st4 = new Balalar("Мадияр", "Айдарович", "Абишев", "04.09.2019", "+77070707070", "Призедент", "2", "100ballkerek");
        Balalar st5 = new Balalar("Кайрат", "Суетологович", "Отморозог", "03.04.2019", "+7сензоред", "Танцы", "1", "8gotobeles");
        Balalar st6 = new Balalar("Алдик", "Шекерович", "Пупкин", "07.01.2018", "87084834353", "Развивашка", "1", "29/1sib");
        Balalar st7 = new Balalar("Жетпісбай", "Кэмривович", "Трипятков", "03.12.2016", "+73234445454", "Развивашка", "1", "29/1sib");
        Balalar st8 = new Balalar("Жұрттың", "Баласы", "Лексусов", "15.07.2017", "+77064344556", "Танцы", "1", "8gotobeles");
        Balalar st9 = new Balalar("Каспи", "Халыков", "Пайпел", "23.04.2018", "+77774355454", "Развивашка", "1", "29/1sib");
        Balalar st10 = new Balalar("Кешбек", "Тенгевович", "Долларов", "05.01.2018", "+77477474747", "Танцы", "1", "8gotobeles");


        BalalarList newList=new BalalarList();
        newList.addStudent(st1);
        newList.addStudent(st1);
        newList.addStudent(st2);
        newList.addStudent(st3);
        newList.addStudent(st4);
        newList.addStudent(st5);
        newList.addStudent(st6);
        newList.addStudent(st7);
        newList.addStudent(st8);
        newList.addStudent(st9);
        newList.addStudent(st10);

        newList.groupPrint("100ballkerek");//список учебной группы
        newList.yearOfBirthPrint("2018");//список студентов, родившихся после заданного года;


    }
}