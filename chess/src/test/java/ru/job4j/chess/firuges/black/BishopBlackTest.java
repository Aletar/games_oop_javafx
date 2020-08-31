package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BishopBlackTest {

    @Test
    public void whenBishopOnA3() {
        BishopBlack bishop = new BishopBlack(Cell.A3);
        assertThat(bishop.position(), is(Cell.A3));
    }

    @Test
    public void whenCopyBishopOnB4() {
        BishopBlack bishop = new BishopBlack(Cell.A3);
        assertThat(bishop.copy(Cell.B4).position(), is(Cell.B4));
    }

    @Test
    public void whenBishopGoFromC1ToG5() {

        BishopBlack bishop = new BishopBlack(Cell.C1);

        Cell[] steps = new Cell[4];
        steps[0] = Cell.D2;
        steps[1] = Cell.E3;
        steps[2] = Cell.F4;
        steps[3] = Cell.G5;

        assertThat(bishop.way(Cell.C1, Cell.G5), is(steps));
    }

    @Test
    public void whenBishopGoFromG5ToC1() {

        BishopBlack bishop = new BishopBlack(Cell.G5);

        Cell[] steps = new Cell[4];
        steps[0] = Cell.F4;
        steps[1] = Cell.E3;
        steps[2] = Cell.D2;
        steps[3] = Cell.C1;

        assertThat(bishop.way(Cell.G5, Cell.C1), is(steps));
    }

    @Test
    public void whenBishopGoFromF1ToB5() {

        BishopBlack bishop = new BishopBlack(Cell.F1);

        Cell[] steps = new Cell[4];
        steps[0] = Cell.E2;
        steps[1] = Cell.D3;
        steps[2] = Cell.C4;
        steps[3] = Cell.B5;

        assertThat(bishop.way(Cell.F1, Cell.B5), is(steps));
    }

    @Test
    public void whenBishopGoFromB5ToF1() {

        BishopBlack bishop = new BishopBlack(Cell.B5);

        Cell[] steps = new Cell[4];
        steps[0] = Cell.C4;
        steps[1] = Cell.D3;
        steps[2] = Cell.E2;
        steps[3] = Cell.F1;

        assertThat(bishop.way(Cell.B5, Cell.F1), is(steps));
    }

}
