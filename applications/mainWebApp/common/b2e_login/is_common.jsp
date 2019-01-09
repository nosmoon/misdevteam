<!--JSP COMMENT START------------------------------------------------------------------------------->
<!--Caution : please write comments in english!!---------------------------------------------------->
<%---------------------------------------------------------------------------------------------------
* file name : is_common.jsp
* function : common module for common code
* new date : 2004-02-19
* writer : unongko
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* update_info :
* updater :
* update date :
* backup file name :
---------------------------------------------------------------------------------------------------%>
<!--JSP COMMENT END--------------------------------------------------------------------------------->

<!--JSP HEADER START-------------------------------------------------------------------------------->
 <% //페이지 캐싱 막기
//response.setHeader("cache-Control","no-store"); //HTTP 1.1
//response.setHeader("Pragma","no-cache"); //HTTP 1.0
//response.setDateHeader ("Expires", 0);
%>
<%--JSP HEADER END---------------------------------------------------------------------------------%>
<%--JSP METHOD START-------------------------------------------------------------------------------%>
<%!
    /**
     * Uitl.leftKscStrB를 확장한다. ".."을 붙인다.
     * @param str
     * @param maxBytes
     * @return String
     */
    private static String leftKscStrB(String str, int maxBytes) throws UnsupportedEncodingException{
        //Null 은 "" 으로
        if(str == null) return "";

        String strTemp = str.trim();

        int strLen = strTemp.length();
        int totLen  = 0;      //컷팅된 글자의 총 byte 수
        int len = 0;          //컷팅된 마지막 글자의 byte 길이
        boolean cut = false;  //컷팅여부

        char[] out = new char[strLen];
        int i = 0;
        for(i = 0; i < strLen; i++){
            if(totLen == maxBytes || totLen == maxBytes + 1) break;
            len = String.valueOf(strTemp.charAt(i)).getBytes("KSC5601").length;
            totLen = totLen + len;
        }
        if(totLen == maxBytes + 1){ //byte 하나가 넘칠 경우 마지막 글자의 byte는 제외
            totLen = totLen - len;
            cut = true;
        }else{
            if(i == strLen){
                cut = false;
            }else{
                cut = true;
            }
        }
        strTemp = new String(strTemp.getBytes(), 0, totLen, "KSC5601");
        return (cut)? strTemp + ".." : strTemp;
    }

    /**
     * null 을 &nbsp;로 변환
     * @param str
     * @return String
     */
    private static String nullToNbsp(String str){
        return (str == null || str.trim().length() == 0)? "&nbsp;" : str;
    }

    /**
     * <, > , ", ' 처리
     * @param str
     * @return String
     */
    private static String encSpecialChar(String str){
        String temp = str.replaceAll("<", "&lt;");
        temp = temp.replaceAll(">", "&gt;");
        temp = temp.replaceAll("\"", "&quot;");
        temp = temp.replaceAll("'", "&#39;");
        return temp;
    }

    //문자열양쪽끝의 '-'를 삭제한다.
    private static String deleteSideHyphen(String str){
        if(str.length()>0){
            if(str.charAt(0)=='-'){
                if(str.length() == 1) str = "";
                else str = str.substring(1);
            }
            if(str.length()>0 && str.charAt(str.length()-1)=='-'){
                str = str.substring(0,str.length()-1);
            }
        }

        return str;
    }

    // 전달된 쿠키에 설정된 값을 얻어서 리턴한다.
    public String getCookieParameterValue(HttpServletRequest req, String param, boolean required){
        String ret = "";
        Cookie[] cookies = req.getCookies();
        if(cookies != null){
            for(int i=0; i<cookies.length; i++){
                if(cookies[i].getName().equals(param)){
                    ret = Util.Uni2Ksc(cookies[i].getValue());
                }
            }
        }

        // if("".equals(ret)) throw new SysException(new Exception("필수 항목( "+param+" )의 값을 쿠키에서 얻을 수 없습니다."));
        if("".equals(ret) && param.equals("CMPYNM")) {
        	ret = Util.getSessionParameterValue(req, "cmpynm", true);
        }

        if("".equals(ret) && param.equals("EMP_NM")) {
        	ret = Util.getSessionParameterValue(req, "emp_nm", true);
        }
       	return ret;
    }

%>
<%--JSP METHOD END---------------------------------------------------------------------------------%>
