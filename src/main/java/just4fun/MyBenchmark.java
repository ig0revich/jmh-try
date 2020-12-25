package just4fun;

import org.openjdk.jmh.annotations.Benchmark;
import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class MyBenchmark {

    @Benchmark
    public void testMethod() {
	int[] arr = {1, 23, 5, 0, 45, 33, 222, 90, 76, 1, 34, 5, 76};

        int n = arr.length;
        for(int i=0; i<n-1; i++) { // IntStream.range(0, n - 1)
          for(int j=1; j<n-i; j++) { //       .flatMap(i -> IntStream.range(1, n - i))
                 //.forEach(j -> {
                    if (arr[j - 1] > arr[j]) {
                       int temp = arr[j];
                       arr[j] = arr[j - 1];
                       arr[j - 1] = temp;
                    }
                // });
           }
	}
    }

}
