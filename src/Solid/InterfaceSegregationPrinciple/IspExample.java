package Solid.InterfaceSegregationPrinciple;

public class IspExample {
    // Large interface that violates ISP
    interface AllInOnePrinter {
        void print();
        void scan();
        void fax();
        void saveToPDF();
    }

    // Problematic implementation - forces the class to implement methods it doesn't use
    class SimplePrinter implements AllInOnePrinter {
        @Override
        public void print() {
            System.out.println("Printing document...");
        }

        @Override
        public void scan() {
            // Shouldn't need to implement this
            throw new UnsupportedOperationException();
        }

        @Override
        public void fax() {
            // Shouldn't need to implement this
            throw new UnsupportedOperationException();
        }

        @Override
        public void saveToPDF() {
            // Shouldn't need to implement this
            throw new UnsupportedOperationException();
        }
    }

    // Solution applying ISP - Segregated interfaces
    interface Printer {
        void print();
    }

    interface Scanner {
        void scan();
    }

    interface FaxMachine {
        void fax();
    }

    interface PDFConverter {
        void saveToPDF();
    }

    // Now each class implements only what it needs
    class BasicPrinter implements Printer {
        @Override
        public void print() {
            System.out.println("Printing document...");
        }
    }

    // Multifunction printer implements all interfaces it needs
    class MultifunctionPrinter implements Printer, Scanner, FaxMachine, PDFConverter {
        @Override
        public void print() {
            System.out.println("Printing document...");
        }

        @Override
        public void scan() {
            System.out.println("Scanning document...");
        }

        @Override
        public void fax() {
            System.out.println("Sending fax...");
        }

        @Override
        public void saveToPDF() {
            System.out.println("Saving as PDF...");
        }
    }
}
