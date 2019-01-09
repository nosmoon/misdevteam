/***************************************************************************************************
* 파일명 : SS_S_INSRACCDDataSet.java
* 기능 : 지국지원-상해보험-사고-상세를 위한 DataSet
* 작성일자 : 2004-02-23
* 작성자 : 김대섭
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
 * 지국지원-상해보험-사고-상세를 위한 DataSet
 */

public class SS_S_INSRACCDDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curprocstat = new ArrayList();
	public String errcode;
	public String errmsg;
	public String acpndt;
	public String accdacpnno;
	public String boemp_no;
	public String flnm;
	public String prn;
	public String bocd;
	public String bonm;
	public String botel;
	public String accddt;
	public String accdtm;
	public String cont;
	public String procstat;
	public String procdt;

	public SS_S_INSRACCDDataSet(){}
	public SS_S_INSRACCDDataSet(String errcode, String errmsg, String acpndt, String accdacpnno, String boemp_no, String flnm, String prn, String bocd, String bonm, String botel, String accddt, String accdtm, String cont, String procstat, String procdt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.acpndt = acpndt;
		this.accdacpnno = accdacpnno;
		this.boemp_no = boemp_no;
		this.flnm = flnm;
		this.prn = prn;
		this.bocd = bocd;
		this.bonm = bonm;
		this.botel = botel;
		this.accddt = accddt;
		this.accdtm = accdtm;
		this.cont = cont;
		this.procstat = procstat;
		this.procdt = procdt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setAcpndt(String acpndt){
		this.acpndt = acpndt;
	}

	public void setAccdacpnno(String accdacpnno){
		this.accdacpnno = accdacpnno;
	}

	public void setBoemp_no(String boemp_no){
		this.boemp_no = boemp_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setBotel(String botel){
		this.botel = botel;
	}

	public void setAccddt(String accddt){
		this.accddt = accddt;
	}

	public void setAccdtm(String accdtm){
		this.accdtm = accdtm;
	}

	public void setCont(String cont){
		this.cont = cont;
	}

	public void setProcstat(String procstat){
		this.procstat = procstat;
	}

	public void setProcdt(String procdt){
		this.procdt = procdt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getAcpndt(){
		return this.acpndt;
	}

	public String getAccdacpnno(){
		return this.accdacpnno;
	}

	public String getBoemp_no(){
		return this.boemp_no;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getBotel(){
		return this.botel;
	}

	public String getAccddt(){
		return this.accddt;
	}

	public String getAccdtm(){
		return this.accdtm;
	}

	public String getCont(){
		return this.cont;
	}

	public String getProcstat(){
		return this.procstat;
	}

	public String getProcdt(){
		return this.procdt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.acpndt = Util.checkString(cstmt.getString(5));
		this.accdacpnno = Util.checkString(cstmt.getString(6));
		this.boemp_no = Util.checkString(cstmt.getString(7));
		this.flnm = Util.checkString(cstmt.getString(8));
		this.prn = Util.checkString(cstmt.getString(9));
		this.bocd = Util.checkString(cstmt.getString(10));
		this.bonm = Util.checkString(cstmt.getString(11));
		this.botel = Util.checkString(cstmt.getString(12));
		this.accddt = Util.checkString(cstmt.getString(13));
		this.accdtm = Util.checkString(cstmt.getString(14));
		this.cont = Util.checkString(cstmt.getString(15));
		this.procstat = Util.checkString(cstmt.getString(16));
		this.procdt = Util.checkString(cstmt.getString(17));
		ResultSet rset0 = (ResultSet) cstmt.getObject(18);
		while(rset0.next()){
			SS_S_INSRACCDCURPROCSTATRecord rec = new SS_S_INSRACCDCURPROCSTATRecord();
			rec.cicodeval = Util.checkString(rset0.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset0.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset0.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset0.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset0.getString("cicdynm"));
			this.curprocstat.add(rec);
		}
	}

	public String curprocstatOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curprocstat.size();
		for(int i=0; i<size; i++){
			SS_S_INSRACCDCURPROCSTATRecord rec = (SS_S_INSRACCDCURPROCSTATRecord)curprocstat.get(i);


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

	public String curprocstatChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curprocstat.size();
		for(int i=0; i<size; i++){
			SS_S_INSRACCDCURPROCSTATRecord rec = (SS_S_INSRACCDCURPROCSTATRecord)curprocstat.get(i);


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

	public String curprocstatRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curprocstat.size();
		for(int i=0; i<size; i++){
			SS_S_INSRACCDCURPROCSTATRecord rec = (SS_S_INSRACCDCURPROCSTATRecord)curprocstat.get(i);


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
	SS_S_INSRACCDDataSet ds = (SS_S_INSRACCDDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curprocstat.size(); i++){
		SS_S_INSRACCDCURPROCSTATRecord curprocstatRec = (SS_S_INSRACCDCURPROCSTATRecord)ds.curprocstat.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getAcpndt()%>
<%= ds.getAccdacpnno()%>
<%= ds.getBoemp_no()%>
<%= ds.getFlnm()%>
<%= ds.getPrn()%>
<%= ds.getBocd()%>
<%= ds.getBonm()%>
<%= ds.getBotel()%>
<%= ds.getAccddt()%>
<%= ds.getAccdtm()%>
<%= ds.getCont()%>
<%= ds.getProcstat()%>
<%= ds.getProcdt()%>
<%= ds.getCurprocstat()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curprocstatRec.cicodeval%>
<%= curprocstatRec.cicdnm%>
<%= curprocstatRec.ciymgbcd%>
<%= curprocstatRec.cicdgb%>
<%= curprocstatRec.cicdynm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Feb 23 20:55:38 KST 2004 */