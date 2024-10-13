/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

/**
 *
 * @author riendra
 */
public interface CRUDInterface<T> {
    void tambah(T t);
    void tampilkan();
    void update(String id, T t);
    void hapus(String id);
}
