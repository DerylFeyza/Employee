package com.mycompany.tugas3pakson;
public class CleaningService extends Employee{  
   @Override
   public void datadiri(){     
        nip = 177103;
        name = "sugiono";
        status = true;
        waktukerja = 4;
        super.datadiri();
        super.datadiri(3000000);
}   
}
