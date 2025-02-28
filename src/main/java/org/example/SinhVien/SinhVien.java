package org.example.SinhVien;

public class SinhVien {
    public int id;
    public String name;
    public int age;
    public String diaChi;


    public SinhVien(int id, String name, int age, String diaChi) {
       setId(id);
       setName(name);
       setAge(age);
       setDiaChi(diaChi);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id== getId()){
            throw new IllegalArgumentException("trung ma");
        }
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name== null){
            throw new IllegalArgumentException("Name null");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0){
            throw new IllegalArgumentException("Tuoi<0");
        }
        this.age = age;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        if(diaChi== null){
            throw new IllegalArgumentException("DiaChi null");
        }
        this.diaChi = diaChi;
    }
}
