 function checkpattern(ram){
            var patcheck = new RegExp("^[a-zA-Z-,]+(\s{0,1}[a-zA-Z-, ])*$");
                var patcheckmob = new RegExp("^[7-9][0-9]{9}$");
                var pattern1= new RegExp("^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,6}$");
                var password= document.getElementById("pass").value;
            	 var repassword= document.getElementById("passwor").value;

           if(ram.id=="full" && ram.value!=0){
            if(!patcheck.test(ram.value))
            {
                document.getElementById("div1").innerHTML="* firstname is not correct";
                document.getElementById("div1").style.color="Red";
                return false;
            }
             else
            {
                document.getElementById("div1").innerHTML="";
                return true;
            }
        }
           else if(ram.id=="email" && ram.value!=0){
               if(!pattern1.test(ram.value))
                   {
                       document.getElementById("div2").innerHTML="Enter a correct emailid";
                       document.getElementById("div2").style.color="Red";
                       return false;
                   }
                    else
                   {
                       document.getElementById("div2").innerHTML="";
                       return true;
                   }

               }
        else if(ram.id=="user" && ram.value!=0){
            if(!patcheck.test(ram.value))
            {
                document.getElementById("div3").innerHTML="* Username is not correct";
                document.getElementById("div3").style.color="Red";
                return false;
            }
             else
            {
                document.getElementById("div3").innerHTML="";
                return true;
            }
        }

        else if(ram.id=="phone" && ram.value!=0){
        if(!patcheckmob.test(ram.value))
            {
                document.getElementById("div4").innerHTML="Enter a correct mobileno";
                document.getElementById("div4").style.color="Red";
                return false;
            }
             else
            {
                document.getElementById("div4").innerHTML="";
                return true;
            }

        }
        else  if(ram.id=="pass" && ram.value!=0){
               if(!pattern1.test(ram.value))
               {
                   document.getElementById("div5").innerHTML="* Password must be atleast 8 characters conatining digits and special characters";
                   document.getElementById("div5").style.color="Red";
                  return false;
               }
                else
               {
                   document.getElementById("div5").innerHTML="";
                   
                   return true;
               }
           }
          
        else   if(ram.id=="passwor" && ram.value!=0){
               if(!pattern1.test(ram.value))
               {
                   document.getElementById("div6").innerHTML="* Password must be atleast 8 characters conatining digits and special characters";
                   document.getElementById("div6").style.color="Red";
                   return false;
               }
               else if(password!=repassword)
               {
                   document.getElementById("div6").innerHTML="Password and confirm password doesnt match";
                   document.getElementById("div6").style.color="Red";
                   return false;
               }
              else
                	{
                	document.getElementById("div6").innerHTML="";
                	return true;
                	}
           }
        }
        
        function validate(form){
        	var full=document.getElementById('full').value;
        	var email=document.getElementById('email').value;
        	var user=document.getElementById('user').value;
        	var phone=document.getElementById('phone').value;
        	var pass=document.getElementById('pass').value;
        	var passwor=document.getElementById('passwor').value;
        if(full=="")
        {
        document.getElementById("div1").innerHTML="*FullName can't be empty";
                document.getElementById("div1").style.color="Red";
        return false;
        }
         if(email==""){
            document.getElementById("div2").innerHTML="*Email cant be empty";
                    document.getElementById("div2").style.color="Red";
            return false;
         }
         if(user==""){
        document.getElementById("div3").innerHTML="*Username cant be empty";
                document.getElementById("div3").style.color="Red";
        return false;
         }
         if(phone==""){
        document.getElementById("div4").innerHTML="*Mobile cant be empty";
                document.getElementById("div4").style.color="Red";
        return false;
         }
       if(pass==""){
            document.getElementById("div5").innerHTML="*Password cant be empty";
                    document.getElementById("div5").style.color="Red";
            return false;
       }
         if(passwor==""){
            document.getElementById("div6").innerHTML="*Confirm Password cant be empty";
                    document.getElementById("div6").style.color="Red";
            return false; 
        }
        }
       