package org.model;
import lombok.*;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Imagen {
    private Long id;
    private String denominacion;

    // Getters and setters

    @Override
    public String toString() {
        return "\nId " + id +
                "\nDescripcion " + denominacion + "\n";
    }
}