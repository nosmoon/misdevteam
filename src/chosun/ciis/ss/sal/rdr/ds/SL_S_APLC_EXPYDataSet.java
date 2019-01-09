/***************************************************************************************************
* 파일명 : SL_S_APLC_EXPYDataSet.java
* 기능 : 독자정보관리-자동이체신청-해지대상목록 상세조회
* 작성일자 : 2004-05-24
* 작성자 : 김상열
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sal.rdr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sal.rdr.dm.*;
import chosun.ciis.ss.sal.rdr.rec.*;

/**
 * 독자정보관리-자동이체신청-해지대상목록 상세조회
 *
 */


public class SL_S_APLC_EXPYDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList rsltcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public SL_S_APLC_EXPYDataSet(){}
	public SL_S_APLC_EXPYDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			SL_S_APLC_EXPYRSLTCURRecord rec = new SL_S_APLC_EXPYRSLTCURRecord();
			rec.aplcdt = Util.checkString(rset0.getString("aplcdt"));
			rec.shftbgnyymm = Util.checkString(rset0.getString("shftbgnyymm"));
			rec.shftclsf = Util.checkString(rset0.getString("shftclsf"));
			rec.prn = Util.checkString(rset0.getString("prn"));
			rec.pymtnm = Util.checkString(rset0.getString("pymtnm"));
			rec.email = Util.checkString(rset0.getString("email"));
			rec.tel1 = Util.checkString(rset0.getString("tel1"));
			rec.tel2 = Util.checkString(rset0.getString("tel2"));
			rec.tel3 = Util.checkString(rset0.getString("tel3"));
			rec.banknm = Util.checkString(rset0.getString("banknm"));
			rec.acctno = Util.checkString(rset0.getString("acctno"));
			rec.cardcmpynm = Util.checkString(rset0.getString("cardcmpynm"));
			rec.cardno = Util.checkString(rset0.getString("cardno"));
			rec.vdtyprd = Util.checkString(rset0.getString("vdtyprd"));
			this.rsltcur.add(rec);
		}
	}

	public String rsltcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rsltcur.size();
		for(int i=0; i<size; i++){
			SL_S_APLC_EXPYRSLTCURRecord rec = (SL_S_APLC_EXPYRSLTCURRecord)rsltcur.get(i);
			
			
			String code = rec.aplcdt;
			String name = rec.shftbgnyymm;
			
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

	public String rsltcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rsltcur.size();
		for(int i=0; i<size; i++){
			SL_S_APLC_EXPYRSLTCURRecord rec = (SL_S_APLC_EXPYRSLTCURRecord)rsltcur.get(i);
			
			
			String code = rec.aplcdt;
			String name = rec.shftbgnyymm;
			
			sb.append("<input name=\"");
			sb.append("aplcdt");
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

	public String rsltcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rsltcur.size();
		for(int i=0; i<size; i++){
			SL_S_APLC_EXPYRSLTCURRecord rec = (SL_S_APLC_EXPYRSLTCURRecord)rsltcur.get(i);
			
			
			String code = rec.aplcdt;
			String name = rec.shftbgnyymm;
			
			sb.append("<input name=\"");
			sb.append("aplcdt");
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
	SL_S_APLC_EXPYDataSet ds = (SL_S_APLC_EXPYDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.rsltcur.size(); i++){
		SL_S_APLC_EXPYRSLTCURRecord rsltcurRec = (SL_S_APLC_EXPYRSLTCURRecord)ds.rsltcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getRsltcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= rsltcurRec.aplcdt%>
<%= rsltcurRec.shftbgnyymm%>
<%= rsltcurRec.shftclsf%>
<%= rsltcurRec.prn%>
<%= rsltcurRec.pymtnm%>
<%= rsltcurRec.email%>
<%= rsltcurRec.tel1%>
<%= rsltcurRec.tel2%>
<%= rsltcurRec.tel3%>
<%= rsltcurRec.banknm%>
<%= rsltcurRec.acctno%>
<%= rsltcurRec.cardcmpynm%>
<%= rsltcurRec.cardno%>
<%= rsltcurRec.vdtyprd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 27 10:59:47 KST 2004 */