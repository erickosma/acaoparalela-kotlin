package com.acaopara

import javax.ws.rs.Path
import javax.ws.rs.DELETE

import javax.ws.rs.POST

import javax.ws.rs.GET

import java.util.LinkedHashMap
import javax.ws.rs.core.MediaType

import java.util.Collections
import javax.ws.rs.Consumes
import javax.ws.rs.Produces


@Path("/fruits")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
class FruitResource {
    private val fruits = Collections.newSetFromMap(Collections.synchronizedMap(LinkedHashMap<Fruit, Boolean>()))

    fun FruitResource() {
        fruits.add(Fruit("Apple", "Winter fruit"))
        fruits.add(Fruit("Pineapple", "Tropical fruit"))
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    fun list(): Set<Fruit>? {
        return fruits
    }

    @POST
    fun add(fruit: Fruit): Set<Fruit>? {
        fruits.add(fruit)
        return fruits
    }

    @DELETE
    fun delete(fruit: Fruit): Set<Fruit>? {
        fruits.removeIf { (name) -> name.contentEquals(fruit.name) }
        return fruits
    }

}