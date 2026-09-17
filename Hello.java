/**
 * Minimal, stateless console application: it has no field, creates no instance
 * and imports nothing outside {@code java.lang}, so a JDK alone builds and runs
 * it. Its default package is why it launches by the bare class name {@code Hello}.
 */
public class Hello {
    /**
     * Entry point invoked by the JVM: writes the program's one greeting line to
     * standard output, then returns normally.
     *
     * @param args command-line arguments, accepted only to satisfy the signature
     *             the JVM requires of an entry point and deliberately never read,
     *             so the output is identical whether or not arguments are supplied.
     */
    public static void main(String[] args) {
        // Sole output: one write to standard output, emitting the fixed greeting plus the platform line separator; no other sink is written.
        System.out.println("Hello from Java!");
        // Termination: control returns from main with no System.exit call, so the JVM terminates normally once this method completes.
    }
}
