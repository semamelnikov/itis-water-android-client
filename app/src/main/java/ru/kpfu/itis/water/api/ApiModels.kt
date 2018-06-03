package ru.kpfu.itis.water.api

/**
 * Created by Melnikov Semyon on 03.06.18.
 * Higher School ITIS KFU
 */

class ItisWaterLoginResponse(val isValid: Boolean, val userId: Long)

class ItisWaterLoginRequest(val login: String, val password: String)

class ItisWaterTicketResponse(val data: List<ItisWaterTicketDataResponse>)

class ItisWaterTicketDataResponse(
        val id: Long,
        val text: String,
        val status: String,
        val date: String
)