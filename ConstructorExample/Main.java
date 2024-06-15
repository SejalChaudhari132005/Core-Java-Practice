class Main{
    public static void main(String[] args){

        Bank b=new Bank();
        b.setName("Union");
        b.setId(56);
        b.setTotalBranches(23);
        b.setAccounts(890);

        System.out.println(b.getName());
        System.out.println(b.getId());
         System.out.println(b.getTotalBranches());
          System.out.println(b.getAccounts());

        Bank b1=new Bank(34,23,78);
        System.out.println(b1.getName());
        System.out.println(b1.getId());
         System.out.println(b1.getTotalBranches());
          System.out.println(b1.getAccounts());
    }
}