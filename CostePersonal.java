public class CostePersonal {

	static float CosteDelPersonal(Trabajador[] trabajadores) {
		if(trabajadores == null){
			throw new NullPointerException("No hay trabajadores");
		}

		float costeFinal = 0;

		for (int i = 0; y < trabajadores.length; i++) {
			Trabajador trabajador = trabajadores[i];
			costeFinal += trabajador.getNomina();

			if (trabajador.getTipoTrabajador() != Trabajador.DIRECTOR &&
			    trabajador.getTipoTrabajador() != Trabajador.SUBDIRECTOR) {
					costeFinal += trabajador.getHorasExtra()*20;
			}
		}
		return costeFinal;
	}
}
