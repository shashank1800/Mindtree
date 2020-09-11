package Exe_47;


public class BankUserList<T> extends ArrayList<T> {

    public void displayBasedOnName(BankUserList<BankUser> bankUser, String name) {
        
        for(BankUser user : bankUser)
            if(user.getName().equals(name))
                System.out.println(user);
        
    }

    public void displayAllUsersNonZeroBalance(BankUserList<BankUser> bankUser) {
        
        for(BankUser user : bankUser)
            if(user.getBalance()!=0)
                System.out.println(user);
    }

    public void displaySortedUserBasedOnAddress(BankUserList<BankUser> bankUser) {
        
        for (int i = 0; i < bankUser.size() - 1; i++)
            for (int j = 0; j < bankUser.size() - i - 1; j++)
                if (bankUser.get(j).getAddress().compareTo(bankUser.get(j+1).getAddress()) > 0 ) {
                    BankUser temp = bankUser.get(j);
                    bankUser.set(j, bankUser.get(j + 1));
                    bankUser.set(j + 1, temp);
                }
        
        for(BankUser user : bankUser)
            System.out.println(user);
    }

 

    public void displaySortedUserBasedOnAccountNumber(BankUserList<BankUser> bankUser) {
        
        for (int i = 0; i < bankUser.size() - 1; i++)
            for (int j = 0; j < size() - i - 1; j++)
                if (bankUser.get(j).getAccNumber() > bankUser.get(j+1).getAccNumber()  ) {
                    BankUser temp = bankUser.get(j);
                    bankUser.set(j, bankUser.get(j + 1));
                    bankUser.set(j + 1, temp);
                }
        
        for(BankUser user : bankUser)
            System.out.println(user);
        
    }
    
    

}
