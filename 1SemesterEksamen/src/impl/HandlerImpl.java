package impl;

import first_semester_eksamen.Handler;
import first_semester_eksamen.Sample;
import first_semester_eksamen.TimeFormatException;
import java.io.BufferedReader;
import java.io.FileReader;

import java.io.IOException;
import java.util.ArrayList;

public class HandlerImpl implements Handler {

    public static final String FILENAME = "Samples.csv";

    @Override
    public String readFile(String filename) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename));
        StringBuilder sb = new StringBuilder();
        try {
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
        } finally {
            br.close();
        }
        String contents = sb.toString();
        return contents;
    }


    /**
     * Converts file content to proper objects
     *
     * @param data The file content as a String
     * @return a list of Sample objects
     * @throws TimeFormatException if time is formated badly
     */
    @Override
    public ArrayList<Sample> getSamples(String data) throws TimeFormatException {
        //temporaty
        data = this.readFile(FILENAME);
        try {
            while ((line = data) != null) {
                // use comma as separator
                String[] sample = line.split(cvsSplitBy);

                System.out.println("Sample [date= " + sample[1] + " , time=" + sample[2] + "]");

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

       // throw new UnsupportedOperationException("Not supported yet.");

    }

    @Override
    public Sample getHighestAmplitude(ArrayList<Sample> samples) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Sample getBiggestRise(ArrayList<Sample> samples) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isTooLoud(int limit, ArrayList<Sample> samples) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void sortByTime(ArrayList<Sample> samples) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void sortByAmplitude(ArrayList<Sample> samples) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ArrayList<Sample> getLoudSamples(int limit, ArrayList<Sample> samples) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ArrayList<Sample> getSamplesBefore(Time limit, ArrayList<Sample> samples) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
    public static void main(String[] args) throws IOException {
        System.out.println("------------ STARTING -----------");
        Handler hndl = new HandlerImpl();
        String res = hndl.readFile("Samples.csv");
        System.out.println(res);
    }


}
