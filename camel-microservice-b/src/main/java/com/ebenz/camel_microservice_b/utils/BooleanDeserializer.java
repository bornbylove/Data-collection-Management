package com.ebenz.camel_microservice_b.utils;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;

public class BooleanDeserializer extends JsonDeserializer {
    @Override
    public Boolean deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JacksonException {
        String value = jsonParser.getText();
        if ("Yes".equalsIgnoreCase(value) || "true".equalsIgnoreCase(value)){
            return true;
        } else if ("No".equalsIgnoreCase(value) || "false".equalsIgnoreCase(value)) {
            return false;
        }
        throw new IOException("Invalid Boolean Value");
    }
}
