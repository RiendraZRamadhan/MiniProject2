/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author riendra
 */
package service;

import model.DonorDarah;
import java.util.ArrayList;
import java.util.List;

public class BankDarahService implements CRUDInterface<DonorDarah> {
    private static final List<DonorDarah> daftarDonor = new ArrayList<>();
    private static int idCounter = 1;

    @Override
    public void tambah(DonorDarah donor) {
        daftarDonor.add(donor);
        System.out.println("Donor berhasil ditambahkan: " + donor.getInfo());
    }

    @Override
    public void tampilkan() {
        if (daftarDonor.isEmpty()) {
            System.out.println("Daftar donor kosong.");
        } else {
            System.out.println("Daftar Donor Darah:");
            for (DonorDarah donor : daftarDonor) {
                System.out.println(donor.getInfo());
            }
        }
    }

    @Override
    public void update(String id, DonorDarah donorBaru) {
        for (int i = 0; i < daftarDonor.size(); i++) {
            if (daftarDonor.get(i).getId().equals(id)) {
                daftarDonor.set(i, donorBaru);
                System.out.println("Data donor berhasil diupdate: " + donorBaru.getInfo());
                return;
            }
        }
        System.out.println("Donor dengan ID " + id + " tidak ditemukan.");
    }

    @Override
    public void hapus(String id) {
        for (DonorDarah donor : daftarDonor) {
            if (donor.getId().equals(id)) {
                daftarDonor.remove(donor);
                System.out.println("Donor berhasil dihapus: " + donor.getInfo());
                return;
            }
        }
        System.out.println("Donor dengan ID " + id + " tidak ditemukan.");
    }

    public static String generateId() {
        return "D" + String.format("%03d", idCounter++);
    }
}
