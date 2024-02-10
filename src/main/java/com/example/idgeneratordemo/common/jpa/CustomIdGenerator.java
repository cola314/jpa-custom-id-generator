package com.example.idgeneratordemo.common.jpa;

import com.example.idgeneratordemo.common.spring.ApplicationContextProvider;
import com.example.idgeneratordemo.service.KeyGeneratorService;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class CustomIdGenerator implements IdentifierGenerator {
    @Override
    public Object generate(SharedSessionContractImplementor session, Object object) {
        var keyGenerator = ApplicationContextProvider.applicationContext().getBean(KeyGeneratorService.class);
        return keyGenerator.generate();
    }
}
