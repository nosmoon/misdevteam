/***************************************************************************************************
* 파일명 : PS_L_AUTO_SHIFT_APLC_INIT.java
* 기능   : 자동이체신청 목록조회화면 초기
* 작성일자 : 2006-04-19
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
 * 출판국 -자동이체신청 목록조회화면 초기
 *
 */

public class PS_L_AUTO_SHIFT_APLC_INITDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList shftclsf = new ArrayList();
	public ArrayList intgbocdcur = new ArrayList();
	public ArrayList aplcprocstat = new ArrayList();
	public ArrayList aplcclsf = new ArrayList();
	public String errcode;
	public String errmsg;

	public PS_L_AUTO_SHIFT_APLC_INITDataSet(){}
	public PS_L_AUTO_SHIFT_APLC_INITDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			PS_L_AUTO_SHIFT_APLC_INITSHFTCLSFRecord rec = new PS_L_AUTO_SHIFT_APLC_INITSHFTCLSFRecord();
			rec.cicodeval = Util.checkString(rset0.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset0.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset0.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset0.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset0.getString("cicdgb"));
			this.shftclsf.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			PS_L_AUTO_SHIFT_APLC_INITAPLCCLSFRecord rec = new PS_L_AUTO_SHIFT_APLC_INITAPLCCLSFRecord();
			rec.cicodeval = Util.checkString(rset1.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset1.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset1.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset1.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset1.getString("cicdgb"));
			this.aplcclsf.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(7);
		while(rset2.next()){
			PS_L_AUTO_SHIFT_APLC_INITAPLCPROCSTATRecord rec = new PS_L_AUTO_SHIFT_APLC_INITAPLCPROCSTATRecord();
			rec.cicodeval = Util.checkString(rset2.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset2.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset2.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset2.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset2.getString("cicdgb"));
			this.aplcprocstat.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(8);
		while(rset3.next()){
			PS_L_AUTO_SHIFT_APLC_INITINTGBOCDCURRecord rec = new PS_L_AUTO_SHIFT_APLC_INITINTGBOCDCURRecord();
			rec.bocd = Util.checkString(rset3.getString("bocd"));
			rec.bonm = Util.checkString(rset3.getString("bonm"));
			rec.deptcd = Util.checkString(rset3.getString("deptcd"));
			rec.sellnetclsf = Util.checkString(rset3.getString("sellnetclsf"));
			this.intgbocdcur.add(rec);
		}
	}

	public String shftclsfOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = shftclsf.size();
		for(int i=0; i<size; i++){
			PS_L_AUTO_SHIFT_APLC_INITSHFTCLSFRecord rec = (PS_L_AUTO_SHIFT_APLC_INITSHFTCLSFRecord)shftclsf.get(i);
			
			
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

	public String aplcclsfOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = aplcclsf.size();
		for(int i=0; i<size; i++){
			PS_L_AUTO_SHIFT_APLC_INITAPLCCLSFRecord rec = (PS_L_AUTO_SHIFT_APLC_INITAPLCCLSFRecord)aplcclsf.get(i);
			
			
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

	public String aplcprocstatOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = aplcprocstat.size();
		for(int i=0; i<size; i++){
			PS_L_AUTO_SHIFT_APLC_INITAPLCPROCSTATRecord rec = (PS_L_AUTO_SHIFT_APLC_INITAPLCPROCSTATRecord)aplcprocstat.get(i);
			
			
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

	public String intgbocdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = intgbocdcur.size();
		for(int i=0; i<size; i++){
			PS_L_AUTO_SHIFT_APLC_INITINTGBOCDCURRecord rec = (PS_L_AUTO_SHIFT_APLC_INITINTGBOCDCURRecord)intgbocdcur.get(i);
			
			
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

	public String shftclsfChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = shftclsf.size();
		for(int i=0; i<size; i++){
			PS_L_AUTO_SHIFT_APLC_INITSHFTCLSFRecord rec = (PS_L_AUTO_SHIFT_APLC_INITSHFTCLSFRecord)shftclsf.get(i);
			
			
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

	public String aplcclsfChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = aplcclsf.size();
		for(int i=0; i<size; i++){
			PS_L_AUTO_SHIFT_APLC_INITAPLCCLSFRecord rec = (PS_L_AUTO_SHIFT_APLC_INITAPLCCLSFRecord)aplcclsf.get(i);
			
			
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

	public String aplcprocstatChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = aplcprocstat.size();
		for(int i=0; i<size; i++){
			PS_L_AUTO_SHIFT_APLC_INITAPLCPROCSTATRecord rec = (PS_L_AUTO_SHIFT_APLC_INITAPLCPROCSTATRecord)aplcprocstat.get(i);
			
			
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

	public String intgbocdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = intgbocdcur.size();
		for(int i=0; i<size; i++){
			PS_L_AUTO_SHIFT_APLC_INITINTGBOCDCURRecord rec = (PS_L_AUTO_SHIFT_APLC_INITINTGBOCDCURRecord)intgbocdcur.get(i);
			
			
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

	public String shftclsfRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = shftclsf.size();
		for(int i=0; i<size; i++){
			PS_L_AUTO_SHIFT_APLC_INITSHFTCLSFRecord rec = (PS_L_AUTO_SHIFT_APLC_INITSHFTCLSFRecord)shftclsf.get(i);
			
			
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

	public String aplcclsfRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = aplcclsf.size();
		for(int i=0; i<size; i++){
			PS_L_AUTO_SHIFT_APLC_INITAPLCCLSFRecord rec = (PS_L_AUTO_SHIFT_APLC_INITAPLCCLSFRecord)aplcclsf.get(i);
			
			
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

	public String aplcprocstatRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = aplcprocstat.size();
		for(int i=0; i<size; i++){
			PS_L_AUTO_SHIFT_APLC_INITAPLCPROCSTATRecord rec = (PS_L_AUTO_SHIFT_APLC_INITAPLCPROCSTATRecord)aplcprocstat.get(i);
			
			
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

	public String intgbocdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = intgbocdcur.size();
		for(int i=0; i<size; i++){
			PS_L_AUTO_SHIFT_APLC_INITINTGBOCDCURRecord rec = (PS_L_AUTO_SHIFT_APLC_INITINTGBOCDCURRecord)intgbocdcur.get(i);
			
			
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
	PS_L_AUTO_SHIFT_APLC_INITDataSet ds = (PS_L_AUTO_SHIFT_APLC_INITDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.shftclsf.size(); i++){
		PS_L_AUTO_SHIFT_APLC_INITSHFTCLSFRecord shftclsfRec = (PS_L_AUTO_SHIFT_APLC_INITSHFTCLSFRecord)ds.shftclsf.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.aplcclsf.size(); i++){
		PS_L_AUTO_SHIFT_APLC_INITAPLCCLSFRecord aplcclsfRec = (PS_L_AUTO_SHIFT_APLC_INITAPLCCLSFRecord)ds.aplcclsf.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.aplcprocstat.size(); i++){
		PS_L_AUTO_SHIFT_APLC_INITAPLCPROCSTATRecord aplcprocstatRec = (PS_L_AUTO_SHIFT_APLC_INITAPLCPROCSTATRecord)ds.aplcprocstat.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.intgbocdcur.size(); i++){
		PS_L_AUTO_SHIFT_APLC_INITINTGBOCDCURRecord intgbocdcurRec = (PS_L_AUTO_SHIFT_APLC_INITINTGBOCDCURRecord)ds.intgbocdcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getShftclsf()%>
<%= ds.getAplcclsf()%>
<%= ds.getAplcprocstat()%>
<%= ds.getIntgbocdcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= shftclsfRec.cicodeval%>
<%= shftclsfRec.cicdnm%>
<%= shftclsfRec.cicdynm%>
<%= shftclsfRec.ciymgbcd%>
<%= shftclsfRec.cicdgb%>
<%= aplcclsfRec.cicodeval%>
<%= aplcclsfRec.cicdnm%>
<%= aplcclsfRec.cicdynm%>
<%= aplcclsfRec.ciymgbcd%>
<%= aplcclsfRec.cicdgb%>
<%= aplcprocstatRec.cicodeval%>
<%= aplcprocstatRec.cicdnm%>
<%= aplcprocstatRec.cicdynm%>
<%= aplcprocstatRec.ciymgbcd%>
<%= aplcprocstatRec.cicdgb%>
<%= intgbocdcurRec.bocd%>
<%= intgbocdcurRec.bonm%>
<%= intgbocdcurRec.deptcd%>
<%= intgbocdcurRec.sellnetclsf%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 03 17:19:14 KST 2006 */