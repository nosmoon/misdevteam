/***************************************************************************************************
* 파일명 : SS_S_MO_SVY_RDRDataSet.java
* 기능 :
* 작성일자 : 2015.12.04
* 작성자 : 장선희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 *
 */


public class SS_S_MO_SVY_RDRDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList resplist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String bonm;
	public String rdrnm;
	public String rdr_no;
	public String seq;
	public String qty;
	public String addrs;
	public String rdrtel_no;
	public String rdrptph_no;
	public String rdr_extntype1;
	public String rdr_extntype2;
	public String rdr_extndt;
	public String extnnm;
	public String suspdt;
	public String suspresn;
	public String resitype;
	public String aplcpath;
	public String reconfyn;
	public String valmm;
	public String resiststat;
	public String connstat;
	public String readstat;
	public String prereadstat;
	public String campid;
	public String giftgvfg;
	public String ddremk;
	public String bo_sendyn;

	public SS_S_MO_SVY_RDRDataSet(){}
	public SS_S_MO_SVY_RDRDataSet(String errcode, String errmsg, String bonm, String rdrnm, String rdr_no, String seq, String qty, String addrs, String rdrtel_no, String rdrptph_no, String rdr_extntype1, String rdr_extntype2, String rdr_extndt, String extnnm, String suspdt, String suspresn, String resitype, String aplcpath, String reconfyn, String valmm, String resiststat, String connstat, String readstat, String prereadstat, String campid, String giftgvfg, String ddremk, String bo_sendyn){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.bonm = bonm;
		this.rdrnm = rdrnm;
		this.rdr_no = rdr_no;
		this.seq = seq;
		this.qty = qty;
		this.addrs = addrs;
		this.rdrtel_no = rdrtel_no;
		this.rdrptph_no = rdrptph_no;
		this.rdr_extntype1 = rdr_extntype1;
		this.rdr_extntype2 = rdr_extntype2;
		this.rdr_extndt = rdr_extndt;
		this.extnnm = extnnm;
		this.suspdt = suspdt;
		this.suspresn = suspresn;
		this.resitype = resitype;
		this.aplcpath = aplcpath;
		this.reconfyn = reconfyn;
		this.valmm = valmm;
		this.resiststat = resiststat;
		this.connstat = connstat;
		this.readstat = readstat;
		this.prereadstat = prereadstat;
		this.campid = campid;
		this.giftgvfg = giftgvfg;
		this.ddremk = ddremk;
		this.bo_sendyn = bo_sendyn;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setQty(String qty){
		this.qty = qty;
	}

	public void setAddrs(String addrs){
		this.addrs = addrs;
	}

	public void setRdrtel_no(String rdrtel_no){
		this.rdrtel_no = rdrtel_no;
	}

	public void setRdrptph_no(String rdrptph_no){
		this.rdrptph_no = rdrptph_no;
	}

	public void setRdr_extntype1(String rdr_extntype1){
		this.rdr_extntype1 = rdr_extntype1;
	}

	public void setRdr_extntype2(String rdr_extntype2){
		this.rdr_extntype2 = rdr_extntype2;
	}

	public void setRdr_extndt(String rdr_extndt){
		this.rdr_extndt = rdr_extndt;
	}

	public void setExtnnm(String extnnm){
		this.extnnm = extnnm;
	}

	public void setSuspdt(String suspdt){
		this.suspdt = suspdt;
	}

	public void setSuspresn(String suspresn){
		this.suspresn = suspresn;
	}

	public void setResitype(String resitype){
		this.resitype = resitype;
	}

	public void setAplcpath(String aplcpath){
		this.aplcpath = aplcpath;
	}

	public void setReconfyn(String reconfyn){
		this.reconfyn = reconfyn;
	}

	public void setValmm(String valmm){
		this.valmm = valmm;
	}

	public void setResiststat(String resiststat){
		this.resiststat = resiststat;
	}

	public void setConnstat(String connstat){
		this.connstat = connstat;
	}

	public void setReadstat(String readstat){
		this.readstat = readstat;
	}

	public void setPrereadstat(String prereadstat){
		this.prereadstat = prereadstat;
	}

	public void setCampid(String campid){
		this.campid = campid;
	}

	public void setGiftgvfg(String giftgvfg){
		this.giftgvfg = giftgvfg;
	}

	public void setDdremk(String ddremk){
		this.ddremk = ddremk;
	}

	public void setBo_sendyn(String bo_sendyn){
		this.bo_sendyn = bo_sendyn;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getQty(){
		return this.qty;
	}

	public String getAddrs(){
		return this.addrs;
	}

	public String getRdrtel_no(){
		return this.rdrtel_no;
	}

	public String getRdrptph_no(){
		return this.rdrptph_no;
	}

	public String getRdr_extntype1(){
		return this.rdr_extntype1;
	}

	public String getRdr_extntype2(){
		return this.rdr_extntype2;
	}

	public String getRdr_extndt(){
		return this.rdr_extndt;
	}

	public String getExtnnm(){
		return this.extnnm;
	}

	public String getSuspdt(){
		return this.suspdt;
	}

	public String getSuspresn(){
		return this.suspresn;
	}

	public String getResitype(){
		return this.resitype;
	}

	public String getAplcpath(){
		return this.aplcpath;
	}

	public String getReconfyn(){
		return this.reconfyn;
	}

	public String getValmm(){
		return this.valmm;
	}

	public String getResiststat(){
		return this.resiststat;
	}

	public String getConnstat(){
		return this.connstat;
	}

	public String getReadstat(){
		return this.readstat;
	}

	public String getPrereadstat(){
		return this.prereadstat;
	}

	public String getCampid(){
		return this.campid;
	}

	public String getGiftgvfg(){
		return this.giftgvfg;
	}

	public String getDdremk(){
		return this.ddremk;
	}

	public String getBo_sendyn(){
		return this.bo_sendyn;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.bonm = Util.checkString(cstmt.getString(11));
		this.rdrnm = Util.checkString(cstmt.getString(12));
		this.rdr_no = Util.checkString(cstmt.getString(13));
		this.seq = Util.checkString(cstmt.getString(14));
		this.qty = Util.checkString(cstmt.getString(15));
		this.addrs = Util.checkString(cstmt.getString(16));
		this.rdrtel_no = Util.checkString(cstmt.getString(17));
		this.rdrptph_no = Util.checkString(cstmt.getString(18));
		this.rdr_extntype1 = Util.checkString(cstmt.getString(19));
		this.rdr_extntype2 = Util.checkString(cstmt.getString(20));
		this.rdr_extndt = Util.checkString(cstmt.getString(21));
		this.extnnm = Util.checkString(cstmt.getString(22));
		this.suspdt = Util.checkString(cstmt.getString(23));
		this.suspresn = Util.checkString(cstmt.getString(24));
		this.resitype = Util.checkString(cstmt.getString(25));
		this.aplcpath = Util.checkString(cstmt.getString(26));
		this.reconfyn = Util.checkString(cstmt.getString(27));
		this.valmm = Util.checkString(cstmt.getString(28));
		this.resiststat = Util.checkString(cstmt.getString(29));
		this.connstat = Util.checkString(cstmt.getString(30));
		this.readstat = Util.checkString(cstmt.getString(31));
		this.prereadstat = Util.checkString(cstmt.getString(32));
		this.campid = Util.checkString(cstmt.getString(33));
		this.giftgvfg = Util.checkString(cstmt.getString(34));
		this.ddremk = Util.checkString(cstmt.getString(35));
		this.bo_sendyn = Util.checkString(cstmt.getString(36));
		ResultSet rset0 = (ResultSet) cstmt.getObject(37);
		while(rset0.next()){
			SS_S_MO_SVY_RDRRESPLISTRecord rec = new SS_S_MO_SVY_RDRRESPLISTRecord();
			rec.qstnum = Util.checkString(rset0.getString("qstnum"));
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.basicdt = Util.checkString(rset0.getString("basicdt"));
			rec.cont = Util.checkString(rset0.getString("cont"));
			rec.response = Util.checkString(rset0.getString("response"));
			rec.priority = Util.checkString(rset0.getString("priority"));
			rec.qstid = Util.checkString(rset0.getString("qstid"));
			rec.resp_bsstat = Util.checkString(rset0.getString("resp_bsstat"));
			this.resplist.add(rec);
		}
	}

	public String resplistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = resplist.size();
		for(int i=0; i<size; i++){
			SS_S_MO_SVY_RDRRESPLISTRecord rec = (SS_S_MO_SVY_RDRRESPLISTRecord)resplist.get(i);


			String code = rec.qstnum;
			String name = rec.rdr_no;

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

	public String resplistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = resplist.size();
		for(int i=0; i<size; i++){
			SS_S_MO_SVY_RDRRESPLISTRecord rec = (SS_S_MO_SVY_RDRRESPLISTRecord)resplist.get(i);


			String code = rec.qstnum;
			String name = rec.rdr_no;

			sb.append("<input name=\"");
			sb.append("qstnum");
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

	public String resplistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = resplist.size();
		for(int i=0; i<size; i++){
			SS_S_MO_SVY_RDRRESPLISTRecord rec = (SS_S_MO_SVY_RDRRESPLISTRecord)resplist.get(i);


			String code = rec.qstnum;
			String name = rec.rdr_no;

			sb.append("<input name=\"");
			sb.append("qstnum");
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
	SS_S_MO_SVY_RDRDataSet ds = (SS_S_MO_SVY_RDRDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.resplist.size(); i++){
		SS_S_MO_SVY_RDRRESPLISTRecord resplistRec = (SS_S_MO_SVY_RDRRESPLISTRecord)ds.resplist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getBonm()%>
<%= ds.getRdrnm()%>
<%= ds.getRdr_no()%>
<%= ds.getSeq()%>
<%= ds.getQty()%>
<%= ds.getAddrs()%>
<%= ds.getRdrtel_no()%>
<%= ds.getRdrptph_no()%>
<%= ds.getRdr_extntype1()%>
<%= ds.getRdr_extntype2()%>
<%= ds.getRdr_extndt()%>
<%= ds.getExtnnm()%>
<%= ds.getSuspdt()%>
<%= ds.getSuspresn()%>
<%= ds.getResitype()%>
<%= ds.getAplcpath()%>
<%= ds.getReconfyn()%>
<%= ds.getValmm()%>
<%= ds.getResiststat()%>
<%= ds.getConnstat()%>
<%= ds.getReadstat()%>
<%= ds.getPrereadstat()%>
<%= ds.getCampid()%>
<%= ds.getGiftgvfg()%>
<%= ds.getDdremk()%>
<%= ds.getBo_sendyn()%>
<%= ds.getResplist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= resplistRec.qstnum%>
<%= resplistRec.rdr_no%>
<%= resplistRec.basicdt%>
<%= resplistRec.cont%>
<%= resplistRec.response%>
<%= resplistRec.priority%>
<%= resplistRec.qstid%>
<%= resplistRec.resp_bsstat%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Dec 18 17:40:54 KST 2015 */