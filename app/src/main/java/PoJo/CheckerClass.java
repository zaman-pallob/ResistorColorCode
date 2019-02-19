package PoJo;

import java.text.DecimalFormat;

public class CheckerClass {

    String T4,T1,T2,T3,T5,TextView1,TextView2,TextView3,TextView4,tempcoef;
    double temp1,temp2,totaldigit,multiplier,tolerance;
    DecimalFormat object;

    public CheckerClass(int id, ValueHolder holder) {
        object=new DecimalFormat("#.####");
        switch (id){
            case 1:
                if(CheckerFour(holder)){
                    Calculation(holder,id);

                }
                break;
            case 2:
                if(CheckerFive(holder)){
                    Calculation(holder,id);
                }
                break;
            case 3:
                if(CheckerSix(holder)){
                    Calculation(holder,id);
                }
                break;

        }

    }

    public boolean CheckerFour(ValueHolder h){
        if(!h.getDigit1().equals(null) & !h.getDigit2().equals(null) & h.getMultiplier()!=100 & h.getTolerance()!=0)
        {
            return true;
        }
        else {
            return false;
        }
    }
    public boolean CheckerFive(ValueHolder h){
        if(!h.getDigit1().equals(null) & !h.getDigit2().equals(null) & !h.getDigit3().equals(null) & h.getMultiplier()!=100 & h.getTolerance()!=0)
        {
            return true;
        }
        else {
            return false;
        }
    }
    public boolean CheckerSix(ValueHolder h){
        if(!h.getDigit1().equals(null) & !h.getDigit2().equals(null) & !h.getDigit3().equals(null) & h.getMultiplier()!=100 & h.getTolerance()!=0 & !h.getTemcoefficient().equals(null))
        {
            return true;
        }
        else {
            return false;
        }

    }


    public void Calculation(ValueHolder holder,int id){

        if(id==1){
            T1=holder.getDigit1()+holder.getDigit2();
        }else if(id==2){
            T1=holder.getDigit1()+holder.getDigit2()+holder.getDigit3();

        }else {
            T1=holder.getDigit1()+holder.getDigit2()+holder.getDigit3();
            tempcoef=holder.getTemcoefficient();
            setTextView3("Temperature Coefficient: "+tempcoef+" ppm");
        }



            totaldigit=Double.valueOf(T1);
            multiplier=holder.getMultiplier();
            tolerance=holder.getTolerance();
            temp1=totaldigit*Math.pow(10,multiplier);
            temp2=(temp1*tolerance)/100;
            T2=" X "+"10"+"^"+String.valueOf((int) multiplier);
            T3=String.valueOf(tolerance)+" %";
            T4=Converter(temp1+temp2);
            T5=Converter(temp1-temp2);
            setTextView1(T1+T2);
            setTextView2("Tolerance: "+T3);
            setTextView4(T5+" <--> "+T4);


    }



    public  String Converter(double total){
            if(total<1000){
                return (String.valueOf(object.format(total))+" Ohm");
            }
            else if (total>1000 & total<1000000){
                return (String.valueOf(object.format(total/1000))+" k  Ohm");
            }else {
                return (String.valueOf(object.format(total/1000000))+" M  Ohm");

            }

    }

    public String getTextView1() {
        return TextView1;
    }

    public String getTextView4() {
        return TextView4;
    }

    public void setTextView4(String textView4) {
        TextView4 = textView4;
    }

    public void setTextView1(String textView1) {
        TextView1 = textView1;
    }

    public String getTextView2() {
        return TextView2;
    }

    public void setTextView2(String textView2) {
        TextView2 = textView2;
    }

    public String getTextView3() {
        return TextView3;
    }

    public void setTextView3(String textView3) {
        TextView3 = textView3;
    }


}
