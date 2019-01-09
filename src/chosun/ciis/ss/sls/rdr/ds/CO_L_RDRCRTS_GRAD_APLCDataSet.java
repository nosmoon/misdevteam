/***************************************************************************************************
* 파일명 : CO_L_RDRCRTS_GRAD_APLCDataSet.java
* 기능 : 독자현황-독자등급부여
* 작성일자 : 2005-02-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.rdr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.rdr.dm.*;
import chosun.ciis.ss.sls.rdr.rec.*;

/**
 * 독자현황-독자등급부여
 */


public class CO_L_RDRCRTS_GRAD_APLCDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList errresncdcur = new ArrayList();
	public ArrayList pusbocdcur = new ArrayList();
	public ArrayList gradcur = new ArrayList();
	public ArrayList medicdcur = new ArrayList();
	public ArrayList rdr_gradaplccur = new ArrayList();
	public ArrayList dtlsprocstatcur = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public CO_L_RDRCRTS_GRAD_APLCDataSet(){}
	public CO_L_RDRCRTS_GRAD_APLCDataSet(String errcode, String errmsg, long totalcnt){
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
		this.totalcnt = cstmt.getLong(22);
		ResultSet rset0 = (ResultSet) cstmt.getObject(23);
		while(rset0.next()){
			CO_L_RDRCRTS_GRAD_APLCPUSBOCDCURRecord rec = new CO_L_RDRCRTS_GRAD_APLCPUSBOCDCURRecord();
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.deptcd = Util.checkString(rset0.getString("deptcd"));
			rec.sellnetclsf = Util.checkString(rset0.getString("sellnetclsf"));
			this.pusbocdcur.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(24);
		while(rset1.next()){
			CO_L_RDRCRTS_GRAD_APLCMEDICDCURRecord rec = new CO_L_RDRCRTS_GRAD_APLCMEDICDCURRecord();
			rec.cicodeval = Util.checkString(rset1.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset1.getString("cicdnm"));
			this.medicdcur.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(25);
		while(rset2.next()){
			CO_L_RDRCRTS_GRAD_APLCDTLSPROCSTATCURRecord rec = new CO_L_RDRCRTS_GRAD_APLCDTLSPROCSTATCURRecord();
			rec.ciymgbcd = Util.checkString(rset2.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset2.getString("cicdgb"));
			rec.cicodeval = Util.checkString(rset2.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset2.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset2.getString("cicdynm"));
			this.dtlsprocstatcur.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(26);
		while(rset3.next()){
			CO_L_RDRCRTS_GRAD_APLCERRRESNCDCURRecord rec = new CO_L_RDRCRTS_GRAD_APLCERRRESNCDCURRecord();
			rec.ciymgbcd = Util.checkString(rset3.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset3.getString("cicdgb"));
			rec.cicodeval = Util.checkString(rset3.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset3.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset3.getString("cicdynm"));
			this.errresncdcur.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(27);
		while(rset4.next()){
			CO_L_RDRCRTS_GRAD_APLCGRADCURRecord rec = new CO_L_RDRCRTS_GRAD_APLCGRADCURRecord();
			rec.ciymgbcd = Util.checkString(rset4.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset4.getString("cicdgb"));
			rec.cicodeval = Util.checkString(rset4.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset4.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset4.getString("cicdynm"));
			this.gradcur.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(28);
		while(rset5.next()){
			CO_L_RDRCRTS_GRAD_APLCRDR_GRADAPLCCURRecord rec = new CO_L_RDRCRTS_GRAD_APLCRDR_GRADAPLCCURRecord();
			rec.regdt = Util.checkString(rset5.getString("regdt"));
			rec.regno = Util.checkString(rset5.getString("regno"));
			rec.rdr_no = Util.checkString(rset5.getString("rdr_no"));
			rec.medicd = Util.checkString(rset5.getString("medicd"));
			rec.medinm = Util.checkString(rset5.getString("medinm"));
			rec.fstsubsdt = Util.checkString(rset5.getString("fstsubsdt"));
			rec.dtlsprocstat = Util.checkString(rset5.getString("dtlsprocstat"));
			rec.dtlsprocstatnm = Util.checkString(rset5.getString("dtlsprocstatnm"));
			rec.errresncd = Util.checkString(rset5.getString("errresncd"));
			rec.errresncdnm = Util.checkString(rset5.getString("errresncdnm"));
			rec.bocd = Util.checkString(rset5.getString("bocd"));
			rec.bonm = Util.checkString(rset5.getString("bonm"));
			rec.id = Util.checkString(rset5.getString("id"));
			rec.entr_no = Util.checkString(rset5.getString("entr_no"));
			rec.memb_nm_korn = Util.checkString(rset5.getString("memb_nm_korn"));
			rec.rdrnm = Util.checkString(rset5.getString("rdrnm"));
			rec.prn = Util.checkString(rset5.getString("prn"));
			rec.email = Util.checkString(rset5.getString("email"));
			rec.ceph_no_1 = Util.checkString(rset5.getString("ceph_no_1"));
			rec.ceph_no_2 = Util.checkString(rset5.getString("ceph_no_2"));
			rec.zip = Util.checkString(rset5.getString("zip"));
			rec.addr = Util.checkString(rset5.getString("addr"));
			rec.dtlsaddr = Util.checkString(rset5.getString("dtlsaddr"));
			rec.home_tel_no = Util.checkString(rset5.getString("home_tel_no"));
			rec.subspersrshpcd = Util.checkString(rset5.getString("subspersrshpcd"));
			rec.memb_kind_cd = Util.checkString(rset5.getString("memb_kind_cd"));
			rec.procdt = Util.checkString(rset5.getString("procdt"));
			rec.recnm = Util.checkString(rset5.getString("recnm"));
			rec.recdt = rset5.getTimestamp("recdt");
			rec.recprn = Util.checkString(rset5.getString("recprn"));
			rec.rnum = rset5.getInt("rnum");
			this.rdr_gradaplccur.add(rec);
		}
	}

	public String pusbocdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = pusbocdcur.size();
		for(int i=0; i<size; i++){
			CO_L_RDRCRTS_GRAD_APLCPUSBOCDCURRecord rec = (CO_L_RDRCRTS_GRAD_APLCPUSBOCDCURRecord)pusbocdcur.get(i);
			
			
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

	public String medicdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = medicdcur.size();
		for(int i=0; i<size; i++){
			CO_L_RDRCRTS_GRAD_APLCMEDICDCURRecord rec = (CO_L_RDRCRTS_GRAD_APLCMEDICDCURRecord)medicdcur.get(i);
			
			
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

	public String dtlsprocstatcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dtlsprocstatcur.size();
		for(int i=0; i<size; i++){
			CO_L_RDRCRTS_GRAD_APLCDTLSPROCSTATCURRecord rec = (CO_L_RDRCRTS_GRAD_APLCDTLSPROCSTATCURRecord)dtlsprocstatcur.get(i);
			
			
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

	public String errresncdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = errresncdcur.size();
		for(int i=0; i<size; i++){
			CO_L_RDRCRTS_GRAD_APLCERRRESNCDCURRecord rec = (CO_L_RDRCRTS_GRAD_APLCERRRESNCDCURRecord)errresncdcur.get(i);
			
			
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

	public String gradcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = gradcur.size();
		for(int i=0; i<size; i++){
			CO_L_RDRCRTS_GRAD_APLCGRADCURRecord rec = (CO_L_RDRCRTS_GRAD_APLCGRADCURRecord)gradcur.get(i);
			
			
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

	public String rdr_gradaplccurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rdr_gradaplccur.size();
		for(int i=0; i<size; i++){
			CO_L_RDRCRTS_GRAD_APLCRDR_GRADAPLCCURRecord rec = (CO_L_RDRCRTS_GRAD_APLCRDR_GRADAPLCCURRecord)rdr_gradaplccur.get(i);
			
			
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

	public String pusbocdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = pusbocdcur.size();
		for(int i=0; i<size; i++){
			CO_L_RDRCRTS_GRAD_APLCPUSBOCDCURRecord rec = (CO_L_RDRCRTS_GRAD_APLCPUSBOCDCURRecord)pusbocdcur.get(i);
			
			
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

	public String medicdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = medicdcur.size();
		for(int i=0; i<size; i++){
			CO_L_RDRCRTS_GRAD_APLCMEDICDCURRecord rec = (CO_L_RDRCRTS_GRAD_APLCMEDICDCURRecord)medicdcur.get(i);
			
			
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

	public String dtlsprocstatcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dtlsprocstatcur.size();
		for(int i=0; i<size; i++){
			CO_L_RDRCRTS_GRAD_APLCDTLSPROCSTATCURRecord rec = (CO_L_RDRCRTS_GRAD_APLCDTLSPROCSTATCURRecord)dtlsprocstatcur.get(i);
			
			
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

	public String errresncdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = errresncdcur.size();
		for(int i=0; i<size; i++){
			CO_L_RDRCRTS_GRAD_APLCERRRESNCDCURRecord rec = (CO_L_RDRCRTS_GRAD_APLCERRRESNCDCURRecord)errresncdcur.get(i);
			
			
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

	public String gradcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = gradcur.size();
		for(int i=0; i<size; i++){
			CO_L_RDRCRTS_GRAD_APLCGRADCURRecord rec = (CO_L_RDRCRTS_GRAD_APLCGRADCURRecord)gradcur.get(i);
			
			
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

	public String rdr_gradaplccurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rdr_gradaplccur.size();
		for(int i=0; i<size; i++){
			CO_L_RDRCRTS_GRAD_APLCRDR_GRADAPLCCURRecord rec = (CO_L_RDRCRTS_GRAD_APLCRDR_GRADAPLCCURRecord)rdr_gradaplccur.get(i);
			
			
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

	public String pusbocdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = pusbocdcur.size();
		for(int i=0; i<size; i++){
			CO_L_RDRCRTS_GRAD_APLCPUSBOCDCURRecord rec = (CO_L_RDRCRTS_GRAD_APLCPUSBOCDCURRecord)pusbocdcur.get(i);
			
			
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

	public String medicdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = medicdcur.size();
		for(int i=0; i<size; i++){
			CO_L_RDRCRTS_GRAD_APLCMEDICDCURRecord rec = (CO_L_RDRCRTS_GRAD_APLCMEDICDCURRecord)medicdcur.get(i);
			
			
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

	public String dtlsprocstatcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dtlsprocstatcur.size();
		for(int i=0; i<size; i++){
			CO_L_RDRCRTS_GRAD_APLCDTLSPROCSTATCURRecord rec = (CO_L_RDRCRTS_GRAD_APLCDTLSPROCSTATCURRecord)dtlsprocstatcur.get(i);
			
			
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

	public String errresncdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = errresncdcur.size();
		for(int i=0; i<size; i++){
			CO_L_RDRCRTS_GRAD_APLCERRRESNCDCURRecord rec = (CO_L_RDRCRTS_GRAD_APLCERRRESNCDCURRecord)errresncdcur.get(i);
			
			
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

	public String gradcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = gradcur.size();
		for(int i=0; i<size; i++){
			CO_L_RDRCRTS_GRAD_APLCGRADCURRecord rec = (CO_L_RDRCRTS_GRAD_APLCGRADCURRecord)gradcur.get(i);
			
			
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

	public String rdr_gradaplccurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rdr_gradaplccur.size();
		for(int i=0; i<size; i++){
			CO_L_RDRCRTS_GRAD_APLCRDR_GRADAPLCCURRecord rec = (CO_L_RDRCRTS_GRAD_APLCRDR_GRADAPLCCURRecord)rdr_gradaplccur.get(i);
			
			
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
	CO_L_RDRCRTS_GRAD_APLCDataSet ds = (CO_L_RDRCRTS_GRAD_APLCDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.pusbocdcur.size(); i++){
		CO_L_RDRCRTS_GRAD_APLCPUSBOCDCURRecord pusbocdcurRec = (CO_L_RDRCRTS_GRAD_APLCPUSBOCDCURRecord)ds.pusbocdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.medicdcur.size(); i++){
		CO_L_RDRCRTS_GRAD_APLCMEDICDCURRecord medicdcurRec = (CO_L_RDRCRTS_GRAD_APLCMEDICDCURRecord)ds.medicdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.dtlsprocstatcur.size(); i++){
		CO_L_RDRCRTS_GRAD_APLCDTLSPROCSTATCURRecord dtlsprocstatcurRec = (CO_L_RDRCRTS_GRAD_APLCDTLSPROCSTATCURRecord)ds.dtlsprocstatcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.errresncdcur.size(); i++){
		CO_L_RDRCRTS_GRAD_APLCERRRESNCDCURRecord errresncdcurRec = (CO_L_RDRCRTS_GRAD_APLCERRRESNCDCURRecord)ds.errresncdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.gradcur.size(); i++){
		CO_L_RDRCRTS_GRAD_APLCGRADCURRecord gradcurRec = (CO_L_RDRCRTS_GRAD_APLCGRADCURRecord)ds.gradcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.rdr_gradaplccur.size(); i++){
		CO_L_RDRCRTS_GRAD_APLCRDR_GRADAPLCCURRecord rdr_gradaplccurRec = (CO_L_RDRCRTS_GRAD_APLCRDR_GRADAPLCCURRecord)ds.rdr_gradaplccur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotalcnt()%>
<%= ds.getPusbocdcur()%>
<%= ds.getMedicdcur()%>
<%= ds.getDtlsprocstatcur()%>
<%= ds.getErrresncdcur()%>
<%= ds.getGradcur()%>
<%= ds.getRdr_gradaplccur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= pusbocdcurRec.bocd%>
<%= pusbocdcurRec.bonm%>
<%= pusbocdcurRec.deptcd%>
<%= pusbocdcurRec.sellnetclsf%>
<%= medicdcurRec.cicodeval%>
<%= medicdcurRec.cicdnm%>
<%= dtlsprocstatcurRec.ciymgbcd%>
<%= dtlsprocstatcurRec.cicdgb%>
<%= dtlsprocstatcurRec.cicodeval%>
<%= dtlsprocstatcurRec.cicdnm%>
<%= dtlsprocstatcurRec.cicdynm%>
<%= errresncdcurRec.ciymgbcd%>
<%= errresncdcurRec.cicdgb%>
<%= errresncdcurRec.cicodeval%>
<%= errresncdcurRec.cicdnm%>
<%= errresncdcurRec.cicdynm%>
<%= gradcurRec.ciymgbcd%>
<%= gradcurRec.cicdgb%>
<%= gradcurRec.cicodeval%>
<%= gradcurRec.cicdnm%>
<%= gradcurRec.cicdynm%>
<%= rdr_gradaplccurRec.regdt%>
<%= rdr_gradaplccurRec.regno%>
<%= rdr_gradaplccurRec.rdr_no%>
<%= rdr_gradaplccurRec.medicd%>
<%= rdr_gradaplccurRec.medinm%>
<%= rdr_gradaplccurRec.fstsubsdt%>
<%= rdr_gradaplccurRec.dtlsprocstat%>
<%= rdr_gradaplccurRec.dtlsprocstatnm%>
<%= rdr_gradaplccurRec.errresncd%>
<%= rdr_gradaplccurRec.errresncdnm%>
<%= rdr_gradaplccurRec.bocd%>
<%= rdr_gradaplccurRec.bonm%>
<%= rdr_gradaplccurRec.id%>
<%= rdr_gradaplccurRec.entr_no%>
<%= rdr_gradaplccurRec.memb_nm_korn%>
<%= rdr_gradaplccurRec.rdrnm%>
<%= rdr_gradaplccurRec.prn%>
<%= rdr_gradaplccurRec.email%>
<%= rdr_gradaplccurRec.ceph_no_1%>
<%= rdr_gradaplccurRec.ceph_no_2%>
<%= rdr_gradaplccurRec.zip%>
<%= rdr_gradaplccurRec.addr%>
<%= rdr_gradaplccurRec.dtlsaddr%>
<%= rdr_gradaplccurRec.home_tel_no%>
<%= rdr_gradaplccurRec.subspersrshpcd%>
<%= rdr_gradaplccurRec.memb_kind_cd%>
<%= rdr_gradaplccurRec.procdt%>
<%= rdr_gradaplccurRec.recnm%>
<%= rdr_gradaplccurRec.recdt%>
<%= rdr_gradaplccurRec.recprn%>
<%= rdr_gradaplccurRec.rnum%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Feb 22 10:22:59 KST 2005 */