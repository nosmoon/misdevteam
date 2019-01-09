/***************************************************************************************************
* 파일명 : SL_L_NWSPSUBS_FOR_STOPDataSet.java
* 기능 : 중지독자관리-중지대상조회
* 작성일자 : 2004-02-09
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
 * 중지독자관리-중지대상조회
 *
 */


public class SL_L_NWSPSUBS_FOR_STOPDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList suspresncdcur = new ArrayList();
	public ArrayList freeclsfcdcur = new ArrayList();
	public ArrayList readercur = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SL_L_NWSPSUBS_FOR_STOPDataSet(){}
	public SL_L_NWSPSUBS_FOR_STOPDataSet(String errcode, String errmsg, long totalcnt){
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
		this.totalcnt = cstmt.getLong(14);
		ResultSet rset0 = (ResultSet) cstmt.getObject(15);
		while(rset0.next()){
			SL_L_NWSPSUBS_FOR_STOPREADERCURRecord rec = new SL_L_NWSPSUBS_FOR_STOPREADERCURRecord();
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.paty_clsfcd = Util.checkString(rset0.getString("paty_clsfcd"));
			rec.natnclsfcd = Util.checkString(rset0.getString("natnclsfcd"));
			rec.rdrnm = Util.checkString(rset0.getString("rdrnm"));
			rec.email = Util.checkString(rset0.getString("email"));
			rec.medicd = Util.checkString(rset0.getString("medicd"));
			rec.medinm = Util.checkString(rset0.getString("medinm"));
			rec.rdrtel_no1 = Util.checkString(rset0.getString("rdrtel_no1"));
			rec.rdrtel_no2 = Util.checkString(rset0.getString("rdrtel_no2"));
			rec.rdrtel_no3 = Util.checkString(rset0.getString("rdrtel_no3"));
			rec.rdrptph_no1 = Util.checkString(rset0.getString("rdrptph_no1"));
			rec.rdrptph_no2 = Util.checkString(rset0.getString("rdrptph_no2"));
			rec.rdrptph_no3 = Util.checkString(rset0.getString("rdrptph_no3"));
			rec.dlvdstccd = Util.checkString(rset0.getString("dlvdstccd"));
			rec.dlvno = Util.checkString(rset0.getString("dlvno"));
			rec.dlvintvno = Util.checkString(rset0.getString("dlvintvno"));
			rec.freeyn = Util.checkString(rset0.getString("freeyn"));
			rec.freeynnm = Util.checkString(rset0.getString("freeynnm"));
			rec.freeclsf = Util.checkString(rset0.getString("freeclsf"));
			rec.qty = Util.checkString(rset0.getString("qty"));
			this.readercur.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(16);
		while(rset1.next()){
			SL_L_NWSPSUBS_FOR_STOPFREECLSFCDCURRecord rec = new SL_L_NWSPSUBS_FOR_STOPFREECLSFCDCURRecord();
			rec.cicodeval = Util.checkString(rset1.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset1.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset1.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset1.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset1.getString("cicdgb"));
			this.freeclsfcdcur.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(17);
		while(rset2.next()){
			SL_L_NWSPSUBS_FOR_STOPSUSPRESNCDCURRecord rec = new SL_L_NWSPSUBS_FOR_STOPSUSPRESNCDCURRecord();
			rec.cicodeval = Util.checkString(rset2.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset2.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset2.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset2.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset2.getString("cicdgb"));
			this.suspresncdcur.add(rec);
		}
	}

	public String readercurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = readercur.size();
		for(int i=0; i<size; i++){
			SL_L_NWSPSUBS_FOR_STOPREADERCURRecord rec = (SL_L_NWSPSUBS_FOR_STOPREADERCURRecord)readercur.get(i);
			
			
			String code = rec.rdr_no;
			String name = rec.paty_clsfcd;
			
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

	public String freeclsfcdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = freeclsfcdcur.size();
		for(int i=0; i<size; i++){
			SL_L_NWSPSUBS_FOR_STOPFREECLSFCDCURRecord rec = (SL_L_NWSPSUBS_FOR_STOPFREECLSFCDCURRecord)freeclsfcdcur.get(i);
			
			
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

	public String suspresncdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = suspresncdcur.size();
		for(int i=0; i<size; i++){
			SL_L_NWSPSUBS_FOR_STOPSUSPRESNCDCURRecord rec = (SL_L_NWSPSUBS_FOR_STOPSUSPRESNCDCURRecord)suspresncdcur.get(i);
			
			
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

	public String readercurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = readercur.size();
		for(int i=0; i<size; i++){
			SL_L_NWSPSUBS_FOR_STOPREADERCURRecord rec = (SL_L_NWSPSUBS_FOR_STOPREADERCURRecord)readercur.get(i);
			
			
			String code = rec.rdr_no;
			String name = rec.paty_clsfcd;
			
			sb.append("<input name=\"");
			sb.append("rdr_no");
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

	public String freeclsfcdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = freeclsfcdcur.size();
		for(int i=0; i<size; i++){
			SL_L_NWSPSUBS_FOR_STOPFREECLSFCDCURRecord rec = (SL_L_NWSPSUBS_FOR_STOPFREECLSFCDCURRecord)freeclsfcdcur.get(i);
			
			
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

	public String suspresncdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = suspresncdcur.size();
		for(int i=0; i<size; i++){
			SL_L_NWSPSUBS_FOR_STOPSUSPRESNCDCURRecord rec = (SL_L_NWSPSUBS_FOR_STOPSUSPRESNCDCURRecord)suspresncdcur.get(i);
			
			
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

	public String readercurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = readercur.size();
		for(int i=0; i<size; i++){
			SL_L_NWSPSUBS_FOR_STOPREADERCURRecord rec = (SL_L_NWSPSUBS_FOR_STOPREADERCURRecord)readercur.get(i);
			
			
			String code = rec.rdr_no;
			String name = rec.paty_clsfcd;
			
			sb.append("<input name=\"");
			sb.append("rdr_no");
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

	public String freeclsfcdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = freeclsfcdcur.size();
		for(int i=0; i<size; i++){
			SL_L_NWSPSUBS_FOR_STOPFREECLSFCDCURRecord rec = (SL_L_NWSPSUBS_FOR_STOPFREECLSFCDCURRecord)freeclsfcdcur.get(i);
			
			
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

	public String suspresncdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = suspresncdcur.size();
		for(int i=0; i<size; i++){
			SL_L_NWSPSUBS_FOR_STOPSUSPRESNCDCURRecord rec = (SL_L_NWSPSUBS_FOR_STOPSUSPRESNCDCURRecord)suspresncdcur.get(i);
			
			
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
	SL_L_NWSPSUBS_FOR_STOPDataSet ds = (SL_L_NWSPSUBS_FOR_STOPDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.readercur.size(); i++){
		SL_L_NWSPSUBS_FOR_STOPREADERCURRecord readercurRec = (SL_L_NWSPSUBS_FOR_STOPREADERCURRecord)ds.readercur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.freeclsfcdcur.size(); i++){
		SL_L_NWSPSUBS_FOR_STOPFREECLSFCDCURRecord freeclsfcdcurRec = (SL_L_NWSPSUBS_FOR_STOPFREECLSFCDCURRecord)ds.freeclsfcdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.suspresncdcur.size(); i++){
		SL_L_NWSPSUBS_FOR_STOPSUSPRESNCDCURRecord suspresncdcurRec = (SL_L_NWSPSUBS_FOR_STOPSUSPRESNCDCURRecord)ds.suspresncdcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotalcnt()%>
<%= ds.getReadercur()%>
<%= ds.getFreeclsfcdcur()%>
<%= ds.getSuspresncdcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= readercurRec.rdr_no%>
<%= readercurRec.paty_clsfcd%>
<%= readercurRec.natnclsfcd%>
<%= readercurRec.rdrnm%>
<%= readercurRec.email%>
<%= readercurRec.medicd%>
<%= readercurRec.medinm%>
<%= readercurRec.rdrtel_no1%>
<%= readercurRec.rdrtel_no2%>
<%= readercurRec.rdrtel_no3%>
<%= readercurRec.rdrptph_no1%>
<%= readercurRec.rdrptph_no2%>
<%= readercurRec.rdrptph_no3%>
<%= readercurRec.dlvdstccd%>
<%= readercurRec.dlvno%>
<%= readercurRec.dlvintvno%>
<%= readercurRec.freeyn%>
<%= readercurRec.freeynnm%>
<%= readercurRec.freeclsf%>
<%= readercurRec.qty%>
<%= freeclsfcdcurRec.cicodeval%>
<%= freeclsfcdcurRec.cicdnm%>
<%= freeclsfcdcurRec.cicdynm%>
<%= freeclsfcdcurRec.ciymgbcd%>
<%= freeclsfcdcurRec.cicdgb%>
<%= suspresncdcurRec.cicodeval%>
<%= suspresncdcurRec.cicdnm%>
<%= suspresncdcurRec.cicdynm%>
<%= suspresncdcurRec.ciymgbcd%>
<%= suspresncdcurRec.cicdgb%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Feb 10 17:40:17 KST 2004 */