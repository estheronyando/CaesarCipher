package org.example;

import java.io.*;

public class App {
    public static void main(String [] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader((System.in)));
        System.out.println("Welcome To Ceasar Cipher!");
        boolean runningProgram = true;

        while(runningProgram){
            System.out.println("**---------------------------------------------------------**");
            System.out.println("Enter A, B or C to choose one of the following options");
            System.out.println("A. Encrypt And Decrypt Message");
            System.out.println("B. Encrypt And Decrypt File");
            System.out.println("C. Exit");
            try{


                String choice = bufferedReader.readLine();
                System.out.println(choice);

                if(choice.equals("A")){

                    System.out.print("PLease enter your message");
                    String originalMessage = bufferedReader.readLine();

                    System.out.print("PLease enter  Key between 1 and 25");
                    int shiftKey = Integer.parseInt(bufferedReader.readLine());

                    if(shiftKey>0 && shiftKey<26){
                        Caesar msgCeasar = new Caesar(originalMessage,shiftKey);
                        EncryptClass msgEncrypt = new EncryptClass();
                        Decrypt msgDecrypt =new Decrypt();

                        msgEncrypt.EncryptMessage(msgCeasar.getMessage(), msgCeasar.getShiftKey());
                        msgDecrypt.decryptMessage(msgEncrypt.getEncryptedMessage(),msgCeasar.getShiftKey() );

                        System.out.println("Input Message :"+ originalMessage);
                        System.out.println("Encrypted Message :"+msgEncrypt.getEncryptedMessage() );

                        System.out.println("Decrypted Message :"+msgDecrypt.getDecryptedMessage() );
                    }else{
                        System.out.println(" Key Must be between 1 and 25");

                    }
                }else if(choice.equals("B")){
                    System.out.println("Enter File Path.Example D://data.txt");
                    String filePath = bufferedReader.readLine();
                    System.out.print("PLease enter  Key between 1 and 25");
                    int shiftKey = Integer.parseInt(bufferedReader.readLine());



                    File file = new File(filePath);
                    BufferedReader reader = new BufferedReader(new FileReader(file));
                    String line;



                    if(shiftKey>0 && shiftKey<26){


                        while((line = reader.readLine()) != null) {
                            Caesar msgCeasar = new Caesar(line,shiftKey);
                            EncryptClass msgEncrypt = new EncryptClass();
                            Decrypt msgDecrypt =new Decrypt();

                            msgEncrypt.EncryptMessage(msgCeasar.getMessage(), msgCeasar.getShiftKey());
                            msgDecrypt.decryptMessage(msgEncrypt.getEncryptedMessage(),msgCeasar.getShiftKey() );

                            System.out.println("FILE ORIGINAL CONTENT: " + line);
                            System.out.println("Encrypted Message :"+msgEncrypt.getEncryptedMessage() );

                            System.out.println("Decrypted Message :"+msgDecrypt.getDecryptedMessage() );
                        }
                    }else{
                        System.out.println(" Key Must be between 1 and 25");
                    }

                }else if(choice.equals("C")) {
                    System.out.println("Successful Exit");
                    runningProgram = false;
                }else {
                    System.out.println("Invalid Choice please try again");
                }



            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}

