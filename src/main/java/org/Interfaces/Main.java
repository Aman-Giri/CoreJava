package org.Interfaces;

    //INTERFACES CONCEPT 2 - WHERE CLASSES AND INTERFACES ARE INTO THE SAME FILE
    //interfaces
        interface Bank{
            void rateofInterest();
        }

        class SBIBank implements Bank{
            @Override
            public void rateofInterest() {
                System.out.println("The Rate of interest is 10 percent");

            }
        }

        class HDFCBank implements Bank{
            @Override
            public void rateofInterest() {
                System.out.println("The rate of interest is 9 percent");
            }
        }

        class AxisBank implements Bank{
            @Override
            public void rateofInterest() {
                System.out.println("The rate of interest is 8 percent");

            }
        }

        public class Main {
            public static void main(String[] args) {
                SBIBank sb = new SBIBank();
                HDFCBank hd = new HDFCBank();
                AxisBank ab = new AxisBank();

                sb.rateofInterest();
                hd.rateofInterest();
                ab.rateofInterest();
            }
        }


