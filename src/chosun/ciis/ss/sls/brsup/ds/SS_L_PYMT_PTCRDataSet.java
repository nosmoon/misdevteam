/***************************************************************************************************
* 파일명 : SS_L_PYMT_PTCRDataSet.java
* 기능 : 지국업무지원-Billing자동이체-납부내역목록
* 작성일자 : 2004-03-18
* 작성자 : 김상열
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * 지국업무지원-Billing자동이체-납부내역목록
 *
 */


public class SS_L_PYMT_PTCRDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList rsltcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_PYMT_PTCRDataSet(){}
	public SS_L_PYMT_PTCRDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			SS_L_PYMT_PTCRRSLTCURRecord rec = new SS_L_PYMT_PTCRRSLTCURRecord();
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.basidt = Util.checkString(rset0.getString("basidt"));
			rec.shftclsfnm = Util.checkString(rset0.getString("shftclsfnm"));
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.rdrnm = Util.checkString(rset0.getString("rdrnm"));
			rec.medinm = Util.checkString(rset0.getString("medinm"));
			rec.clamqty = rset0.getInt("clamqty");
			rec.subsmappli = Util.checkString(rset0.getString("subsmappli"));
			rec.realsubsamt = rset0.getInt("realsubsamt");
			rec.erryn = Util.checkString(rset0.getString("erryn"));
			rec.recpocomnm = Util.checkString(rset0.getString("recpocomnm"));
			this.rsltcur.add(rec);
		}
	}

	public String rsltcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rsltcur.size();
		for(int i=0; i<size; i++){
			SS_L_PYMT_PTCRRSLTCURRecord rec = (SS_L_PYMT_PTCRRSLTCURRecord)rsltcur.get(i);


			String code = rec.bonm;
			String name = rec.basidt;

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
			SS_L_PYMT_PTCRRSLTCURRecord rec = (SS_L_PYMT_PTCRRSLTCURRecord)rsltcur.get(i);


			String code = rec.bonm;
			String name = rec.basidt;

			sb.append("<input name=\"");
			sb.append("bonm");
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
			SS_L_PYMT_PTCRRSLTCURRecord rec = (SS_L_PYMT_PTCRRSLTCURRecord)rsltcur.get(i);


			String code = rec.bonm;
			String name = rec.basidt;

			sb.append("<input name=\"");
			sb.append("bonm");
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
	SS_L_PYMT_PTCRDataSet ds = (SS_L_PYMT_PTCRDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.rsltcur.size(); i++){
		SS_L_PYMT_PTCRRSLTCURRecord rsltcurRec = (SS_L_PYMT_PTCRRSLTCURRecord)ds.rsltcur.get(i);%>
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

<%= rsltcurRec.bonm%>
<%= rsltcurRec.basidt%>
<%= rsltcurRec.shftclsfnm%>
<%= rsltcurRec.rdr_no%>
<%= rsltcurRec.rdrnm%>
<%= rsltcurRec.medinm%>
<%= rsltcurRec.clamqty%>
<%= rsltcurRec.subsmappli%>
<%= rsltcurRec.realsubsamt%>
<%= rsltcurRec.erryn%>
<%= rsltcurRec.recpocomnm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 22 22:04:30 KST 2004 */