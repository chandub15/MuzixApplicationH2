package com.stackroute.MuzixApplication.seeddata;



import com.stackroute.MuzixApplication.domain.Track;
import com.stackroute.MuzixApplication.repository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SeedDataCmdLineRunner implements CommandLineRunner {
    private TrackRepository trackRepository;

    @Autowired
    public SeedDataCmdLineRunner(TrackRepository trackRepository)
    {
        this.trackRepository = trackRepository;
    }

    @Override
    public void run(String... args) throws Exception
    {
        Track Track1=Track.builder()
                .name("abc")
                .comment("A")
                .build();

        Track Track2=Track.builder()
                .name("def")
                .comment("B")
                .build();

        Track Track3=Track.builder()
                .name("ghi")
                .comment("C")
                .build();

        Track Track4=Track.builder()
                .name("jkl")
                .comment("D")
                .build();

        Track Track5=Track.builder()
                .name("mno")
                .comment("E")
                .build();

        Track Track6=Track.builder()
                .name("pqr")
                .comment("F")
                .build();


        trackRepository.save(Track1);
        trackRepository.save(Track2);
        trackRepository.save(Track3);
        trackRepository.save(Track4);
        trackRepository.save(Track5);
        trackRepository.save(Track6);
    }
}
