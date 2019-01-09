/***************************************************************************************************
* ���ϸ� : .java
* ��� : 
* �ۼ����� : 
* �ۼ��� : ������
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ss.sls.ca.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.ca.dm.*;
import chosun.ciis.ss.sls.ca.rec.*;

/**
 * 
 */


public class SS_S_CA_HEADDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList extnlist = new ArrayList();
	public ArrayList curacctbank = new ArrayList();
	public ArrayList curcntrstatcd = new ArrayList();
	public String errcode;
	public String errmsg;
	public String stafclsfcd;
	public String stafno;
	public String prn;
	public String ernno;
	public String stafnm;
	public String zip;
	public String addr;
	public String dtlsaddr;
	public String tel_no1;
	public String tel_no2;
	public String tel_no3;
	public String ptph_no1;
	public String ptph_no2;
	public String ptph_no3;
	public String email;
	public String carrmatt;
	public String leaderyn;
	public String acctno;
	public String acctbank;
	public String acctdeps_pers;
	public String acctregdt;
	public String id_cardissudt;
	public String blngteamregmm;
	public String blngteamnm;
	public String jursarearegmm;
	public String jursareanm;
	public String remk;
	public String cntrstatcd;
	public String in_cmpydt;
	public String lvcmpydt;
	public String bocd;
	public String cmpynm;
	public String empseq;

	public SS_S_CA_HEADDataSet(){}
	public SS_S_CA_HEADDataSet(String errcode, String errmsg, String stafclsfcd, String stafno, String prn, String ernno, String stafnm, String zip, String addr, String dtlsaddr, String tel_no1, String tel_no2, String tel_no3, String ptph_no1, String ptph_no2, String ptph_no3, String email, String carrmatt, String leaderyn, String acctno, String acctbank, String acctdeps_pers, String acctregdt, String id_cardissudt, String blngteamregmm, String blngteamnm, String jursarearegmm, String jursareanm, String remk, String cntrstatcd, String in_cmpydt, String lvcmpydt, String bocd, String cmpynm, String empseq){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.stafclsfcd = stafclsfcd;
		this.stafno = stafno;
		this.prn = prn;
		this.ernno = ernno;
		this.stafnm = stafnm;
		this.zip = zip;
		this.addr = addr;
		this.dtlsaddr = dtlsaddr;
		this.tel_no1 = tel_no1;
		this.tel_no2 = tel_no2;
		this.tel_no3 = tel_no3;
		this.ptph_no1 = ptph_no1;
		this.ptph_no2 = ptph_no2;
		this.ptph_no3 = ptph_no3;
		this.email = email;
		this.carrmatt = carrmatt;
		this.leaderyn = leaderyn;
		this.acctno = acctno;
		this.acctbank = acctbank;
		this.acctdeps_pers = acctdeps_pers;
		this.acctregdt = acctregdt;
		this.id_cardissudt = id_cardissudt;
		this.blngteamregmm = blngteamregmm;
		this.blngteamnm = blngteamnm;
		this.jursarearegmm = jursarearegmm;
		this.jursareanm = jursareanm;
		this.remk = remk;
		this.cntrstatcd = cntrstatcd;
		this.in_cmpydt = in_cmpydt;
		this.lvcmpydt = lvcmpydt;
		this.bocd = bocd;
		this.cmpynm = cmpynm;
		this.empseq = empseq;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setStafclsfcd(String stafclsfcd){
		this.stafclsfcd = stafclsfcd;
	}

	public void setStafno(String stafno){
		this.stafno = stafno;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setErnno(String ernno){
		this.ernno = ernno;
	}

	public void setStafnm(String stafnm){
		this.stafnm = stafnm;
	}

	public void setZip(String zip){
		this.zip = zip;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setDtlsaddr(String dtlsaddr){
		this.dtlsaddr = dtlsaddr;
	}

	public void setTel_no1(String tel_no1){
		this.tel_no1 = tel_no1;
	}

	public void setTel_no2(String tel_no2){
		this.tel_no2 = tel_no2;
	}

	public void setTel_no3(String tel_no3){
		this.tel_no3 = tel_no3;
	}

	public void setPtph_no1(String ptph_no1){
		this.ptph_no1 = ptph_no1;
	}

	public void setPtph_no2(String ptph_no2){
		this.ptph_no2 = ptph_no2;
	}

	public void setPtph_no3(String ptph_no3){
		this.ptph_no3 = ptph_no3;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public void setCarrmatt(String carrmatt){
		this.carrmatt = carrmatt;
	}

	public void setLeaderyn(String leaderyn){
		this.leaderyn = leaderyn;
	}

	public void setAcctno(String acctno){
		this.acctno = acctno;
	}

	public void setAcctbank(String acctbank){
		this.acctbank = acctbank;
	}

	public void setAcctdeps_pers(String acctdeps_pers){
		this.acctdeps_pers = acctdeps_pers;
	}

	public void setAcctregdt(String acctregdt){
		this.acctregdt = acctregdt;
	}

	public void setId_cardissudt(String id_cardissudt){
		this.id_cardissudt = id_cardissudt;
	}

	public void setBlngteamregmm(String blngteamregmm){
		this.blngteamregmm = blngteamregmm;
	}

	public void setBlngteamnm(String blngteamnm){
		this.blngteamnm = blngteamnm;
	}

	public void setJursarearegmm(String jursarearegmm){
		this.jursarearegmm = jursarearegmm;
	}

	public void setJursareanm(String jursareanm){
		this.jursareanm = jursareanm;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setCntrstatcd(String cntrstatcd){
		this.cntrstatcd = cntrstatcd;
	}

	public void setIn_cmpydt(String in_cmpydt){
		this.in_cmpydt = in_cmpydt;
	}

	public void setLvcmpydt(String lvcmpydt){
		this.lvcmpydt = lvcmpydt;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setCmpynm(String cmpynm){
		this.cmpynm = cmpynm;
	}

	public void setEmpseq(String empseq){
		this.empseq = empseq;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getStafclsfcd(){
		return this.stafclsfcd;
	}

	public String getStafno(){
		return this.stafno;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getErnno(){
		return this.ernno;
	}

	public String getStafnm(){
		return this.stafnm;
	}

	public String getZip(){
		return this.zip;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getDtlsaddr(){
		return this.dtlsaddr;
	}

	public String getTel_no1(){
		return this.tel_no1;
	}

	public String getTel_no2(){
		return this.tel_no2;
	}

	public String getTel_no3(){
		return this.tel_no3;
	}

	public String getPtph_no1(){
		return this.ptph_no1;
	}

	public String getPtph_no2(){
		return this.ptph_no2;
	}

	public String getPtph_no3(){
		return this.ptph_no3;
	}

	public String getEmail(){
		return this.email;
	}

	public String getCarrmatt(){
		return this.carrmatt;
	}

	public String getLeaderyn(){
		return this.leaderyn;
	}

	public String getAcctno(){
		return this.acctno;
	}

	public String getAcctbank(){
		return this.acctbank;
	}

	public String getAcctdeps_pers(){
		return this.acctdeps_pers;
	}

	public String getAcctregdt(){
		return this.acctregdt;
	}

	public String getId_cardissudt(){
		return this.id_cardissudt;
	}

	public String getBlngteamregmm(){
		return this.blngteamregmm;
	}

	public String getBlngteamnm(){
		return this.blngteamnm;
	}

	public String getJursarearegmm(){
		return this.jursarearegmm;
	}

	public String getJursareanm(){
		return this.jursareanm;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getCntrstatcd(){
		return this.cntrstatcd;
	}

	public String getIn_cmpydt(){
		return this.in_cmpydt;
	}

	public String getLvcmpydt(){
		return this.lvcmpydt;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getCmpynm(){
		return this.cmpynm;
	}

	public String getEmpseq(){
		return this.empseq;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.stafclsfcd = Util.checkString(cstmt.getString(5));
		this.stafno = Util.checkString(cstmt.getString(6));
		this.prn = Util.checkString(cstmt.getString(7));
		this.ernno = Util.checkString(cstmt.getString(8));
		this.stafnm = Util.checkString(cstmt.getString(9));
		this.zip = Util.checkString(cstmt.getString(10));
		this.addr = Util.checkString(cstmt.getString(11));
		this.dtlsaddr = Util.checkString(cstmt.getString(12));
		this.tel_no1 = Util.checkString(cstmt.getString(13));
		this.tel_no2 = Util.checkString(cstmt.getString(14));
		this.tel_no3 = Util.checkString(cstmt.getString(15));
		this.ptph_no1 = Util.checkString(cstmt.getString(16));
		this.ptph_no2 = Util.checkString(cstmt.getString(17));
		this.ptph_no3 = Util.checkString(cstmt.getString(18));
		this.email = Util.checkString(cstmt.getString(19));
		this.carrmatt = Util.checkString(cstmt.getString(20));
		this.leaderyn = Util.checkString(cstmt.getString(21));
		this.acctno = Util.checkString(cstmt.getString(22));
		this.acctbank = Util.checkString(cstmt.getString(23));
		this.acctdeps_pers = Util.checkString(cstmt.getString(24));
		this.acctregdt = Util.checkString(cstmt.getString(25));
		this.id_cardissudt = Util.checkString(cstmt.getString(26));
		this.blngteamregmm = Util.checkString(cstmt.getString(27));
		this.blngteamnm = Util.checkString(cstmt.getString(28));
		this.jursarearegmm = Util.checkString(cstmt.getString(29));
		this.jursareanm = Util.checkString(cstmt.getString(30));
		this.remk = Util.checkString(cstmt.getString(31));
		this.cntrstatcd = Util.checkString(cstmt.getString(32));
		this.in_cmpydt = Util.checkString(cstmt.getString(33));
		this.lvcmpydt = Util.checkString(cstmt.getString(34));
		this.bocd = Util.checkString(cstmt.getString(35));
		this.cmpynm = Util.checkString(cstmt.getString(36));
		this.empseq = Util.checkString(cstmt.getString(37));
		ResultSet rset0 = (ResultSet) cstmt.getObject(38);
		while(rset0.next()){
			SS_S_CA_HEADCURCNTRSTATCDRecord rec = new SS_S_CA_HEADCURCNTRSTATCDRecord();
			rec.cicodeval = Util.checkString(rset0.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset0.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset0.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset0.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset0.getString("cicdynm"));
			this.curcntrstatcd.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(39);
		while(rset1.next()){
			SS_S_CA_HEADCURACCTBANKRecord rec = new SS_S_CA_HEADCURACCTBANKRecord();
			rec.cicodeval = Util.checkString(rset1.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset1.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset1.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset1.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset1.getString("cicdynm"));
			this.curacctbank.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(40);
		while(rset2.next()){
			SS_S_CA_HEADEXTNLISTRecord rec = new SS_S_CA_HEADEXTNLISTRecord();
			rec.rdr_no = Util.checkString(rset2.getString("rdr_no"));
			rec.rdrnm = Util.checkString(rset2.getString("rdrnm"));
			rec.rdr_extndt = Util.checkString(rset2.getString("rdr_extndt"));
			rec.qty = Util.checkString(rset2.getString("qty"));
			rec.bonm = Util.checkString(rset2.getString("bonm"));
			rec.headcnfmdt = Util.checkString(rset2.getString("headcnfmdt"));
			rec.cnfmstat = Util.checkString(rset2.getString("cnfmstat"));
			rec.valmm = Util.checkString(rset2.getString("valmm"));
			rec.suspdt = Util.checkString(rset2.getString("suspdt"));
			rec.suspresn = Util.checkString(rset2.getString("suspresn"));
			this.extnlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SS_S_CA_HEADDataSet ds = (SS_S_CA_HEADDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curcntrstatcd.size(); i++){
		SS_S_CA_HEADCURCNTRSTATCDRecord curcntrstatcdRec = (SS_S_CA_HEADCURCNTRSTATCDRecord)ds.curcntrstatcd.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.curacctbank.size(); i++){
		SS_S_CA_HEADCURACCTBANKRecord curacctbankRec = (SS_S_CA_HEADCURACCTBANKRecord)ds.curacctbank.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.extnlist.size(); i++){
		SS_S_CA_HEADEXTNLISTRecord extnlistRec = (SS_S_CA_HEADEXTNLISTRecord)ds.extnlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getStafclsfcd()%>
<%= ds.getStafno()%>
<%= ds.getPrn()%>
<%= ds.getErnno()%>
<%= ds.getStafnm()%>
<%= ds.getZip()%>
<%= ds.getAddr()%>
<%= ds.getDtlsaddr()%>
<%= ds.getTel_no1()%>
<%= ds.getTel_no2()%>
<%= ds.getTel_no3()%>
<%= ds.getPtph_no1()%>
<%= ds.getPtph_no2()%>
<%= ds.getPtph_no3()%>
<%= ds.getEmail()%>
<%= ds.getCarrmatt()%>
<%= ds.getLeaderyn()%>
<%= ds.getAcctno()%>
<%= ds.getAcctbank()%>
<%= ds.getAcctdeps_pers()%>
<%= ds.getAcctregdt()%>
<%= ds.getId_cardissudt()%>
<%= ds.getBlngteamregmm()%>
<%= ds.getBlngteamnm()%>
<%= ds.getJursarearegmm()%>
<%= ds.getJursareanm()%>
<%= ds.getRemk()%>
<%= ds.getCntrstatcd()%>
<%= ds.getIn_cmpydt()%>
<%= ds.getLvcmpydt()%>
<%= ds.getBocd()%>
<%= ds.getCmpynm()%>
<%= ds.getEmpseq()%>
<%= ds.getCurcntrstatcd()%>
<%= ds.getCuracctbank()%>
<%= ds.getExtnlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curcntrstatcdRec.cicodeval%>
<%= curcntrstatcdRec.cicdnm%>
<%= curcntrstatcdRec.ciymgbcd%>
<%= curcntrstatcdRec.cicdgb%>
<%= curcntrstatcdRec.cicdynm%>
<%= curacctbankRec.cicodeval%>
<%= curacctbankRec.cicdnm%>
<%= curacctbankRec.ciymgbcd%>
<%= curacctbankRec.cicdgb%>
<%= curacctbankRec.cicdynm%>
<%= extnlistRec.rdr_no%>
<%= extnlistRec.rdrnm%>
<%= extnlistRec.rdr_extndt%>
<%= extnlistRec.qty%>
<%= extnlistRec.bonm%>
<%= extnlistRec.headcnfmdt%>
<%= extnlistRec.cnfmstat%>
<%= extnlistRec.valmm%>
<%= extnlistRec.suspdt%>
<%= extnlistRec.suspresn%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Sep 04 15:26:04 KST 2015 */