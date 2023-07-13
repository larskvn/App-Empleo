
package com.empleos.Service;

import com.empleos.Entity.PerfilEntity;
import java.util.List;


public interface PerfilService {
    public List<PerfilEntity> listarTodasLosPerfiles();
    
    public PerfilEntity add(PerfilEntity perfilEntity);
    
}
