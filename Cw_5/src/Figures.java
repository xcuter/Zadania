import java.util.stream.Stream;

public enum Figures {
    NINE,
    TEN,
    JACK,
    QUEEN,
    KING,
    ACE;
    


    Figures(){
    }


    public String GetName(){
            return Figures.super.name();
    }

    public static Stream<Figures> stream(){
        return Stream.of(Figures.values());
    }
}
