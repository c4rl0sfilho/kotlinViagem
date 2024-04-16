package br.senai.sp.jandira.viagem.repository

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import br.senai.sp.jandira.viagem.R
import br.senai.sp.jandira.viagem.model.Viagem
import java.time.LocalDate

class ViagemRepository {

    @Composable
    fun listarTodasAsViagens(context: Context): List<Viagem>{

        val viagemLondres = Viagem()
        viagemLondres.id = 1
        viagemLondres.destino = "Londres"
        viagemLondres.descricao = "London, the capital of England and the United Kingdom, is a 21st-century city with history stretching back to Roman times."
        viagemLondres.dataChegada = LocalDate.of(2023, 7, 18)
        viagemLondres.dataPartida = LocalDate.of(2023, 7, 25)
        viagemLondres.imagem = painterResource(id = R.drawable.london)

        val viagemParis = Viagem()
        viagemParis.id = 2
        viagemParis.destino = "Paris"
        viagemParis.descricao = "Paris, France's capital, is a major European city and a global center for art, fashion, gastronomy and culture."
        viagemParis.dataChegada = LocalDate.of(2023, 7, 25)
        viagemParis.dataPartida = LocalDate.of(2023, 7, 29)
        viagemParis.imagem = null
        //painterResource(id = R.drawable.paris)

        val viagemGrecia = Viagem()
        viagemGrecia.id = 3
        viagemGrecia.destino = "Grecia"
        viagemGrecia.descricao = "Greece is a country in southeastern Europe with thousands of islands throughout the Aegean and Ionian seas. "
        viagemGrecia.dataChegada = LocalDate.of(2023, 7, 18)
        viagemGrecia.dataPartida = LocalDate.of(2023, 7, 25)
        viagemGrecia.imagem = painterResource(id = R.drawable.grecia)

        val viagemBankok = Viagem()
        viagemBankok.id = 4
        viagemBankok.destino = "Bankok"
        viagemBankok.descricao = "Bangkok, Thailand’s capital, is a large city known for ornate shrines and vibrant street life."
        viagemBankok.dataChegada = LocalDate.of(2023, 7, 18)
        viagemBankok.dataPartida = LocalDate.of(2023, 7, 25)
        viagemBankok.imagem = painterResource(id = R.drawable.bankok)

        val viagemNewYork = Viagem()
        viagemNewYork.id = 5
        viagemNewYork.destino = "NewYork"
        viagemNewYork.descricao = "New York City comprises 5 boroughs sitting where the Hudson River meets the Atlantic Ocean."
        viagemNewYork.dataChegada = LocalDate.of(2023, 7, 18)
        viagemNewYork.dataPartida = LocalDate.of(2023, 7, 25)
        viagemNewYork.imagem = painterResource(id = R.drawable.newyork)

        val viagens = listOf(viagemGrecia, viagemBankok, viagemLondres, viagemParis, viagemNewYork)

        return viagens
    }
}