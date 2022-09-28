public abstract class Oral extends Examen {
    private NivelDeSatisfaccion nivelDeSatisfaccion;

    public Oral(NivelDeSatisfaccion nivelDeSatisfaccion) {
        this.nivelDeSatisfaccion = nivelDeSatisfaccion;
    }

    public NivelDeSatisfaccion getNivelDeSatisfaccion() {
        return nivelDeSatisfaccion;
    }

    public void setNivelDeSatisfaccion(NivelDeSatisfaccion nivelDeSatisfaccion) {
        this.nivelDeSatisfaccion = nivelDeSatisfaccion;
    }

    @Override
    public boolean aprobado() {
    if(this.nivelDeSatisfaccion.equals("INSUFICIENTE") || this.nivelDeSatisfaccion.equals("EXCELENTE")) return true;
    else return false;
    }
}
