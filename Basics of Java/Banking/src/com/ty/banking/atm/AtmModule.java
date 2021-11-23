package com.ty.banking.atm;

//object+user input

public class AtmModule {
  // These global variables are the server values
  public static int AccNo = 101;
  public static String BankName ="ICICI";
  public static String Name = "Qspiders",
                      email = "qsp@gmail.com",
                      password = "qwerty@123";
  public static double balance = 1000.50 ;
  public static long phone = 9865431020l ;
  
  public static String Statement = 
  "Customer : "+Name+"\t Bank : "+BankName+"\n"
  +"Opening balance is : "+balance+"Rs";

  public static String withdraw(short pin, double amount)
  {
      if( amount < balance )
      {
          if( balance-amount > 400 )
          {
              if( pin == 1234 )
              {
                  balance = balance - amount;
                  return Statement+"\n"
                                  +"Operation : Withdraw["+amount+" Rs ]\t\t|\t Balance : "+balance+" Rs";   
              }
              else
              {
                  System.out.println("Incorrect UPI pin");
                  return "";
              }
          }
          else
          {
              
              if( pin == 1234 )
              {
                  balance-=12;
                  Statement+= "\nPenalty for not maintaining minimum Balance";

                  System.out.println("Penalty amount of 12 Rs is added");

                  balance = balance - amount;
                  return Statement+"\n"
                                  +"Operation : Withdraw["+amount+" Rs ]\t\t|\t Balance : "+balance+" Rs";   
              }
              else
              {
                  System.out.println("Incorrect UPI pin");
                  return "";
              }
          }
      }
      else
      {
          System.out.println("Insufficient funds");
          return "";
      }
  }
  public static String deposit( double amount)
  {
      if( amount % 100 == 0 )
      {
          balance = balance + amount ;
          System.out.println("transaction Successful");
          return Statement+"\n"
                          +"Operation : Deposit:["+amount+" Rs ]\t\t|\tBalance : "+balance+" Rs";
      }
      else
      {
          System.out.println("Amount is invalid");
          return Statement;
      }
  }

  public static void viewAccountDetails() 
  {
      System.out.println("-----------------------------");
      System.out.println("Name\t\t:\t"+Name);
      System.out.println("Account no\t:\t"+AccNo);
      System.out.println("Bank\t\t:\t"+BankName);
      System.out.println("Email\t\t:\t"+email);
      System.out.println("Password\t:\t*********");
      System.out.println("Balance\t\t:\t"+balance+" Rs");
      System.out.println("-----------------------------");
  }

  public static boolean login(String user, String pswd)
  {
      if ( user == email && pswd == password)
      {
          System.out.println("Login successful");
          return true;
      }
      else
      {
          System.out.println("Invalid Credentials");
          return false;
      }
  }

  public static void main(String[] args) 
  {
      System.out.println("Welcome to the "+BankName+"Bank");
      System.out.println("Enter your Credentials to login");

      String user="qsp@gmail.com", pswd="qwerty@123";
      System.out.println("Username : "+user);
      System.out.println("Password : "+pswd);
      
      if( login(user, pswd) )
      {
          System.out.println("----------------------------------");
          System.out.println("Please choose an operation");
          String option = "logout";

          switch( option )
          {
              case "view"             :   viewAccountDetails();                               
                                          break;

              case "deposit"          :   System.out.println( deposit(500) );
                                          break;

              case "withdraw"         :   System.out.println( withdraw((short)1234, 1200.0));
                                          break;

              case "mini statement"   :   System.out.println( Statement );
                                          break;

              case "logout"           :   System.out.println("Thank you for banking with us");
                                          System.exit(0);
          
              default : System.out.println("Incorrect input");
          }
          System.out.println("----------------------------------");

      }
      
      else    
      {
          System.out.println("System error...Please try again");
      }
  }
}

