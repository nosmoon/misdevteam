<%---------------------------------------------------------------------------------------------------
* file name : ps_common.jsp
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
<%@ page errorPage="/jsp/ps/comm_jsp/app_error.jsp"%>
<%@	page import="
		java.sql.*,
		java.text.*,
		java.lang.*,
		java.util.*,
		java.io.*,
		javax.ejb.*,
		somo.framework.db.*,
		somo.framework.expt.*,
		somo.framework.log.*,
		somo.framework.ejb.*,
		somo.framework.prop.*,
		somo.framework.servlet.*,
		somo.framework.lib.*,
        somo.framework.util.*,
		chosun.ciis.ps.pbs.common.ds.*,
		chosun.ciis.ps.pbs.common.rec.*,
		chosun.ciis.ps.pbs.common.dm.*,
		chosun.ciis.ps.pbs.code.ds.*,
		chosun.ciis.ps.pbs.code.rec.*,
		chosun.ciis.ps.pbs.code.dm.*,
		chosun.ciis.ps.pbs.reader.ds.*,
		chosun.ciis.ps.pbs.reader.rec.*,
		chosun.ciis.ps.pbs.reader.dm.*,
		chosun.ciis.ps.pbs.send.ds.*,
		chosun.ciis.ps.pbs.send.rec.*,
		chosun.ciis.ps.pbs.send.dm.*,
		chosun.ciis.ps.pbs.allow.ds.*,
		chosun.ciis.ps.pbs.allow.rec.*,
		chosun.ciis.ps.pbs.allow.dm.*,
		chosun.ciis.ps.pbs.share.ds.*,
		chosun.ciis.ps.pbs.share.rec.*,
		chosun.ciis.ps.pbs.share.dm.*,
		chosun.ciis.ps.pbs.bill.ds.*,
		chosun.ciis.ps.pbs.bill.rec.*,
		chosun.ciis.ps.pbs.bill.dm.*,
		chosun.ciis.ps.pbs.support.ds.*,
		chosun.ciis.ps.pbs.support.rec.*,
		chosun.ciis.ps.pbs.support.dm.*,
		chosun.ciis.ps.pbs.print.ds.*,
		chosun.ciis.ps.pbs.print.rec.*,
		chosun.ciis.ps.pbs.print.dm.*,
		kr.co.comsquare.rwXmlLib.*,
        chosun.ciis.co.lib.xi.RwXmlWrapper
"
%>
<% //������ ĳ�� ����
//response.setHeader("cache-Control","no-store"); //HTTP 1.1
//response.setHeader("Pragma","no-cache"); //HTTP 1.0
//response.setDateHeader ("Expires", 0);
%>
<%!
    /**
     * Uitl.leftKscStrB�� Ȯ���Ѵ�. ".."�� ���δ�.
     * @param str
     * @param maxBytes
     * @return String
     */
    private static String leftKscStrB(String str, int maxBytes) throws UnsupportedEncodingException{
        //Null �� "" ����
        if(str == null) return "";

        String strTemp = str.trim();

        int strLen = strTemp.length();
        int totLen  = 0;      //���õ� ������ �� byte ��
        int len = 0;          //���õ� ������ ������ byte ����
        boolean cut = false;  //���ÿ���

        char[] out = new char[strLen];
        int i = 0;
        for(i = 0; i < strLen; i++){
            if(totLen == maxBytes || totLen == maxBytes + 1) break;
            len = String.valueOf(strTemp.charAt(i)).getBytes("KSC5601").length;
            totLen = totLen + len;
        }
        if(totLen == maxBytes + 1){ //byte �ϳ��� ��ĥ ��� ������ ������ byte�� ����
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
                if(str.length() == 1) str = "";
                else str = str.substring(1);
            }
            if(str.length()>0 && str.charAt(str.length()-1)=='-'){
                str = str.substring(0,str.length()-1);
            }
        }

        return str;
    }

    // ���޵� ��Ű�� ������ ���� �� �����Ѵ�.
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

        // if("".equals(ret)) throw new SysException(new Exception("�ʼ� �׸�( "+param+" )�� ���� ��Ű���� ���� �� �����ϴ�."));
        if("".equals(ret) && param.equals("CMPYNM")) {
        	ret = Util.getSessionParameterValue(req, "cmpynm", true);
        }

        if("".equals(ret) && param.equals("EMP_NM")) {
        	ret = Util.getSessionParameterValue(req, "emp_nm", true);
        }
       	return ret;
    }

%>
