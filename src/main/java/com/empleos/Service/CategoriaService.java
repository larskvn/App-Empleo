

package com.empleos.Service;

import com.empleos.Entity.CategoriaEntity;
import java.util.List;

public interface CategoriaService {
    
    public List<CategoriaEntity> listarTodaLasCategorias();
    
    
    public List<CategoriaEntity> save();
    
    public CategoriaEntity update(CategoriaEntity c);
 
    public CategoriaEntity delete(CategoriaEntity c);
}
