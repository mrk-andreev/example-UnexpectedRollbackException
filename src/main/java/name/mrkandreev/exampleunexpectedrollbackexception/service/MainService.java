package name.mrkandreev.exampleunexpectedrollbackexception.service;

import java.util.UUID;
import lombok.RequiredArgsConstructor;
import name.mrkandreev.exampleunexpectedrollbackexception.repository.MainRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class MainService {
  private final MainRepository mainRepository;

  private final SecondService secondService;

  @Transactional
  public void invoke(long itemId) {
    var item = mainRepository.findById(itemId).orElseThrow();
    try {
      secondService.invoke(itemId);
    } catch (RuntimeException e) {
      item.setValue(UUID.randomUUID().toString());
      mainRepository.saveAndFlush(item);
    }
  }
}
