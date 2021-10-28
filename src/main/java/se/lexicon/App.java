package se.lexicon;

import se.lexicon.model.Denomination;

public class App
{
    public static void main( String[] args )
    {
        Denomination denomination = Denomination.SEK_1;

        System.out.println(denomination.getIntValue());
    }
}
