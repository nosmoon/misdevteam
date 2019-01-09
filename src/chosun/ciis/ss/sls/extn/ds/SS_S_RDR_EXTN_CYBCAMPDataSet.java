/***************************************************************************************************
* 파일명 : SS_S_RDR_EXTN_CYBCAMPDataSet.java
* 기능 : 확장현황-사이버확장-대회 상세를 위한 DataSet
* 작성일자 : 2004-07-24
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 확장현황-사이버확장-대회 상세를 위한 DataSet
 */


public class SS_S_RDR_EXTN_CYBCAMPDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curmedicd = new ArrayList();
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String rdr_extncampno;
	public String campnm;
	public String frdt;
	public String todt;
	public String closyn;
	public String closdt;
	public String alonpayplandt;
	public String remk;

	public SS_S_RDR_EXTN_CYBCAMPDataSet(){}
	public SS_S_RDR_EXTN_CYBCAMPDataSet(String errcode, String errmsg, String rdr_extncampno, String campnm, String frdt, String todt, String closyn, String closdt, String alonpayplandt, String remk){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.rdr_extncampno = rdr_extncampno;
		this.campnm = campnm;
		this.frdt = frdt;
		this.todt = todt;
		this.closyn = closyn;
		this.closdt = closdt;
		this.alonpayplandt = alonpayplandt;
		this.remk = remk;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setRdr_extncampno(String rdr_extncampno){
		this.rdr_extncampno = rdr_extncampno;
	}

	public void setCampnm(String campnm){
		this.campnm = campnm;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setClosyn(String closyn){
		this.closyn = closyn;
	}

	public void setClosdt(String closdt){
		this.closdt = closdt;
	}

	public void setAlonpayplandt(String alonpayplandt){
		this.alonpayplandt = alonpayplandt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getRdr_extncampno(){
		return this.rdr_extncampno;
	}

	public String getCampnm(){
		return this.campnm;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getClosyn(){
		return this.closyn;
	}

	public String getClosdt(){
		return this.closdt;
	}

	public String getAlonpayplandt(){
		return this.alonpayplandt;
	}

	public String getRemk(){
		return this.remk;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.rdr_extncampno = Util.checkString(cstmt.getString(4));
		this.campnm = Util.checkString(cstmt.getString(5));
		this.frdt = Util.checkString(cstmt.getString(6));
		this.todt = Util.checkString(cstmt.getString(7));
		this.closyn = Util.checkString(cstmt.getString(8));
		this.closdt = Util.checkString(cstmt.getString(9));
		this.alonpayplandt = Util.checkString(cstmt.getString(10));
		this.remk = Util.checkString(cstmt.getString(11));
		ResultSet rset0 = (ResultSet) cstmt.getObject(12);
		while(rset0.next()){
			SS_S_RDR_EXTN_CYBCAMPCURCOMMLISTRecord rec = new SS_S_RDR_EXTN_CYBCAMPCURCOMMLISTRecord();
			rec.medicd = Util.checkString(rset0.getString("medicd"));
			rec.medinm = Util.checkString(rset0.getString("medinm"));
			rec.alonamt = rset0.getInt("alonamt");
			rec.cnvsalonamt = rset0.getInt("cnvsalonamt");
			this.curcommlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(13);
		while(rset1.next()){
			SS_S_RDR_EXTN_CYBCAMPCURMEDICDRecord rec = new SS_S_RDR_EXTN_CYBCAMPCURMEDICDRecord();
			rec.cicodeval = Util.checkString(rset1.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset1.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset1.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset1.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset1.getString("cicdynm"));
			this.curmedicd.add(rec);
		}
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_S_RDR_EXTN_CYBCAMPCURCOMMLISTRecord rec = (SS_S_RDR_EXTN_CYBCAMPCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.medicd;
			String name = rec.medinm;
			
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

	public String curmedicdOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curmedicd.size();
		for(int i=0; i<size; i++){
			SS_S_RDR_EXTN_CYBCAMPCURMEDICDRecord rec = (SS_S_RDR_EXTN_CYBCAMPCURMEDICDRecord)curmedicd.get(i);
			
			
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

	public String curcommlistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_S_RDR_EXTN_CYBCAMPCURCOMMLISTRecord rec = (SS_S_RDR_EXTN_CYBCAMPCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.medicd;
			String name = rec.medinm;
			
			sb.append("<input name=\"");
			sb.append("medicd");
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

	public String curmedicdChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curmedicd.size();
		for(int i=0; i<size; i++){
			SS_S_RDR_EXTN_CYBCAMPCURMEDICDRecord rec = (SS_S_RDR_EXTN_CYBCAMPCURMEDICDRecord)curmedicd.get(i);
			
			
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

	public String curcommlistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_S_RDR_EXTN_CYBCAMPCURCOMMLISTRecord rec = (SS_S_RDR_EXTN_CYBCAMPCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.medicd;
			String name = rec.medinm;
			
			sb.append("<input name=\"");
			sb.append("medicd");
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

	public String curmedicdRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curmedicd.size();
		for(int i=0; i<size; i++){
			SS_S_RDR_EXTN_CYBCAMPCURMEDICDRecord rec = (SS_S_RDR_EXTN_CYBCAMPCURMEDICDRecord)curmedicd.get(i);
			
			
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
	SS_S_RDR_EXTN_CYBCAMPDataSet ds = (SS_S_RDR_EXTN_CYBCAMPDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_S_RDR_EXTN_CYBCAMPCURCOMMLISTRecord curcommlistRec = (SS_S_RDR_EXTN_CYBCAMPCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curmedicd.size(); i++){
		SS_S_RDR_EXTN_CYBCAMPCURMEDICDRecord curmedicdRec = (SS_S_RDR_EXTN_CYBCAMPCURMEDICDRecord)ds.curmedicd.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getRdr_extncampno()%>
<%= ds.getCampnm()%>
<%= ds.getFrdt()%>
<%= ds.getTodt()%>
<%= ds.getClosyn()%>
<%= ds.getClosdt()%>
<%= ds.getAlonpayplandt()%>
<%= ds.getRemk()%>
<%= ds.getCurcommlist()%>
<%= ds.getCurmedicd()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.medicd%>
<%= curcommlistRec.medinm%>
<%= curcommlistRec.alonamt%>
<%= curcommlistRec.cnvsalonamt%>
<%= curmedicdRec.cicodeval%>
<%= curmedicdRec.cicdnm%>
<%= curmedicdRec.ciymgbcd%>
<%= curmedicdRec.cicdgb%>
<%= curmedicdRec.cicdynm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Aug 07 14:15:15 KST 2004 */