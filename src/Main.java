class Animal {
    protected String nombre;
    protected int edad;
    public Animal(String nombre,int edad){
        this.nombre=nombre;
        this.edad=edad;
    }
    public String getNombre()
    {
        return nombre;
    }
    public int getEdad()
    {
        return edad;
    }
}
class Mamiferos extends Animal{
    protected int numPatas;
    protected String tipoPelaje;
    public Mamiferos(String nombre, int edad, int numPatas , String tipoPelaje) {
        super(nombre, edad);
        this.numPatas = numPatas;
        this.tipoPelaje = tipoPelaje;
    }
    public int getNumPatas() {
        return numPatas;
    }
    public String getTipoPelaje() {
        return tipoPelaje;
    }
}
class Ave extends Animal{
    protected String tipoPlumaje;
    protected String habilidadVuelo;
    public Ave(String nombre,int edad , String tipoPlumaje,String habilidadVuelo)  {
        super(nombre,edad);
        this.tipoPlumaje=tipoPlumaje;
        this.habilidadVuelo=habilidadVuelo;
    }
    public String getTipoPlumaje() {
        return tipoPlumaje;
    }
    public String puedeVolar(){
        return habilidadVuelo;
    }
}
class Felino extends Mamiferos{
    protected String longitudCola;
    protected String tipoCaza;
    public Felino(String nombre,int edad,int numPatas,String tipoPelaje,String longitudCola,String tipoCaza){
        super(nombre,edad,numPatas,tipoPelaje);
        this.longitudCola=longitudCola;
        this.tipoCaza=tipoCaza;
    }
    public String getLongitudCola(){
        return longitudCola;
    }
    public String getTipoCaza()
    {
        return tipoCaza;
    }
}
class Canido extends Mamiferos{
    protected String raza;
    protected String habilidadOlfato;
    public Canido(String nombre,int edad,int numPatas,String tipoPelaje,String raza,String habilidadOlfato){
        super(nombre, edad, numPatas, tipoPelaje);
        this.raza=raza;
        this.habilidadOlfato=habilidadOlfato;
    }
    public String getRaza()
    {
        return raza;
    }
    public String tieneBuenOlfato()
    {
        return habilidadOlfato;
    }
}
class Leon extends Felino{
    protected String melena;
    protected String territorioCaza;
    public Leon(String nombre,int edad,int numPatas,String tipoPelaje,String longitudCola,String tipoCaza,String melena,String territorioCaza){
        super(nombre, edad, numPatas, tipoPelaje, longitudCola, tipoCaza);
        this.melena=melena;
        this.territorioCaza=territorioCaza;
    }
    public String getMelena(){
        return melena;
    }
    public String getTerritorioCaza()
    {
        return territorioCaza;
    }
}
class Perro extends Canido{
    protected String colorPelaje;
    protected String tamano;
    public Perro (String nombre,int edad,int numPatas,String tipoPelaje,String raza,String habilidadOlfato,String colorPelaje,String tamano){
        super(nombre, edad, numPatas, tipoPelaje, raza, habilidadOlfato);
        this.colorPelaje=colorPelaje;
        this.tamano=tamano;
    }
    public String getColorPelaje()
    {
        return colorPelaje;
    }
    public String getTamano(){
        return tamano;
    }
}
class GatoDomestico extends Felino{
    protected String comportamientoDomestico;
    protected String raza;
    public GatoDomestico(String nombre,int edad,int numPatas,String tipoPelaje,String longitudCola,String tipoCaza,String comportamientoDomestico,String raza){
        super(nombre, edad, numPatas, tipoPelaje, longitudCola, tipoCaza);
        this.comportamientoDomestico=comportamientoDomestico;
        this.raza=raza;
    }
    public String getComportamientoDomestico()
    {
        return comportamientoDomestico;
    }
}
class LabradorRetriever extends Perro{
    protected String habilidadNadar;
    protected String personalidad;
    public LabradorRetriever(String nombre,int edad,int numPatas,String tipoPelaje,String raza,String habilidadOlfato,String colorPelaje,String tamano,String habilidadNadar,String personalidad){

        super(nombre, edad, numPatas, tipoPelaje, raza, habilidadOlfato, colorPelaje, tamano);
        this.habilidadNadar=habilidadNadar;
        this.personalidad=personalidad;
    }
    public String getPersonalidad()
    {
        return personalidad;
    }
    public String puedeNadar(){
        return habilidadNadar;
    }
}
class Principal
{
    public static void main(String[] args) {
        LabradorRetriever labrador = new LabradorRetriever("Luna", 12, 4, "Corto", "Labrador", "Bueno", "Blanco", "Grande","Excelente", "Inteligente");
        GatoDomestico gato = new GatoDomestico("Michi", 2, 4, "Corto", "Larga", "Por las noches", "Bueno", "Nueva raza");
        Perro perro = new Perro("Firulais", 5, 4, "corto", "Pastor Aleman", "Bueno", "Blanco", "Grande");
        Leon leon = new Leon("Simba", 8, 4, "Corto", "Largo", "Por las noches", "Larga", "Jungla");
        Canido canido = new Canido("Pelusa", 6, 4, "Corto", "Pastor Ale", "Excelente");
        Felino felino = new Felino("Simba", 8, 4, "corto", "Grande" , "Excelente");
        Ave ave = new Ave("Pelusa", 6, "Corto", "Excelente");
        Mamiferos mamifero = new Mamiferos("Pelusa", 6, 4, "Corto");
        Animal animal = new Animal("Pelusa", 6);
        //GATO DOMESTICO
        System.out.println("INFORMACION DEL GATO DOMESTICO");
        System.out.println("Nombre: " + gato.getNombre());
        System.out.println("Edad: " + gato.getEdad());
        System.out.println("Numero de patas: " + gato.getNumPatas());
        System.out.println("Tipo de pelaje: " + gato.getTipoPelaje());
        System.out.println("Longitud de la cola: " + gato.getLongitudCola());
        System.out.println("Tipo de caza: " + gato.getTipoCaza());
        System.out.println("Comportamiento doméstico: " + gato.getComportamientoDomestico());


        //LEON
        System.out.println("INFORMACION DEL LEON");
        System.out.println("Nombre: " + leon.getNombre());
        System.out.println("Edad: " + leon.getEdad());
        System.out.println("Numero de patas: " + leon.getNumPatas());
        System.out.println("Tipo de pelaje: " + leon.getTipoPelaje());
        System.out.println("Longitud de cola: " + leon.getLongitudCola());
        System.out.println("Tipo de caza: " + leon.getTipoCaza());
        System.out.println("Melena: " + leon.getMelena());
        System.out.println("Territorio de caza: " + leon.getTerritorioCaza());
        //AVES
        System.out.println("INFORMACION DEL AVE");
        System.out.println("Nombre: " + ave.getNombre());
        System.out.println("Edad: " + ave.getEdad());
        System.out.println("Tipo de plumaje: " + ave.getTipoPlumaje());
        System.out.println("Habilidad de vuelo: " + ave.puedeVolar());
        // FELINOS
        System.out.println("INFORMACION DEL FELINO");
        System.out.println("Nombre: " + felino.getNombre());
        System.out.println("Edad: " + felino.getEdad());
        System.out.println("Numero de patas: " + felino.getNumPatas());
        System.out.println("Tipo de pelaje: " + felino.getTipoPelaje());
        System.out.println("Longitud de cola: " + felino.getLongitudCola());
        System.out.println("Tipo de caza: " + felino.getTipoCaza());

        //LABRADOR RETRIEVER
        System.out.println("INFORMACION DEL LABRADOR RETRIEVER");
        System.out.println("Nombre: " + labrador.getNombre());
        System.out.println("Edad: " + labrador.getEdad());
        System.out.println("Numero de patas: " + labrador.getNumPatas());
        System.out.println("Tipo de pelaje: " + labrador.getTipoPelaje());
        System.out.println("Raza: " + labrador.getRaza());
        System.out.println("Habilidad de nadar: " + labrador.puedeNadar());
        System.out.println("Habilidad de olfato: " + labrador.tieneBuenOlfato());
        System.out.println("Color de pelaje: " + labrador.getColorPelaje());
        System.out.println("Tamaño: " + labrador.getTamano());
        System.out.println("Personalidad" + labrador.getPersonalidad());
        //PERRO
        System.out.println("INFORMACION DEL PERRO");
        System.out.println("Nombre: " + perro.getNombre());
        System.out.println("Edad: " + perro.getEdad());
        System.out.println("Numero de patas: " + perro.getNumPatas());
        System.out.println("Tipo de pelaje: " + perro.getTipoPelaje());
        System.out.println("Raza: " + perro.getRaza());
        System.out.println("Habilidad de olfato: " + perro.tieneBuenOlfato());
        System.out.println("Color de pelaje: " + perro.getColorPelaje());
        System.out.println("Tamaño: " + perro.getTamano());
        //CANIDO
        System.out.println("INFORMACION DEL CANIDO");
        System.out.println("Nombre: " + canido.getNombre());
        System.out.println("Edad: " + canido.getEdad());
        System.out.println("Numero de patas: " + canido.getNumPatas());
        System.out.println("Tipo de pelaje: " + canido.getTipoPelaje());
        System.out.println("Raza: " + canido.getRaza());
        System.out.println("Habilidad de olfato: " + canido.tieneBuenOlfato());

        //MAMIFEROS
        System.out.println("INFORMACION DEL MAMIFERO");
        System.out.println("Nombre: " + mamifero.getNombre());
        System.out.println("Edad: " + mamifero.getEdad());
        System.out.println("Numero de patas: " + mamifero.getNumPatas());
        System.out.println("Tipo de pelaje: " + mamifero.getTipoPelaje());

        //CLASE ANIMAL
        System.out.println("INFORMACION DEL ANIMAL");
        System.out.println("Nombre: " + animal.getNombre());
        System.out.println("Edad: " + animal.getEdad());
    }
}