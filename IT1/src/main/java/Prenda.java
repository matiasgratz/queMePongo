public class Prenda {
  String tipo; // (zapatos, camisa de mangas cortas, pantalón, etc).
  Categoria categoria; // (parte superior, calzado, parte inferior, accesorios).
  String material;
  String colorPrincipal;
  String colorSecundario;

  public Prenda(String tipo, Categoria categoria, String material, String colorPrincipal, String colorSecundario){
    this.tipo = tipo;
    this.categoria = categoria;
    this.material = material;
    this.colorPrincipal = colorPrincipal;
    this.colorSecundario = colorSecundario;
    if (tipo == null){
        throw new RuntimeException("La prenda debe tener un tipo");
    }
    if (material == null){
        throw new RuntimeException("La prenda debe tener un material");
    }
    if (categoria == null){
        throw new RuntimeException("La prenda debe tener un categoria");
    }
    if (colorPrincipal == null) {
      throw new RuntimeException("La prenda debe tener un color principal");
    }
  }

// Falta
  // Como usuarie de QuéMePongo, quiero evitar que haya prendas cuya categoría no se condiga con su tipo. (Ej, una remera no puede ser calzado).









}

