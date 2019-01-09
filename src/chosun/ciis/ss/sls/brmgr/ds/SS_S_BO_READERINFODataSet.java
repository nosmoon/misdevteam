/***************************************************************************************************
 * 파일명   : SP_SS_S_BO_READERINFO
 * 기능     : 지국경영-주간조선 독자조회
 * 작성일자 : 2007/06/15
 * 작성자   : 이혁
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.brmgr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.rec.*;

/**
**  SP_SS_S_BO_READERINFO
**/

public class SS_S_BO_READERINFODataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList readinfocur = new ArrayList();
	public ArrayList sendmthdcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_S_BO_READERINFODataSet(){}
	public SS_S_BO_READERINFODataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			SS_S_BO_READERINFOREADINFOCURRecord rec = new SS_S_BO_READERINFOREADINFOCURRecord();
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.medicd = Util.checkString(rset0.getString("medicd"));
			rec.termsubsno = Util.checkString(rset0.getString("termsubsno"));
			rec.rdrnm = Util.checkString(rset0.getString("rdrnm"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.aplcdt = Util.checkString(rset0.getString("aplcdt"));
			rec.delidt = Util.checkString(rset0.getString("delidt"));
			rec.subsfrser_no = Util.checkString(rset0.getString("subsfrser_no"));
			rec.substoser_no = Util.checkString(rset0.getString("substoser_no"));
			rec.rdrtel_no1 = Util.checkString(rset0.getString("rdrtel_no1"));
			rec.acqnm = Util.checkString(rset0.getString("acqnm"));
			rec.rdrtel_no2 = Util.checkString(rset0.getString("rdrtel_no2"));
			rec.rdrtel_no3 = Util.checkString(rset0.getString("rdrtel_no3"));
			rec.rdrptph_no1 = Util.checkString(rset0.getString("rdrptph_no1"));
			rec.rdrptph_no2 = Util.checkString(rset0.getString("rdrptph_no2"));
			rec.rdrptph_no3 = Util.checkString(rset0.getString("rdrptph_no3"));
			rec.rdroffinm = Util.checkString(rset0.getString("rdroffinm"));
			rec.rdroffitel_no1 = Util.checkString(rset0.getString("rdroffitel_no1"));
			rec.rdroffitel_no2 = Util.checkString(rset0.getString("rdroffitel_no2"));
			rec.rdroffitel_no3 = Util.checkString(rset0.getString("rdroffitel_no3"));
			rec.rdrposi = Util.checkString(rset0.getString("rdrposi"));
			rec.prn = Util.checkString(rset0.getString("prn"));
			rec.email = Util.checkString(rset0.getString("email"));
			rec.bidt = Util.checkString(rset0.getString("bidt"));
			rec.lusoclsfcd = Util.checkString(rset0.getString("lusoclsfcd"));
			rec.weddyn = Util.checkString(rset0.getString("weddyn"));
			rec.weddanvydt = Util.checkString(rset0.getString("weddanvydt"));
			rec.ocpnclsfcd = Util.checkString(rset0.getString("ocpnclsfcd"));
			rec.resiclsfcd = Util.checkString(rset0.getString("resiclsfcd"));
			rec.resitypecd = Util.checkString(rset0.getString("resitypecd"));
			rec.rshpclsfcd = Util.checkString(rset0.getString("rshpclsfcd"));
			rec.dlvzip = Util.checkString(rset0.getString("dlvzip"));
			rec.dlvaddr = Util.checkString(rset0.getString("dlvaddr"));
			rec.dlvdtlsaddr = Util.checkString(rset0.getString("dlvdtlsaddr"));
			rec.paty_clsfcd = Util.checkString(rset0.getString("paty_clsfcd"));
			rec.patycd = Util.checkString(rset0.getString("patycd"));
			rec.sendmthd = Util.checkString(rset0.getString("sendmthd"));
			rec.ddlv_cd = Util.checkString(rset0.getString("ddlv_cd"));
			rec.recpclsf = Util.checkString(rset0.getString("recpclsf"));
			rec.aplc_persflnm = Util.checkString(rset0.getString("aplc_persflnm"));
			rec.aplc_persoffinm = Util.checkString(rset0.getString("aplc_persoffinm"));
			rec.aplc_persposi = Util.checkString(rset0.getString("aplc_persposi"));
			rec.aplc_perstel_no1 = Util.checkString(rset0.getString("aplc_perstel_no1"));
			rec.aplc_perstel_no2 = Util.checkString(rset0.getString("aplc_perstel_no2"));
			rec.aplc_perstel_no3 = Util.checkString(rset0.getString("aplc_perstel_no3"));
			rec.aplc_persptph_no1 = Util.checkString(rset0.getString("aplc_persptph_no1"));
			rec.aplc_persptph_no2 = Util.checkString(rset0.getString("aplc_persptph_no2"));
			rec.aplc_persptph_no3 = Util.checkString(rset0.getString("aplc_persptph_no3"));
			rec.clamplflnm = Util.checkString(rset0.getString("clamplflnm"));
			rec.clamploffinm = Util.checkString(rset0.getString("clamploffinm"));
			rec.clamplposi = Util.checkString(rset0.getString("clamplposi"));
			rec.clampltel_no1 = Util.checkString(rset0.getString("clampltel_no1"));
			rec.clampltel_no2 = Util.checkString(rset0.getString("clampltel_no2"));
			rec.clampltel_no3 = Util.checkString(rset0.getString("clampltel_no3"));
			rec.clamplptph_no1 = Util.checkString(rset0.getString("clamplptph_no1"));
			rec.clamplptph_no2 = Util.checkString(rset0.getString("clamplptph_no2"));
			rec.clamplptph_no3 = Util.checkString(rset0.getString("clamplptph_no3"));
			rec.clamplzip = Util.checkString(rset0.getString("clamplzip"));
			rec.clampladdr = Util.checkString(rset0.getString("clampladdr"));
			rec.clampldtlsaddr = Util.checkString(rset0.getString("clampldtlsaddr"));
			rec.acpntypeclsf = Util.checkString(rset0.getString("acpntypeclsf"));
			rec.acpntypecd = Util.checkString(rset0.getString("acpntypecd"));
			rec.linkyear = rset0.getInt("linkyear");
			rec.sendyncd = Util.checkString(rset0.getString("sendyncd"));
			rec.sendynprocdt = Util.checkString(rset0.getString("sendynprocdt"));
			rec.alonpaypointcd = Util.checkString(rset0.getString("alonpaypointcd"));
			rec.alonpaycd = Util.checkString(rset0.getString("alonpaycd"));
			rec.alonpayprocdt = Util.checkString(rset0.getString("alonpayprocdt"));
			rec.amno = Util.checkString(rset0.getString("amno"));
			rec.amno_nm = Util.checkString(rset0.getString("amno_nm"));
			rec.amno_deptnm = Util.checkString(rset0.getString("amno_deptnm"));
			rec.hdqtemp_no = Util.checkString(rset0.getString("hdqtemp_no"));
			rec.hdqtemp_nm = Util.checkString(rset0.getString("hdqtemp_nm"));
			rec.hdqtemp_deptnm = Util.checkString(rset0.getString("hdqtemp_deptnm"));
			rec.mang_empno = Util.checkString(rset0.getString("mang_empno"));
			rec.mang_emp_nm = Util.checkString(rset0.getString("mang_emp_nm"));
			rec.mang_emp_deptnm = Util.checkString(rset0.getString("mang_emp_deptnm"));
			rec.rdr_extnno = Util.checkString(rset0.getString("rdr_extnno"));
			rec.rdr_extndt = Util.checkString(rset0.getString("rdr_extndt"));
			rec.arbtno = Util.checkString(rset0.getString("arbtno"));
			rec.arbtaplcdt = Util.checkString(rset0.getString("arbtaplcdt"));
			rec.taxstmtexne = Util.checkString(rset0.getString("taxstmtexne"));
			rec.taxstmtkind = Util.checkString(rset0.getString("taxstmtkind"));
			rec.taxstmtissudt = Util.checkString(rset0.getString("taxstmtissudt"));
			rec.memo = Util.checkString(rset0.getString("memo"));
			rec.sellamt = rset0.getInt("sellamt");
			rec.dcamt = rset0.getInt("dcamt");
			rec.realsellamt = rset0.getInt("realsellamt");
			rec.un_clamtamt = rset0.getInt("un_clamtamt");
			rec.rcpmmthd = Util.checkString(rset0.getString("rcpmmthd"));
			rec.rcpmenddt = Util.checkString(rset0.getString("rcpmenddt"));
			rec.payalonamt = rset0.getInt("payalonamt");
			rec.subsyys = Util.checkString(rset0.getString("subsyys"));
			rec.aplcpathcd = Util.checkString(rset0.getString("aplcpathcd"));
			rec.rdr_extntypecd = Util.checkString(rset0.getString("rdr_extntypecd"));
			rec.suspresncd = Util.checkString(rset0.getString("suspresncd"));
			rec.acq_bocd = Util.checkString(rset0.getString("acq_bocd"));
			rec.acq_bonm = Util.checkString(rset0.getString("acq_bonm"));
			rec.deli_empno = Util.checkString(rset0.getString("deli_empno"));
			rec.deli_empnm = Util.checkString(rset0.getString("deli_empnm"));
			rec.deli_deptnm = Util.checkString(rset0.getString("deli_deptnm"));
			rec.boprocdt = Util.checkString(rset0.getString("boprocdt"));
			rec.dstccd = Util.checkString(rset0.getString("dstccd"));
			rec.dlvno = Util.checkString(rset0.getString("dlvno"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.medinm = Util.checkString(rset0.getString("medinm"));
			rec.recpclsfnm = Util.checkString(rset0.getString("recpclsfnm"));
			rec.bo_rdr_no = Util.checkString(rset0.getString("bo_rdr_no"));
			this.readinfocur.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			SS_S_BO_READERINFOSENDMTHDCURRecord rec = new SS_S_BO_READERINFOSENDMTHDCURRecord();
			rec.cicodeval = Util.checkString(rset1.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset1.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset1.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset1.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset1.getString("cicdgb"));
			this.sendmthdcur.add(rec);
		}
	}

	public String readinfocurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = readinfocur.size();
		for(int i=0; i<size; i++){
			SS_S_BO_READERINFOREADINFOCURRecord rec = (SS_S_BO_READERINFOREADINFOCURRecord)readinfocur.get(i);
			
			
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

	public String sendmthdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = sendmthdcur.size();
		for(int i=0; i<size; i++){
			SS_S_BO_READERINFOSENDMTHDCURRecord rec = (SS_S_BO_READERINFOSENDMTHDCURRecord)sendmthdcur.get(i);
			
			
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

	public String readinfocurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = readinfocur.size();
		for(int i=0; i<size; i++){
			SS_S_BO_READERINFOREADINFOCURRecord rec = (SS_S_BO_READERINFOREADINFOCURRecord)readinfocur.get(i);
			
			
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

	public String sendmthdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = sendmthdcur.size();
		for(int i=0; i<size; i++){
			SS_S_BO_READERINFOSENDMTHDCURRecord rec = (SS_S_BO_READERINFOSENDMTHDCURRecord)sendmthdcur.get(i);
			
			
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

	public String readinfocurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = readinfocur.size();
		for(int i=0; i<size; i++){
			SS_S_BO_READERINFOREADINFOCURRecord rec = (SS_S_BO_READERINFOREADINFOCURRecord)readinfocur.get(i);
			
			
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

	public String sendmthdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = sendmthdcur.size();
		for(int i=0; i<size; i++){
			SS_S_BO_READERINFOSENDMTHDCURRecord rec = (SS_S_BO_READERINFOSENDMTHDCURRecord)sendmthdcur.get(i);
			
			
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
	SS_S_BO_READERINFODataSet ds = (SS_S_BO_READERINFODataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.readinfocur.size(); i++){
		SS_S_BO_READERINFOREADINFOCURRecord readinfocurRec = (SS_S_BO_READERINFOREADINFOCURRecord)ds.readinfocur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.sendmthdcur.size(); i++){
		SS_S_BO_READERINFOSENDMTHDCURRecord sendmthdcurRec = (SS_S_BO_READERINFOSENDMTHDCURRecord)ds.sendmthdcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getReadinfocur()%>
<%= ds.getSendmthdcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= readinfocurRec.rdr_no%>
<%= readinfocurRec.medicd%>
<%= readinfocurRec.termsubsno%>
<%= readinfocurRec.rdrnm%>
<%= readinfocurRec.bocd%>
<%= readinfocurRec.aplcdt%>
<%= readinfocurRec.delidt%>
<%= readinfocurRec.subsfrser_no%>
<%= readinfocurRec.substoser_no%>
<%= readinfocurRec.rdrtel_no1%>
<%= readinfocurRec.acqnm%>
<%= readinfocurRec.rdrtel_no2%>
<%= readinfocurRec.rdrtel_no3%>
<%= readinfocurRec.rdrptph_no1%>
<%= readinfocurRec.rdrptph_no2%>
<%= readinfocurRec.rdrptph_no3%>
<%= readinfocurRec.rdroffinm%>
<%= readinfocurRec.rdroffitel_no1%>
<%= readinfocurRec.rdroffitel_no2%>
<%= readinfocurRec.rdroffitel_no3%>
<%= readinfocurRec.rdrposi%>
<%= readinfocurRec.prn%>
<%= readinfocurRec.email%>
<%= readinfocurRec.bidt%>
<%= readinfocurRec.lusoclsfcd%>
<%= readinfocurRec.weddyn%>
<%= readinfocurRec.weddanvydt%>
<%= readinfocurRec.ocpnclsfcd%>
<%= readinfocurRec.resiclsfcd%>
<%= readinfocurRec.resitypecd%>
<%= readinfocurRec.rshpclsfcd%>
<%= readinfocurRec.dlvzip%>
<%= readinfocurRec.dlvaddr%>
<%= readinfocurRec.dlvdtlsaddr%>
<%= readinfocurRec.paty_clsfcd%>
<%= readinfocurRec.patycd%>
<%= readinfocurRec.sendmthd%>
<%= readinfocurRec.ddlv_cd%>
<%= readinfocurRec.recpclsf%>
<%= readinfocurRec.aplc_persflnm%>
<%= readinfocurRec.aplc_persoffinm%>
<%= readinfocurRec.aplc_persposi%>
<%= readinfocurRec.aplc_perstel_no1%>
<%= readinfocurRec.aplc_perstel_no2%>
<%= readinfocurRec.aplc_perstel_no3%>
<%= readinfocurRec.aplc_persptph_no1%>
<%= readinfocurRec.aplc_persptph_no2%>
<%= readinfocurRec.aplc_persptph_no3%>
<%= readinfocurRec.clamplflnm%>
<%= readinfocurRec.clamploffinm%>
<%= readinfocurRec.clamplposi%>
<%= readinfocurRec.clampltel_no1%>
<%= readinfocurRec.clampltel_no2%>
<%= readinfocurRec.clampltel_no3%>
<%= readinfocurRec.clamplptph_no1%>
<%= readinfocurRec.clamplptph_no2%>
<%= readinfocurRec.clamplptph_no3%>
<%= readinfocurRec.clamplzip%>
<%= readinfocurRec.clampladdr%>
<%= readinfocurRec.clampldtlsaddr%>
<%= readinfocurRec.acpntypeclsf%>
<%= readinfocurRec.acpntypecd%>
<%= readinfocurRec.linkyear%>
<%= readinfocurRec.sendyncd%>
<%= readinfocurRec.sendynprocdt%>
<%= readinfocurRec.alonpaypointcd%>
<%= readinfocurRec.alonpaycd%>
<%= readinfocurRec.alonpayprocdt%>
<%= readinfocurRec.amno%>
<%= readinfocurRec.amno_nm%>
<%= readinfocurRec.amno_deptnm%>
<%= readinfocurRec.hdqtemp_no%>
<%= readinfocurRec.hdqtemp_nm%>
<%= readinfocurRec.hdqtemp_deptnm%>
<%= readinfocurRec.mang_empno%>
<%= readinfocurRec.mang_emp_nm%>
<%= readinfocurRec.mang_emp_deptnm%>
<%= readinfocurRec.rdr_extnno%>
<%= readinfocurRec.rdr_extndt%>
<%= readinfocurRec.arbtno%>
<%= readinfocurRec.arbtaplcdt%>
<%= readinfocurRec.taxstmtexne%>
<%= readinfocurRec.taxstmtkind%>
<%= readinfocurRec.taxstmtissudt%>
<%= readinfocurRec.memo%>
<%= readinfocurRec.sellamt%>
<%= readinfocurRec.dcamt%>
<%= readinfocurRec.realsellamt%>
<%= readinfocurRec.un_clamtamt%>
<%= readinfocurRec.rcpmmthd%>
<%= readinfocurRec.rcpmenddt%>
<%= readinfocurRec.payalonamt%>
<%= readinfocurRec.subsyys%>
<%= readinfocurRec.aplcpathcd%>
<%= readinfocurRec.rdr_extntypecd%>
<%= readinfocurRec.suspresncd%>
<%= readinfocurRec.acq_bocd%>
<%= readinfocurRec.acq_bonm%>
<%= readinfocurRec.deli_empno%>
<%= readinfocurRec.deli_empnm%>
<%= readinfocurRec.deli_deptnm%>
<%= readinfocurRec.boprocdt%>
<%= readinfocurRec.dstccd%>
<%= readinfocurRec.dlvno%>
<%= readinfocurRec.bonm%>
<%= readinfocurRec.medinm%>
<%= readinfocurRec.recpclsfnm%>
<%= readinfocurRec.bo_rdr_no%>
<%= sendmthdcurRec.cicodeval%>
<%= sendmthdcurRec.cicdnm%>
<%= sendmthdcurRec.cicdynm%>
<%= sendmthdcurRec.ciymgbcd%>
<%= sendmthdcurRec.cicdgb%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jun 15 15:53:01 KST 2007 */