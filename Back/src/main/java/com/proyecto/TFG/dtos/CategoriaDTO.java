package com.proyecto.TFG.dtos;

import com.proyecto.TFG.modelos.Producto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoriaDTO {

    private long id;
    private String nombre;
    private String descripcion;

}
