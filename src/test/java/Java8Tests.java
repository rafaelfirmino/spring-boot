import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Created by rafaelfirmino on 03/12/15.
 */
@RunWith(MockitoJUnitRunner.class)
public class Java8Tests {

    @Test
    public void forEachTest(){
        List<String> list = Arrays.asList("muito grande", "maior", "grande", "tiny");
        list
        .stream()
        .filter(s -> s.startsWith("m"))
        .map(String::toUpperCase)
                    .sorted()
                    .forEach(System.out::println);

        IntStream.range(1, 4)
                .map(n -> n + 1)
                .average()
                .ifPresent(System.out::println);

        list
                .stream()
                .map(s -> s.toUpperCase())
                .reduce((s1, s2) -> s1.length() > s2.length() ? s1 : s2)
                .ifPresent(System.out::println);
    }
}
