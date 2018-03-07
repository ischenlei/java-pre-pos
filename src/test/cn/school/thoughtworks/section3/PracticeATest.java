package cn.school.thoughtworks.section3;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class PracticeATest {
    private PracticeA practiceA = null;

    @Before
    public void setUp() throws Exception {
        practiceA = new PracticeA();
    }

    @Test
    public void create_update_elements_should_return_an_array_with_same_elements_in_two_collections() throws Exception {
        //选出A集合中元素的key属性跟B对象中value属性中的元素相同的元素,把他们的count-1，输出减过之后的新A集合
        Map<String, Integer> collection1 = new HashMap<String, Integer>() {{
            put("a", 2);
            put("e", 2);
            put("h", 2);
            put("t", 2);
            put("f", 2);
            put("c", 2);
            put("g", 2);
            put("b", 2);
            put("d", 2);
        }};

        List<String> list = Arrays.asList("a", "d", "e", "f");
        Map<String, List<String>> collection2 = new HashMap<>();
        collection2.put("value", list);

        Map<String, Integer> result = practiceA.createUpdatedCollection(collection1, collection2);
        Map<String, Integer> expectedResult = new HashMap<String, Integer>() {{
            put("a", 1);
            put("e", 1);
            put("h", 2);
            put("t", 2);
            put("f", 1);
            put("c", 2);
            put("g", 2);
            put("b", 2);
            put("d", 1);
        }};

        assertEquals(result, expectedResult);
    }
}
