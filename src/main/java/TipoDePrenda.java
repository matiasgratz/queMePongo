public class TipoDePrenda {
    Categoria categoria;
    public void Categoria(Categoria categoria){
      this.categoria = categoria;
    }
    Categoria categoria(){
      return this.categoria;
    }
    static ZAPATO = new Categoria(CALZADO);
    static REMERA = new Categoria(PARTE_SUPERIOR);
    static PANTALON = new Categoria(PARTE_INFERIOR);

}
