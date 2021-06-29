package saveTheRopa;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRoupa {
    private Integer id = 0;
    private Map<Integer, List<Vestuario>> vestuarios = new HashMap<>();

    public GuardaRoupa() {
        this.id++;
    }

    public Integer guardarVestuario(List<Vestuario> listaDeVestuario) {
        this.vestuarios.put(this.id, listaDeVestuario);

        return this.id;
    }

    public void mostrarVestuarios() {
        for (Map.Entry<Integer, List<Vestuario>> guardaRoupa : this.vestuarios.entrySet()) {
            int key = guardaRoupa.getKey();
            List<Vestuario> vestuarios = guardaRoupa.getValue();

            vestuarios.forEach(vestuario -> System.out.println(key + ": " + vestuario));
        }
    }

    public List devolverVestuario(Integer id) {
        if (this.vestuarios.containsKey(id)) {
            List<Vestuario> vestuarioRemovido = this.vestuarios.remove(id);

            return vestuarioRemovido;
        }

        return null;
    }
}
