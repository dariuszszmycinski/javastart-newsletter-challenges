
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;

public class NamesStatistic {

    private static final String FILE_NAME = "Popular_Baby_Names.csv";

    public static void main(String[] args) throws FileNotFoundException {
        HashSet<Name> namesFullData = readFile(FILE_NAME);
        ArrayList<SimpleName> simpleNames = namesToSimpleNames(namesFullData);

        //10 najpopularniejszych imion
        top10(simpleNames);

        //najpopularniejsze imię żeńskie
        topFemale(simpleNames);

        //najpopularniejsze litery
        top3Letters(simpleNames);

    }

    private static HashSet readFile(String fileName) throws FileNotFoundException {
        HashSet<Name> namesFullData = new HashSet<>();
        Scanner scanner = new Scanner(new File(fileName));
        scanner.nextLine();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] lineSplited = line.split(",");
            Name name = new Name(Integer.parseInt(lineSplited[0]), lineSplited[1], lineSplited[2], lineSplited[3].toLowerCase(), Integer.parseInt(lineSplited[4]), Integer.parseInt(lineSplited[5]));
            namesFullData.add(name);
        }
        return namesFullData;
    }

    private static ArrayList namesToSimpleNames(HashSet<Name> names) {
        ArrayList<SimpleName> simpleNames = new ArrayList<>();
        for (Name n : names) {
            String name = n.getFirstName();
            String sex = n.getSex();
            int count = n.getCount();
            SimpleName simpleName = new SimpleName(name, sex);
            if (simpleNames.contains(simpleName)) {
                simpleName.setCount(simpleName.getCount() + count);
            } else {
                simpleName.setCount(count);
                simpleNames.add(simpleName);
            }
        }
        simpleNames.sort(Comparator.comparing(SimpleName::getName));
        return simpleNames;
    }

    private static void top10(ArrayList<SimpleName> simpleNames) {
        simpleNames.sort(Comparator.comparingInt(SimpleName::getCount));
        System.out.println("Top 10 najpopularniejszych imion:");
        for (int i = 0; i < 10; i++) {
            System.out.println(simpleNames.get(simpleNames.size() - 1 - i));
        }
    }

    private static void topFemale(ArrayList<SimpleName> simpleNames) {
        List<SimpleName> femaleNames = simpleNames
                .stream()
                .filter(n -> n.getSex().equals("FEMALE"))
                .sorted(Comparator.comparingInt(SimpleName::getCount))
                .collect(Collectors.toList());
        femaleNames.sort(Comparator.comparingInt(SimpleName::getCount));
        System.out.println("\nNajpopularniejsze imię żeńskie:");
        System.out.println(femaleNames.get(femaleNames.size() - 1));
    }

    private static void top3Letters(ArrayList<SimpleName> simpleNames) {


        Map<Character, Integer> letters = new HashMap<>();

        for (SimpleName s : simpleNames) {
            char firstChar = s.getName().charAt(0);
            int count = s.getCount();
            if (letters.containsKey(firstChar)) {
                letters.put(firstChar, letters.get(firstChar) + 1);
            } else {
                letters.put(firstChar, 1);
            }
        }
        System.out.println("\nNajpopularniejsze są imiona na literę:");

        int maxValueInMap=(Collections.max(letters.values()));
        for (Map.Entry<Character, Integer> entry : letters.entrySet()) {
            if (entry.getValue()==maxValueInMap) {
                System.out.println(entry.getKey()+" "+entry.getValue());
                entry.setValue(0);
            }
        }
        int secondMaxValueInMap=(Collections.max(letters.values()));
        for (Map.Entry<Character, Integer> entry : letters.entrySet()) {
            if (entry.getValue()==secondMaxValueInMap) {
                System.out.println(entry.getKey()+" "+entry.getValue());
                entry.setValue(0);
            }
        }
        int thirdMaxValueInMap=(Collections.max(letters.values()));
        for (Map.Entry<Character, Integer> entry : letters.entrySet()) {
            if (entry.getValue()==thirdMaxValueInMap) {
                System.out.println(entry.getKey()+" "+entry.getValue());
            }
        }


    }
}