import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RetreiveFiveCards {

    private List<String> Figure = Figures.stream().map(Enum::name).collect(Collectors.toList());
    private List<String> Colors = ColorsOfCards.stream().map(Enum::name).collect(Collectors.toList());
    private String[]  Cards = new String[5];

    RetreiveFiveCards(){
        Random gen = new Random();
        IntStream.range(0, this.Cards.length).forEach(i -> this.Cards[i] = (this.Colors.get(gen.nextInt(3))).concat(" " + this.Figure.get(gen.nextInt(5))));
    }

    public void PrintCards(){
        for (String card : this.Cards) {
            System.out.println(card);
        }
    }

    public void RetreiveAnotherFive(){
        Random gen = new Random();
        for (int i =0 ;i < this.Cards.length;i++)
        {
            IntStream.range(0, this.Cards.length).forEach(i -> this.Cards[i] = (this.Colors.get(gen.nextInt(3))).concat(" " + this.Figure.get(gen.nextInt(5))));
        }
    }
}
