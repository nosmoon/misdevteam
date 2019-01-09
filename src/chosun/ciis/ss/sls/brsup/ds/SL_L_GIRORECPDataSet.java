/***************************************************************************************************
 * 파일명   : SL_L_GIRORECPDataSet.java
 * 기능     : 지국지원-빌링-지로EDI
 * 작성일자 : 2007/02/22
 * 작성자   : 이혁
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.brsup.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
**  SP_SL_L_GIRORECP
**/

public class SL_L_GIRORECPDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList rsltcur = new ArrayList();
	public String errcode;
	public String errmsg;
	public long normcnt;
	public long errcnt;
	public long rjtcnt;
	public long totalcnt;
	public long finccnt;
	public long rcpmcnt;
	public long normamt;
	public long erramt;
	public long rjtamt;
	public long totalamt;
	public long fincamt;
	public long rcpmamt;
	public long atmcnt;
	public long atmamt;
	public long internetcnt;
	public long internetamt;
	public long girocoms;
	public long cntforpaging;
	public long cvscnt;
	public long cvsamt;
	public long cvscoms;

	public SL_L_GIRORECPDataSet(){}
	public SL_L_GIRORECPDataSet(String errcode, String errmsg, long normcnt, long errcnt, long rjtcnt, long totalcnt, long finccnt, long rcpmcnt, long normamt, long erramt, long rjtamt, long totalamt, long fincamt, long rcpmamt, long atmcnt, long atmamt, long internetcnt, long internetamt, long girocoms, long cntforpaging, long cvscnt, long cvsamt, long cvscoms){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.normcnt = normcnt;
		this.errcnt = errcnt;
		this.rjtcnt = rjtcnt;
		this.totalcnt = totalcnt;
		this.finccnt = finccnt;
		this.rcpmcnt = rcpmcnt;
		this.normamt = normamt;
		this.erramt = erramt;
		this.rjtamt = rjtamt;
		this.totalamt = totalamt;
		this.fincamt = fincamt;
		this.rcpmamt = rcpmamt;
		this.atmcnt = atmcnt;
		this.atmamt = atmamt;
		this.internetcnt = internetcnt;
		this.internetamt = internetamt;
		this.girocoms = girocoms;
		this.cntforpaging = cntforpaging;
		this.cvscnt = cvscnt;
		this.cvsamt = cvsamt;
		this.cvscoms = cvscoms;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setNormcnt(long normcnt){
		this.normcnt = normcnt;
	}

	public void setErrcnt(long errcnt){
		this.errcnt = errcnt;
	}

	public void setRjtcnt(long rjtcnt){
		this.rjtcnt = rjtcnt;
	}

	public void setTotalcnt(long totalcnt){
		this.totalcnt = totalcnt;
	}

	public void setFinccnt(long finccnt){
		this.finccnt = finccnt;
	}

	public void setRcpmcnt(long rcpmcnt){
		this.rcpmcnt = rcpmcnt;
	}

	public void setNormamt(long normamt){
		this.normamt = normamt;
	}

	public void setErramt(long erramt){
		this.erramt = erramt;
	}

	public void setRjtamt(long rjtamt){
		this.rjtamt = rjtamt;
	}

	public void setTotalamt(long totalamt){
		this.totalamt = totalamt;
	}

	public void setFincamt(long fincamt){
		this.fincamt = fincamt;
	}

	public void setRcpmamt(long rcpmamt){
		this.rcpmamt = rcpmamt;
	}

	public void setAtmcnt(long atmcnt){
		this.atmcnt = atmcnt;
	}

	public void setAtmamt(long atmamt){
		this.atmamt = atmamt;
	}

	public void setInternetcnt(long internetcnt){
		this.internetcnt = internetcnt;
	}

	public void setInternetamt(long internetamt){
		this.internetamt = internetamt;
	}

	public void setGirocoms(long girocoms){
		this.girocoms = girocoms;
	}

	public void setCntforpaging(long cntforpaging){
		this.cntforpaging = cntforpaging;
	}

	public void setCvscnt(long cvscnt){
		this.cvscnt = cvscnt;
	}

	public void setCvsamt(long cvsamt){
		this.cvsamt = cvsamt;
	}

	public void setCvscoms(long cvscoms){
		this.cvscoms = cvscoms;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public long getNormcnt(){
		return this.normcnt;
	}

	public long getErrcnt(){
		return this.errcnt;
	}

	public long getRjtcnt(){
		return this.rjtcnt;
	}

	public long getTotalcnt(){
		return this.totalcnt;
	}

	public long getFinccnt(){
		return this.finccnt;
	}

	public long getRcpmcnt(){
		return this.rcpmcnt;
	}

	public long getNormamt(){
		return this.normamt;
	}

	public long getErramt(){
		return this.erramt;
	}

	public long getRjtamt(){
		return this.rjtamt;
	}

	public long getTotalamt(){
		return this.totalamt;
	}

	public long getFincamt(){
		return this.fincamt;
	}

	public long getRcpmamt(){
		return this.rcpmamt;
	}

	public long getAtmcnt(){
		return this.atmcnt;
	}

	public long getAtmamt(){
		return this.atmamt;
	}

	public long getInternetcnt(){
		return this.internetcnt;
	}

	public long getInternetamt(){
		return this.internetamt;
	}

	public long getGirocoms(){
		return this.girocoms;
	}

	public long getCntforpaging(){
		return this.cntforpaging;
	}

	public long getCvscnt(){
		return this.cvscnt;
	}

	public long getCvsamt(){
		return this.cvsamt;
	}

	public long getCvscoms(){
		return this.cvscoms;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.normcnt = cstmt.getLong(11);
		this.errcnt = cstmt.getLong(12);
		this.rjtcnt = cstmt.getLong(13);
		this.totalcnt = cstmt.getLong(14);
		this.finccnt = cstmt.getLong(15);
		this.rcpmcnt = cstmt.getLong(16);
		this.normamt = cstmt.getLong(17);
		this.erramt = cstmt.getLong(18);
		this.rjtamt = cstmt.getLong(19);
		this.totalamt = cstmt.getLong(20);
		this.fincamt = cstmt.getLong(21);
		this.rcpmamt = cstmt.getLong(22);
		this.atmcnt = cstmt.getLong(23);
		this.atmamt = cstmt.getLong(24);
		this.internetcnt = cstmt.getLong(25);
		this.internetamt = cstmt.getLong(26);
		this.girocoms = cstmt.getLong(27);
		this.cntforpaging = cstmt.getLong(28);
		this.cvscnt = cstmt.getLong(29);
		this.cvsamt = cstmt.getLong(30);
		this.cvscoms = cstmt.getLong(31);
		ResultSet rset0 = (ResultSet) cstmt.getObject(32);
		while(rset0.next()){
			SL_L_GIRORECPRSLTCURRecord rec = new SL_L_GIRORECPRSLTCURRecord();
			rec.acqdt = Util.checkString(rset0.getString("acqdt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.recpdt = Util.checkString(rset0.getString("recpdt"));
			rec.shftdt = Util.checkString(rset0.getString("shftdt"));
			rec.amt = rset0.getInt("amt");
			rec.custbrwsno = Util.checkString(rset0.getString("custbrwsno"));
			rec.girocoms = rset0.getInt("girocoms");
			rec.tbstprocclsf = Util.checkString(rset0.getString("tbstprocclsf"));
			rec.rcpmrflclsf = Util.checkString(rset0.getString("rcpmrflclsf"));
			rec.rcpmrfldescri = Util.checkString(rset0.getString("rcpmrfldescri"));
			rec.rcpmrflyn = Util.checkString(rset0.getString("rcpmrflyn"));
			rec.rcpmrfldt = Util.checkString(rset0.getString("rcpmrfldt"));
			rec.recpclsf = Util.checkString(rset0.getString("recpclsf"));
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.medicd = Util.checkString(rset0.getString("medicd"));
			rec.medinm = Util.checkString(rset0.getString("medinm"));
			rec.mediynm = Util.checkString(rset0.getString("mediynm"));
			rec.subsmappli = Util.checkString(rset0.getString("subsmappli"));
			rec.clamamt = rset0.getInt("clamamt");
			rec.clamt = rset0.getInt("clamt");
			rec.rdrnm = Util.checkString(rset0.getString("rdrnm"));
			rec.addrnm = Util.checkString(rset0.getString("addrnm"));
			rec.dlvdtlsaddr = Util.checkString(rset0.getString("dlvdtlsaddr"));
			rec.dlvdong = Util.checkString(rset0.getString("dlvdong"));
			rec.dlvser_no = Util.checkString(rset0.getString("dlvser_no"));
			rec.dlvbnji = Util.checkString(rset0.getString("dlvbnji"));
			rec.dlvteamcd = Util.checkString(rset0.getString("dlvteamcd"));
			rec.dlvdstccd = Util.checkString(rset0.getString("dlvdstccd"));
			rec.dlvno = Util.checkString(rset0.getString("dlvno"));
			this.rsltcur.add(rec);
		}
	}

	public String rsltcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rsltcur.size();
		for(int i=0; i<size; i++){
			SL_L_GIRORECPRSLTCURRecord rec = (SL_L_GIRORECPRSLTCURRecord)rsltcur.get(i);
			
			
			String code = rec.acqdt;
			String name = rec.seq;
			
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

	public String rsltcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rsltcur.size();
		for(int i=0; i<size; i++){
			SL_L_GIRORECPRSLTCURRecord rec = (SL_L_GIRORECPRSLTCURRecord)rsltcur.get(i);
			
			
			String code = rec.acqdt;
			String name = rec.seq;
			
			sb.append("<input name=\"");
			sb.append("acqdt");
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

	public String rsltcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rsltcur.size();
		for(int i=0; i<size; i++){
			SL_L_GIRORECPRSLTCURRecord rec = (SL_L_GIRORECPRSLTCURRecord)rsltcur.get(i);
			
			
			String code = rec.acqdt;
			String name = rec.seq;
			
			sb.append("<input name=\"");
			sb.append("acqdt");
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
	SL_L_GIRORECPDataSet ds = (SL_L_GIRORECPDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.rsltcur.size(); i++){
		SL_L_GIRORECPRSLTCURRecord rsltcurRec = (SL_L_GIRORECPRSLTCURRecord)ds.rsltcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getNormcnt()%>
<%= ds.getErrcnt()%>
<%= ds.getRjtcnt()%>
<%= ds.getTotalcnt()%>
<%= ds.getFinccnt()%>
<%= ds.getRcpmcnt()%>
<%= ds.getNormamt()%>
<%= ds.getErramt()%>
<%= ds.getRjtamt()%>
<%= ds.getTotalamt()%>
<%= ds.getFincamt()%>
<%= ds.getRcpmamt()%>
<%= ds.getAtmcnt()%>
<%= ds.getAtmamt()%>
<%= ds.getInternetcnt()%>
<%= ds.getInternetamt()%>
<%= ds.getGirocoms()%>
<%= ds.getCntforpaging()%>
<%= ds.getCvscnt()%>
<%= ds.getCvsamt()%>
<%= ds.getCvscoms()%>
<%= ds.getRsltcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= rsltcurRec.acqdt%>
<%= rsltcurRec.seq%>
<%= rsltcurRec.recpdt%>
<%= rsltcurRec.shftdt%>
<%= rsltcurRec.amt%>
<%= rsltcurRec.custbrwsno%>
<%= rsltcurRec.girocoms%>
<%= rsltcurRec.tbstprocclsf%>
<%= rsltcurRec.rcpmrflclsf%>
<%= rsltcurRec.rcpmrfldescri%>
<%= rsltcurRec.rcpmrflyn%>
<%= rsltcurRec.rcpmrfldt%>
<%= rsltcurRec.recpclsf%>
<%= rsltcurRec.rdr_no%>
<%= rsltcurRec.medicd%>
<%= rsltcurRec.medinm%>
<%= rsltcurRec.mediynm%>
<%= rsltcurRec.subsmappli%>
<%= rsltcurRec.clamamt%>
<%= rsltcurRec.clamt%>
<%= rsltcurRec.rdrnm%>
<%= rsltcurRec.addrnm%>
<%= rsltcurRec.dlvdtlsaddr%>
<%= rsltcurRec.dlvdong%>
<%= rsltcurRec.dlvser_no%>
<%= rsltcurRec.dlvbnji%>
<%= rsltcurRec.dlvteamcd%>
<%= rsltcurRec.dlvdstccd%>
<%= rsltcurRec.dlvno%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Feb 22 16:48:15 KST 2007 */