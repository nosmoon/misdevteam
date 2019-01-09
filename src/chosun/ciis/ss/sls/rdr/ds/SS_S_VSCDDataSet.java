/***************************************************************************************************
* 파일명 : .java
* 기능 : *독자현황-VacationStop-코드-수정
* 작성일자 : 2009-06-15
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.rdr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.rdr.dm.*;
import chosun.ciis.ss.sls.rdr.rec.*;

/**
 * 독자현황-VacationStop-코드-수정
 */

public class SS_S_VSCDDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curdeptcd = new ArrayList();
	public String errcode;
	public String errmsg;
	public String vaca_arearegncd;
	public String vaca_arearegnnm;
	public String vaca_areacd;
	public String vaca_areanm;
	public String vaca_areatel_no1;
	public String vaca_areatel_no2;
	public String vaca_areatel_no3;
	public String vaca_areazip;
	public String vaca_areaaddr;
	public String vaca_areadtlsaddr;
	public String bonm;
	public String descri;
	public String bocd;
	public String deptcd;
	public String partcd;
	public String areacd;
	public String areanm;

	public SS_S_VSCDDataSet(){}
	public SS_S_VSCDDataSet(String errcode, String errmsg, String vaca_arearegncd, String vaca_arearegnnm, String vaca_areacd, String vaca_areanm, String vaca_areatel_no1, String vaca_areatel_no2, String vaca_areatel_no3, String vaca_areazip, String vaca_areaaddr, String vaca_areadtlsaddr, String bonm, String descri, String bocd, String deptcd, String partcd, String areacd, String areanm){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.vaca_arearegncd = vaca_arearegncd;
		this.vaca_arearegnnm = vaca_arearegnnm;
		this.vaca_areacd = vaca_areacd;
		this.vaca_areanm = vaca_areanm;
		this.vaca_areatel_no1 = vaca_areatel_no1;
		this.vaca_areatel_no2 = vaca_areatel_no2;
		this.vaca_areatel_no3 = vaca_areatel_no3;
		this.vaca_areazip = vaca_areazip;
		this.vaca_areaaddr = vaca_areaaddr;
		this.vaca_areadtlsaddr = vaca_areadtlsaddr;
		this.bonm = bonm;
		this.descri = descri;
		this.bocd = bocd;
		this.deptcd = deptcd;
		this.partcd = partcd;
		this.areacd = areacd;
		this.areanm = areanm;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setVaca_arearegncd(String vaca_arearegncd){
		this.vaca_arearegncd = vaca_arearegncd;
	}

	public void setVaca_arearegnnm(String vaca_arearegnnm){
		this.vaca_arearegnnm = vaca_arearegnnm;
	}

	public void setVaca_areacd(String vaca_areacd){
		this.vaca_areacd = vaca_areacd;
	}

	public void setVaca_areanm(String vaca_areanm){
		this.vaca_areanm = vaca_areanm;
	}

	public void setVaca_areatel_no1(String vaca_areatel_no1){
		this.vaca_areatel_no1 = vaca_areatel_no1;
	}

	public void setVaca_areatel_no2(String vaca_areatel_no2){
		this.vaca_areatel_no2 = vaca_areatel_no2;
	}

	public void setVaca_areatel_no3(String vaca_areatel_no3){
		this.vaca_areatel_no3 = vaca_areatel_no3;
	}

	public void setVaca_areazip(String vaca_areazip){
		this.vaca_areazip = vaca_areazip;
	}

	public void setVaca_areaaddr(String vaca_areaaddr){
		this.vaca_areaaddr = vaca_areaaddr;
	}

	public void setVaca_areadtlsaddr(String vaca_areadtlsaddr){
		this.vaca_areadtlsaddr = vaca_areadtlsaddr;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setDescri(String descri){
		this.descri = descri;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setPartcd(String partcd){
		this.partcd = partcd;
	}

	public void setAreacd(String areacd){
		this.areacd = areacd;
	}

	public void setAreanm(String areanm){
		this.areanm = areanm;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getVaca_arearegncd(){
		return this.vaca_arearegncd;
	}

	public String getVaca_arearegnnm(){
		return this.vaca_arearegnnm;
	}

	public String getVaca_areacd(){
		return this.vaca_areacd;
	}

	public String getVaca_areanm(){
		return this.vaca_areanm;
	}

	public String getVaca_areatel_no1(){
		return this.vaca_areatel_no1;
	}

	public String getVaca_areatel_no2(){
		return this.vaca_areatel_no2;
	}

	public String getVaca_areatel_no3(){
		return this.vaca_areatel_no3;
	}

	public String getVaca_areazip(){
		return this.vaca_areazip;
	}

	public String getVaca_areaaddr(){
		return this.vaca_areaaddr;
	}

	public String getVaca_areadtlsaddr(){
		return this.vaca_areadtlsaddr;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getDescri(){
		return this.descri;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getPartcd(){
		return this.partcd;
	}

	public String getAreacd(){
		return this.areacd;
	}

	public String getAreanm(){
		return this.areanm;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.vaca_arearegncd = Util.checkString(cstmt.getString(5));
		this.vaca_arearegnnm = Util.checkString(cstmt.getString(6));
		this.vaca_areacd = Util.checkString(cstmt.getString(7));
		this.vaca_areanm = Util.checkString(cstmt.getString(8));
		this.vaca_areatel_no1 = Util.checkString(cstmt.getString(9));
		this.vaca_areatel_no2 = Util.checkString(cstmt.getString(10));
		this.vaca_areatel_no3 = Util.checkString(cstmt.getString(11));
		this.vaca_areazip = Util.checkString(cstmt.getString(12));
		this.vaca_areaaddr = Util.checkString(cstmt.getString(13));
		this.vaca_areadtlsaddr = Util.checkString(cstmt.getString(14));
		this.bonm = Util.checkString(cstmt.getString(15));
		this.descri = Util.checkString(cstmt.getString(16));
		this.bocd = Util.checkString(cstmt.getString(17));
		this.deptcd = Util.checkString(cstmt.getString(18));
		this.partcd = Util.checkString(cstmt.getString(19));
		this.areacd = Util.checkString(cstmt.getString(20));
		this.areanm = Util.checkString(cstmt.getString(21));
		ResultSet rset0 = (ResultSet) cstmt.getObject(22);
		while(rset0.next()){
			SS_S_VSCDCURDEPTCDRecord rec = new SS_S_VSCDCURDEPTCDRecord();
			rec.deptcd = Util.checkString(rset0.getString("deptcd"));
			rec.boksnm = Util.checkString(rset0.getString("boksnm"));
			this.curdeptcd.add(rec);
		}
	}

	public String curdeptcdOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curdeptcd.size();
		for(int i=0; i<size; i++){
			SS_S_VSCDCURDEPTCDRecord rec = (SS_S_VSCDCURDEPTCDRecord)curdeptcd.get(i);
			
			
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

	public String curdeptcdChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curdeptcd.size();
		for(int i=0; i<size; i++){
			SS_S_VSCDCURDEPTCDRecord rec = (SS_S_VSCDCURDEPTCDRecord)curdeptcd.get(i);
			
			
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

	public String curdeptcdRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curdeptcd.size();
		for(int i=0; i<size; i++){
			SS_S_VSCDCURDEPTCDRecord rec = (SS_S_VSCDCURDEPTCDRecord)curdeptcd.get(i);
			
			
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
	SS_S_VSCDDataSet ds = (SS_S_VSCDDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curdeptcd.size(); i++){
		SS_S_VSCDCURDEPTCDRecord curdeptcdRec = (SS_S_VSCDCURDEPTCDRecord)ds.curdeptcd.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getVaca_arearegncd()%>
<%= ds.getVaca_arearegnnm()%>
<%= ds.getVaca_areacd()%>
<%= ds.getVaca_areanm()%>
<%= ds.getVaca_areatel_no1()%>
<%= ds.getVaca_areatel_no2()%>
<%= ds.getVaca_areatel_no3()%>
<%= ds.getVaca_areazip()%>
<%= ds.getVaca_areaaddr()%>
<%= ds.getVaca_areadtlsaddr()%>
<%= ds.getBonm()%>
<%= ds.getDescri()%>
<%= ds.getBocd()%>
<%= ds.getDeptcd()%>
<%= ds.getPartcd()%>
<%= ds.getAreacd()%>
<%= ds.getAreanm()%>
<%= ds.getCurdeptcd()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curdeptcdRec.deptcd%>
<%= curdeptcdRec.boksnm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jun 15 19:16:40 KST 2009 */