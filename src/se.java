import java.util.HashSet;

    public class se {
        public static HashSet<String> riempiHashSet() {
            HashSet<String> hashSet = new HashSet<>();

            // Aggiungi elementi all'HashSet
            hashSet.add("Elemento1");
            hashSet.add("Elemento2");
            hashSet.add("Elemento3");
            hashSet.add("Elemento4");

            return hashSet;
        }

        public static void main(String[] args) {
            HashSet<String> hashSet = riempiHashSet();
            riempiHashSet();
        }
    }

