package online.javafun.mvc;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class RandomNumberService {
    private final Random random = new Random();

    int generateRandomInRange(int start, int end) {
        int range = end - start;
        int randomNumber = random.nextInt(range);
        return start + randomNumber;
    }
}
