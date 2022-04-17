package atechie.io.dsa.search;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

class LinearSearchTest {

    @Test
    @DisplayName("Given an array of Integers, When number is found in array, Returns index")
    void givenAnArrayOfIntegersWhenNumberIsFoundInArrayReturnsIndex() {
        int[] numbers = {1, 2, 4, 5, 10, 20};
        LinearSearch linearSearch = new LinearSearch();
        int index = linearSearch.search(numbers, 5);

        assertThat(index, equalTo(3));
    }

    @Test
    @DisplayName("Given an array of Integers, When number is not found in array, Returns index as -1")
    void givenAnArrayOfIntegersWhenNumberIsNotFoundInArrayReturnsIndexAs1() {
        int[] numbers = {1, 2, 4, 5, 10, 20};
        LinearSearch linearSearch = new LinearSearch();
        int index = linearSearch.search(numbers, 50);

        assertThat(index, equalTo(-1));
    }

    @Test
    @DisplayName("Given an array of Integers, When array size is not greater than 0, Returns index as -1")
    void givenAnArrayOfIntegersWhenArraySizeIsNotGreaterThan0ReturnsIndexAs1() {
        int[] numbers = {};
        LinearSearch linearSearch = new LinearSearch();
        int index = linearSearch.search(numbers, 50);

        assertThat(index, equalTo(-1));
    }
}
