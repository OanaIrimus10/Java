package VariabilaMetoda;

import org.testng.annotations.Test;

public class StructuriAlternative {
    //structuri alternative= if-then-else; switch-case

    @Test
    public void MetodaTest() {
//    VerificareNumar(6);
//    VerificareNumar(3);
//    VerificareNumar(5);
//    ParImpar(-5);
//    System.out.println(getSalariu());
      zileSaptamanii(2);
    }

    //verificam un nr mai mare decat 5
    public void VerificareNumar(int n) {
        if (n > 5) {
            System.out.println("Numarul " + n + " e mai mare decat 5");
        } else if (n < 5) {
            System.out.println("Numarul " + n + " e mai mic decat 5");
        } else
            System.out.println("Numarul " + n + " e egal cu 5");
    }


    //verificam daca un nr este par pozitiv sau par negativ
    public void ParImpar(int n) {
        if (n > 0) {
            if (n % 2 == 0) {
                System.out.println("Numarul" + n + " este par pozitiv.");
            } else System.out.println(("Numarul" + n + " este impar pozitiv."));
        } else if (n < 0) {
            if (n % 2 == 0) {
                System.out.println("Numarul" + n + " este par negativ.");
            } else System.out.println(("Numarul" + n + " este impar negativ."));
        }

    }

    //metoda return
    public Integer getSalariu() {
        Integer salariu = 8500;
        return salariu;
    }


    //switch case
    public void zileSaptamanii(Integer zi) {
        switch (zi) {
            case 1:
                System.out.println("Azi e este luni.");
                break;
            case 2:
                System.out.println("Azi e  marti.");
                break;
            case 3:
                System.out.println("Azi e miercuri.");
                break;
            case 4:
                System.out.println("Azi e joi.");
                break;
            case 5:
                System.out.println("Azi e vineri.");
                break;
        }


    }
}

