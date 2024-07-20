package com.filiale.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FilialeModel {
    @Id
    private int filialeId;
    private String filialeName;
    private int entrepriseId;

    public FilialeModel(String filialeName, int entrepriseId) {
        this.filialeName = filialeName;
        this.entrepriseId = entrepriseId;
    }
}
