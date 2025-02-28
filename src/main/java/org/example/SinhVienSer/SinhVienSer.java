package org.example.SinhVienSer;

import org.example.SinhVien.SinhVien;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SinhVienSer {

    public List<SinhVien> list= new ArrayList<>();


    public void add(SinhVien sinhVien){
        if(sinhVien == null){
               throw  new IllegalArgumentException("loi");
        }
        list.add(sinhVien);

    }
    public Optional<SinhVien> findById(int id){
        return list.stream().filter(s->s.getId()==id).findFirst();

    }
//    public void Update(SinhVien sinhVien){
//        if(sinhVien == null){
//           throw  new  IllegalArgumentException("Update loi");
//        }
//        Optional<SinhVien> findById = findById(sinhVien.getId());
//        if(findById.isPresent()){
//         list.add(sinhVien);
//        }
//    }
    public void Update(SinhVien sinhVien) {
        for (SinhVien s : list) {
            if (s.getId() == sinhVien.getId()) {
                throw new IllegalArgumentException("Trung ma");
            }
        }
        list.add(sinhVien);
    }
}
