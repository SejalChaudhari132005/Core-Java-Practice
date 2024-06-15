class Bank{
    String name;
    int id;
    int totalBranches;
    int accounts;

    String getName(){
        return this.name;
    }
    void setName(String name){
        this.name=name;
    }

    int getId(){
        return this.id;
    }

    void setId(int id){
        this.id=id;
    }

    int getTotalBranches(){
        return this.totalBranches;
    }
    void setTotalBranches(int totalBranches){
        this.totalBranches=totalBranches;
    }

    int getAccounts(){
        return this.accounts;
    }
    void setAccounts(int accounts){
        this.accounts=accounts;
    }

    Bank(int id,int totalBranches,int accounts){
        this.name="Union";
        this.id=id;
        this.totalBranches=totalBranches;
        this.accounts=accounts;
    }

    Bank(){
        
    }


}