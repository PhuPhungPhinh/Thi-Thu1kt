package org.example.SinhVienSer;

import org.example.SinhVien.SinhVien;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SinhVienSerTest {
public SinhVienSer sinhVienSer;


    @BeforeEach
    void setUp() {
        sinhVienSer = new SinhVienSer();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void add() {
    }

    @Test
    void findById() {
    }

    @Test
    void update() {
        SinhVien sv= new SinhVien(1,"tu",12,"lang son");
        sinhVienSer.add(sv);

        sv.setName("linh");
        sv.setDiaChi("yenbai");
        sv.setAge(15);

        assertEquals("linh",sinhVienSer.findById(1).get().getName());
        assertEquals("yenbai",sinhVienSer.findById(1).get().getDiaChi());
        assertEquals(15,sinhVienSer.findById(1).get().getAge());
    }

    @Test
    void update2() {
        SinhVien sv= new SinhVien(1,"tu",12,"lang son");
        sinhVienSer.add(sv);
        Exception exception = assertThrows(IllegalArgumentException.class,()->
                sinhVienSer.Update(new SinhVien(1,null,12,"lang son"))
        );
        assertEquals("Name null",exception.getMessage());
    }

    @Test
    void update4() {
        SinhVien sv= new SinhVien(1,"tu",12,"lang son");
        sinhVienSer.add(sv);
        Exception exception = assertThrows(IllegalArgumentException.class,()->
                sinhVienSer.Update(new SinhVien(1,"tu",12,null))
        );
        assertEquals("DiaChi null",exception.getMessage());
    }
    @Test
    void update5() {
        SinhVien sv= new SinhVien(1,"tu",12,"lang son");
        sinhVienSer.add(sv);
        Exception exception = assertThrows(IllegalArgumentException.class,()->
                sinhVienSer.Update(new SinhVien(1,"tu",12,"lang son"))
        );
        assertEquals("Trung ma",exception.getMessage());
    }
    @Test
    void update6() {
        SinhVien sv= new SinhVien(1,"tu",12,"lang son");
        sinhVienSer.add(sv);
        Exception exception = assertThrows(IllegalArgumentException.class,()->
                sinhVienSer.Update(new SinhVien(1,"tu",-3,"lang son"))
        );
        assertEquals("Tuoi<0",exception.getMessage());
    }
}