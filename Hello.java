/**
 * Minimal console application whose entire observable behaviour is one fixed
 * greeting written to standard output followed by normal termination.
 *
 * <p>The class is declared in the default package, with no {@code package}
 * statement, which is the reason it is launched by its bare class name rather
 * than by a package-qualified one.
 *
 * <p>It holds no state: no field is declared, no constructor is declared and no
 * instance is ever created, so nothing is carried between invocations and there
 * is no shared mutable data for concurrent callers to contend over.
 *
 * <p>Building it requires nothing beyond a JDK. Nothing outside
 * {@code java.lang} is imported, so there is no dependency to resolve and this
 * repository carries no build descriptor to run.
 */
public class Hello {
    /**
     * Entry point invoked by the JVM: performs the program's single unit of
     * work by writing the greeting to standard output, then returns so that
     * the runtime shuts down of its own accord.
     *
     * <p>This method is the program's entire public contract. It reads no
     * configuration, opens no resource, mutates no state and declares no
     * checked exception, so a complete run is reported by returning normally
     * with an empty error stream.
     *
     * @param args command-line arguments, accepted only to satisfy the
     *             signature the JVM requires of an entry point and
     *             deliberately never read. The array is not dereferenced
     *             anywhere in this method, so the output is identical whether
     *             arguments are supplied or not.
     */
    public static void main(String[] args) {
        // Sole output: one write to standard output, emitting the fixed greeting plus the platform line separator; no other sink is written.
        System.out.println("Hello from Java!");
        // Termination: control returns from main with no System.exit call, so the JVM terminates normally once this method completes.
    }
}
