agent_jre_version = '';
applet_jre_version = '';

function getAgentValue(key) {
	var token_id = '';
	if(global_sso_applet_object) {
		var str = global_sso_applet_object.getInstance();
		if(str == 'ok') {
			token_id = global_sso_applet_object.getAgentValue(key);
		}else{
			setTimeout("getAgentValue('"+key+"')", 1000);
		}
	}else{
			setTimeout("getAgentValue('"+key+"')", 1000);
	}
	
	return token_id;
}

/*
add function : check agent-token at Customer Site Application!
created : 2009.01.15 by dkpak@genics.co.kr
*/
function checkAgentTokenValue() {
	var rtn = '';
	if(global_sso_applet_object) {
		var str = global_sso_applet_object.getInstance();
		if(str == 'ok') {
			rtn = global_sso_applet_object.getAgentAliveFlag();
		}
	}
	
	return rtn;
}

function setAgentTokenId(token, ssoInfo, acl, license, applet_check) {
	if(global_sso_applet_object) {
		var str = global_sso_applet_object.getInstance();
		if(str == 'ok') {
			global_sso_applet_object.setAgentCertInfo(token, ssoInfo, acl, license, applet_check);
		}
	}
}


function delAgentTokenId() {
	var rtn = '';
	var str = '';
	if(global_sso_applet_object) {
			str = global_sso_applet_object.getInstance();
			if(str == 'ok') {
				global_sso_applet_object.delAgentCertInfo();
				rtn = 'ok';
			}
	}
	return rtn;
}

function setExtraAgentTokenId( name, value ) {
	if(global_sso_applet_object) {
		var str = global_sso_applet_object.getInstance();
		if(str == 'ok') {
			global_sso_applet_object.setExtraAgentValue(name, value);
		}
	}
}

function getExtraAgentValue(key) {
	var token_id = '';
	if(global_sso_applet_object) {
		var str = global_sso_applet_object.getInstance();
		if(str == 'ok') {
			token_id = global_sso_applet_object.getExtraAgentValue(key);
		}else{
			setTimeout("getExtraAgentValue('"+key+"')", 1000);
		}
	}else{
		setTimeout("getExtraAgentValue('"+key+"')", 1000);
	}
	
	return token_id;
}

function delExtraAgentTokenId() {
	if(global_sso_applet_object) {
		var str = global_sso_applet_object.getInstance();
		if(str == 'ok') {
			global_sso_applet_object.delExtraInfo();
		}	
		return 'ok';
	}else{
		setTimeout("delExtraAgentTokenId()", 1000);
	}
}


function setSSOCookie( name, value) { 
	document.cookie = name + "=" + value + "; path=/";
} 

function getSSOCookie(name) {
	var rtn = '';
	var offset;
	var end;
	var search = name + "=";
  if (document.cookie.length > 0) {                 
  	offset = document.cookie.indexOf(search);
   	if (offset != -1) {       
    	offset += search.length;                          
    	end = document.cookie.indexOf(";", offset);   
    	if (end == -1) {
     		end = document.cookie.length;
     	}
    	rtn = document.cookie.substring(offset, end);
  	}
  }  
  return rtn;
}

function delSSOCookie( name ) {
 	var expire = new Date();
 
 	expire.setDate( expire.getDate() - 30 );
 	document.cookie = name + "= " + "; expires=" + expire.toGMTString() + "; path=/";
}

function decodeURL(str){
	var s0, i, j, s, ss, u, n, f;
	s0 = "";                // decoded str
	for (i = 0; i < str.length; i++){   // scan the source str
		s = str.charAt(i);
		if (s == "+"){s0 += " ";}       // "+" should be changed to SP
		else {
			if (s != "%"){s0 += s;}     // add an unescaped char
			else{               // escape sequence decoding
				u = 0;          // unicode of the character
				f = 1;          // escape flag, zero means end of this sequence
				while (true) {
					ss = "";        // local str to parse as int
						for (j = 0; j < 2; j++ ) {  // get two maximum hex characters for parse
							sss = str.charAt(++i);
							if (((sss >= "0") && (sss <= "9")) || ((sss >= "a") && (sss <= "f"))  || ((sss >= "A") && (sss <= "F"))) {
								ss += sss;      // if hex, add the hex character
							} else {--i; break;}    // not a hex char., exit the loop
						}
					n = parseInt(ss, 16);           // parse the hex str as byte
					if (n <= 0x7f){u = n; f = 1;}   // single byte format
					if ((n >= 0xc0) && (n <= 0xdf)){u = n & 0x1f; f = 2;}   // double byte format
					if ((n >= 0xe0) && (n <= 0xef)){u = n & 0x0f; f = 3;}   // triple byte format
					if ((n >= 0xf0) && (n <= 0xf7)){u = n & 0x07; f = 4;}   // quaternary byte format (extended)
					if ((n >= 0x80) && (n <= 0xbf)){u = (u << 6) + (n & 0x3f); --f;}         // not a first, shift and add 6 lower bits
					if (f <= 1){break;}         // end of the utf byte sequence
					if (str.charAt(i + 1) == "%"){ i++ ;}                   // test for the next shift byte
					else {break;}                   // abnormal, format error
				}
			s0 += String.fromCharCode(u);           // add the escaped character
			}
		}
	}
	return s0;
}

function deco64(InStr){
  var len_1 = InStr.length;
  var ttb = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=";
  var len_res = InStr.length % 4;
  var len_div = len_1 - len_res;
  var re = new makeArray(3);
  var In  = new makeArray(4);
  var DecNum = new makeArray(4);
  var i=0;
  var Stat = "";
  var tmp16, tmp16s;
  var EnB=4;
  var str="";

  while(1)
  {
    if( i >= len_1 )
         break; 

    for(k=1;k<=4;k++)
    {
      In[k] = InStr.charAt(i++);
      DecNum[k] = ttb.indexOf(In[k]);
    } 

    if( i >= len_div )
    {
        Stat = "End";  
        if( len_res == 3 || DecNum[4] == 64 )
          EnB = 3;
        if( len_res == 2 || DecNum[3] == 64 )
          EnB = 2;
    }

    re[1] = ( DecNum[1] << 2 ) + ( DecNum[2] >> 4);
    re[2] = ( ( DecNum[2] & 15 ) << 4 ) + ( DecNum[3] >> 2);
    re[3] = ( ( DecNum[3] & 3 ) << 6 ) | DecNum[4] ;

    for(k=1;k<=3;k++)
    {
       if( k < EnB )
       { 
          tmp16 = re[k].toString(16);
          tmp16s = "%" + tmp16;
          str = str + tmp16s  ; 
       }
    }
   }
  str = unescape(str); 
  return str;
}

function enco64(InStr){
  var ttb = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=";
  var len_1 = InStr.length;
  var len_res = InStr.length % 3;
  var len_div = len_1 - len_res;
  var ra = new makeArray(4);
  var i=0;
  var Stat = "";

  var str="";
  while(1)
  {
    if( i >= len_1 )
         break; 


    if( i >= len_div )
         Stat = "End";  

    A = eval(InStr.charCodeAt(i++));
    B = eval(InStr.charCodeAt(i++));
    C = eval(InStr.charCodeAt(i++));

    if( i > len_div )
    {
        Stat = "End";  

        if( len_res >= 1)
          C = 0;
        if( len_res == 1 )
          B = 0;
    }
    ra[1] = A >> 2;
    ra[2] = ( (A & 3) << 4 ) + (B >> 4);
    ra[3] = ( ( B & 15 ) << 2 ) + ( C >> 6);
    ra[4] = C & 63;

    if( Stat == "End" && len_res >= 1 )
          ra[4] = 64; 
    if( Stat == "End" && len_res == 1 )
          ra[3] = 64;

    for(k=1;k<=4;k++)
       str = str + ttb.substr(ra[k],1); 
 }  
 return str;
}

function makeArray(n){
    this.length=n
    for(var i=1; i<=n; i++){
            this[i]=null;
    }
    return this
}

function getAgentVersion() {
	var version = '';
	if(global_sso_applet_object) {
				
		var str;
		str = global_sso_applet_object.getInstance();
		if(str == 'ok') {
			version = global_sso_applet_object.getAgentVersion();
		}
	
	}
	
	return version;
}

function getAppletVersion() {
	var version = '';
	if(global_sso_applet_object) {
		var str = global_sso_applet_object.getInstance();
		if(str == 'ok') {
			version = global_sso_applet_object.getAppletVersion();
		}	
	}
	
	return version;
}

function getAgentJREVersion() {
	var version = '';
	if(global_sso_applet_object) {
				
		var str;
		str = global_sso_applet_object.getInstance();
		if(str == 'ok') {
			version = global_sso_applet_object.getAgentJREVersion();
		}
	
	}
	
	return version;
}

function getAppletJREVersion() {
	var version = '';
	if(global_sso_applet_object) {
		var str = global_sso_applet_object.getInstance();
		if(str == 'ok') {
			version = global_sso_applet_object.getAppletJREVersion();
		}	
	}
	
	return version;
}

function killAgent() {
	if(global_sso_applet_object) {
		var str = global_sso_applet_object.getInstance();
		if(str == 'ok') {
			global_sso_applet_object.setStatus();
			setTimeout('goIndexPageCozAgentReinstall()', 1000);
		}
	}else{
			setTimeout('killAgent()', 1000);
	}
}

function goIndexPageCozAgentReinstall() {
	document.location.href="/";
}