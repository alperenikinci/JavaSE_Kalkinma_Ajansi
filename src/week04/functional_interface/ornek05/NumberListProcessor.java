package week04.functional_interface.ornek05;

import java.util.List;

@FunctionalInterface
public interface NumberListProcessor {
    int process(List<Integer> numbers);
}
