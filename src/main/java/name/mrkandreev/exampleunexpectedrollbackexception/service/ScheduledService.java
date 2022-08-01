package name.mrkandreev.exampleunexpectedrollbackexception.service;

import lombok.RequiredArgsConstructor;
import name.mrkandreev.exampleunexpectedrollbackexception.model.Item;
import name.mrkandreev.exampleunexpectedrollbackexception.repository.MainRepository;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ScheduledService {
  private final MainRepository mainRepository;

  private final MainService mainService;

  @Scheduled(fixedDelay = 1000L)
  public void invoke() {
    Item item = new Item();
    mainRepository.saveAndFlush(item);

    mainService.invoke(item.getId());
  }
}
