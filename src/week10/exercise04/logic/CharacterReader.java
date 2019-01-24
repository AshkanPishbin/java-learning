package week10.exercise04.logic.data.logic;

import week10.exercise04.logic.data.data.CharacterPerformance;
import week10.exercise04.logic.data.reader.FileReader;

import java.util.List;
import java.util.stream.Collectors;

public class CharacterReader {
    public List<CharacterPerformance> getPerformance() {
        return new FileReader().asList("week10/exercise04/logic/data/refrence/got-characters.csv").stream()
                .skip(1)
                .map(s -> s.split(";"))
                .map(s -> new CharacterPerformance(
                        s[0],
                        s[1],
                        s[2],
                        s[3],
                        s[4],
                        s[5],
                        s[6],
                        s[7],
                        s[8],
                        s[9],
                        s[10],
                        s[11],
                        s[12]
                ))
                .collect(Collectors.toList());
    }
}
