package name.mrkandreev.exampleunexpectedrollbackexception.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class SecondService {
  @Transactional
  public void invoke(long itemId) {
    throw new IllegalArgumentException(String.valueOf(itemId));
  }
}
