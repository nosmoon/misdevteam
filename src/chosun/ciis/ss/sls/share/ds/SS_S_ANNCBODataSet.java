/***************************************************************************************************
* 파일명 : .java
* 기능 : 정보공유-실시간공지-지국공지 상세조회
* 작성일자 : 2009-04-16
* 작성자 : 권정윤
***************************************************************************************************/


package chosun.ciis.ss.sls.share.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.share.dm.*;
import chosun.ciis.ss.sls.share.rec.*;

/**
 * 정보공유-실시간공지-지국공지 상세조회
 */

public class SS_S_ANNCBODataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long seq;
	public String makepersid;
	public String makepersnm;
	public String posicd;
	public String posinm;
	public String deptcd;
	public String deptnm;
	public String rmsgclsf;
	public String rmsgdept;
	public String rmsgdeptnm;
	public String rmsgarea;
	public String rmsgareanm;
	public String anncbgntm;
	public String anncendtm;
	public String annctitl;
	public String annccont;
	public String incmgpers;
	public String incmgdt;
	public String chgpers;
	public String chgdt;

	public SS_S_ANNCBODataSet(){}
	public SS_S_ANNCBODataSet(String errcode, String errmsg, long seq, String makepersid, String makepersnm, String posicd, String posinm, String deptcd, String deptnm, String rmsgclsf, String rmsgdept, String rmsgdeptnm, String rmsgarea, String rmsgareanm, String anncbgntm, String anncendtm, String annctitl, String annccont, String incmgpers, String incmgdt, String chgpers, String chgdt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.seq = seq;
		this.makepersid = makepersid;
		this.makepersnm = makepersnm;
		this.posicd = posicd;
		this.posinm = posinm;
		this.deptcd = deptcd;
		this.deptnm = deptnm;
		this.rmsgclsf = rmsgclsf;
		this.rmsgdept = rmsgdept;
		this.rmsgdeptnm = rmsgdeptnm;
		this.rmsgarea = rmsgarea;
		this.rmsgareanm = rmsgareanm;
		this.anncbgntm = anncbgntm;
		this.anncendtm = anncendtm;
		this.annctitl = annctitl;
		this.annccont = annccont;
		this.incmgpers = incmgpers;
		this.incmgdt = incmgdt;
		this.chgpers = chgpers;
		this.chgdt = chgdt;
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

	public void setMakepersid(String makepersid){
		this.makepersid = makepersid;
	}

	public void setMakepersnm(String makepersnm){
		this.makepersnm = makepersnm;
	}

	public void setPosicd(String posicd){
		this.posicd = posicd;
	}

	public void setPosinm(String posinm){
		this.posinm = posinm;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setDeptnm(String deptnm){
		this.deptnm = deptnm;
	}

	public void setRmsgclsf(String rmsgclsf){
		this.rmsgclsf = rmsgclsf;
	}

	public void setRmsgdept(String rmsgdept){
		this.rmsgdept = rmsgdept;
	}

	public void setRmsgdeptnm(String rmsgdeptnm){
		this.rmsgdeptnm = rmsgdeptnm;
	}

	public void setRmsgarea(String rmsgarea){
		this.rmsgarea = rmsgarea;
	}

	public void setRmsgareanm(String rmsgareanm){
		this.rmsgareanm = rmsgareanm;
	}

	public void setAnncbgntm(String anncbgntm){
		this.anncbgntm = anncbgntm;
	}

	public void setAnncendtm(String anncendtm){
		this.anncendtm = anncendtm;
	}

	public void setAnnctitl(String annctitl){
		this.annctitl = annctitl;
	}

	public void setAnnccont(String annccont){
		this.annccont = annccont;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setIncmgdt(String incmgdt){
		this.incmgdt = incmgdt;
	}

	public void setChgpers(String chgpers){
		this.chgpers = chgpers;
	}

	public void setChgdt(String chgdt){
		this.chgdt = chgdt;
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

	public String getMakepersid(){
		return this.makepersid;
	}

	public String getMakepersnm(){
		return this.makepersnm;
	}

	public String getPosicd(){
		return this.posicd;
	}

	public String getPosinm(){
		return this.posinm;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getDeptnm(){
		return this.deptnm;
	}

	public String getRmsgclsf(){
		return this.rmsgclsf;
	}

	public String getRmsgdept(){
		return this.rmsgdept;
	}

	public String getRmsgdeptnm(){
		return this.rmsgdeptnm;
	}

	public String getRmsgarea(){
		return this.rmsgarea;
	}

	public String getRmsgareanm(){
		return this.rmsgareanm;
	}

	public String getAnncbgntm(){
		return this.anncbgntm;
	}

	public String getAnncendtm(){
		return this.anncendtm;
	}

	public String getAnnctitl(){
		return this.annctitl;
	}

	public String getAnnccont(){
		return this.annccont;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getIncmgdt(){
		return this.incmgdt;
	}

	public String getChgpers(){
		return this.chgpers;
	}

	public String getChgdt(){
		return this.chgdt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.seq = cstmt.getLong(4);
		this.makepersid = Util.checkString(cstmt.getString(5));
		this.makepersnm = Util.checkString(cstmt.getString(6));
		this.posicd = Util.checkString(cstmt.getString(7));
		this.posinm = Util.checkString(cstmt.getString(8));
		this.deptcd = Util.checkString(cstmt.getString(9));
		this.deptnm = Util.checkString(cstmt.getString(10));
		this.rmsgclsf = Util.checkString(cstmt.getString(11));
		this.rmsgdept = Util.checkString(cstmt.getString(12));
		this.rmsgdeptnm = Util.checkString(cstmt.getString(13));
		this.rmsgarea = Util.checkString(cstmt.getString(14));
		this.rmsgareanm = Util.checkString(cstmt.getString(15));
		this.anncbgntm = Util.checkString(cstmt.getString(16));
		this.anncendtm = Util.checkString(cstmt.getString(17));
		this.annctitl = Util.checkString(cstmt.getString(18));
		//this.annccont = Util.checkString(cstmt.getString(19));
		this.annccont = cstmt.getString(19);
		this.incmgpers = Util.checkString(cstmt.getString(20));
		this.incmgdt = Util.checkString(cstmt.getString(21));
		this.chgpers = Util.checkString(cstmt.getString(22));
		this.chgdt = Util.checkString(cstmt.getString(23));
		ResultSet rset0 = (ResultSet) cstmt.getObject(24);
		while(rset0.next()){
			SS_S_ANNCBOCURCOMMLISTRecord rec = new SS_S_ANNCBOCURCOMMLISTRecord();
			rec.deptcd = Util.checkString(rset0.getString("deptcd"));
			rec.boksnm = Util.checkString(rset0.getString("boksnm"));
			this.curcommlist.add(rec);
		}
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_S_ANNCBOCURCOMMLISTRecord rec = (SS_S_ANNCBOCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.deptcd;
			String name = rec.boksnm;
			
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
			SS_S_ANNCBOCURCOMMLISTRecord rec = (SS_S_ANNCBOCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.deptcd;
			String name = rec.boksnm;
			
			sb.append("<input name=\"");
			sb.append("deptcd");
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
			SS_S_ANNCBOCURCOMMLISTRecord rec = (SS_S_ANNCBOCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.deptcd;
			String name = rec.boksnm;
			
			sb.append("<input name=\"");
			sb.append("deptcd");
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
	SS_S_ANNCBODataSet ds = (SS_S_ANNCBODataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_S_ANNCBOCURCOMMLISTRecord curcommlistRec = (SS_S_ANNCBOCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getSeq()%>
<%= ds.getMakepersid()%>
<%= ds.getMakepersnm()%>
<%= ds.getPosicd()%>
<%= ds.getPosinm()%>
<%= ds.getDeptcd()%>
<%= ds.getDeptnm()%>
<%= ds.getRmsgclsf()%>
<%= ds.getRmsgdept()%>
<%= ds.getRmsgdeptnm()%>
<%= ds.getRmsgarea()%>
<%= ds.getRmsgareanm()%>
<%= ds.getAnncbgntm()%>
<%= ds.getAnncendtm()%>
<%= ds.getAnnctitl()%>
<%= ds.getAnnccont()%>
<%= ds.getIncmgpers()%>
<%= ds.getIncmgdt()%>
<%= ds.getChgpers()%>
<%= ds.getChgdt()%>
<%= ds.getCurcommlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.deptcd%>
<%= curcommlistRec.boksnm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 16 15:05:47 KST 2009 */