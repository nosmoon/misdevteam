/***************************************************************************************************
* 파일명 : CO_S_SCHEDataSet.java
* 기능 : 정보공유-일정-상세를 위한 DataSet
* 작성일자 : 2004-04-24
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/

package chosun.ciis.ss.sls.share.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.share.dm.*;
import chosun.ciis.ss.sls.share.rec.*;

/**
 * 정보공유-일정-상세를 위한 DataSet
 */

public class CO_S_SCHEDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist2 = new ArrayList();
	public ArrayList curcommlist3 = new ArrayList();
	public String errcode;
	public String errmsg;
	public long seq;
	public String schemangitemcd;
	public String schemangitemcd_nm;
	public String schemangunitcd;
	public String schemangunitcd_nm;
	public String frdt;
	public String todt;
	public String remk;
	public String deptcd;
	public String deptnm;
	public String use_pers;
	public String use_persclsf;
	public String use_persclsf_nm;
	public String empnm;

	public CO_S_SCHEDataSet(){}
	public CO_S_SCHEDataSet(String errcode, String errmsg, long seq, String schemangitemcd, String schemangitemcd_nm, String schemangunitcd, String schemangunitcd_nm, String frdt, String todt, String remk, String deptcd, String deptnm, String use_pers, String use_persclsf, String use_persclsf_nm, String empnm){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.seq = seq;
		this.schemangitemcd = schemangitemcd;
		this.schemangitemcd_nm = schemangitemcd_nm;
		this.schemangunitcd = schemangunitcd;
		this.schemangunitcd_nm = schemangunitcd_nm;
		this.frdt = frdt;
		this.todt = todt;
		this.remk = remk;
		this.deptcd = deptcd;
		this.deptnm = deptnm;
		this.use_pers = use_pers;
		this.use_persclsf = use_persclsf;
		this.use_persclsf_nm = use_persclsf_nm;
		this.empnm = empnm;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setSeq(long seq){
		this.seq = seq;
	}

	public void setSchemangitemcd(String schemangitemcd){
		this.schemangitemcd = schemangitemcd;
	}

	public void setSchemangitemcd_nm(String schemangitemcd_nm){
		this.schemangitemcd_nm = schemangitemcd_nm;
	}

	public void setSchemangunitcd(String schemangunitcd){
		this.schemangunitcd = schemangunitcd;
	}

	public void setSchemangunitcd_nm(String schemangunitcd_nm){
		this.schemangunitcd_nm = schemangunitcd_nm;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setDeptnm(String deptnm){
		this.deptnm = deptnm;
	}

	public void setUse_pers(String use_pers){
		this.use_pers = use_pers;
	}

	public void setUse_persclsf(String use_persclsf){
		this.use_persclsf = use_persclsf;
	}

	public void setUse_persclsf_nm(String use_persclsf_nm){
		this.use_persclsf_nm = use_persclsf_nm;
	}

	public void setEmpnm(String empnm){
		this.empnm = empnm;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public long getSeq(){
		return this.seq;
	}

	public String getSchemangitemcd(){
		return this.schemangitemcd;
	}

	public String getSchemangitemcd_nm(){
		return this.schemangitemcd_nm;
	}

	public String getSchemangunitcd(){
		return this.schemangunitcd;
	}

	public String getSchemangunitcd_nm(){
		return this.schemangunitcd_nm;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getDeptnm(){
		return this.deptnm;
	}

	public String getUse_pers(){
		return this.use_pers;
	}

	public String getUse_persclsf(){
		return this.use_persclsf;
	}

	public String getUse_persclsf_nm(){
		return this.use_persclsf_nm;
	}

	public String getEmpnm(){
		return this.empnm;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.seq = cstmt.getLong(4);
		this.schemangitemcd = Util.checkString(cstmt.getString(5));
		this.schemangitemcd_nm = Util.checkString(cstmt.getString(6));
		this.schemangunitcd = Util.checkString(cstmt.getString(7));
		this.schemangunitcd_nm = Util.checkString(cstmt.getString(8));
		this.frdt = Util.checkString(cstmt.getString(9));
		this.todt = Util.checkString(cstmt.getString(10));
		this.remk = Util.checkString(cstmt.getString(11));
		this.deptcd = Util.checkString(cstmt.getString(12));
		this.deptnm = Util.checkString(cstmt.getString(13));
		this.use_pers = Util.checkString(cstmt.getString(14));
		this.use_persclsf = Util.checkString(cstmt.getString(15));
		this.use_persclsf_nm = Util.checkString(cstmt.getString(16));
		this.empnm = Util.checkString(cstmt.getString(17));
		ResultSet rset0 = (ResultSet) cstmt.getObject(18);
		while(rset0.next()){
			CO_S_SCHECURCOMMLIST2Record rec = new CO_S_SCHECURCOMMLIST2Record();
			rec.cicodeval = Util.checkString(rset0.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset0.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset0.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset0.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset0.getString("cicdynm"));
			this.curcommlist2.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(19);
		while(rset1.next()){
			CO_S_SCHECURCOMMLIST3Record rec = new CO_S_SCHECURCOMMLIST3Record();
			rec.cicodeval = Util.checkString(rset1.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset1.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset1.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset1.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset1.getString("cicdynm"));
			this.curcommlist3.add(rec);
		}
	}

	public String curcommlist2OptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist2.size();
		for(int i=0; i<size; i++){
			CO_S_SCHECURCOMMLIST2Record rec = (CO_S_SCHECURCOMMLIST2Record)curcommlist2.get(i);
			
			
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

	public String curcommlist3OptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist3.size();
		for(int i=0; i<size; i++){
			CO_S_SCHECURCOMMLIST3Record rec = (CO_S_SCHECURCOMMLIST3Record)curcommlist3.get(i);
			
			
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

	public String curcommlist2ChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist2.size();
		for(int i=0; i<size; i++){
			CO_S_SCHECURCOMMLIST2Record rec = (CO_S_SCHECURCOMMLIST2Record)curcommlist2.get(i);
			
			
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

	public String curcommlist3ChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist3.size();
		for(int i=0; i<size; i++){
			CO_S_SCHECURCOMMLIST3Record rec = (CO_S_SCHECURCOMMLIST3Record)curcommlist3.get(i);
			
			
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

	public String curcommlist2RdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist2.size();
		for(int i=0; i<size; i++){
			CO_S_SCHECURCOMMLIST2Record rec = (CO_S_SCHECURCOMMLIST2Record)curcommlist2.get(i);
			
			
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

	public String curcommlist3RdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist3.size();
		for(int i=0; i<size; i++){
			CO_S_SCHECURCOMMLIST3Record rec = (CO_S_SCHECURCOMMLIST3Record)curcommlist3.get(i);
			
			
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
	CO_S_SCHEDataSet ds = (CO_S_SCHEDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist2.size(); i++){
		CO_S_SCHECURCOMMLIST2Record curcommlist2Rec = (CO_S_SCHECURCOMMLIST2Record)ds.curcommlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curcommlist3.size(); i++){
		CO_S_SCHECURCOMMLIST3Record curcommlist3Rec = (CO_S_SCHECURCOMMLIST3Record)ds.curcommlist3.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getSeq()%>
<%= ds.getSchemangitemcd()%>
<%= ds.getSchemangitemcd_nm()%>
<%= ds.getSchemangunitcd()%>
<%= ds.getSchemangunitcd_nm()%>
<%= ds.getFrdt()%>
<%= ds.getTodt()%>
<%= ds.getRemk()%>
<%= ds.getDeptcd()%>
<%= ds.getDeptnm()%>
<%= ds.getUse_pers()%>
<%= ds.getUse_persclsf()%>
<%= ds.getUse_persclsf_nm()%>
<%= ds.getEmpnm()%>
<%= ds.getCurcommlist2()%>
<%= ds.getCurcommlist3()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlist2Rec.cicodeval%>
<%= curcommlist2Rec.cicdnm%>
<%= curcommlist2Rec.ciymgbcd%>
<%= curcommlist2Rec.cicdgb%>
<%= curcommlist2Rec.cicdynm%>
<%= curcommlist3Rec.cicodeval%>
<%= curcommlist3Rec.cicdnm%>
<%= curcommlist3Rec.ciymgbcd%>
<%= curcommlist3Rec.cicdgb%>
<%= curcommlist3Rec.cicdynm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jun 07 10:27:21 KST 2004 */