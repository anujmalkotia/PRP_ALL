public String withoutX(String str) {
   
  if(str.length() < 1) return str ;
  if(str.length() == 1 && str.equals("x") ) return "" ;
   
  if( str.substring(0).equals("x") ){
        if( str.substring(str.length()-1).equals("x") )
           return str.substring(1,str.length()-1) ;
            
        else return str.substring(1) ;
       
      }
    
  else if( str.substring(str.length()-1).equals("x")) // *  -  my code does not go here 
        
           return str.substring(0,str.length()-1) ;
            
   else return str ;
}