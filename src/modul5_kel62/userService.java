/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul5_kel62;

/**
 *
 * @author ROG GL553VD
 */
public class userService {
   private String[][] data = new String[2][3];
    private String email, password, roles = "";
    private String[][] histories = new String [2][4];
    private String game1, game2, tanggal = "";
    public userService(String emails, String passwords)
    {
        email = emails;
        password = passwords;
        String[][] data = 
        { 
            {"amezrykelompok62@gmail.com", "12345", "supedAdmin"},
            {"sayidkelompok62@gmail.com", "12345", "user"} 
        };
        String[][] histories =
        {
            {"amezrykelompok62@gmail.com","Apex Legends", "CS:GO","25-04-2020"},
            {"sayidkelompok62@gmail.com","Dota 2", "Paladin", "25-04-2020"}
        };
        this.data = data;
        this.histories = histories;
    }
    
    private boolean checkCredential()
    {
        for(int i = 0; i < data.length; i++ )
        {
            if(data[i][0].equals(email))
            {
                if(data[i][1].equals(password))
                {
                    roles = data[i][2];
                    game1 = histories[i][1];
                    game2 = histories[i][2];
                    tanggal = histories[i][3];
                    return true;
                }
            }
        }
        return false;
    }
    
    public void login()
    {
        boolean status = checkCredential();
        if(status == true)
        {
            System.out.println("\nWelcome " + roles);
            System.out.println("Logged it as user email " + email);
            System.out.println("Histories :");
            System.out.println("User :" + email);
            System.out.println("Activity :" + game1 + ", "+ game2);
            System.out.println("Date :" + tanggal);
        }
        else
        {
            System.out.println("\nInvalid Login ");
        }
    }
}
 

