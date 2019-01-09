/***************************************************************************************************
* 파일명 : .java
* 기능 : 비독자관리 조회
* 작성일자 : 2009-08-07
* 작성자 : 권정윤
***************************************************************************************************/


package chosun.ciis.ss.sls.rdr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.rdr.dm.*;
import chosun.ciis.ss.sls.rdr.rec.*;

/**
 * 비독자관리 조회 
 */

public class SS_L_RDR_MNGMEMB_MODataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList rdrmngmemb = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_RDR_MNGMEMB_MODataSet(){}
	public SS_L_RDR_MNGMEMB_MODataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(11);
		while(rset0.next()){
			SS_L_RDR_MNGMEMB_MORDRMNGMEMBRecord rec = new SS_L_RDR_MNGMEMB_MORDRMNGMEMBRecord();
			rec.custclas = Util.checkString(rset0.getString("custclas"));
			rec.clsf = Util.checkString(rset0.getString("clsf"));
			rec.clsfdesc = Util.checkString(rset0.getString("clsfdesc"));
			rec.regdt = Util.checkString(rset0.getString("regdt"));
			rec.custnm = Util.checkString(rset0.getString("custnm"));
			rec.sex = Util.checkString(rset0.getString("sex"));
			rec.age = Util.checkString(rset0.getString("age"));
			rec.home_zip = Util.checkString(rset0.getString("home_zip"));
			rec.home_addr = Util.checkString(rset0.getString("home_addr"));
			rec.email = Util.checkString(rset0.getString("email"));
			rec.rdrptph_no1 = Util.checkString(rset0.getString("rdrptph_no1"));
			rec.medinm = Util.checkString(rset0.getString("medinm"));
			rec.subs_prd = Util.checkString(rset0.getString("subs_prd"));
			rec.chrn_pre = rset0.getInt("chrn_pre");
			rec.chrn_emy = rset0.getInt("chrn_emy");
			rec.chrn_mid = rset0.getInt("chrn_mid");
			rec.chrn_hig = rset0.getInt("chrn_hig");
			rec.evntdate_from = Util.checkString(rset0.getString("evntdate_from"));
			rec.evntdate_to = Util.checkString(rset0.getString("evntdate_to"));
			this.rdrmngmemb.add(rec);
		}
	}

	public String rdrmngmembOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rdrmngmemb.size();
		for(int i=0; i<size; i++){
			SS_L_RDR_MNGMEMB_MORDRMNGMEMBRecord rec = (SS_L_RDR_MNGMEMB_MORDRMNGMEMBRecord)rdrmngmemb.get(i);
			
			
			String code = rec.custclas;
			String name = rec.clsf;
			
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

	public String rdrmngmembChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rdrmngmemb.size();
		for(int i=0; i<size; i++){
			SS_L_RDR_MNGMEMB_MORDRMNGMEMBRecord rec = (SS_L_RDR_MNGMEMB_MORDRMNGMEMBRecord)rdrmngmemb.get(i);
			
			
			String code = rec.custclas;
			String name = rec.clsf;
			
			sb.append("<input name=\"");
			sb.append("custclas");
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

	public String rdrmngmembRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rdrmngmemb.size();
		for(int i=0; i<size; i++){
			SS_L_RDR_MNGMEMB_MORDRMNGMEMBRecord rec = (SS_L_RDR_MNGMEMB_MORDRMNGMEMBRecord)rdrmngmemb.get(i);
			
			
			String code = rec.custclas;
			String name = rec.clsf;
			
			sb.append("<input name=\"");
			sb.append("custclas");
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
	SS_L_RDR_MNGMEMB_MODataSet ds = (SS_L_RDR_MNGMEMB_MODataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.rdrmngmemb.size(); i++){
		SS_L_RDR_MNGMEMB_MORDRMNGMEMBRecord rdrmngmembRec = (SS_L_RDR_MNGMEMB_MORDRMNGMEMBRecord)ds.rdrmngmemb.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getRdrmngmemb()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= rdrmngmembRec.custclas%>
<%= rdrmngmembRec.clsf%>
<%= rdrmngmembRec.clsfdesc%>
<%= rdrmngmembRec.regdt%>
<%= rdrmngmembRec.custnm%>
<%= rdrmngmembRec.sex%>
<%= rdrmngmembRec.age%>
<%= rdrmngmembRec.home_zip%>
<%= rdrmngmembRec.home_addr%>
<%= rdrmngmembRec.email%>
<%= rdrmngmembRec.rdrptph_no1%>
<%= rdrmngmembRec.medinm%>
<%= rdrmngmembRec.subs_prd%>
<%= rdrmngmembRec.chrn_pre%>
<%= rdrmngmembRec.chrn_emy%>
<%= rdrmngmembRec.chrn_mid%>
<%= rdrmngmembRec.chrn_hig%>
<%= rdrmngmembRec.evntdate_from%>
<%= rdrmngmembRec.evntdate_to%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Aug 11 16:44:11 KST 2009 */