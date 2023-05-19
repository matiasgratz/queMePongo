import static java.io.PrintStream.requireNonNull;

public class Prenda {
  TipoDePrenda tipoDePrenda;
  Categoria categoria;
  Material material;
  Color color;
  Color colorOpcional;
  Trama trama;

  public Prenda(TipoDePrenda  categoria, Material material, Color color, Trama trama){
    this.tipoDePrenda  = categoria;
    this.material = material;
    this.color = color;
    this.trama = trama;
    this.tipoDePrenda = requireNonNull(categoria, "tipo de prenda es obligatorio");
    this.material = requireNonNull(material, "material es obligatorio");
    this.color = requireNonNull(color, "color es obligatorio");
  }

  public void setColorOpcional(Color colorOpcional)
  {
  this.colorOpcional = colorOpcional;
  }

}

