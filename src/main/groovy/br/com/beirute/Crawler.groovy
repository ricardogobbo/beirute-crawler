package br.com.beirute

import br.com.beirute.cidades.Goiania
import br.com.beirute.cidades.RioDeJaneiro
import br.com.beirute.cidades.SaoPaulo
import br.com.beirute.cidades.Vitoria
import groovy.json.JsonSlurper
import groovy.json.JsonSlurperClassic
import org.jsoup.Jsoup
import org.jsoup.nodes.Document

import javax.swing.JOptionPane

class Crawler {

    public void execute() {


        List<DataAndHeader> cidades = [new SaoPaulo(), new RioDeJaneiro(), new Vitoria(), new Goiania()]

        while (true) {
            cidades.each { cidade ->
                try {

                    Document doc =
                            Jsoup.connect(cidade.getUrl())
                                    .headers(cidade.getHeaders())
                                    .data(cidade.getData())
                                    .post()

                    def a = new JsonSlurper()
                    def b = a.parseText(doc.text())
                    List<Pokemon> pokemons = []
                    b.pokemons.each { aa ->
                        Pokemon pokemon = new Pokemon()
                        pokemon.id = aa.value.pokemon_id
                        pokemon.nome = aa.value.pokemon_name
                        pokemon.lat = aa.value.latitude
                        pokemon.lon = aa.value.longitude
                        pokemons << pokemon
                        if (pokemon.id == 201)
                            JOptionPane.showMessageDialog(null, "UNOWN!!!!!!!!!!!")
                    }

                    pokemons.sort { it.id }

                    println '======================================================================================================================================================'
                    println cidade.name
                    println '======================================================================================================================================================'
                    pokemons.eachWithIndex { pokemon, i ->
                        print pokemon
                        println "      "
                        //if(i % 3 == 2)
                            //println ''
                    }
                    //println ''
                    println '------------------------------------------------------------------------------------------------------------------------------------------------------'
                    println ''
                    println ''
                } catch (e){
                    println "ERRO NA CIDADE: " + cidade.name
                }
            }

            println ''
            println '    FIM'
            println '    Aguarde 1 min para a atualização'
            println ''
            Thread.sleep(100000)
        }
    }

}
