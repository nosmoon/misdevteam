/***************************************************************************************************
 * 파일명   : SP_SL_L_BNSITEM
 * 기능     : 관리자-판촉코드-목록
 * 작성일자 : 2007/05/25
 * 작성자   : 이혁
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.admin.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.rec.*;

/**
**  SP_SL_L_BNSITEM
**/

public class SL_L_BNSITEMDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList useclsfcur = new ArrayList();
	public ArrayList bnsitemcur = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SL_L_BNSITEMDataSet(){}
	public SL_L_BNSITEMDataSet(String errcode, String errmsg, long totalcnt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.totalcnt = totalcnt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setTotalcnt(long totalcnt){
		this.totalcnt = totalcnt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public long getTotalcnt(){
		return this.totalcnt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.totalcnt = cstmt.getLong(7);
		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			SL_L_BNSITEMBNSITEMCURRecord rec = new SL_L_BNSITEMBNSITEMCURRecord();
			rec.bns_itemcd = Util.checkString(rset0.getString("bns_itemcd"));
			rec.bns_itemnm = Util.checkString(rset0.getString("bns_itemnm"));
			rec.uprc = rset0.getInt("uprc");
			rec.mnftwon = Util.checkString(rset0.getString("mnftwon"));
			rec.spec = Util.checkString(rset0.getString("spec"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.useclsf = Util.checkString(rset0.getString("useclsf"));
			rec.useyn = Util.checkString(rset0.getString("useyn"));
			this.bnsitemcur.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(9);
		while(rset1.next()){
			SL_L_BNSITEMUSECLSFCURRecord rec = new SL_L_BNSITEMUSECLSFCURRecord();
			rec.cicodeval = Util.checkString(rset1.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset1.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset1.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset1.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset1.getString("cicdgb"));
			this.useclsfcur.add(rec);
		}
	}

	public String bnsitemcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bnsitemcur.size();
		for(int i=0; i<size; i++){
			SL_L_BNSITEMBNSITEMCURRecord rec = (SL_L_BNSITEMBNSITEMCURRecord)bnsitemcur.get(i);
			
			
			String code = rec.bns_itemcd;
			String name = rec.bns_itemnm;
			
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

	public String useclsfcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = useclsfcur.size();
		for(int i=0; i<size; i++){
			SL_L_BNSITEMUSECLSFCURRecord rec = (SL_L_BNSITEMUSECLSFCURRecord)useclsfcur.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
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

	public String bnsitemcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bnsitemcur.size();
		for(int i=0; i<size; i++){
			SL_L_BNSITEMBNSITEMCURRecord rec = (SL_L_BNSITEMBNSITEMCURRecord)bnsitemcur.get(i);
			
			
			String code = rec.bns_itemcd;
			String name = rec.bns_itemnm;
			
			sb.append("<input name=\"");
			sb.append("bns_itemcd");
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

	public String useclsfcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = useclsfcur.size();
		for(int i=0; i<size; i++){
			SL_L_BNSITEMUSECLSFCURRecord rec = (SL_L_BNSITEMUSECLSFCURRecord)useclsfcur.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<input name=\"");
			sb.append("cicodeval");
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

	public String bnsitemcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bnsitemcur.size();
		for(int i=0; i<size; i++){
			SL_L_BNSITEMBNSITEMCURRecord rec = (SL_L_BNSITEMBNSITEMCURRecord)bnsitemcur.get(i);
			
			
			String code = rec.bns_itemcd;
			String name = rec.bns_itemnm;
			
			sb.append("<input name=\"");
			sb.append("bns_itemcd");
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

	public String useclsfcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = useclsfcur.size();
		for(int i=0; i<size; i++){
			SL_L_BNSITEMUSECLSFCURRecord rec = (SL_L_BNSITEMUSECLSFCURRecord)useclsfcur.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<input name=\"");
			sb.append("cicodeval");
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
	SL_L_BNSITEMDataSet ds = (SL_L_BNSITEMDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.bnsitemcur.size(); i++){
		SL_L_BNSITEMBNSITEMCURRecord bnsitemcurRec = (SL_L_BNSITEMBNSITEMCURRecord)ds.bnsitemcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.useclsfcur.size(); i++){
		SL_L_BNSITEMUSECLSFCURRecord useclsfcurRec = (SL_L_BNSITEMUSECLSFCURRecord)ds.useclsfcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotalcnt()%>
<%= ds.getBnsitemcur()%>
<%= ds.getUseclsfcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= bnsitemcurRec.bns_itemcd%>
<%= bnsitemcurRec.bns_itemnm%>
<%= bnsitemcurRec.uprc%>
<%= bnsitemcurRec.mnftwon%>
<%= bnsitemcurRec.spec%>
<%= bnsitemcurRec.remk%>
<%= bnsitemcurRec.useclsf%>
<%= bnsitemcurRec.useyn%>
<%= useclsfcurRec.cicodeval%>
<%= useclsfcurRec.cicdnm%>
<%= useclsfcurRec.cicdynm%>
<%= useclsfcurRec.ciymgbcd%>
<%= useclsfcurRec.cicdgb%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 25 16:17:19 KST 2007 */