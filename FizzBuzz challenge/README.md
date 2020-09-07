# FizzBuzzChallenge
challenge from javastart.pl newsletter


FizzBuzz to jedno z podstawowych zadań rekrutacyjnych, które bardzo szybko pozwala zweryfikować, czy osoba, które je rozwiązuje zna podstawowe konstrukcje języka takie jak pętle, czy instrukcje sterujące i potrafi logicznie myśleć. Polega ono na tym, że dla określonego przedziału liczb w konsoli wyświetlamy:

liczbę i słowo "Fizz" dla liczb podzielonych przez 3,
liczbę i słowo "Buzz" dla liczb podzielnych przez 5,
liczbę i słowo "FizzBuzz" dla liczb podzielonych zarówno przez 3 i 5.
Przy czym dla każdej liczby powinien być wyświetlony tylko jeden z podanych komunikatów, a dla liczb, które nie są podzielne przez 3 ani 5 nie powinien być wyświetlony żaden komunikat. Przykładowo dla przedziału liczb [0; 15] w konsoli powinien pojawić się następujący wynik:

0 - FizzBuzz
3 - Fizz
5 - Buzz
6 - Fizz
9 - Fizz
10 - Buzz
12 - Fizz
15 - FizzBuzz1

Zadanie w klasycznej wersji byłoby zbyt proste, dlatego dla urozmaicenia załóżmy, że istnieje interfejs:

interface FizzBuzz {
    void print(int from, int to);
}

Celem metody print jest wyświetlenie komunikatów Fizz, Buzz lub FizzBuzz, zgodnie z opisem z wcześniejszej części tego zadania, dla domkniętego przedziału [from; to]. Zdefiniuj jego trzy implementacje, przy czym:

pierwsza wykorzystuje klasyczną pętlę for, while lub do while,
druga korzysta ze strumieni z Javy 8,
trzecia wykorzystuje pętlę for each.
