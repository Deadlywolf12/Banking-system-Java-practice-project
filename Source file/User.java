package bank;

import java.util.Objects;

public class User {
    User() {
    }

    // Declaring variables

    private String pUserName;
    private String pPass;

    private int pBal;

    public void setpUserName(String pUserName) {
        this.pUserName = pUserName;
    }

    public void setpBal(int pBal) {
        this.pBal = pBal;
    }

    // checking variables
    int lenCheck1, lenCheck2;
   private int chklog;
   private int chkregis;
   private int  depoChk;
   private int  withChk;

    public int getChklog() {
        return chklog;
    }

    public void setChklog(int chklog) {
        this.chklog = chklog;
    }

    public int getChkregis() {
        return chkregis;
    }

    public void setChkregis(int chkregis) {
        this.chkregis = chkregis;
    }

    public int getDepoChk() {
        return depoChk;
    }

    public void setDepoChk(int depoChk) {
        this.depoChk = depoChk;
    }

    public int getWithChk() {
        return withChk;
    }

    public void setWithChk(int withChk) {
        this.withChk = withChk;
    }

    //storing variables
    String error = "";
    String promt = "";
    String promt2 = "";
    String promt3 = "";

    public String getpUserName() {
        return pUserName;
    }

    public int getpBal() {
        return pBal;
    }

    public String uRegis(String name, String pass) {


        lenCheck1 = name.length();
        lenCheck2 = pass.length();
        if (lenCheck1 >= 4 && lenCheck2 >= 8) {
            setChklog(1);
            error = "successfuly Registered now login";

        } else {
setChkregis(0);
            error = "user and password must be greater than 8 character";


        }

        return error;
    }

    public String uLogin(String name2, String pass2) {
        if (Objects.equals(name2, pUserName) && Objects.equals(pass2, pPass)) {

            promt = pUserName + " Welcome back";
            setChklog(1);


        } else {
            promt = "User or pass does not match";
        }

        return promt;
    }


    String uDeposit(int amt) {
        if (amt != 0) {
            pBal += amt;
            promt2 = "Added";
           setDepoChk(1);
        } else promt2 = "Add amt first";
        return promt2;


    }

     String uWithdraw (int amt){
        if (amt!=0) {
            if (amt <= pBal && pBal!=0) {
                pBal -= amt;
                promt3 = "Withdrew done";
                setWithChk(1);
            } else promt3 = "not enough bal";
        }
            else promt3 = "Add amt first";

        return promt3;

        }
     }


