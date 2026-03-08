/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import participant.*;
import exception.InvalidMemberException;

/**
 *
 * @author ASUS
 */
public class MainAudition {

    public static void startAudition(Participant p) {

        p.performSoundcheck();

        try {
            p.validateCrew();
            System.out.println("Jumlah kru valid.\n");

        } catch (InvalidMemberException e) {
            System.out.println("Error: " + e.getMessage() + "\n");
        }
    }

    public static void main(String[] args) {

        Participant solo1 = new Soloist("Lucas", 1);
        Participant solo2 = new Soloist("Seunghan", 2);

        Participant band1 = new Band("RIIZE", 4);
        Participant band2 = new Band("SuperM", 1 );

        startAudition(solo1);
        startAudition(solo2);
        startAudition(band1);
        startAudition(band2);
    }
}