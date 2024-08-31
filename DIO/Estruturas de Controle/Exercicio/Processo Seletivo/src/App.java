import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class App {
    public static void main(String[] args) throws Exception {
        String[] candidates = candidateSelection();
        printSelected(candidates);
        System.out.println();
        System.out.println("-------------------------------------------------------------");
        System.out.println("Start call to candidates...");
        for (String candidate : candidates) {
            if (candidate != null) {
                call(candidate);

            }
        }

    }

    static void call(String candidate) {
        int attempts = 0;
        boolean keepTrying = true;
        boolean answered = false;

        do {
            answered = meet(candidate);
            keepTrying = !answered;

            if (keepTrying) {
                attempts++;
            }else{
                System.out.println("Contact made");
            }

        } while (keepTrying && attempts < 3);
        if(answered){
            System.out.println("We managed to get in touch with "+ candidate +" in " + attempts + " attempts");
        }else{
            System.out.println("we couldn't get in touch with " + candidate);
        }
    }

    static void printSelected(String[] candidates) {

        for (int i = 0; i < candidates.length; i++) {
            System.out.println("-------------------------------------------------------------");
            System.out.println("Candidate Number : " + (i + 1) + " Name : " + candidates[i]);
        }

        // ou com o For Each
        for (String candidate : candidates) {
            // System.out.print(candidate + " | ");
        }
    }

    static boolean meet(String candidate) {
        System.out.println("Calling to : " + candidate + "..............");
        return new Random().nextInt(3) == 1;
    }

    static String[] candidateSelection() {
        String[] candidates = { "Alex", "João", "ana", "Kleber", "Gerson", "Larissa", "Beto", "Felipe", "Davi",
                "Marcelo" };
        double baseSalary = 2000.00;
        int selectedCandidates = 0;
        int currentCandidate = 0;
        String[] candidatesList = new String[5];
        while (selectedCandidates < 5 && candidates.length > currentCandidate) {

            System.out.println("-------------------------------------------------------------");

            String candidate = candidates[currentCandidate];
            double intendedSalary = getIntendedSalary();
            analyzeandidates(intendedSalary);

            System.out.println("Candidate : " + candidate + " | intended Salary  : " + intendedSalary);

            if (intendedSalary < baseSalary) {
                System.out.println("The Candidate " + candidate + " was selected");
                candidatesList[selectedCandidates] = candidate;
                selectedCandidates++;
            } else {
                System.out.println("The Candidate " + candidate + " was not selected");
            }

            currentCandidate++;
        }
        return candidatesList;
    }

    static double getIntendedSalary() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analyzeandidates(double intendedSalary) {
        double baseSalary = 2000.00;

        if (intendedSalary < baseSalary) {
            System.out.println("call the candidate");
        } else if (intendedSalary == baseSalary) {
            System.out.println("Waiting for other candidates");
        } else {
            System.out.println("call with counter-proposal");
        }
    }
}
