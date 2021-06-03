import org.junit.Test;

import static org.junit.Assert.*;

public class QuickSortTest {
    @Test
    public void testPartition() throws Exception{
        QuickSort Partit = new QuickSort();
        int[] array = { 4, 6, 5, 3, 1, 7, 2,10 };
        int partActual=Partit.partition(array,0,6);
        int partExpected=3;
        assertEquals(partExpected,partActual);

    }

    @Test
    public void testQuickSort() {
        QuickSort QS = new QuickSort();
        int[] arrayActual = { 4, 6, 5, 3, 1, 7, 2,10 };
        QS.quickSort(arrayActual,0,6);
        int[] arrayExpected={1,2,3,4,5,6,7,10};
        assertArrayEquals(arrayExpected,arrayActual);
    }

    @Test
    public void quickSortString() {
        QuickSort QS = new QuickSort();
        String[] StringarrayActual = { "lesha", "nikita", "pasha", "koly", "max", "anton","alex" };

        QS.quickSortString(StringarrayActual,0,6);
        String[] StringarrayExpected={"alex", "anton", "koly", "lesha", "max", "nikita", "pasha"};
        assertArrayEquals(StringarrayExpected,StringarrayActual);
    }

    @Test
    public void partitionForString() {
        QuickSort Partit1 = new QuickSort();
        String[] Stringarray = { "lesha", "nikita", "pasha", "koly", "max", "anton","alex" };
        int partActual=Partit1.partitionForString(Stringarray,0,6);
        int partExpected=3;
        assertEquals(partExpected,partActual);
    }
}