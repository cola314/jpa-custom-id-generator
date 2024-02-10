package com.example.idgeneratordemo;

import com.example.idgeneratordemo.entity.MyEntity;
import com.example.idgeneratordemo.repository.MyEntityRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class ApplicationCommandLineRunner implements CommandLineRunner {
    private final MyEntityRepository myEntityRepository;

    @Override
    public void run(String... args) throws Exception {
        var entity = myEntityRepository.save(new MyEntity());
        log.info(entity.id());
    }
}
