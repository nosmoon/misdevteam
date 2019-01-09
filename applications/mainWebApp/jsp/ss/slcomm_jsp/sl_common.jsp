<!--JSP COMMENT START------------------------------------------------------------------------------->
<!--Caution : please write comments in english!!---------------------------------------------------->
<%---------------------------------------------------------------------------------------------------
* file name : sl_common.jsp
* function : common module for common code
* new date : 2003-10-27
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
<%@ page errorPage="/jsp/ss/comm_jsp/sys_error.jsp"%>
<%@	page import="
        java.sql.*,
        java.text.*,
        java.lang.*,
        java.util.*,
        java.io.*,
        javax.ejb.*,
        java.net.*,
        com.ksnet.card.*,

        somo.framework.db.*,
        somo.framework.expt.*,
        somo.framework.log.*,      
        somo.framework.prop.*,
        somo.framework.servlet.*,
        somo.framework.lib.*,
        somo.framework.util.*,

        chosun.ciis.ss.sal.common.dm.*,
        chosun.ciis.ss.sal.common.ds.*,
        chosun.ciis.ss.sal.common.rec.*,


        chosun.ciis.ss.sal.rdr.dm.*,
        chosun.ciis.ss.sal.rdr.ds.*,
        chosun.ciis.ss.sal.rdr.rec.*
"%>
<% //������ ĳ�� ����
response.setHeader("cache-Control","no-store"); //HTTP 1.1
response.setHeader("Pragma","no-cache"); //HTTP 1.0
response.setDateHeader ("Expires", 0);
%>
<!--JSP HEADER END---------------------------------------------------------------------------------->

<!--JSP METHOD START-------------------------------------------------------------------------------->
<%!
    /**
     * Uitl.leftKscStrB�� Ȯ���Ѵ�. ".."�� ���δ�.
     * @param str
     * @param maxBytes
     * @return String
     */
    private static String leftKscStrB(String str, int maxBytes){
        if(str == null && "".equals(str) || maxBytes <= 1) return "";
        String strTemp = "";
        if(str.getBytes().length <= maxBytes)
            strTemp = str;
        else{
            strTemp = Util.leftKscStrB(str, maxBytes) + "..";
        }
        return strTemp;
    }

    /**
     * null �� &nbsp;�� ��ȯ
     * @param str
     * @return String
     */
    private static String nullToNbsp(String str){
        return (str == null || str.trim().length() == 0)? "&nbsp;" : str;
    }

    /**
     * <, > , ", ' ó��
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

    //���ڿ����ʳ��� '-'�� �����Ѵ�.
    private static String deleteSideHyphen(String str){

        if(str.length()>0){
            if(str.charAt(0)=='-'){
                str = str.substring(1);
            }
            if(str.charAt(str.length()-1)=='-'){
                str = str.substring(0,str.length()-1);
            }
        }

        return str;
    }

%>
<!--JSP METHOD END---------------------------------------------------------------------------------->