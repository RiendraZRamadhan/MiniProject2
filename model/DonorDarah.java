/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author riendra
 */
public final class DonorDarah extends Orang {
    private String golonganDarah;

    public DonorDarah(String id, String nama, String golonganDarah) {
        super(id, nama);
        this.golonganDarah = golonganDarah;
    }

    public String getGolonganDarah() { return golonganDarah; }
    public void setGolonganDarah(String golonganDarah) { this.golonganDarah = golonganDarah; }

    @Override
    public String getInfo() {
        return "Donor Darah - ID: " + id + ", Nama: " + nama + ", Golongan Darah: " + golonganDarah;
    }
}



