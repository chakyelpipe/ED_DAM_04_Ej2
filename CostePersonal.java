public class CostePersonal {

    static float calcularCostePersonal(Trabajador[] trabajadores) {
        float costeTotal = 0;
        for (Trabajador trabajador : trabajadores) {
            costeTotal += calcularCosteTrabajador(trabajador);
        }
        return costeTotal;
    }

    private static float calcularCosteTrabajador(Trabajador trabajador) {
        if (trabajador.esDirector() || trabajador.esSubdirector()) {
            return trabajador.getNomina();
        } else {
            return trabajador.getNomina() + (trabajador.getHorasExtras() * 20);
        }
    }
}
