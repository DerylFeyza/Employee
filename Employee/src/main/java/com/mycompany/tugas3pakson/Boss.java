package com.mycompany.tugas3pakson;
public class Boss extends Employee{
    @Override
    public void datadiri(){     
        nip = 1000001;
        name = "Eggman Nega";
        status = true;
        waktukerja = 10;
        super.datadiri();
        super.datadiri(20000069);
}
}
