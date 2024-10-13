/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author riendra
 */
public final class Petugas extends Orang {
    private String jabatan;

    public Petugas(String id, String nama, String jabatan) {
        super(id, nama);
        this.jabatan = jabatan;
    }

    public String getJabatan() { return jabatan; }
    public void setJabatan(String jabatan) { this.jabatan = jabatan; }

    @Override
    public String getInfo() {
        return "Petugas - ID: " + id + ", Nama: " + nama + ", Jabatan: " + jabatan;
    }
}
