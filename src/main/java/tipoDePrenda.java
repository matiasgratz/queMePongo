public class tipoDePrenda {
    Categoria categoria;
    public Categoria(Categoria categoria){
      this.categoria = categoria;
    }
    Categoria categoria(){
      return this.categoria;
    }
    constant ZAPATO = new TipoDePrenda(CALZADO);
    constant REMERA = new TipoDePrenda(PARTE_SUPERIOR);
    constant PANTALON = new TipoDePrenda(PARTE_INFERIOR);

}
