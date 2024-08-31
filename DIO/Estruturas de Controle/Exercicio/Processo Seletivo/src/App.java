import java.util.concurrent.ThreadLocalRandom;

public class App {
    public static void main(String[] args) throws Exception {
        candidateSelection();
    }

    static void candidateSelection() {
        String[] candidates = { "Alex", "João", "ana", "Kleber", "Gerson", "Larissa", "Beto", "Felipe", "Davi",
                "Marcelo"};
        double baseSalary = 2000.00;
        int selectedCandidates = 0;
        int currentCandidate = 0;
        while (selectedCandidates < 5 && candidates.length > currentCandidate) {

            System.out.println("-------------------------------------------------------------");

            String candidate = candidates[currentCandidate];
            double intendedSalary = getIntendedSalary();
            analyzeandidates(intendedSalary);

            System.out.println("Candidate : " + candidate + " | intended Salary  : " + intendedSalary);

            if (intendedSalary < baseSalary){
                System.out.println("The Candidate " + candidate + " was selected");
                selectedCandidates++;
            }else{
                System.out.println("The Candidate " + candidate + " was not selected");
            }

            currentCandidate++;
            

        }
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
