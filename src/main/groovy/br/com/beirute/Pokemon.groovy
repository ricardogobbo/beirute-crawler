package br.com.beirute

/**
 * Created by ricardo.gobbo on 09/11/2017.
 */
class Pokemon {

    Integer id
    String nome

    Double lat
    Double lon

    Date dataDesaparecimento

    @Override
    String toString() {
        return String.sprintf("%03d", id) + ": " +
                String.sprintf("%-12s", nome) +
                "Pos: " +
                String.sprintf("%.7f", lat).replace(',','.') + ", " +
                String.sprintf("%.7f", lon).replace(',','.') + "  Des: " +
                dataDesaparecimento.format("dd/MM/yyyy hh:mm:ss")
    }
}
