package com.mycompany.tugas3pakson;
public class Manager extends Employee{
    @Override
    public void datadiri(){     
        nip = 4206969;
        name = "Mr Irony";
        status = false;
        waktukerja = 15;
        super.datadiri();
        super.datadiri(10000069);
}   
}
