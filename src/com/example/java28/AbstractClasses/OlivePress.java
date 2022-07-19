package com.example.java28.AbstractClasses;

import java.util.List;

import com.example.java28.AbstractClasses.model.Olive;

public class OlivePress {

    public int getOil(List<Olive> olives) {
        int totalOil = 0;
      for (Olive o : olives) {
          totalOil += o.crush();
      }
      return totalOil;
    }
    
}
