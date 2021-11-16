package org.taktik.couchdb.handlers

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonDeserializer
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter

class RFC1123DateTimeDeserializer : JsonDeserializer<ZonedDateTime>() {
    override fun deserialize(
            p: JsonParser?,
            ctxt: DeserializationContext?
    ): ZonedDateTime = ZonedDateTime.parse(p?.valueAsString, DateTimeFormatter.RFC_1123_DATE_TIME)
}
