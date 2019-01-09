/***************************************************************************************************
* 파일명 : SL_S_RDR_NWSPCLAMTDataSet.java
* 기능 : 독자-독자정보관리(입금내역상세)
* 작성일자 : 2004-05-20
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
 * 독자-독자정보관리(입금내역상세)
 *
 */

public class SL_S_RDR_NWSPCLAMTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList clamtcur = new ArrayList();
	public ArrayList rcpmclsfcur = new ArrayList();
	public ArrayList defaultcur = new ArrayList();
	public ArrayList clamtmthdcur = new ArrayList();
	public String errcode;
	public String errmsg;
	public String curryymm;
	public String realsubsamt;

	public SL_S_RDR_NWSPCLAMTDataSet(){}
	public SL_S_RDR_NWSPCLAMTDataSet(String errcode, String errmsg, String curryymm, String realsubsamt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.curryymm = curryymm;
		this.realsubsamt = realsubsamt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setCurryymm(String curryymm){
		this.curryymm = curryymm;
	}

	public void setRealsubsamt(String realsubsamt){
		this.realsubsamt = realsubsamt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getCurryymm(){
		return this.curryymm;
	}

	public String getRealsubsamt(){
		return this.realsubsamt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.curryymm = Util.checkString(cstmt.getString(7));
		this.realsubsamt = Util.checkString(cstmt.getString(8));
		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			SL_S_RDR_NWSPCLAMTDEFAULTCURRecord rec = new SL_S_RDR_NWSPCLAMTDEFAULTCURRecord();
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.medicd = Util.checkString(rset0.getString("medicd"));
			rec.dlvdstccd = Util.checkString(rset0.getString("dlvdstccd"));
			rec.clamtmthdcd = Util.checkString(rset0.getString("clamtmthdcd"));
			rec.clamqty = rset0.getInt("clamqty");
			rec.clamamt = rset0.getInt("clamamt");
			this.defaultcur.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(10);
		while(rset1.next()){
			SL_S_RDR_NWSPCLAMTCLAMTCURRecord rec = new SL_S_RDR_NWSPCLAMTCLAMTCURRecord();
			rec.rdr_no = Util.checkString(rset1.getString("rdr_no"));
			rec.medicd = Util.checkString(rset1.getString("medicd"));
			rec.dlvdstccd = Util.checkString(rset1.getString("dlvdstccd"));
			rec.clamtmthdcd = Util.checkString(rset1.getString("clamtmthdcd"));
			rec.rcpmclsfcd = Util.checkString(rset1.getString("rcpmclsfcd"));
			rec.clamamt = rset1.getInt("clamamt");
			rec.clamt = rset1.getInt("clamt");
			rec.recpdt = Util.checkString(rset1.getString("recpdt"));
			this.clamtcur.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(11);
		while(rset2.next()){
			SL_S_RDR_NWSPCLAMTCLAMTMTHDCURRecord rec = new SL_S_RDR_NWSPCLAMTCLAMTMTHDCURRecord();
			rec.ciymgbcd = Util.checkString(rset2.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset2.getString("cicdgb"));
			rec.cicodeval = Util.checkString(rset2.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset2.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset2.getString("cicdynm"));
			this.clamtmthdcur.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(12);
		while(rset3.next()){
			SL_S_RDR_NWSPCLAMTRCPMCLSFCURRecord rec = new SL_S_RDR_NWSPCLAMTRCPMCLSFCURRecord();
			rec.ciymgbcd = Util.checkString(rset3.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset3.getString("cicdgb"));
			rec.cicodeval = Util.checkString(rset3.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset3.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset3.getString("cicdynm"));
			this.rcpmclsfcur.add(rec);
		}
	}

	public String defaultcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = defaultcur.size();
		for(int i=0; i<size; i++){
			SL_S_RDR_NWSPCLAMTDEFAULTCURRecord rec = (SL_S_RDR_NWSPCLAMTDEFAULTCURRecord)defaultcur.get(i);
			
			
			String code = rec.rdr_no;
			String name = rec.medicd;
			
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

	public String clamtcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = clamtcur.size();
		for(int i=0; i<size; i++){
			SL_S_RDR_NWSPCLAMTCLAMTCURRecord rec = (SL_S_RDR_NWSPCLAMTCLAMTCURRecord)clamtcur.get(i);
			
			
			String code = rec.rdr_no;
			String name = rec.medicd;
			
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

	public String clamtmthdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = clamtmthdcur.size();
		for(int i=0; i<size; i++){
			SL_S_RDR_NWSPCLAMTCLAMTMTHDCURRecord rec = (SL_S_RDR_NWSPCLAMTCLAMTMTHDCURRecord)clamtmthdcur.get(i);
			
			
			String code = rec.ciymgbcd;
			String name = rec.cicdgb;
			
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

	public String rcpmclsfcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rcpmclsfcur.size();
		for(int i=0; i<size; i++){
			SL_S_RDR_NWSPCLAMTRCPMCLSFCURRecord rec = (SL_S_RDR_NWSPCLAMTRCPMCLSFCURRecord)rcpmclsfcur.get(i);
			
			
			String code = rec.ciymgbcd;
			String name = rec.cicdgb;
			
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

	public String defaultcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = defaultcur.size();
		for(int i=0; i<size; i++){
			SL_S_RDR_NWSPCLAMTDEFAULTCURRecord rec = (SL_S_RDR_NWSPCLAMTDEFAULTCURRecord)defaultcur.get(i);
			
			
			String code = rec.rdr_no;
			String name = rec.medicd;
			
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

	public String clamtcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = clamtcur.size();
		for(int i=0; i<size; i++){
			SL_S_RDR_NWSPCLAMTCLAMTCURRecord rec = (SL_S_RDR_NWSPCLAMTCLAMTCURRecord)clamtcur.get(i);
			
			
			String code = rec.rdr_no;
			String name = rec.medicd;
			
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

	public String clamtmthdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = clamtmthdcur.size();
		for(int i=0; i<size; i++){
			SL_S_RDR_NWSPCLAMTCLAMTMTHDCURRecord rec = (SL_S_RDR_NWSPCLAMTCLAMTMTHDCURRecord)clamtmthdcur.get(i);
			
			
			String code = rec.ciymgbcd;
			String name = rec.cicdgb;
			
			sb.append("<input name=\"");
			sb.append("ciymgbcd");
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

	public String rcpmclsfcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rcpmclsfcur.size();
		for(int i=0; i<size; i++){
			SL_S_RDR_NWSPCLAMTRCPMCLSFCURRecord rec = (SL_S_RDR_NWSPCLAMTRCPMCLSFCURRecord)rcpmclsfcur.get(i);
			
			
			String code = rec.ciymgbcd;
			String name = rec.cicdgb;
			
			sb.append("<input name=\"");
			sb.append("ciymgbcd");
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

	public String defaultcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = defaultcur.size();
		for(int i=0; i<size; i++){
			SL_S_RDR_NWSPCLAMTDEFAULTCURRecord rec = (SL_S_RDR_NWSPCLAMTDEFAULTCURRecord)defaultcur.get(i);
			
			
			String code = rec.rdr_no;
			String name = rec.medicd;
			
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

	public String clamtcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = clamtcur.size();
		for(int i=0; i<size; i++){
			SL_S_RDR_NWSPCLAMTCLAMTCURRecord rec = (SL_S_RDR_NWSPCLAMTCLAMTCURRecord)clamtcur.get(i);
			
			
			String code = rec.rdr_no;
			String name = rec.medicd;
			
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

	public String clamtmthdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = clamtmthdcur.size();
		for(int i=0; i<size; i++){
			SL_S_RDR_NWSPCLAMTCLAMTMTHDCURRecord rec = (SL_S_RDR_NWSPCLAMTCLAMTMTHDCURRecord)clamtmthdcur.get(i);
			
			
			String code = rec.ciymgbcd;
			String name = rec.cicdgb;
			
			sb.append("<input name=\"");
			sb.append("ciymgbcd");
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

	public String rcpmclsfcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rcpmclsfcur.size();
		for(int i=0; i<size; i++){
			SL_S_RDR_NWSPCLAMTRCPMCLSFCURRecord rec = (SL_S_RDR_NWSPCLAMTRCPMCLSFCURRecord)rcpmclsfcur.get(i);
			
			
			String code = rec.ciymgbcd;
			String name = rec.cicdgb;
			
			sb.append("<input name=\"");
			sb.append("ciymgbcd");
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
	SL_S_RDR_NWSPCLAMTDataSet ds = (SL_S_RDR_NWSPCLAMTDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.defaultcur.size(); i++){
		SL_S_RDR_NWSPCLAMTDEFAULTCURRecord defaultcurRec = (SL_S_RDR_NWSPCLAMTDEFAULTCURRecord)ds.defaultcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.clamtcur.size(); i++){
		SL_S_RDR_NWSPCLAMTCLAMTCURRecord clamtcurRec = (SL_S_RDR_NWSPCLAMTCLAMTCURRecord)ds.clamtcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.clamtmthdcur.size(); i++){
		SL_S_RDR_NWSPCLAMTCLAMTMTHDCURRecord clamtmthdcurRec = (SL_S_RDR_NWSPCLAMTCLAMTMTHDCURRecord)ds.clamtmthdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.rcpmclsfcur.size(); i++){
		SL_S_RDR_NWSPCLAMTRCPMCLSFCURRecord rcpmclsfcurRec = (SL_S_RDR_NWSPCLAMTRCPMCLSFCURRecord)ds.rcpmclsfcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurryymm()%>
<%= ds.getRealsubsamt()%>
<%= ds.getDefaultcur()%>
<%= ds.getClamtcur()%>
<%= ds.getClamtmthdcur()%>
<%= ds.getRcpmclsfcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= defaultcurRec.rdr_no%>
<%= defaultcurRec.medicd%>
<%= defaultcurRec.dlvdstccd%>
<%= defaultcurRec.clamtmthdcd%>
<%= defaultcurRec.clamqty%>
<%= defaultcurRec.clamamt%>
<%= clamtcurRec.rdr_no%>
<%= clamtcurRec.medicd%>
<%= clamtcurRec.dlvdstccd%>
<%= clamtcurRec.clamtmthdcd%>
<%= clamtcurRec.rcpmclsfcd%>
<%= clamtcurRec.clamamt%>
<%= clamtcurRec.clamt%>
<%= clamtcurRec.recpdt%>
<%= clamtmthdcurRec.ciymgbcd%>
<%= clamtmthdcurRec.cicdgb%>
<%= clamtmthdcurRec.cicodeval%>
<%= clamtmthdcurRec.cicdnm%>
<%= clamtmthdcurRec.cicdynm%>
<%= rcpmclsfcurRec.ciymgbcd%>
<%= rcpmclsfcurRec.cicdgb%>
<%= rcpmclsfcurRec.cicodeval%>
<%= rcpmclsfcurRec.cicdnm%>
<%= rcpmclsfcurRec.cicdynm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat May 22 15:08:35 KST 2004 */