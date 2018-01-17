public static boolean Main(String args[]){
   for (int i = str.length();--i>=0;){  
       if (!Character.isDigit(str.charAt(i))){
           return false;
       }
   }
   return true;
}
