import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.stream.Stream;

public enum ColorsOfCards {
    SPADES  ,
    HEARTS  ,
    CLUBS   ,
    DIAMONDS;



    ColorsOfCards() {
    }

    @Contract(pure = true)
    public @NotNull String GetName(){
        return ColorsOfCards.super.name();
    }

    public static Stream<ColorsOfCards> stream(){
        return Stream.of(ColorsOfCards.values());
    }
}
