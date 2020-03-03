import java.security.SecureRandom;
import allConstants.Constantes;

public class Persona{
    //Atributos
    private String strNombre;
    private String strApellidos;
    private String strDNI;
    private char charSexo;
    private int intEdad;
    private double dblPeso;
    private double dblEstatura;
    //Fin atributos

    //Constructores
    public Persona(){
        this.strNombre = "";
        this.strApellidos = "";
        this.charSexo = Constantes.SEXO_DEFAULT;
        this.intEdad = 0;
        this.dblPeso = 0;
        this.dblEstatura = 0;
        this.strDNI = this.generarDNI();
    }

    public Persona(String strNombre, String strApellidos, int intEdad, char charSexo){
        this.strNombre = strNombre;
        this.strApellidos = strApellidos;
        this.charSexo = comprobarSexo(charSexo);
        this.intEdad = intEdad;
        this.dblPeso = 0;
        this.dblEstatura = 0;
        this.strDNI = this.generarDNI();
    }

    public Persona(String strNombre, String strApellidos, int intEdad, char charSexo, double dblPeso, double dblEstatura){
        this.strNombre = strNombre;
        this.strApellidos = strApellidos;
        this.charSexo = comprobarSexo(charSexo);
        this.intEdad = intEdad;
        this.dblPeso = dblPeso;
        this.dblEstatura = dblEstatura;
        this.strDNI = this.generarDNI();
    }
    //Fin constructores


    //Metodos

    /*Este método genera el DNI
      de la persona
    */
    private String generarDNI(){
        String strGenDNI = "";

        int numDNIGen = generarNumeroAleatorioDNI();

        char letraParaDNI = generarLetraParaElDNI(numDNIGen);

        strGenDNI = numDNIGen + Character.toString(letraParaDNI) ;

        return strGenDNI;
    }


    /*Este método genera un numero
      aleatorio de 8 cifras
     */
    public int generarNumeroAleatorioDNI(){
        SecureRandom generadorDeNumero = new SecureRandom();
        int numDNIGen;

        numDNIGen = 9999999 + generadorDeNumero.nextInt(90000000);

        return numDNIGen;
    }


    /*Este método genera una letra para completar el DNI segun el
      número aleatorio generado en el método generarNumeroAleatorioDNI().
      Recibe como parametro el numero de 8 cifras y retorna la letra
     */

    public char generarLetraParaElDNI(int numeroDNI) {
        char letraParaDNI;
        int idLetra = numeroDNI % 23;

        char [] tablaDeLetrasDNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D',
                                    'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L',
                                    'C', 'K', 'E'};


        letraParaDNI = tablaDeLetrasDNI [idLetra];
        return letraParaDNI;
    }


    /*Este metodo valida si el sexo introducido fué H ó M*/
    private char comprobarSexo(char sexo){
        char sexoAsignado = Constantes.SEXO_DEFAULT;
        switch(Character.toUpperCase(sexo)){
            case 'M':
                sexoAsignado = 'M';
                break;
            case Constantes.SEXO_DEFAULT:
                sexoAsignado = Constantes.SEXO_DEFAULT;
                break;
            default:
                //Asignar H al sexo si se introdujo una opcion oncorrecta
        }
        return sexoAsignado;
    }

    /*Este método evalúa el peso de la persona e indica
      informacion acerca de su peso
     */
    public String verificarPeso(){
        int nivelPeso = this.calcularIMC();
        String informacionPeso = "";

        switch(nivelPeso){
            case Constantes.ID_PESO_BAJO:
                informacionPeso = Constantes.PESO_BAJO;
                break;
            case Constantes.ID_PESO_NORMAL:
                informacionPeso = Constantes.PESO_NORMAL;
                break;
            case Constantes.ID_SOBREPESO:
                informacionPeso = Constantes.SOBREPESO;
                break;
            default:
                informacionPeso = Constantes.MSG_ERROR_PESO;
        }
        return informacionPeso;
    }


    /*Este método calcula el índice de masa corporal de la persona
      retorna -1 si está bajo de peso
      retorna 0 si está en peso normal
      retorna 1 si está en sobrepeso
    */
    private int calcularIMC(){

        double valorIMC = this.getPeso() / (Math.pow(this.getEstatura(), 2));
        int infoPeso = 0;

        if(valorIMC < 20){

            infoPeso = Constantes.ID_PESO_BAJO;

        }else if(valorIMC <= 25){

            infoPeso = Constantes.ID_PESO_NORMAL;

        }else if(!Double.isNaN(valorIMC)){

            infoPeso = Constantes.ID_SOBREPESO;

        }else{

            infoPeso = Constantes.ERROR_PESO;

        }
        return infoPeso;
    }


    /*Este metodo valida si la persona es mayor de edad
      retorna verdadero si es mayor de edad o
      retorna falso si no lo es
     */
    public boolean esMayorDeEdad(){

        return this.getEdad() >= Constantes.MAYOR_DE_EDAD;

    }

    public String verificarEdad(){

        return !this.esMayorDeEdad() ? Constantes.ES_MENOR_DE_EDAD : Constantes.ES_MAYOR_DE_EDAD;
    }

    //Fin metodos


    //Getters
    public String getNombre(){
        return this.strNombre;
    }

    public String getApellidos(){
        return this.strApellidos;
    }

    public String getDNI(){
        return this.strDNI;
    }

    public char getSexo(){
        return this.charSexo;
    }

    public int getEdad(){
        return this.intEdad;
    }

    public double getPeso(){
        return this.dblPeso;
    }

    public double getEstatura(){
        return this.dblEstatura;
    }
    //Fin Getters


    //Setters
    public void setNombre(String strNombre){
        this.strNombre = strNombre;
    }

    public void setApellidos(String strApellidos){
        this.strApellidos = strApellidos;
    }

    public void setSexo(char charSexo){
        this.charSexo = this.comprobarSexo(charSexo);
    }

    public void setEdad(int intEdad){
        this.intEdad = intEdad;
    }

    public void setPeso(double dblPeso){
        this.dblPeso = dblPeso;
    }

    public void setEstatura(double dblEstatura){
        this.dblEstatura = dblEstatura;
    }
    //Fin Setters


    @Override
    public String toString() {
        return  "Nombre: " + this.getNombre() + "\n" +
                "Apellidos: " + this.getApellidos() + "\n" +
                "DNI: " + this.getDNI() + "\n" +
                "Sexo: " + this.getSexo() + "\n" +
                "Edad: " + this.getEdad() + "\n" +
                this.verificarEdad() + "\n" +
                "Peso: " + this.getPeso() + "\n" +
                "Nivel de peso: " + this.verificarPeso() + "\n" +
                "Estatura: " + this.getEstatura();
    }
}
