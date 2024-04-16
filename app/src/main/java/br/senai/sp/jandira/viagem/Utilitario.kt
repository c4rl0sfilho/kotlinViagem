package br.senai.sp.jandira.viagem

import java.time.LocalDate

fun SimplificarData(dataExtenso: LocalDate): String{

    val dia = dataExtenso.dayOfMonth.toString()
    val mes = dataExtenso.month.toString().substring(0..2)

    return "$dia - $mes"
}