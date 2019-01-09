/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ad.pub.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.pub.ds.*;
import chosun.ciis.ad.pub.rec.*;

/**
 * 
 */


public class AD_PUB_3140_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String clos_dt;
	public String chcode;
	public String cuscode;
	public String blndcode;
	public String orgcode;
	public String frdate;
	public String todate;
	public String rcvgrp;
	public String chgcode;
	public String dtlseq;
	public long dtlrownum;
	public String acct_trn_cnfm;
	public String medi_cd;
	public String pubc_occr_dt;
	public String pubc_occr_seq;
	public String pubc_slip_no;
	public String medialeb_yn;
	public String xchngadvt_yn;
	public String event_cd;
	public String rslt_dept;
	public long   trst_rate;
	public long   trst_fee;
	public long   div_trst_fee_ex;
	public long   div_trst_vat;
	public long   div_trst_fee;
	public String incmg_pers_ip;
	public String incmg_pers;

	public AD_PUB_3140_ADM(){}
	public AD_PUB_3140_ADM(String cmpy_cd, String clos_dt, String chcode, String cuscode, String blndcode, String orgcode, String frdate, String todate, String rcvgrp, String chgcode, String dtlseq, long dtlrownum, String acct_trn_cnfm, String medi_cd, String pubc_occr_dt, String pubc_occr_seq, String pubc_slip_no, String medialeb_yn, String xchngadvt_yn, String event_cd, String rslt_dept, long trst_rate, long trst_fee, long div_trst_fee_ex, long div_trst_vat, long div_trst_fee, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.clos_dt = clos_dt;
		this.chcode = chcode;
		this.cuscode = cuscode;
		this.blndcode = blndcode;
		this.orgcode = orgcode;
		this.frdate = frdate;
		this.todate = todate;
		this.rcvgrp = rcvgrp;
		this.chgcode = chgcode;
		this.dtlseq = dtlseq;
		this.dtlrownum = dtlrownum;
		this.acct_trn_cnfm = acct_trn_cnfm;
		this.medi_cd = medi_cd;
		this.pubc_occr_dt = pubc_occr_dt;
		this.pubc_occr_seq = pubc_occr_seq;
		this.pubc_slip_no = pubc_slip_no;
		this.medialeb_yn = medialeb_yn;
		this.xchngadvt_yn = xchngadvt_yn;
		this.event_cd = event_cd;
		this.rslt_dept = rslt_dept;
		this.trst_rate = trst_rate;
		this.trst_fee = trst_fee;
		this.div_trst_fee_ex = div_trst_fee_ex;
		this.div_trst_vat = div_trst_vat;
		this.div_trst_fee = div_trst_fee;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setClos_dt(String clos_dt){
		this.clos_dt = clos_dt;
	}

	public void setChcode(String chcode){
		this.chcode = chcode;
	}

	public void setCuscode(String cuscode){
		this.cuscode = cuscode;
	}

	public void setBlndcode(String blndcode){
		this.blndcode = blndcode;
	}

	public void setOrgcode(String orgcode){
		this.orgcode = orgcode;
	}

	public void setFrdate(String frdate){
		this.frdate = frdate;
	}

	public void setTodate(String todate){
		this.todate = todate;
	}

	public void setRcvgrp(String rcvgrp){
		this.rcvgrp = rcvgrp;
	}

	public void setChgcode(String chgcode){
		this.chgcode = chgcode;
	}

	public void setDtlseq(String dtlseq){
		this.dtlseq = dtlseq;
	}

	public void setDtlrownum(long dtlrownum){
		this.dtlrownum = dtlrownum;
	}

	public void setAcct_trn_cnfm(String acct_trn_cnfm){
		this.acct_trn_cnfm = acct_trn_cnfm;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setPubc_occr_dt(String pubc_occr_dt){
		this.pubc_occr_dt = pubc_occr_dt;
	}

	public void setPubc_occr_seq(String pubc_occr_seq){
		this.pubc_occr_seq = pubc_occr_seq;
	}

	public void setPubc_slip_no(String pubc_slip_no){
		this.pubc_slip_no = pubc_slip_no;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}
	
	public void setMedialeb_yn(String medialeb_yn){
		this.medialeb_yn = medialeb_yn;
	}
	public void setXchngadvt_yn(String xchngadvt_yn){
		this.xchngadvt_yn = xchngadvt_yn;
	}
	public void setEvent_cd(String event_cd){
		this.event_cd = event_cd;
	}
	public void setRslt_dept(String rslt_dept){
		this.rslt_dept = rslt_dept;
	}	
	public void setTrst_rate(long trst_rate){
		this.trst_rate = trst_rate;
	}
	
	public void setTrst_fee(long trst_fee){
		this.trst_fee = trst_fee;
	}
	
	public void setDiv_trst_fee_ex(long div_trst_fee_ex){
		this.div_trst_fee_ex = div_trst_fee_ex;
	}
	
	public void setDiv_trst_vat(long div_trst_vat){
		this.div_trst_vat = div_trst_vat;
	}
	
	public void setDiv_trst_fee(long div_trst_fee){
		this.div_trst_fee = div_trst_fee;
	}
	
	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getClos_dt(){
		return this.clos_dt;
	}

	public String getChcode(){
		return this.chcode;
	}

	public String getCuscode(){
		return this.cuscode;
	}

	public String getBlndcode(){
		return this.blndcode;
	}

	public String getOrgcode(){
		return this.orgcode;
	}

	public String getFrdate(){
		return this.frdate;
	}

	public String getTodate(){
		return this.todate;
	}

	public String getRcvgrp(){
		return this.rcvgrp;
	}

	public String getChgcode(){
		return this.chgcode;
	}

	public String getDtlseq(){
		return this.dtlseq;
	}

	public long getDtlrownum(){
		return this.dtlrownum;
	}

	public String getAcct_trn_cnfm(){
		return this.acct_trn_cnfm;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getPubc_occr_dt(){
		return this.pubc_occr_dt;
	}

	public String getPubc_occr_seq(){
		return this.pubc_occr_seq;
	}

	public String getPubc_slip_no(){
		return this.pubc_slip_no;
	}

	public String getMedialeb_yn(){
		return this.medialeb_yn;
	}

	public String getXchngadvt_yn(){
		return this.xchngadvt_yn;
	}
	public String getEvent_cd(){
		return this.event_cd;
	}	
	public String getRslt_dept(){
		return this.rslt_dept;
	}		
	public long getTrst_rate(){
		return this.trst_rate;
	}
	
	public long getTrst_fee(){
		return this.trst_fee;
	}
	
	public long getDiv_trst_fee_ex(){
		return this.div_trst_fee_ex;
	}
	
	public long getDiv_trst_vat(){
		return this.div_trst_vat;
	}
	
	public long getDiv_trst_fee(){
		return this.div_trst_fee;
	}
	
	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call SP_AD_PUB_3140_A(? ,?, ? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_PUB_3140_ADM dm = (AD_PUB_3140_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.clos_dt);
		cstmt.setString(5, dm.chcode);
		cstmt.setString(6, dm.cuscode);
		cstmt.setString(7, dm.blndcode);
		cstmt.setString(8, dm.orgcode);
		cstmt.setString(9, dm.frdate);
		cstmt.setString(10, dm.todate);
		cstmt.setString(11, dm.rcvgrp);
		cstmt.setString(12, dm.chgcode);
		cstmt.setString(13, dm.dtlseq);
		cstmt.setLong(14, dm.dtlrownum);
		cstmt.setString(15, dm.acct_trn_cnfm);
		cstmt.setString(16, dm.medi_cd);
		cstmt.setString(17, dm.pubc_occr_dt);
		cstmt.setString(18, dm.pubc_occr_seq);
		cstmt.setString(19, dm.pubc_slip_no);
		cstmt.setString(20, dm.medialeb_yn);
		cstmt.setString(21, dm.xchngadvt_yn);
		cstmt.setString(22, dm.event_cd);
		cstmt.setLong(23, dm.trst_rate);
		cstmt.setLong(24, dm.trst_fee);
		cstmt.setLong(25, dm.div_trst_fee_ex);
		cstmt.setLong(26, dm.div_trst_vat);
		cstmt.setLong(27, dm.div_trst_fee);
		cstmt.setString(28, dm.rslt_dept);
		cstmt.setString(29, dm.incmg_pers_ip);
		cstmt.setString(30, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.pub.ds.AD_PUB_3140_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("clos_dt = [" + getClos_dt() + "]");
		System.out.println("chcode = [" + getChcode() + "]");
		System.out.println("cuscode = [" + getCuscode() + "]");
		System.out.println("blndcode = [" + getBlndcode() + "]");
		System.out.println("orgcode = [" + getOrgcode() + "]");
		System.out.println("frdate = [" + getFrdate() + "]");
		System.out.println("todate = [" + getTodate() + "]");
		System.out.println("rcvgrp = [" + getRcvgrp() + "]");
		System.out.println("chgcode = [" + getChgcode() + "]");
		System.out.println("dtlseq = [" + getDtlseq() + "]");
		System.out.println("dtlrownum = [" + getDtlrownum() + "]");
		System.out.println("acct_trn_cnfm = [" + getAcct_trn_cnfm() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("pubc_occr_dt = [" + getPubc_occr_dt() + "]");
		System.out.println("pubc_occr_seq = [" + getPubc_occr_seq() + "]");
		System.out.println("pubc_slip_no = [" + getPubc_slip_no() + "]");
		System.out.println("Medialeb_yn = [" + getMedialeb_yn() + "]");
		System.out.println("Xchngadvt_yn = [" + getXchngadvt_yn() + "]");
		System.out.println("Event_cd = [" + getEvent_cd() + "]");
		System.out.println("Trst_rate = [" + getTrst_rate() + "]");
		System.out.println("Trst_fee = [" + getTrst_fee() + "]");
		System.out.println("Div_trst_fee_ex = [" + getDiv_trst_fee_ex() + "]");
		System.out.println("Div_trst_vat = [" + getDiv_trst_vat() + "]");
		System.out.println("Div_trst_fee = [" + getDiv_trst_fee() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String clos_dt = req.getParameter("clos_dt");
if( clos_dt == null){
	System.out.println(this.toString+" : clos_dt is null" );
}else{
	System.out.println(this.toString+" : clos_dt is "+clos_dt );
}
String chcode = req.getParameter("chcode");
if( chcode == null){
	System.out.println(this.toString+" : chcode is null" );
}else{
	System.out.println(this.toString+" : chcode is "+chcode );
}
String cuscode = req.getParameter("cuscode");
if( cuscode == null){
	System.out.println(this.toString+" : cuscode is null" );
}else{
	System.out.println(this.toString+" : cuscode is "+cuscode );
}
String blndcode = req.getParameter("blndcode");
if( blndcode == null){
	System.out.println(this.toString+" : blndcode is null" );
}else{
	System.out.println(this.toString+" : blndcode is "+blndcode );
}
String orgcode = req.getParameter("orgcode");
if( orgcode == null){
	System.out.println(this.toString+" : orgcode is null" );
}else{
	System.out.println(this.toString+" : orgcode is "+orgcode );
}
String frdate = req.getParameter("frdate");
if( frdate == null){
	System.out.println(this.toString+" : frdate is null" );
}else{
	System.out.println(this.toString+" : frdate is "+frdate );
}
String todate = req.getParameter("todate");
if( todate == null){
	System.out.println(this.toString+" : todate is null" );
}else{
	System.out.println(this.toString+" : todate is "+todate );
}
String rcvgrp = req.getParameter("rcvgrp");
if( rcvgrp == null){
	System.out.println(this.toString+" : rcvgrp is null" );
}else{
	System.out.println(this.toString+" : rcvgrp is "+rcvgrp );
}
String chgcode = req.getParameter("chgcode");
if( chgcode == null){
	System.out.println(this.toString+" : chgcode is null" );
}else{
	System.out.println(this.toString+" : chgcode is "+chgcode );
}
String dtlseq = req.getParameter("dtlseq");
if( dtlseq == null){
	System.out.println(this.toString+" : dtlseq is null" );
}else{
	System.out.println(this.toString+" : dtlseq is "+dtlseq );
}
String dtlrownum = req.getParameter("dtlrownum");
if( dtlrownum == null){
	System.out.println(this.toString+" : dtlrownum is null" );
}else{
	System.out.println(this.toString+" : dtlrownum is "+dtlrownum );
}
String acct_trn_cnfm = req.getParameter("acct_trn_cnfm");
if( acct_trn_cnfm == null){
	System.out.println(this.toString+" : acct_trn_cnfm is null" );
}else{
	System.out.println(this.toString+" : acct_trn_cnfm is "+acct_trn_cnfm );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String pubc_occr_dt = req.getParameter("pubc_occr_dt");
if( pubc_occr_dt == null){
	System.out.println(this.toString+" : pubc_occr_dt is null" );
}else{
	System.out.println(this.toString+" : pubc_occr_dt is "+pubc_occr_dt );
}
String pubc_occr_seq = req.getParameter("pubc_occr_seq");
if( pubc_occr_seq == null){
	System.out.println(this.toString+" : pubc_occr_seq is null" );
}else{
	System.out.println(this.toString+" : pubc_occr_seq is "+pubc_occr_seq );
}
String pubc_slip_no = req.getParameter("pubc_slip_no");
if( pubc_slip_no == null){
	System.out.println(this.toString+" : pubc_slip_no is null" );
}else{
	System.out.println(this.toString+" : pubc_slip_no is "+pubc_slip_no );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String clos_dt = Util.checkString(req.getParameter("clos_dt"));
String chcode = Util.checkString(req.getParameter("chcode"));
String cuscode = Util.checkString(req.getParameter("cuscode"));
String blndcode = Util.checkString(req.getParameter("blndcode"));
String orgcode = Util.checkString(req.getParameter("orgcode"));
String frdate = Util.checkString(req.getParameter("frdate"));
String todate = Util.checkString(req.getParameter("todate"));
String rcvgrp = Util.checkString(req.getParameter("rcvgrp"));
String chgcode = Util.checkString(req.getParameter("chgcode"));
String dtlseq = Util.checkString(req.getParameter("dtlseq"));
String dtlrownum = Util.checkString(req.getParameter("dtlrownum"));
String acct_trn_cnfm = Util.checkString(req.getParameter("acct_trn_cnfm"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String pubc_occr_dt = Util.checkString(req.getParameter("pubc_occr_dt"));
String pubc_occr_seq = Util.checkString(req.getParameter("pubc_occr_seq"));
String pubc_slip_no = Util.checkString(req.getParameter("pubc_slip_no"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String clos_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("clos_dt")));
String chcode = Util.Uni2Ksc(Util.checkString(req.getParameter("chcode")));
String cuscode = Util.Uni2Ksc(Util.checkString(req.getParameter("cuscode")));
String blndcode = Util.Uni2Ksc(Util.checkString(req.getParameter("blndcode")));
String orgcode = Util.Uni2Ksc(Util.checkString(req.getParameter("orgcode")));
String frdate = Util.Uni2Ksc(Util.checkString(req.getParameter("frdate")));
String todate = Util.Uni2Ksc(Util.checkString(req.getParameter("todate")));
String rcvgrp = Util.Uni2Ksc(Util.checkString(req.getParameter("rcvgrp")));
String chgcode = Util.Uni2Ksc(Util.checkString(req.getParameter("chgcode")));
String dtlseq = Util.Uni2Ksc(Util.checkString(req.getParameter("dtlseq")));
String dtlrownum = Util.Uni2Ksc(Util.checkString(req.getParameter("dtlrownum")));
String acct_trn_cnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_trn_cnfm")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String pubc_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_occr_dt")));
String pubc_occr_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_occr_seq")));
String pubc_slip_no = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_slip_no")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setClos_dt(clos_dt);
dm.setChcode(chcode);
dm.setCuscode(cuscode);
dm.setBlndcode(blndcode);
dm.setOrgcode(orgcode);
dm.setFrdate(frdate);
dm.setTodate(todate);
dm.setRcvgrp(rcvgrp);
dm.setChgcode(chgcode);
dm.setDtlseq(dtlseq);
dm.setDtlrownum(dtlrownum);
dm.setAcct_trn_cnfm(acct_trn_cnfm);
dm.setMedi_cd(medi_cd);
dm.setPubc_occr_dt(pubc_occr_dt);
dm.setPubc_occr_seq(pubc_occr_seq);
dm.setPubc_slip_no(pubc_slip_no);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Feb 16 20:03:23 KST 2012 */