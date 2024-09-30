package threads;

public class Main {
    public static void main(String[] args) {
        threads.Design d1 = new threads.Design(1,"D1");
        // Ch02-Step 5 - Create an object of the VotingRunnable & CountingRunnable for design1
        threads.VotingRunnable votingRunnableD1 = new threads.VotingRunnable(d1);
        threads.CountingRunnable countingRunnableD1 = new threads.CountingRunnable(d1);

        // Ch02-Step 6.1 - Create a new Thread instance, passing in the VotingRunnable object for design1
        Thread votingD1 = new Thread(votingRunnableD1);
        // Ch02-Step 6.2 - Create a new Thread instance, passing in the CountingRunnable object for design1
        Thread countingD1 = new Thread(countingRunnableD1);

        // Ch02-Step 7.1 - Start the voting thread for design1
        votingD1.start();
        // Ch02-Step 7.2 - Start the counting thread for design1
        countingD1.start();

        threads.Design d2 = new threads.Design(2,"D2");
        // Ch02-Step 5 - Create an object of the VotingRunnable & CountingRunnable for design2
        threads.VotingRunnable votingRunnableD2 = new threads.VotingRunnable(d2);
        threads.CountingRunnable countingRunnableD2 = new threads.CountingRunnable(d2);

        // Ch02-Step 6.1 - Create a new Thread instance, passing in the VotingRunnable object for design2
        Thread votingD2 = new Thread(votingRunnableD2);
        // Ch02-Step 6.2 - Create a new Thread instance, passing in the CountingRunnable object for design2
        Thread countingD2 = new Thread(countingRunnableD2);

        // Ch02-Step 7.1 - Start the voting thread for design2
        votingD2.start();
        // Ch02-Step 7.2 - Start the counting thread for design2
        countingD2.start();

        threads.Design d3 = new threads.Design(3,"D3");
        // Ch02-Step 5 - Create an object of the VotingRunnable & CountingRunnable for design3
        threads.VotingRunnable votingRunnableD3 = new threads.VotingRunnable(d3);
        threads.CountingRunnable countingRunnableD3 = new threads.CountingRunnable(d3);

        // Ch02-Step 6.1 - Create a new Thread instance, passing in the VotingRunnable object for design3
        Thread votingD3 = new Thread(votingRunnableD3);
        // Ch02-Step 6.2 - Create a new Thread instance, passing in the CountingRunnable object for design3
        Thread countingD3 = new Thread(countingRunnableD3);

        // Ch02-Step 7.1 - Start the voting thread for design3
        votingD3.start();
        // Ch02-Step 7.2 - Start the counting thread for design3
        countingD3.start();

    }
}
