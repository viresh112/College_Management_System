class Sample{
//output:
      private int rollNo;
      private String name;
      private String branch;
      private static String clgName;

      public void setrollNo(int rollNo){
            this.rollNo=rollNo;
      }
      public void setname(String name){
            this.name=name;
      }
      public void setbranch(String branch){
            this.branch=branch;
      }
      public void setclgName(String clgName){
            this.clgName=clgName;
      }
      public int getrollNo(){
            return rollNo;
      }
      public String getname(){
            return name;
      }
      public String getbranch(){
            return branch;
      }
      public String getclgName(){
            return clgName;
      }
}
public class Encapsulation {
      public static void main(String[] args) {
            Sample[] s=new Sample[2];
            s[0]=new Sample();
            s[1]=new Sample();

            s[0].setrollNo(33);
            s[0].setname("Viresh");
            s[0].setbranch("CM");
            s[0].setclgName("GP Solapur");

            int roll=s[0].getrollNo();
            String name=s[0].getname();
            String branch=s[0].getbranch();
            String clg=s[0].getclgName();

            System.out.println("Name:"+name+"\r\n"+"Roll Name:"+roll+"\r\n"+"Branch:"+branch+"\r\n"+"College Name:"+clg+"\r\n");

            s[1].setrollNo(93);
            s[1].setname("Shraddha");
            s[1].setbranch("CM");
           // s[1].setclgName("GP Solapur");

            int roll1=s[1].getrollNo();
            String name1=s[1].getname();
            String branch1=s[1].getbranch();
            String clg1=s[1].getclgName();

            System.out.println("Name:"+name1+"\r\n"+"Roll Name:"+roll1+"\r\n"+"Branch:"+branch1+"\r\n"+"College Name:"+clg1+"\r\n");

      }
}
