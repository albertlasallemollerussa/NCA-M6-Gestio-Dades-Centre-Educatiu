package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);

        ArrayList<alumnes> llistaAlumnes = new ArrayList<>();
        ArrayList<professors> llistaProfessors = new ArrayList<>();
        ArrayList<treballadors> llistaTreballadors = new ArrayList<>();
        ArrayList<curs> llistaCurs = new ArrayList<>();
        ArrayList<assignatures> llistaAssignatures = new ArrayList<>();

        File alumnes = new File("alumnes.txt");
        File treballadors = new File("treballadors.txt");
        File professors = new File("professors.txt");
        File curs = new File("curs.txt");
        File assignatures = new File("assignatures.txt");


        int numero;

        if (alumnes.exists()) {
            FileInputStream fis = new FileInputStream(alumnes);
            ObjectInputStream ois = new ObjectInputStream(fis);

            while (fis.available() > 0) {
                alumnes a = (alumnes) ois.readObject();
                llistaAlumnes.add(a);

            }

            ois.close();
            fis.close();

        }

        if (treballadors.exists()) {
            FileInputStream fis = new FileInputStream(treballadors);
            ObjectInputStream ois = new ObjectInputStream(fis);

            while (fis.available() > 0) {
                treballadors t = (treballadors) ois.readObject();
                llistaTreballadors.add(t);

            }

            ois.close();
            fis.close();

        }

        if (professors.exists()) {
            FileInputStream fis = new FileInputStream(professors);
            ObjectInputStream ois = new ObjectInputStream(fis);

            while (fis.available() > 0) {
                professors p = (professors) ois.readObject();
                llistaProfessors.add(p);

            }

            ois.close();
            fis.close();

        }

        if (curs.exists()) {
            FileInputStream fis = new FileInputStream(curs);
            ObjectInputStream ois = new ObjectInputStream(fis);

            while (fis.available() > 0) {
                curs a = (curs) ois.readObject();
                llistaCurs.add(a);

            }

            ois.close();
            fis.close();

        }

        if (assignatures.exists()) {
            FileInputStream fis = new FileInputStream(assignatures);
            ObjectInputStream ois = new ObjectInputStream(fis);

            while (fis.available() > 0) {
                assignatures a = (assignatures) ois.readObject();
                llistaAssignatures.add(a);

            }

            ois.close();
            fis.close();

        }


        do {
            System.out.println();
            System.out.println("Que vols fer? Escriu un numero:");
            System.out.println("Insertar - 1");
            System.out.println("Mostrar - 2");
            System.out.println("Modificar - 3");
            System.out.println("Esborrar - 4");
            System.out.println("Sortir - 5");

            numero = sc.nextInt();
            sc.nextLine();

            if (numero == 1) {

                System.out.println("Que vols insertar?");
                System.out.println("1- Alumnes");
                System.out.println("2- Treballadors");
                System.out.println("3- Professors");
                System.out.println("4- Curs");
                System.out.println("5- Assignatures");


                int numeroObjecte = sc.nextInt();
                sc.nextLine();

                if (numeroObjecte == 1) {

                    System.out.print("Escriu el numero d'Alumnes que vols insertar: ");
                    int n = sc.nextInt();
                    sc.nextLine();

                    for (int i = 0; i < n; i++) {

                        boolean idExisteix = false;

                        int id;

                        do {

                            System.out.println("introdueix el id del Alumne:");
                            id = sc.nextInt();
                            sc.nextLine();

                            for (alumnes a1 : llistaAlumnes) {
                                if (a1.getId() == id) {
                                    System.out.println("El id " + id + " ja existeix");
                                    idExisteix = true;
                                    break;
                                } else {
                                    idExisteix = false;
                                }
                            }

                        } while (idExisteix);


                        if (!idExisteix) {
                            System.out.println("introdueix el nom del alumne: ");
                            String nom = sc.nextLine();

                            System.out.println("introdueix el telefon del alumne: ");
                            int tlf = sc.nextInt();
                            sc.nextLine();

                            System.out.println("introdueix la edat del alumne: ");
                            int edat = sc.nextInt();
                            sc.nextLine();

                            System.out.println("introdueix la adreça del alumne: ");
                            String adreça = sc.nextLine();

                            System.out.println("introdueix el telefon del pare/mare/tutor del alumne: ");
                            int tlfTutor = sc.nextInt();
                            sc.nextLine();

                            boolean trobarID = false;
                            do{

                                System.out.println("Introdueix el id del curs que fara l'alumne:");
                                int idcurs = sc.nextInt();
                                sc.nextLine();

                                for (curs c: llistaCurs){
                                    if (c.getId() == idcurs){

                                        alumnes a = new alumnes(tlf, nom, adreça, edat, id, tlfTutor, idcurs);
                                        llistaAlumnes.add(a);
                                        trobarID = true;

                                    }else{
                                        System.out.println("No hi ha cap curs amb el ID: "+idcurs);
                                    }
                                }

                            }while(!trobarID);

                        }
                    }


                    FileOutputStream fos = new FileOutputStream(alumnes);
                    ObjectOutputStream oos = new ObjectOutputStream(fos);

                    for (alumnes a : llistaAlumnes) {
                        oos.writeObject(a);
                    }


                    fos.close();
                    oos.close();
                }


                if (numeroObjecte == 2) {

                    System.out.print("Escriu el numero de treballadors que vols insertar: ");
                    int n = sc.nextInt();
                    sc.nextLine();

                    for (int i = 0; i < n; i++) {

                        boolean idExisteix = false;

                        int id;

                        do {

                            System.out.println("introdueix el id del treballador:");
                            id = sc.nextInt();
                            sc.nextLine();

                            for (treballadors t1 : llistaTreballadors) {
                                if (t1.getId() == id) {
                                    System.out.println("El id " + id + " ja existeix");
                                    idExisteix = true;
                                    break;
                                } else {
                                    idExisteix = false;
                                }
                            }

                        } while (idExisteix);


                        if (!idExisteix) {
                            System.out.println("introdueix el nom del treballador: ");
                            String nom = sc.nextLine();

                            System.out.println("introdueix el telefon del treballador: ");
                            int tlf = sc.nextInt();
                            sc.nextLine();

                            System.out.println("introdueix la adreça del treballador: ");
                            String adreça = sc.nextLine();

                            System.out.println("Escriu el departament on treballara el treballador:");
                            String departament = sc.nextLine();


                            treballadors t = new treballadors(nom, id, adreça, tlf, departament);
                            llistaTreballadors.add(t);
                        }
                    }


                    FileOutputStream fos = new FileOutputStream(treballadors);
                    ObjectOutputStream oos = new ObjectOutputStream(fos);

                    for (treballadors t : llistaTreballadors) {
                        oos.writeObject(t);
                    }


                    fos.close();
                    oos.close();

                }
                if (numeroObjecte == 3) {

                    System.out.print("Escriu el numero de professors que vols insertar: ");
                    int n = sc.nextInt();
                    sc.nextLine();

                    for (int i = 0; i < n; i++) {

                        boolean idExisteix = false;

                        int id;

                        do {

                            System.out.println("introdueix el id del Professor:");
                            id = sc.nextInt();
                            sc.nextLine();

                            for (professors p1 : llistaProfessors) {
                                if (p1.getId() == id) {
                                    System.out.println("El id " + id + " ja existeix");
                                    idExisteix = true;
                                    break;
                                } else {
                                    idExisteix = false;
                                }
                            }

                        } while (idExisteix);


                        if (!idExisteix) {
                            System.out.println("introdueix el nom del professor: ");
                            String nom = sc.nextLine();

                            System.out.println("introdueix el telefon del professor: ");
                            int tlf = sc.nextInt();
                            sc.nextLine();

                            System.out.println("introdueix la adreça del professor: ");
                            String adreça = sc.nextLine();

                            boolean trobarID = false;
                            do{

                                System.out.println("Introdueix el id del curs que impartira el professor");
                                int idcurs = sc.nextInt();
                                sc.nextLine();

                                for (curs c: llistaCurs){
                                    if (c.getId() == idcurs){

                                        professors p = new professors(nom, id, tlf, adreça, idcurs);
                                        llistaProfessors.add(p);
                                        trobarID = true;

                                    }else{
                                        System.out.println("No hi ha cap curs amb el ID: "+idcurs);
                                    }
                                }


                            }while(!trobarID);

                        }
                    }


                    FileOutputStream fos = new FileOutputStream(professors);
                    ObjectOutputStream oos = new ObjectOutputStream(fos);

                    for (professors p : llistaProfessors) {
                        oos.writeObject(p);
                    }


                    fos.close();
                    oos.close();

                }
                if (numeroObjecte == 4) {

                    System.out.print("Escriu el numero de cursos que vols insertar: ");
                    int n = sc.nextInt();
                    sc.nextLine();

                    for (int i = 0; i < n; i++) {

                        boolean idExisteix = false;

                        int id;

                        do {

                            System.out.println("introdueix el id del Curs:");
                            id = sc.nextInt();
                            sc.nextLine();

                            for (curs c1 : llistaCurs) {
                                if (c1.getId() == id) {
                                    System.out.println("El id " + id + " ja existeix");
                                    idExisteix = true;
                                    break;
                                } else {
                                    idExisteix = false;
                                }
                            }

                        } while (idExisteix);


                        if (!idExisteix) {
                            System.out.println("introdueix el nom del curs: ");
                            String nom = sc.nextLine();

                            System.out.println("introdueix el preu del curs al mes: ");
                            int preu = sc.nextInt();
                            sc.nextLine();

                            System.out.println("El curs té assingatures optatives? Escriu Si o aprenta Enter:");
                            String condicional = sc.nextLine();

                            String assignaturaOptativa = "No";

                            if (condicional.equals("Si")) {

                                System.out.println("introdueix una asignatura optativa: ");
                                assignaturaOptativa = sc.nextLine();

                            }

                            curs c = new curs(id, preu, nom, assignaturaOptativa);
                            llistaCurs.add(c);

                        }
                    }


                    FileOutputStream fos = new FileOutputStream(curs);
                    ObjectOutputStream oos = new ObjectOutputStream(fos);

                    for (curs c : llistaCurs) {
                        oos.writeObject(c);
                    }


                    fos.close();
                    oos.close();

                }
                if (numeroObjecte == 5) {

                    System.out.print("Escriu el numero d'Assingnatures que vols insertar: ");
                    int n = sc.nextInt();
                    sc.nextLine();

                    for (int i = 0; i < n; i++) {

                        System.out.println("introdueix el nom de la asignatura: ");
                        String nom = sc.nextLine();

                        System.out.println("introdueix les hores que durara l'asignatura durant el curs: ");
                        int hores = sc.nextInt();
                        sc.nextLine();

                        boolean trobarID = false;
                        do{

                            System.out.println("Introdueix el id del curs al que pertany:");
                            int idcurs = sc.nextInt();
                            sc.nextLine();

                            for (curs c: llistaCurs){
                                if (c.getId() == idcurs){

                                    assignatures a = new assignatures(hores, nom, idcurs);
                                    llistaAssignatures.add(a);
                                    trobarID = true;

                                }else{
                                    System.out.println("No hi ha cap curs amb el ID: "+idcurs);
                                }
                            }

                        }while(!trobarID);

                    }


                    FileOutputStream fos = new FileOutputStream(assignatures);
                    ObjectOutputStream oos = new ObjectOutputStream(fos);

                    for (assignatures a : llistaAssignatures) {
                        oos.writeObject(a);
                    }


                    fos.close();
                    oos.close();

                }

            }
            if (numero == 2) {

                System.out.println("Que vols que es mostri:");
                System.out.println("1- Alumnes");
                System.out.println("2- Treballadors");
                System.out.println("3- Professors");
                System.out.println("4- Cursos");
                System.out.println("5- Assignatures");


                int numeroObjecte = sc.nextInt();
                sc.nextLine();

                if (numeroObjecte == 1) {

                    FileInputStream fis = new FileInputStream(alumnes);
                    ObjectInputStream ois = new ObjectInputStream(fis);

                    llistaAlumnes.clear();

                    while (fis.available() > 0) {
                        alumnes a = (alumnes) ois.readObject();
                        llistaAlumnes.add(a);
                        System.out.println(a.toString());
                    }

                    ois.close();
                    fis.close();

                }

                if (numeroObjecte == 2) {

                    FileInputStream fis = new FileInputStream(treballadors);
                    ObjectInputStream ois = new ObjectInputStream(fis);

                    llistaTreballadors.clear();

                    while (fis.available() > 0) {
                        treballadors t = (treballadors) ois.readObject();
                        llistaTreballadors.add(t);
                        System.out.println(t.toString());
                    }

                    ois.close();
                    fis.close();

                }

                if (numeroObjecte == 3) {

                    FileInputStream fis = new FileInputStream(professors);
                    ObjectInputStream ois = new ObjectInputStream(fis);

                    llistaProfessors.clear();

                    while (fis.available() > 0) {
                        professors t = (professors) ois.readObject();
                        llistaProfessors.add(t);
                        System.out.println(t.toString());
                    }

                    ois.close();
                    fis.close();


                }

                if (numeroObjecte == 4) {

                    FileInputStream fis = new FileInputStream(curs);
                    ObjectInputStream ois = new ObjectInputStream(fis);

                    llistaCurs.clear();

                    while (fis.available() > 0) {
                        curs t = (curs) ois.readObject();
                        llistaCurs.add(t);
                        System.out.println(t.toString());
                    }

                    ois.close();
                    fis.close();


                }

                if (numeroObjecte == 5) {

                    FileInputStream fis = new FileInputStream(assignatures);
                    ObjectInputStream ois = new ObjectInputStream(fis);

                    llistaAssignatures.clear();

                    while (fis.available() > 0) {
                        assignatures t = (assignatures) ois.readObject();
                        llistaAssignatures.add(t);
                        System.out.println(t.toString());
                    }

                    ois.close();
                    fis.close();

                }

            }
            if (numero == 3) {


                System.out.println("Que vols modificar?");
                System.out.println("1- Alumnes");
                System.out.println("2- Treballadors");
                System.out.println("3- Professors");
                System.out.println("4- Cursos");
                System.out.println("5- Assignatures");

                int classeModificar = sc.nextInt();
                sc.nextLine();

                if (classeModificar == 1) {

                    System.out.println("Escriu l'ID de l'alumne que vols modificar:");
                    int idModificar = sc.nextInt();
                    sc.nextLine();

                    boolean encontrado = false;

                    for (alumnes a : llistaAlumnes) {
                        if (a.getId() == idModificar) {
                            System.out.println("Alumne seleccionat: " + a.toString());


                            System.out.println("Introdueix el nom de l'alumne:");
                            String nouNom = sc.nextLine();
                            a.setNom(nouNom);

                            System.out.println("Introdueix el telèfon de l'alumne:");
                            int nouTelefon = sc.nextInt();
                            sc.nextLine();
                            a.setTelefon(nouTelefon);

                            System.out.println("Introdueix la edat de l'alumne:");
                            int edat = sc.nextInt();
                            sc.nextLine();
                            a.setEdat(edat);

                            System.out.println("Introdueix la adreça de l'alumne:");
                            String adreca = sc.nextLine();
                            a.setAdreça(adreca);

                            System.out.println("Introdueix el telèfon del tutor legal de l'alumne:");
                            int tlfLegal = sc.nextInt();
                            sc.nextLine();
                            a.setTelefonTutorLegal(tlfLegal);

                            boolean trobarID = false;
                            do{

                                System.out.println("Introdueix el id del curs que fara l'alumne:");
                                int idcurs = sc.nextInt();
                                sc.nextLine();

                                for (curs c: llistaCurs){
                                    if (c.getId() == idcurs){

                                        a.setIdcurs(idcurs);
                                        trobarID = true;

                                    }else{
                                        System.out.println("No hi ha cap curs amb el ID: "+idcurs);
                                    }
                                }

                            }while(!trobarID);

                            System.out.println("Dades de l'alumne actualitzades.");
                            encontrado = true;
                            break;
                        }
                    }

                    if (encontrado) {
                        FileOutputStream fos = new FileOutputStream(alumnes);
                        ObjectOutputStream oos = new ObjectOutputStream(fos);

                        for (alumnes a : llistaAlumnes) {
                            oos.writeObject(a);
                        }

                        fos.close();
                        oos.close();
                    } else {
                        System.out.println("No s'ha trobat cap alumne amb l'ID " + idModificar);
                    }

                }
                if (classeModificar == 2) {

                    System.out.println("Escriu l'ID del treballador que vols modificar:");
                    int idModificar = sc.nextInt();
                    sc.nextLine();

                    boolean encontrado = false;

                    for (treballadors t : llistaTreballadors) {
                        if (t.getId() == idModificar) {
                            System.out.println("Treballador seleccionat: " + t.toString());


                            System.out.println("Introdueix el nom del treballador:");
                            String nouNom = sc.nextLine();
                            t.setNom(nouNom);

                            System.out.println("Introdueix la adreça del treballador:");
                            String adreça = sc.nextLine();
                            t.setAdreça(adreça);

                            System.out.println("Introdueix el telèfon del treballador:");
                            int nouTelefon = sc.nextInt();
                            sc.nextLine();
                            t.setTelefon(nouTelefon);

                            System.out.println("Escriu el departament del treballador:");
                            String departament = sc.nextLine();
                            t.setDepartament(departament);

                            System.out.println("Dades del treballador actualitzades.");
                            encontrado = true;
                            break;
                        }
                    }

                    if (encontrado) {
                        FileOutputStream fos = new FileOutputStream(treballadors);
                        ObjectOutputStream oos = new ObjectOutputStream(fos);

                        for (treballadors t : llistaTreballadors) {
                            oos.writeObject(t);
                        }

                        fos.close();
                        oos.close();
                    } else {
                        System.out.println("No s'ha trobat cap treballador amb l'ID " + idModificar);
                    }

                }
                if (classeModificar == 3) {

                    System.out.println("Escriu l'ID del professor que vols modificar:");
                    int idModificar = sc.nextInt();
                    sc.nextLine();

                    boolean encontrado = false;

                    for (professors p : llistaProfessors) {
                        if (p.getId() == idModificar) {
                            System.out.println("Professor seleccionat: " + p.toString());


                            System.out.println("Introdueix el nom del professor:");
                            String nouNom = sc.nextLine();
                            p.setNom(nouNom);

                            System.out.println("Introdueix la adreça del professor:");
                            String adreça = sc.nextLine();
                            p.setAdreça(adreça);

                            System.out.println("Introdueix el telèfon del professor:");
                            int nouTelefon = sc.nextInt();
                            sc.nextLine();
                            p.setTelefon(nouTelefon);

                            boolean trobarID = false;
                            do{

                                System.out.println("Introdueix el id del curs que impartira el professor");
                                int idcurs = sc.nextInt();
                                sc.nextLine();

                                for (curs c: llistaCurs){
                                    if (c.getId() == idcurs){

                                        p.setIdCurs(idcurs);
                                        trobarID = true;

                                    }else{
                                        System.out.println("No hi ha cap curs amb el ID: "+idcurs);
                                    }
                                }


                            }while(!trobarID);

                            System.out.println("Dades del professor actualitzades.");
                            encontrado = true;
                            break;
                        }
                    }

                    if (encontrado) {
                        FileOutputStream fos = new FileOutputStream(professors);
                        ObjectOutputStream oos = new ObjectOutputStream(fos);

                        for (professors p : llistaProfessors) {
                            oos.writeObject(p);
                        }

                        fos.close();
                        oos.close();
                    } else {
                        System.out.println("No s'ha trobat cap professor amb l'ID " + idModificar);
                    }


                }
                if (classeModificar == 4) {

                    System.out.println("Escriu l'ID del curs que vols modificar:");
                    int idModificar = sc.nextInt();
                    sc.nextLine();

                    boolean encontrado = false;

                    for (curs c : llistaCurs) {
                        if (c.getId() == idModificar) {
                            System.out.println("Curs seleccionat: " + c.toString());


                            System.out.println("Introdueix el nom del curs:");
                            String nouNomCurs = sc.nextLine();
                            c.setNomCurs(nouNomCurs);

                            System.out.println("Introdueix el preu del curs:");
                            int nouPreu = sc.nextInt();
                            sc.nextLine();
                            c.setPreu(nouPreu);

                            System.out.println("Te assignatures optatives? Escriu Si en cas afirmatiu");
                            String condicional = sc.nextLine();

                            String assignaturaOptativa = "No";

                            if (condicional.equals("Si")) {

                                System.out.println("introdueix una asignatura optativa: ");
                                assignaturaOptativa = sc.nextLine();
                                c.setAssignaturesOptatives(assignaturaOptativa);

                            }

                            System.out.println("Dades del curs actualitzades.");
                            encontrado = true;
                            break;


                        }
                    }

                    if (encontrado) {
                        FileOutputStream fos = new FileOutputStream(curs);
                        ObjectOutputStream oos = new ObjectOutputStream(fos);

                        for (curs c : llistaCurs) {
                            oos.writeObject(c);
                        }

                        fos.close();
                        oos.close();
                    } else {
                        System.out.println("No s'ha trobat cap curs amb l'ID " + idModificar);
                    }

                }
                if (classeModificar == 5) {

                    System.out.println("Escriu el nom de l'assignatura que vols modificar:");
                    String nomAssignaturaModificar = sc.nextLine();

                    boolean encontrado = false;

                    for (assignatures assign : llistaAssignatures) {
                        if (assign.getNom().equals(nomAssignaturaModificar)) {
                            System.out.println("Assignatura seleccionada: " + assign.toString());


                            System.out.println("Introdueix el nombre d'hores de l'assignatura:");
                            int nousHores = sc.nextInt();
                            sc.nextLine();
                            assign.setDuradaHores(nousHores);

                            boolean trobarID = false;
                            do{

                                System.out.println("Introdueix el id del curs a la que pertany l'assignatura:");
                                int idcurs = sc.nextInt();
                                sc.nextLine();

                                for (curs c: llistaCurs){
                                    if (c.getId() == idcurs){

                                        assign.setIdCurs(idcurs);
                                        trobarID = true;

                                    }else{
                                        System.out.println("No hi ha cap curs amb el ID: "+idcurs);
                                    }
                                }

                            }while(!trobarID);

                            System.out.println("Dades de l'assignatura actualitzades.");
                            encontrado = true;
                            break;
                        }
                    }

                    if (encontrado) {
                        FileOutputStream fos = new FileOutputStream(curs);
                        ObjectOutputStream oos = new ObjectOutputStream(fos);

                        for (assignatures assign : llistaAssignatures) {
                            oos.writeObject(assign);
                        }

                        fos.close();
                        oos.close();
                    } else {
                        System.out.println("No s'ha trobat cap assignatura amb el nom de  " + nomAssignaturaModificar);
                    }
                }

            }
            if (numero == 4) {

                System.out.println("Que vols que s'esborri?");
                System.out.println("1- Alumnes");
                System.out.println("2- Treballadors");
                System.out.println("3- Professors");
                System.out.println("4- Cursos");
                System.out.println("5- Assignatures");


                int numeroObjecte = sc.nextInt();
                sc.nextLine();

                if (numeroObjecte == 1) {
                    System.out.println("Escriu l'ID de l'alumne que vols esborrar:");
                    int borrarID = sc.nextInt();
                    sc.nextLine();

                    boolean encontrado = false;
                    alumnes alumnoEliminar = null;

                    for (alumnes a : llistaAlumnes) {
                        if (a.getId() == borrarID) {
                            System.out.println("Alumne selecionat: " + a.toString());
                            encontrado = true;
                            alumnoEliminar = a;
                            break;
                        }
                    }

                    if (encontrado) {
                        llistaAlumnes.remove(alumnoEliminar);
                        try (FileOutputStream fos = new FileOutputStream(alumnes);
                             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                            for (alumnes a : llistaAlumnes) {
                                oos.writeObject(a);
                            }
                            System.out.println("Alumne eliminat correctament");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                    } else {
                        System.out.println("No s'ha trobat cap alumne amb l'ID: " + borrarID);
                    }

                }
                if (numeroObjecte == 2) {

                    System.out.println("Escriu l'ID del treballador que vols esborrar:");
                    int borrarID = sc.nextInt();
                    sc.nextLine();

                    boolean encontrado = false;
                    treballadors treballadorEsborrar = null;

                    for (treballadors t : llistaTreballadors) {
                        if (t.getId() == borrarID) {
                            System.out.println("Treballador selecionat: " + t.toString());
                            encontrado = true;
                            treballadorEsborrar = t;
                            break;
                        }
                    }

                    if (encontrado) {
                        llistaTreballadors.remove(treballadorEsborrar);
                        try (FileOutputStream fos = new FileOutputStream(treballadors);
                             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                            for (treballadors t : llistaTreballadors) {
                                oos.writeObject(t);
                            }
                            System.out.println("Treballador eliminat correctament");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                    } else {
                        System.out.println("No s'ha trobat cap treballador amb l'ID: " + borrarID);
                    }

                }
                if (numeroObjecte == 3) {

                    System.out.println("Escriu l'ID del professor que vols esborrar:");
                    int borrarID = sc.nextInt();
                    sc.nextLine();

                    boolean encontrado = false;
                    professors professorsEliminar = null;

                    for (professors p : llistaProfessors) {
                        if (p.getId() == borrarID) {
                            System.out.println("Professor selecionat: " + p.toString());
                            encontrado = true;
                            professorsEliminar = p;
                            break;
                        }
                    }

                    if (encontrado) {
                        llistaProfessors.remove(professorsEliminar);
                        try (FileOutputStream fos = new FileOutputStream(professors);
                             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                            for (professors p : llistaProfessors) {
                                oos.writeObject(p);
                            }
                            System.out.println("Professor eliminat correctament");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                    } else {
                        System.out.println("No s'ha trobat cap professor amb l'ID: " + borrarID);
                    }

                }
                if (numeroObjecte == 4) {

                    System.out.println("Escriu l'ID del curs que vols esborrar:");
                    int borrarID = sc.nextInt();
                    sc.nextLine();

                    boolean encontrado = false;
                    curs cursEliminar = null;

                    for (curs c : llistaCurs) {
                        if (c.getId() == borrarID) {
                            System.out.println("Curs selecionat: " + c.toString());
                            encontrado = true;
                            cursEliminar = c;
                            break;
                        }
                    }

                    if (encontrado) {
                        llistaCurs.remove(cursEliminar);
                        try (FileOutputStream fos = new FileOutputStream(curs);
                             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                            for (curs c : llistaCurs) {
                                oos.writeObject(c);
                            }
                            System.out.println("Curs eliminat correctament");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                    } else {
                        System.out.println("No s'ha trobat cap curs amb l'ID: " + borrarID);
                    }

                }
                if (numeroObjecte == 5) {

                    System.out.println("Escriu el nom de la assignatura que vols esborrar:");
                    String nomAssignatura = sc.nextLine();

                    boolean encontrado = false;
                    assignatures assignaturesEliminar = null;

                    for (assignatures assign : llistaAssignatures) {
                        if (assign.getNom().equals(nomAssignatura)) {
                            System.out.println("Assignatura seleccionada: " + assign.toString());
                            encontrado = true;
                            assignaturesEliminar = assign;
                            break;
                        }
                    }

                    if (encontrado) {
                        llistaAssignatures.remove(assignaturesEliminar);
                        try (FileOutputStream fos = new FileOutputStream(assignatures);
                             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                            for (assignatures assign : llistaAssignatures) {
                                oos.writeObject(assign);
                            }
                            System.out.println("Assignatura eliminada correctament");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                    } else {
                        System.out.println("No s'ha trobat cap Assignatura amb el nom de: " + nomAssignatura);
                    }

                }

            }
            if (numero == 5) {
                System.out.println("Gracies per utilitzar el programa!");

            }


        } while (numero != 5);
    }
}