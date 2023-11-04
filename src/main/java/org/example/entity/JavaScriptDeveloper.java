package org.example.entity;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("jsDeveloper")
public class JavaScriptDeveloper implements Developer{
    @Override
    public String getCode() {
        return "1 + 1 = 11";
    }
}
