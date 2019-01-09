/***************************************************************************************************
* 파일명 : 
* 기능 : 
* 작성일자 : 2003-12-27
* 작성자 : 김영윤
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sal.rdr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sal.rdr.dm.*;
import chosun.ciis.ss.sal.rdr.rec.*;

/**
 *
 *
 */


public class SL_L_DSCTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList dsctcur = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SL_L_DSCTDataSet(){}
	public SL_L_DSCTDataSet(String errcode, String errmsg, long totalcnt){
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
		this.totalcnt = cstmt.getLong(13);
		ResultSet rset0 = (ResultSet) cstmt.getObject(14);
		while(rset0.next()){
			SL_L_DSCTDSCTCURRecord rec = new SL_L_DSCTDSCTCURRecord();
			rec.regdt = Util.checkString(rset0.getString("regdt"));
			rec.regno = Util.checkString(rset0.getString("regno"));
			rec.dscttypenm = Util.checkString(rset0.getString("dscttypenm"));
			rec.acpndt = Util.checkString(rset0.getString("acpndt"));
			rec.acpnpathnm = Util.checkString(rset0.getString("acpnpathnm"));
			rec.deptcd = Util.checkString(rset0.getString("deptcd"));
			rec.areacd = Util.checkString(rset0.getString("areacd"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.dsno = Util.checkString(rset0.getString("dsno"));
			rec.termsubsno = Util.checkString(rset0.getString("termsubsno"));
			rec.medicd = Util.checkString(rset0.getString("medicd"));
			rec.rdrnm = Util.checkString(rset0.getString("rdrnm"));
			rec.prn = Util.checkString(rset0.getString("prn"));
			rec.rdrtel_no1 = Util.checkString(rset0.getString("rdrtel_no1"));
			rec.rdrtel_no2 = Util.checkString(rset0.getString("rdrtel_no2"));
			rec.rdrtel_no3 = Util.checkString(rset0.getString("rdrtel_no3"));
			rec.rdrptph_no1 = Util.checkString(rset0.getString("rdrptph_no1"));
			rec.rdrptph_no2 = Util.checkString(rset0.getString("rdrptph_no2"));
			rec.rdrptph_no3 = Util.checkString(rset0.getString("rdrptph_no3"));
			rec.dlvzip = Util.checkString(rset0.getString("dlvzip"));
			rec.dlvaddr = Util.checkString(rset0.getString("dlvaddr"));
			rec.dlvdtlsaddr = Util.checkString(rset0.getString("dlvdtlsaddr"));
			rec.titl = Util.checkString(rset0.getString("titl"));
			rec.cont = Util.checkString(rset0.getString("cont"));
			rec.bocnfmdt = Util.checkString(rset0.getString("bocnfmdt"));
			rec.bocnfmyn = Util.checkString(rset0.getString("bocnfmyn"));
			rec.boprocdt = Util.checkString(rset0.getString("boprocdt"));
			rec.boprocyn = Util.checkString(rset0.getString("boprocyn"));
			rec.boproccont = Util.checkString(rset0.getString("boproccont"));
			rec.cns_empnm = Util.checkString(rset0.getString("cns_empnm"));
			rec.cns_empid = Util.checkString(rset0.getString("cns_empid"));
			rec.proccont = Util.checkString(rset0.getString("proccont"));
			rec.procpers = Util.checkString(rset0.getString("procpers"));
			this.dsctcur.add(rec);
		}
	}

	public String dsctcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dsctcur.size();
		for(int i=0; i<size; i++){
			SL_L_DSCTDSCTCURRecord rec = (SL_L_DSCTDSCTCURRecord)dsctcur.get(i);
			
			
			String code = rec.regdt;
			String name = rec.regno;
			
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

	public String dsctcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dsctcur.size();
		for(int i=0; i<size; i++){
			SL_L_DSCTDSCTCURRecord rec = (SL_L_DSCTDSCTCURRecord)dsctcur.get(i);
			
			
			String code = rec.regdt;
			String name = rec.regno;
			
			sb.append("<input name=\"");
			sb.append("regdt");
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

	public String dsctcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dsctcur.size();
		for(int i=0; i<size; i++){
			SL_L_DSCTDSCTCURRecord rec = (SL_L_DSCTDSCTCURRecord)dsctcur.get(i);
			
			
			String code = rec.regdt;
			String name = rec.regno;
			
			sb.append("<input name=\"");
			sb.append("regdt");
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
	SL_L_DSCTDataSet ds = (SL_L_DSCTDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.dsctcur.size(); i++){
		SL_L_DSCTDSCTCURRecord dsctcurRec = (SL_L_DSCTDSCTCURRecord)ds.dsctcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotalcnt()%>
<%= ds.getDsctcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= dsctcurRec.regdt%>
<%= dsctcurRec.regno%>
<%= dsctcurRec.dscttypenm%>
<%= dsctcurRec.acpndt%>
<%= dsctcurRec.acpnpathnm%>
<%= dsctcurRec.deptcd%>
<%= dsctcurRec.areacd%>
<%= dsctcurRec.bocd%>
<%= dsctcurRec.rdr_no%>
<%= dsctcurRec.dsno%>
<%= dsctcurRec.termsubsno%>
<%= dsctcurRec.medicd%>
<%= dsctcurRec.rdrnm%>
<%= dsctcurRec.prn%>
<%= dsctcurRec.rdrtel_no1%>
<%= dsctcurRec.rdrtel_no2%>
<%= dsctcurRec.rdrtel_no3%>
<%= dsctcurRec.rdrptph_no1%>
<%= dsctcurRec.rdrptph_no2%>
<%= dsctcurRec.rdrptph_no3%>
<%= dsctcurRec.dlvzip%>
<%= dsctcurRec.dlvaddr%>
<%= dsctcurRec.dlvdtlsaddr%>
<%= dsctcurRec.titl%>
<%= dsctcurRec.cont%>
<%= dsctcurRec.bocnfmdt%>
<%= dsctcurRec.bocnfmyn%>
<%= dsctcurRec.boprocdt%>
<%= dsctcurRec.boprocyn%>
<%= dsctcurRec.boproccont%>
<%= dsctcurRec.cns_empnm%>
<%= dsctcurRec.cns_empid%>
<%= dsctcurRec.proccont%>
<%= dsctcurRec.procpers%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sun Feb 01 16:57:38 KST 2004 */