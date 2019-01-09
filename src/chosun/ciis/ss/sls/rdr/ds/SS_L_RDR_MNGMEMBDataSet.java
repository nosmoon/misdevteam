/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자관리 비독자관리 조회 
* 작성일자 : 2009/09/25
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
 * 독자관리 비독자관리 조회
 */

public class SS_L_RDR_MNGMEMBDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList rdrmngmemb = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_RDR_MNGMEMBDataSet(){}
	public SS_L_RDR_MNGMEMBDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(16);
		while(rset0.next()){
			SS_L_RDR_MNGMEMBRDRMNGMEMBRecord rec = new SS_L_RDR_MNGMEMBRDRMNGMEMBRecord();
			rec.cmpycd = Util.checkString(rset0.getString("cmpycd"));
			rec.deptcd = Util.checkString(rset0.getString("deptcd"));
			rec.custclas = Util.checkString(rset0.getString("custclas"));
			rec.custclas2 = Util.checkString(rset0.getString("custclas2"));
			rec.area = Util.checkString(rset0.getString("area"));
			rec.custclasdesc = Util.checkString(rset0.getString("custclasdesc"));
			rec.custseq = Util.checkString(rset0.getString("custseq"));
			rec.evntdate_from = Util.checkString(rset0.getString("evntdate_from"));
			rec.evntdate_to = Util.checkString(rset0.getString("evntdate_to"));
			rec.custnm = Util.checkString(rset0.getString("custnm"));
			rec.custennm = Util.checkString(rset0.getString("custennm"));
			rec.prn = Util.checkString(rset0.getString("prn"));
			rec.home_zip = Util.checkString(rset0.getString("home_zip"));
			rec.home_addr = Util.checkString(rset0.getString("home_addr"));
			rec.home_dtlsaddr = Util.checkString(rset0.getString("home_dtlsaddr"));
			rec.hometel_no1 = Util.checkString(rset0.getString("hometel_no1"));
			rec.hometel_no2 = Util.checkString(rset0.getString("hometel_no2"));
			rec.hometel_no3 = Util.checkString(rset0.getString("hometel_no3"));
			rec.offitel_no1 = Util.checkString(rset0.getString("offitel_no1"));
			rec.offitel_no2 = Util.checkString(rset0.getString("offitel_no2"));
			rec.offitel_no3 = Util.checkString(rset0.getString("offitel_no3"));
			rec.rdrptph_no1 = Util.checkString(rset0.getString("rdrptph_no1"));
			rec.rdrptph_no2 = Util.checkString(rset0.getString("rdrptph_no2"));
			rec.rdrptph_no3 = Util.checkString(rset0.getString("rdrptph_no3"));
			rec.offi_zip = Util.checkString(rset0.getString("offi_zip"));
			rec.offi_addr = Util.checkString(rset0.getString("offi_addr"));
			rec.offi_dtlsaddr = Util.checkString(rset0.getString("offi_dtlsaddr"));
			rec.email = Util.checkString(rset0.getString("email"));
			rec.blng = Util.checkString(rset0.getString("blng"));
			rec.posi = Util.checkString(rset0.getString("posi"));
			rec.achievement = Util.checkString(rset0.getString("achievement"));
			rec.grade = Util.checkString(rset0.getString("grade"));
			rec.cust_stat = Util.checkString(rset0.getString("cust_stat"));
			rec.inout = Util.checkString(rset0.getString("inout"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.updateyn = Util.checkString(rset0.getString("updateyn"));
			rec.clsf = Util.checkString(rset0.getString("clsf"));
			rec.clsfdesc = Util.checkString(rset0.getString("clsfdesc"));
			rec.sex = Util.checkString(rset0.getString("sex"));
			rec.age = Util.checkString(rset0.getString("age"));
			rec.chrn_pre = rset0.getInt("chrn_pre");
			rec.chrn_emy = rset0.getInt("chrn_emy");
			rec.chrn_mid = rset0.getInt("chrn_mid");
			rec.chrn_hig = rset0.getInt("chrn_hig");
			rec.subs_prd = Util.checkString(rset0.getString("subs_prd"));
			rec.medinm = Util.checkString(rset0.getString("medinm"));
			rec.regdt = Util.checkString(rset0.getString("regdt"));
			this.rdrmngmemb.add(rec);
		}
	}

	public String rdrmngmembOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rdrmngmemb.size();
		for(int i=0; i<size; i++){
			SS_L_RDR_MNGMEMBRDRMNGMEMBRecord rec = (SS_L_RDR_MNGMEMBRDRMNGMEMBRecord)rdrmngmemb.get(i);
			
			
			String code = rec.cmpycd;
			String name = rec.deptcd;
			
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
			SS_L_RDR_MNGMEMBRDRMNGMEMBRecord rec = (SS_L_RDR_MNGMEMBRDRMNGMEMBRecord)rdrmngmemb.get(i);
			
			
			String code = rec.cmpycd;
			String name = rec.deptcd;
			
			sb.append("<input name=\"");
			sb.append("cmpycd");
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
			SS_L_RDR_MNGMEMBRDRMNGMEMBRecord rec = (SS_L_RDR_MNGMEMBRDRMNGMEMBRecord)rdrmngmemb.get(i);
			
			
			String code = rec.cmpycd;
			String name = rec.deptcd;
			
			sb.append("<input name=\"");
			sb.append("cmpycd");
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
	SS_L_RDR_MNGMEMBDataSet ds = (SS_L_RDR_MNGMEMBDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.rdrmngmemb.size(); i++){
		SS_L_RDR_MNGMEMBRDRMNGMEMBRecord rdrmngmembRec = (SS_L_RDR_MNGMEMBRDRMNGMEMBRecord)ds.rdrmngmemb.get(i);%>
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

<%= rdrmngmembRec.cmpycd%>
<%= rdrmngmembRec.deptcd%>
<%= rdrmngmembRec.custclas%>
<%= rdrmngmembRec.custclas2%>
<%= rdrmngmembRec.area%>
<%= rdrmngmembRec.custclasdesc%>
<%= rdrmngmembRec.custseq%>
<%= rdrmngmembRec.evntdate_from%>
<%= rdrmngmembRec.evntdate_to%>
<%= rdrmngmembRec.custnm%>
<%= rdrmngmembRec.custennm%>
<%= rdrmngmembRec.prn%>
<%= rdrmngmembRec.home_zip%>
<%= rdrmngmembRec.home_addr%>
<%= rdrmngmembRec.home_dtlsaddr%>
<%= rdrmngmembRec.hometel_no1%>
<%= rdrmngmembRec.hometel_no2%>
<%= rdrmngmembRec.hometel_no3%>
<%= rdrmngmembRec.offitel_no1%>
<%= rdrmngmembRec.offitel_no2%>
<%= rdrmngmembRec.offitel_no3%>
<%= rdrmngmembRec.rdrptph_no1%>
<%= rdrmngmembRec.rdrptph_no2%>
<%= rdrmngmembRec.rdrptph_no3%>
<%= rdrmngmembRec.offi_zip%>
<%= rdrmngmembRec.offi_addr%>
<%= rdrmngmembRec.offi_dtlsaddr%>
<%= rdrmngmembRec.email%>
<%= rdrmngmembRec.blng%>
<%= rdrmngmembRec.posi%>
<%= rdrmngmembRec.achievement%>
<%= rdrmngmembRec.grade%>
<%= rdrmngmembRec.cust_stat%>
<%= rdrmngmembRec.inout%>
<%= rdrmngmembRec.remk%>
<%= rdrmngmembRec.updateyn%>
<%= rdrmngmembRec.clsf%>
<%= rdrmngmembRec.clsfdesc%>
<%= rdrmngmembRec.sex%>
<%= rdrmngmembRec.age%>
<%= rdrmngmembRec.chrn_pre%>
<%= rdrmngmembRec.chrn_emy%>
<%= rdrmngmembRec.chrn_mid%>
<%= rdrmngmembRec.chrn_hig%>
<%= rdrmngmembRec.subs_prd%>
<%= rdrmngmembRec.medinm%>
<%= rdrmngmembRec.regdt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Sep 25 15:12:29 KST 2009 */