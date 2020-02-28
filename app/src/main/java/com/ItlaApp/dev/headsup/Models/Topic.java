package com.ItlaApp.dev.headsup.Models;

import org.json.JSONArray;
import org.json.JSONException;

public class Topic {

    public String name;
    public String[] subjects;

    public static JSONArray getTopics() throws JSONException {

        String topics        = "[{\"title\":\"Animales\",\"subjects\":[\"Elefante\",\"Araña\",\"Águila\",\"Rata\",\"Cuervo\",\"Koala\",\"Hormiga\",\"Murciélago\",\"Humano\",\"Chimpancé\",\"Caballo\",\"Topo\",\"Gusano\",\"Búho\",\"Caimán\",\"Cangrejo\",\"Mosquito\",\"Ardilla\",\"Caracol\",\"Ratón\",\"Camaleón\",\"Venado\",\"Mapache\",\"Alce\",\"Antílope\",\"Castor\",\"Comadreja\",\"Erizo\",\"Hurón\",\"Lobo\",\"Lince\",\"Marmota\",\"Oso\",\"Pantera\",\"Topo\"]}," +
                "{\"title\":\"Profesiones\",\"subjects\":[\"Cantante\",\"Peluquero\",\"Camarero\",\"Piloto\",\"Jueza\",\"Deportista\",\"Granjero\",\"Contable\",\"Actor / Actriz\",\"Arqueólogo\",\"Arquitecto\",\"Astronauta\",\"Panadero\",\"Biólogo/a\",\"Albañil\",\"Carnicero/a\",\"Carpintero/a\",\"Cajero/a\",\"Payaso\",\"Zapatero\",\"Consultor\",\"Cocinero\",\"Bailarín\",\"Decorador\",\"Dentista\",\"Diseñador\",\"Granjero\",\"Bombero\",\"Pescador\",\"Florista\",\"Jardinero/a\",\"Peluquero/a\",\"Cazador\",\"Periodista\",\"Juez\",\"Abogado/a\",\"Bibliotecario/a\",\"Mecánico/a\",\"Minero/a\",\"Modelo\",\"Monje\",\"Niñera\",\"Monja\",\"Enfermero/a\",\"Pintor\",\"Fotógrafo\",\"Fontanero\",\"Policía\",\"Político\",\"Conserje\",\"Cura\",\"Programador\",\"Psiquiatra\",\"Psicólogo/a\",\"Recepcionista\",\"Investigador\",\"Marinero/a\",\"Vendedor\",\"Científico\",\"Secretario\",\"Cantante\",\"Trabajador social\",\"Deportista\",\"Cirujano\",\"Taxista\"]}]";
        return new JSONArray(topics);

    }

}
