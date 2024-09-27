public class StudentGrades {

    public static void main(String[] args)
    {
        System.out.println("///////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\n" +
                "==          Student Points          ==\n" +
                "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\///////////////////");
        System.out.println("");
        System.out.println("");
        System.out.println("Name            Lab     Bonus   Total\n" +
                "----            ---     -----   -----");

        StudentGrades obj = new StudentGrades();
        obj.go();
    }

    public void go()
    {
        int lab_t=14, bonus_t=1, total_t=15;
    System.out.println("Tom"+"             "+lab_t+"        "+bonus_t+"       "+total_t);

        int lab_m=20, bonus_m=4, total_m=24;
        System.out.println("Michelle"+"        "+lab_m+"        "+bonus_m+"       "+total_m);

        int lab_ha=37, bonus_ha=2, total_ha=39;
        System.out.println("Harrison"+"        "+lab_ha+"        "+bonus_ha+"       "+total_ha);

        int lab_ho=42, bonus_ho=3, total_ho=45;
        System.out.println("Holly"+"           "+lab_ho+"        "+bonus_ho+"       "+total_ho);

        int lab_k=39, bonus_k=2, total_k=41;
        System.out.println("Kyle"+"            "+lab_k+"        "+bonus_k+"       "+total_k);

    }


}
