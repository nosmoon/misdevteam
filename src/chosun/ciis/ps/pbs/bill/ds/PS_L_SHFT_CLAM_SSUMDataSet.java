/***************************************************************************************************
* 파일명 : PS_L_SHFT_CLAM_SSUM.java
* 기능   : 자동이체청구확인요약목록
* 작성일자 : 2006-04-25
* 작성자 : 전현표
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ps.pbs.bill.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.bill.dm.*;
import chosun.ciis.ps.pbs.bill.rec.*;

/**
 * 출판국 -자동이체청구확인요약목록
 *
 */

public class PS_L_SHFT_CLAM_SSUMDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList rsltcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public PS_L_SHFT_CLAM_SSUMDataSet(){}
	public PS_L_SHFT_CLAM_SSUMDataSet(String errcode, String errmsg){
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
			PS_L_SHFT_CLAM_SSUMRSLTCURRecord rec = new PS_L_SHFT_CLAM_SSUMRSLTCURRecord();
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.basidt = Util.checkString(rset0.getString("basidt"));
			rec.shftclsfcd = Util.checkString(rset0.getString("shftclsfcd"));
			rec.shftclsfnm = Util.checkString(rset0.getString("shftclsfnm"));
			rec.clamnoit = rset0.getInt("clamnoit");
			rec.clamtotamt = rset0.getInt("clamtotamt");
			rec.recpnoit = rset0.getInt("recpnoit");
			rec.recptotamt = rset0.getInt("recptotamt");
			rec.billcoms = rset0.getInt("billcoms");
			this.rsltcur.add(rec);
		}
	}

	public String rsltcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rsltcur.size();
		for(int i=0; i<size; i++){
			PS_L_SHFT_CLAM_SSUMRSLTCURRecord rec = (PS_L_SHFT_CLAM_SSUMRSLTCURRecord)rsltcur.get(i);
			
			
			String code = rec.bocd;
			String name = rec.bonm;
			
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
			PS_L_SHFT_CLAM_SSUMRSLTCURRecord rec = (PS_L_SHFT_CLAM_SSUMRSLTCURRecord)rsltcur.get(i);
			
			
			String code = rec.bocd;
			String name = rec.bonm;
			
			sb.append("<input name=\"");
			sb.append("bocd");
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
			PS_L_SHFT_CLAM_SSUMRSLTCURRecord rec = (PS_L_SHFT_CLAM_SSUMRSLTCURRecord)rsltcur.get(i);
			
			
			String code = rec.bocd;
			String name = rec.bonm;
			
			sb.append("<input name=\"");
			sb.append("bocd");
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
	PS_L_SHFT_CLAM_SSUMDataSet ds = (PS_L_SHFT_CLAM_SSUMDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.rsltcur.size(); i++){
		PS_L_SHFT_CLAM_SSUMRSLTCURRecord rsltcurRec = (PS_L_SHFT_CLAM_SSUMRSLTCURRecord)ds.rsltcur.get(i);%>
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

<%= rsltcurRec.bocd%>
<%= rsltcurRec.bonm%>
<%= rsltcurRec.basidt%>
<%= rsltcurRec.shftclsfcd%>
<%= rsltcurRec.shftclsfnm%>
<%= rsltcurRec.clamnoit%>
<%= rsltcurRec.clamtotamt%>
<%= rsltcurRec.recpnoit%>
<%= rsltcurRec.recptotamt%>
<%= rsltcurRec.billcoms%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 03 17:49:09 KST 2006 */