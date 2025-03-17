package semaine5.td05;

// Question 1

class Mail{
    public static final double BASIS = 1.50;
    boolean express;
    String address;

    public Mail(boolean express, String address){
        this.express = express;
        this.address = address;
    }

    public boolean isValid(){
        if(this.address == null) 
            return false;
        return !this.address.isEmpty();
    }

    public double frank(){
        if (! this.isValid()) 
            return 0;
        if (this.express)
            return 2 * Mail.BASIS;
        else
            return Mail.BASIS;
    }

    public String toString(){
        return "Mail" + "Destination : " + this.address + "Price : " + this.express;
        StringBuffer sb = new StringBuffer();
        if (this.express)
            sb.append("Mail (Express)\n");
        else
            sb.append("Mail\n");
        sb.append("Destination : " + this.address + "\n");
        sb.append("Price : " + this.frank() + "\n");
        return sb.toString();

        // String result;
        // if (this.express)
        //     result = "Mail (Express)\n";
        // else
        //     result = "Mail\n";
        // result += "Destination : " + this.address + "\n";
        // result += "Price : " + this.frank() + "\n";
        // return result;
    }
}