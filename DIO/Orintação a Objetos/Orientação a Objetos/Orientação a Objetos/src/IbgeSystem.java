public class IbgeSystem {
    public static void main(String[] args) {
        for(BrazilianStates state : BrazilianStates.values()){
            System.out.println(state.getAcronym()  + " : " + state.getName());
        }

        BrazilianStates currentState = BrazilianStates.SANTA_CATARINA;
    }
}
