/***************************************************************************************************
* 파일명 : SP_PS_L_BNS_BOOK_CD.java
* 발송-반송관리 선택된 독자번호의 보너스북 조회
* 작성일자 : 2004-03-19
* 작성자 : 김건호 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 : 
* 수정일자 :   
* 백업 :   
***************************************************************************************************/


package chosun.ciis.ps.pbs.send.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.send.dm.*;
import chosun.ciis.ps.pbs.send.rec.*;

/**
 * 발송-반송관리 선택된 독자번호의 보너스북 조회
 *
 */

  

public class PS_L_BNS_BOOK_CDDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList bns_bookcdcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public PS_L_BNS_BOOK_CDDataSet(){}
	public PS_L_BNS_BOOK_CDDataSet(String errcode, String errmsg){
		this.errcode = errcode;
		this.errmsg = errmsg;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			PS_L_BNS_BOOK_CDBNS_BOOKCDCURRecord rec = new PS_L_BNS_BOOK_CDBNS_BOOKCDCURRecord();
			rec.bns_bookcd = Util.checkString(rset0.getString("bns_bookcd"));
			rec.bns_booknm = Util.checkString(rset0.getString("bns_booknm"));
			rec.cmpycd = Util.checkString(rset0.getString("cmpycd"));
			rec.bgnvdtydt = Util.checkString(rset0.getString("bgnvdtydt"));
			rec.endvdtydt = Util.checkString(rset0.getString("endvdtydt"));
			this.bns_bookcdcur.add(rec);
		}
	}

	public String bns_bookcdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bns_bookcdcur.size();
		for(int i=0; i<size; i++){
			PS_L_BNS_BOOK_CDBNS_BOOKCDCURRecord rec = (PS_L_BNS_BOOK_CDBNS_BOOKCDCURRecord)bns_bookcdcur.get(i);
			
			
			String code = rec.bns_bookcd;
			String name = rec.bns_booknm;
			
			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String bns_bookcdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bns_bookcdcur.size();
		for(int i=0; i<size; i++){
			PS_L_BNS_BOOK_CDBNS_BOOKCDCURRecord rec = (PS_L_BNS_BOOK_CDBNS_BOOKCDCURRecord)bns_bookcdcur.get(i);
			
			
			String code = rec.bns_bookcd;
			String name = rec.bns_booknm;
			
			sb.append("<input name=\"");
			sb.append("bns_bookcd");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String bns_bookcdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bns_bookcdcur.size();
		for(int i=0; i<size; i++){
			PS_L_BNS_BOOK_CDBNS_BOOKCDCURRecord rec = (PS_L_BNS_BOOK_CDBNS_BOOKCDCURRecord)bns_bookcdcur.get(i);
			
			
			String code = rec.bns_bookcd;
			String name = rec.bns_booknm;
			
			sb.append("<input name=\"");
			sb.append("bns_bookcd");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PS_L_BNS_BOOK_CDDataSet ds = (PS_L_BNS_BOOK_CDDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.bns_bookcdcur.size(); i++){
		PS_L_BNS_BOOK_CDBNS_BOOKCDCURRecord bns_bookcdcurRec = (PS_L_BNS_BOOK_CDBNS_BOOKCDCURRecord)ds.bns_bookcdcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getBns_bookcdcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= bns_bookcdcurRec.bns_bookcd%>
<%= bns_bookcdcurRec.bns_booknm%>
<%= bns_bookcdcurRec.cmpycd%>
<%= bns_bookcdcurRec.bgnvdtydt%>
<%= bns_bookcdcurRec.endvdtydt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Mar 19 17:09:29 KST 2004 */