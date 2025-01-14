package VariabilaMetoda;

import org.testng.annotations.Test;

public class Student {


    // clasa= sablon care defineste proprietatile si comportamentul unei entitati specifice
    // intr-un fisier java putem avea mai multe clase diferentiate pe baza numelui (nu este un practice bun sa ai mai multe clase intr un fisier)
    // intr-o clasa putem defini proprietatile si actiunile entitatii
    // variabila= proprietatea unei clase
    // variabilele pot fii : global si local
    // variabile globale = sunt vizibile peste tot in proiect
    // variabile locale = sunt vizibile doar in locul unde a fost declarat
    // ca sa definim o variabila locala: access control (public) tip variabila nume variabila
    // cand definim o variabila nu e obligatoriu sa ii dai o valoare
    // metoda= actiunea unei clase
    // 2 tipuri de metode: void si return



    public String nume;
    public String prenume;
    public Integer varsta;
    public String adresa;
    public Double inaltime;
    public Float greutate;
    public Character sex;
    public Boolean areDiploma;

    @Test
    public void prezentareStudent() {
        nume="Irimus";
        prenume="Oana";
        varsta=38;
        adresa="Prof Ioan Rus 42F1";
        inaltime=1.65;
        greutate=52.00f;
        sex='M';
        areDiploma=true;

        //System.out.println(nume +  " " + prenume + " " + varsta );
        //System.out.println(inaltime);
        System.out.println("Numele elevului este" + " " + nume);
        System.out.println("Preumele elevului este" + " " + prenume);
        System.out.println("Elevul are varsta de " + " " + varsta);
        System.out.println("Are studentul diploma? " + " " + areDiploma);


    calculMedie();

    }


    public void calculMedie() {
        Integer nota1=8;
        Integer nota2=5;
        Integer nota3=10;
        Integer medie= (nota1 + nota2 + nota3)/3;
        System.out.println("Elevul are media: " + medie);






    }

}
