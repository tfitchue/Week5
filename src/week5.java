public class week5 {
    interface Logger {
        void log(String message);
        void error(String message);
    }

    class AsteriskLogger implements Logger {
        @Override
        public void log(String message) {
            System.out.println("***" + message + "***");
        }

        @Override
        public void error(String message) {
            System.out.println("****************");
            System.out.println("***Error: " + message + "***");
            System.out.println("****************");
        }
    }

    class SpacedLogger implements Logger {
        @Override
        public void log(String message) {
            StringBuilder spacedMessage = new StringBuilder();
            for (int i = 0; i < message.length(); i++) {
                spacedMessage.append(message.charAt(i)).append(' ');
            }
            System.out.println(spacedMessage);
        }

        @Override
        public void error(String message) {
            StringBuilder spacedMessage = new StringBuilder("ERROR: ");
            for (int i = 0; i < message.length(); i++) {
                spacedMessage.append(message.charAt(i)).append(' ');
            }
            System.out.println(spacedMessage);
        }
    }
}

class App {
    public static void main(String[] args) {
        week5.Logger asteriskLogger = new week5().new AsteriskLogger();
        week5.Logger spacedLogger = new week5().new SpacedLogger();

        asteriskLogger.log("Hello");
        asteriskLogger.error("Hello");
        System.out.println("-------------------");
        spacedLogger.log("Hello");
        spacedLogger.error("Hello");
    }
}
