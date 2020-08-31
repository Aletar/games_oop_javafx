package ru.job4j.chess;

import org.junit.Test;
import ru.job4j.chess.Logic;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;

import java.util.Locale;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class LogicTest {

    @Test
    public void whenCanMove() {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.A1));
        assertThat(logic.move(Cell.A1, Cell.H8), is(true));
    }

    @Test
    public void whenCantMove() {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.A1));
        logic.add(new BishopBlack(Cell.E5));
        assertThat(logic.move(Cell.A1, Cell.H8), is(false));
    }
}