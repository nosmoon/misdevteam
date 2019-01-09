/***************************************************************************************************
* 파일명 : SP_PS_S_SEND_RETN_DTL.java
* 발송-반송관리 상세내역 조회화면
* 작성일자 : 2004-03-19
* 작성자 : 김건호
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ps.pbs.send.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.send.dm.*;
import chosun.ciis.ps.pbs.send.rec.*;

/**
 * 발송-반송관리 상세내역 조회화면
 *
 */



public class PS_S_SEND_RETN_DTLDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList bns_bookcdcur = new ArrayList();
	public ArrayList retnclsfcur = new ArrayList();
	public ArrayList retnresncdcur = new ArrayList();
	public String errcode;
	public String errmsg;
	public String rdr_no;
	public String rdrnm;
	public String medicd;
	public String medinm;
	public String termsubsno;
	public String retndt;
	public String retnclsf;
	public String retn_nmno;
	public String bns_bookcd;
	public String agrmntdt;
	public long agrmntamt;
	public String retnresncd;
	public String memo;
	public String boprocyn;
	public String boprocdt;
	public String boprocmemo;

	public PS_S_SEND_RETN_DTLDataSet(){}
	public PS_S_SEND_RETN_DTLDataSet(String errcode, String errmsg, String rdr_no, String rdrnm, String medicd, String medinm, String termsubsno, String retndt, String retnclsf, String retn_nmno, String bns_bookcd, String agrmntdt, long agrmntamt, String retnresncd, String memo, String boprocyn, String boprocdt, String boprocmemo){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.rdr_no = rdr_no;
		this.rdrnm = rdrnm;
		this.medicd = medicd;
		this.medinm = medinm;
		this.termsubsno = termsubsno;
		this.retndt = retndt;
		this.retnclsf = retnclsf;
		this.retn_nmno = retn_nmno;
		this.bns_bookcd = bns_bookcd;
		this.agrmntdt = agrmntdt;
		this.agrmntamt = agrmntamt;
		this.retnresncd = retnresncd;
		this.memo = memo;
		this.boprocyn = boprocyn;
		this.boprocdt = boprocdt;
		this.boprocmemo = boprocmemo;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setTermsubsno(String termsubsno){
		this.termsubsno = termsubsno;
	}

	public void setRetndt(String retndt){
		this.retndt = retndt;
	}

	public void setRetnclsf(String retnclsf){
		this.retnclsf = retnclsf;
	}

	public void setRetn_nmno(String retn_nmno){
		this.retn_nmno = retn_nmno;
	}

	public void setBns_bookcd(String bns_bookcd){
		this.bns_bookcd = bns_bookcd;
	}

	public void setAgrmntdt(String agrmntdt){
		this.agrmntdt = agrmntdt;
	}

	public void setAgrmntamt(long agrmntamt){
		this.agrmntamt = agrmntamt;
	}

	public void setRetnresncd(String retnresncd){
		this.retnresncd = retnresncd;
	}

	public void setMemo(String memo){
		this.memo = memo;
	}

	public void setBoprocyn(String boprocyn){
		this.boprocyn = boprocyn;
	}

	public void setBoprocdt(String boprocdt){
		this.boprocdt = boprocdt;
	}

	public void setBoprocmemo(String boprocmemo){
		this.boprocmemo = boprocmemo;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public String getTermsubsno(){
		return this.termsubsno;
	}

	public String getRetndt(){
		return this.retndt;
	}

	public String getRetnclsf(){
		return this.retnclsf;
	}

	public String getRetn_nmno(){
		return this.retn_nmno;
	}

	public String getBns_bookcd(){
		return this.bns_bookcd;
	}

	public String getAgrmntdt(){
		return this.agrmntdt;
	}

	public long getAgrmntamt(){
		return this.agrmntamt;
	}

	public String getRetnresncd(){
		return this.retnresncd;
	}

	public String getMemo(){
		return this.memo;
	}

	public String getBoprocyn(){
		return this.boprocyn;
	}

	public String getBoprocdt(){
		return this.boprocdt;
	}

	public String getBoprocmemo(){
		return this.boprocmemo;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.rdr_no = Util.checkString(cstmt.getString(9));
		this.rdrnm = Util.checkString(cstmt.getString(10));
		this.medicd = Util.checkString(cstmt.getString(11));
		this.medinm = Util.checkString(cstmt.getString(12));
		this.termsubsno = Util.checkString(cstmt.getString(13));
		this.retndt = Util.checkString(cstmt.getString(14));
		this.retnclsf = Util.checkString(cstmt.getString(15));
		this.retn_nmno = Util.checkString(cstmt.getString(16));
		this.bns_bookcd = Util.checkString(cstmt.getString(17));
		this.agrmntdt = Util.checkString(cstmt.getString(18));
		this.agrmntamt = cstmt.getLong(19);
		this.retnresncd = Util.checkString(cstmt.getString(20));
		this.memo = Util.checkString(cstmt.getString(21));
		this.boprocyn = Util.checkString(cstmt.getString(22));
		this.boprocdt = Util.checkString(cstmt.getString(23));
		this.boprocmemo = Util.checkString(cstmt.getString(24));
		ResultSet rset0 = (ResultSet) cstmt.getObject(25);
		while(rset0.next()){
			PS_S_SEND_RETN_DTLRETNCLSFCURRecord rec = new PS_S_SEND_RETN_DTLRETNCLSFCURRecord();
			rec.ciymgbcd = Util.checkString(rset0.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset0.getString("cicdgb"));
			rec.cicodeval = Util.checkString(rset0.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset0.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset0.getString("cicdynm"));
			this.retnclsfcur.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(26);
		while(rset1.next()){
			PS_S_SEND_RETN_DTLRETNRESNCDCURRecord rec = new PS_S_SEND_RETN_DTLRETNRESNCDCURRecord();
			rec.ciymgbcd = Util.checkString(rset1.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset1.getString("cicdgb"));
			rec.cicodeval = Util.checkString(rset1.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset1.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset1.getString("cicdynm"));
			this.retnresncdcur.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(27);
		while(rset2.next()){
			PS_S_SEND_RETN_DTLBNS_BOOKCDCURRecord rec = new PS_S_SEND_RETN_DTLBNS_BOOKCDCURRecord();
			rec.bns_bookcd = Util.checkString(rset2.getString("bns_bookcd"));
			rec.bns_booknm = Util.checkString(rset2.getString("bns_booknm"));
			rec.cmpycd = Util.checkString(rset2.getString("cmpycd"));
			rec.bgnvdtydt = Util.checkString(rset2.getString("bgnvdtydt"));
			rec.endvdtydt = Util.checkString(rset2.getString("endvdtydt"));
			this.bns_bookcdcur.add(rec);
		}
	}

	public String retnclsfcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = retnclsfcur.size();
		for(int i=0; i<size; i++){
			PS_S_SEND_RETN_DTLRETNCLSFCURRecord rec = (PS_S_SEND_RETN_DTLRETNCLSFCURRecord)retnclsfcur.get(i);

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

	public String retnresncdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = retnresncdcur.size();
		for(int i=0; i<size; i++){
			PS_S_SEND_RETN_DTLRETNRESNCDCURRecord rec = (PS_S_SEND_RETN_DTLRETNRESNCDCURRecord)retnresncdcur.get(i);

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

	public String bns_bookcdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bns_bookcdcur.size();
		for(int i=0; i<size; i++){
			PS_S_SEND_RETN_DTLBNS_BOOKCDCURRecord rec = (PS_S_SEND_RETN_DTLBNS_BOOKCDCURRecord)bns_bookcdcur.get(i);


			String code = rec.bns_bookcd;
			String name = rec.bns_booknm;

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

	public String retnclsfcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = retnclsfcur.size();
		for(int i=0; i<size; i++){
			PS_S_SEND_RETN_DTLRETNCLSFCURRecord rec = (PS_S_SEND_RETN_DTLRETNCLSFCURRecord)retnclsfcur.get(i);

            String code = rec.cicodeval;
			String name = rec.cicdnm;

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

	public String retnresncdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = retnresncdcur.size();
		for(int i=0; i<size; i++){
			PS_S_SEND_RETN_DTLRETNRESNCDCURRecord rec = (PS_S_SEND_RETN_DTLRETNRESNCDCURRecord)retnresncdcur.get(i);

            String code = rec.cicodeval;
			String name = rec.cicdnm;

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

	public String bns_bookcdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bns_bookcdcur.size();
		for(int i=0; i<size; i++){
			PS_S_SEND_RETN_DTLBNS_BOOKCDCURRecord rec = (PS_S_SEND_RETN_DTLBNS_BOOKCDCURRecord)bns_bookcdcur.get(i);


			String code = rec.bns_bookcd;
			String name = rec.bns_booknm;

			sb.append("<input name=\"");
			sb.append("bns_bookcd");
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

	public String retnclsfcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = retnclsfcur.size();
		for(int i=0; i<size; i++){
			PS_S_SEND_RETN_DTLRETNCLSFCURRecord rec = (PS_S_SEND_RETN_DTLRETNCLSFCURRecord)retnclsfcur.get(i);

            String code = rec.cicodeval;
			String name = rec.cicdnm;

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

	public String retnresncdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = retnresncdcur.size();
		for(int i=0; i<size; i++){
			PS_S_SEND_RETN_DTLRETNRESNCDCURRecord rec = (PS_S_SEND_RETN_DTLRETNRESNCDCURRecord)retnresncdcur.get(i);

            String code = rec.cicodeval;
			String name = rec.cicdnm;

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

	public String bns_bookcdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bns_bookcdcur.size();
		for(int i=0; i<size; i++){
			PS_S_SEND_RETN_DTLBNS_BOOKCDCURRecord rec = (PS_S_SEND_RETN_DTLBNS_BOOKCDCURRecord)bns_bookcdcur.get(i);


			String code = rec.bns_bookcd;
			String name = rec.bns_booknm;

			sb.append("<input name=\"");
			sb.append("bns_bookcd");
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
	PS_S_SEND_RETN_DTLDataSet ds = (PS_S_SEND_RETN_DTLDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.retnclsfcur.size(); i++){
		PS_S_SEND_RETN_DTLRETNCLSFCURRecord retnclsfcurRec = (PS_S_SEND_RETN_DTLRETNCLSFCURRecord)ds.retnclsfcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.retnresncdcur.size(); i++){
		PS_S_SEND_RETN_DTLRETNRESNCDCURRecord retnresncdcurRec = (PS_S_SEND_RETN_DTLRETNRESNCDCURRecord)ds.retnresncdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.bns_bookcdcur.size(); i++){
		PS_S_SEND_RETN_DTLBNS_BOOKCDCURRecord bns_bookcdcurRec = (PS_S_SEND_RETN_DTLBNS_BOOKCDCURRecord)ds.bns_bookcdcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getRdr_no()%>
<%= ds.getRdrnm()%>
<%= ds.getMedicd()%>
<%= ds.getMedinm()%>
<%= ds.getTermsubsno()%>
<%= ds.getRetndt()%>
<%= ds.getRetnclsf()%>
<%= ds.getRetn_nmno()%>
<%= ds.getBns_bookcd()%>
<%= ds.getAgrmntdt()%>
<%= ds.getAgrmntamt()%>
<%= ds.getRetnresncd()%>
<%= ds.getMemo()%>
<%= ds.getBoprocyn()%>
<%= ds.getBoprocdt()%>
<%= ds.getBoprocmemo()%>
<%= ds.getRetnclsfcur()%>
<%= ds.getRetnresncdcur()%>
<%= ds.getBns_bookcdcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= retnclsfcurRec.ciymgbcd%>
<%= retnclsfcurRec.cicdgb%>
<%= retnclsfcurRec.cicodeval%>
<%= retnclsfcurRec.cicdnm%>
<%= retnclsfcurRec.cicdynm%>
<%= retnresncdcurRec.ciymgbcd%>
<%= retnresncdcurRec.cicdgb%>
<%= retnresncdcurRec.cicodeval%>
<%= retnresncdcurRec.cicdnm%>
<%= retnresncdcurRec.cicdynm%>
<%= bns_bookcdcurRec.bns_bookcd%>
<%= bns_bookcdcurRec.bns_booknm%>
<%= bns_bookcdcurRec.cmpycd%>
<%= bns_bookcdcurRec.bgnvdtydt%>
<%= bns_bookcdcurRec.endvdtydt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Mar 19 14:36:42 KST 2004 */