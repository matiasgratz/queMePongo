public class Prenda {
  TipoDePrenda tipoDePrenda;
  Categoria categoria;
  Material material;
  Color color;
  Color colorOpcional;

  public Prenda(TipoDePrenda  categoria, Material material, Color color){
    this.TipoDePrenda  = categoria;
    this.Material = material;
    this.Color = color;
    this.tipoDePrenda = requireNonNull(tipo, "tipo de prenda es obligatorio");
    this.material = requireNonNull(material, "material es obligatorio");
    this.color = requireNonNull(color, "color es obligatorio");
  }

  public void setColorOpcional(Color colorOpcional)
  {
  this.colorOpcional = colorOpcional;
  }

}

