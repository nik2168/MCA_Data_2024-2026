import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


// Benefit of Java Stream

// There are some benefits because of which we use Stream in Java as mentioned below:

// No Storage
// Pipeline of Functions
// Laziness
// Can be infinite
// Can be parallelized
// Can be created from collections, arrays, Files Lines, Methods in Stream, IntStream etc.
// Important Intermediate Operations

// There are a few Intermediate Operations mentioned below:

// 1. map()
// The map method is used to return a stream consisting of the results of applying the given function to the elements of this stream.

// Syntax:

// <R> Stream<R> map(Function<? super T, ? extends R> mapper)
// 2. filter()
// The filter method is used to select elements as per the Predicate passed as an argument.

// Syntax:

// Stream<T> filter(Predicate<? super T> predicate)
// 3. sorted()
// The sorted method is used to sort the stream.

// Syntax:

// Stream<T> sorted()
// Stream<T> sorted(Comparator<? super T> comparator)
// 4.flatMap()

// Syntax:

// The flatMap operation in Java Streams is used to flatten a stream of collections into a single stream of elements.

// <R> Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> mapper)
// 5. distinct ()
// Removes duplicate elements. It returns a stream consisting of the distinct elements (according to Object.equals(Object)).

// Syntax:

// Stream<T> distinct()
// 6. peek()

// Performs an action on each element without modifying the stream. It returns a stream consisting of the elements of this stream, additionally performing the provided action on each element as elements are consumed from the resulting stream.

// Syntax:

// Stream<T> peek(Consumer<? super T> action)


public class StreamPrac {
    public static void main(String[] args) {

        List<String> s = Arrays.asList("Szm", "Silajeet", "Sam", "William");
        System.out.println(s);

        List<String> result = s.stream()
        .filter(r -> r.startsWith("S"))
        .map(t -> t.toUpperCase())
        .distinct() // remove duplicate shit
        .sorted() // will sort things out
        .collect(Collectors.toList()); // will collect each value and makes a list out of no where

        System.out.println(result);

    }
}

// flatMap(List::stream): Flattens the nested lists into a single stream of strings.
// filter(s -> s.startsWith("S")): Filters the strings to only include those that start with “S”.
// map(String::toUpperCase): Converts each string in the stream to uppercase.
// distinct(): Removes any duplicate strings.
// sorted(): Sorts the resulting strings alphabetically.
// peek(...): Adds each processed element to the intermediateResults set for intermediate inspection.
// collect(Collectors.toList()): Collects the final processed strings into a list called result.


// Stream Operations Recap:
// Operation Type	Examples	Description
// Intermediate Operations	map(), filter(), distinct(), sorted(), flatMap()	Transform or filter elements, and return a new stream.
// Terminal Operations	collect(), forEach(), reduce(), count(), min(), max()	Trigger the processing of the stream and produce a result or side effect.
// Short-circuiting Operations	anyMatch(), allMatch(), noneMatch(), findFirst(), findAny()	Operations that may not process all elements in the stream.