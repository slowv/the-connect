package com.outside.theconnect.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
public class District implements Serializable {
    @Id
    private Long id;
    private String name;
//    public enum DistrictType{
//       HUYEN(0),QUAN(1),THANH_PHO_TT_TINH(2);
//        private int value;
//
//        DistrictType(int value) {
//            this.value = value;
//        }
//    }
    private String type;
    @ManyToOne
    private Province province;
    @OneToMany(mappedBy = "district")
    private List<Commune> commune;

}
