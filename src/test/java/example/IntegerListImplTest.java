package example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class IntegerListImplTest {
    private final IntegerListImpl test = new IntegerListImpl();

    @BeforeEach
    public void setUp() {
        test.add(1);
        test.add(2);
        test.add(3);
    }

    @Test
    void add() {
        assertEquals(test.add(1), 1);
    }

    @Test
    void AddIS() {
        assertEquals(test.add(1, 2), 2);
    }

    @Test
    void set() {
        assertEquals(test.set(2, 3), 3);
    }

    @Test
    void removeStr() {
        assertEquals(test.remove(1), 2);
    }

    @Test
    void RemoveInd() {
        assertEquals(test.remove(0), 1);
    }

    @Test
    void containsTrue() {
        assertTrue(test.contains(2));
        assertTrue(test.contains(1));
    }

    @Test
    void containsFalse() {
        assertFalse(test.contains(4));
        assertFalse(test.contains(1000));
    }

    @Test
    void indexOf() {
        assertEquals(test.indexOf(2), 1);
    }

    @Test
    void lastIndexOf() {
        assertEquals(test.lastIndexOf(1), 0);
    }

    @Test
    void get() {
        assertEquals(test.get(0), 1);
    }

    @Test
    void equalsTrue() {
        IntegerListImpl test2 = new IntegerListImpl();
        test2.add(1);
        test2.add(2);
        test2.add(3);
        assertTrue(Arrays.equals(test.toArray(), test2.toArray()));
    }

    @Test
    void equalsFalse() {
        IntegerListImpl test2 = new IntegerListImpl();
        test2.add(1);
        test2.add(2);
        assertFalse(Arrays.equals(test.toArray(), test2.toArray()));
    }

    @Test
    void size() {
        assertEquals(test.size(), 3);
    }

    @Test
    void isEmptyFalse() {
        assertFalse(test.isEmpty());
    }

    @Test
    void isEmptyTrue() {
        IntegerListImpl test3 = new IntegerListImpl();
        assertTrue(test3.isEmpty());
    }

    @Test
    void clear() {
        test.clear();
        assertEquals(0, test.size());
    }

    @Test
    void toArray() {
        IntegerListImpl test4 = new IntegerListImpl();
        test4.add(1);
        test4.add(2);
        test4.add(3);
        assertArrayEquals(test4.toArray(), test.toArray());
    }
}