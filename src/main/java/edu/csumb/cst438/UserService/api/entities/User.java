package edu.csumb.cst438.UserService.api.entities;




public class User {
    
    private String id;
    private UserName username; 
    private UserCredit usercredit;

    
    public User(){
        super();
    }


    public User (UserName username, UserCredit usercredit) {
        super();
        this.username=username;

        this.usercredit=usercredit;

        
    }



    public void setId (String id) {
        this.id = id;
    }



    public String getId () {
        return this.id;
    }



  

    public void setUsername (UserName username) {

        this.username = username;
    }


    public UserName getUsername (){

        return this.username;
    }



    public void setUsercredit(UserCredit usercredit ){

         this.usercredit=usercredit;

    }


    public UserCredit getUsercredit(){

        return this.usercredit;

    }










  
 
}