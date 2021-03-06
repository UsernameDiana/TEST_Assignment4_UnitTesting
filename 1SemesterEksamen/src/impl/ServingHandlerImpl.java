
package impl;

import first_semester_eksamen.Sample;
import first_semester_eksamen.Serving;
import first_semester_eksamen.ServingHandler;
import first_semester_eksamen.TimeFormatException;
import java.io.IOException;
import java.util.ArrayList;

public class ServingHandlerImpl implements ServingHandler{

        @Override
        public void sortByTime(ArrayList<Serving> servings) {
                    }

        @Override
        public String readFile(String filename) throws IOException {
            return null;
        }

        @Override
        public ArrayList<Serving> getServings(String data) throws TimeFormatException {
            return null;
        }
        //Emmely
        @Override
        public Serving getHighestServing(ArrayList<Serving> servings) {
            Serving highest=null;
            int size = servings.size();
            int highestValue = -10;

            for (int i = 0; i < size ; i++) {
                if ( servings.get(i).getAmount() > highestValue ) {
                    highest = servings.get(i);
                    highestValue = servings.get(i).getAmount();
                }
            }
            return highest;
        }

        @Override
        public Serving getLessServing(ArrayList<Serving> servings) {
            Serving lowest=null;
            int size = servings.size();
            int lowestValue = -1;

            for (int i = 0; i < size ; i++) {
                if(i ==0){
                    lowestValue = servings.get(i).getAmount();
                    lowest = servings.get(i);
                }
                if ( servings.get(i).getAmount() < lowestValue ) {
                    lowest = servings.get(i);
                    lowestValue = servings.get(i).getAmount();
                }
            }
            return lowest;
        }

        @Override
        public ArrayList<Serving> getValidServings(int max, int min, ArrayList<Serving> servings) {
            return null;
        }

        @Override
        public boolean isTooMuch(int limit, Serving serving) {

            if ( serving.getAmount() > limit ) {
                return true;
            }
            return false;
        }

        @Override
        public void sortByAmount(ArrayList<Serving> servings) {

        }

        @Override
        public ArrayList<Serving> getTooHighServings(int max, ArrayList<Serving> servings) {
            return null;
        }

        @Override
        public ArrayList<Serving> getLessServings(int limit, ArrayList<Serving> servings) {
            return null;
        }

        @Override
        public int getTotalExcessServings(int max, ArrayList<Serving> servings) {
            int size = servings.size();
            int amount = 0;

            for (int i = 0; i < size ; i++) {
                if ( servings.get(i).getAmount() > max ) {
                    amount += servings.get(i).getAmount();
                }
            }
            return amount;
        }

        @Override
        public int getTotalMissingServings(int min, ArrayList<Serving> servings) {
            int size = servings.size();
            int amount = 0;

            for (int i = 0; i < size ; i++) {
                if ( servings.get(i).getAmount() > min ) {
                    amount += min - servings.get(i).getAmount();
                }
            }
            return amount;
        }

}
