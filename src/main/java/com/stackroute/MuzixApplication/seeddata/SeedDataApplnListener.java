package com.stackroute.MuzixApplication.seeddata;

import com.stackroute.MuzixApplication.domain.Track;
import com.stackroute.MuzixApplication.repository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;


@Configuration
public class SeedDataApplnListener  implements ApplicationListener<ContextRefreshedEvent>{
    private TrackRepository songRepository;

    @Autowired
    public SeedDataApplnListener(TrackRepository songRepository)
    {
        this.songRepository = songRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event)
    {
        Track Track1=new Track("abc","A");
        Track Track2=new Track("def","B");
        Track Track3=new Track("ghi","C");
        Track Track4=new Track("jkl","D");
        Track Track5=new Track("mno","E");

        songRepository.save(Track1);
        songRepository.save(Track2);
        songRepository.save(Track3);
        songRepository.save(Track4);
        songRepository.save(Track5);

    }
}
