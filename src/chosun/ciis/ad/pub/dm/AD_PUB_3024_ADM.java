/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
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


public class AD_PUB_3024_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

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
	public String mst_yn;
	public String acct_trn_cnfm;
	public String medi_cd;
	public String pubc_occr_dt;
	public String pubc_occr_seq;
	public String incmg_pers_ip;
	public String incmg_pers;

	public AD_PUB_3024_ADM(){}
	public AD_PUB_3024_ADM(String cmpy_cd, String clos_dt, String chcode, String cuscode, String blndcode, String orgcode, String frdate, String todate, String rcvgrp, String chgcode, String dtlseq, String mst_yn, String acct_trn_cnfm, String medi_cd, String pubc_occr_dt, String pubc_occr_seq, String incmg_pers_ip, String incmg_pers){
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
		this.mst_yn = mst_yn;
		this.acct_trn_cnfm = acct_trn_cnfm;
		this.medi_cd = medi_cd;
		this.pubc_occr_dt = pubc_occr_dt;
		this.pubc_occr_seq = pubc_occr_seq;
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

	public void setMst_yn(String mst_yn){
		this.mst_yn = mst_yn;
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

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
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

	public String getMst_yn(){
		return this.mst_yn;
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

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}
    /*BIS의 프로시져CALL */
	public String getSQL(){
		 return "{ call SP_AD_PUB_3024_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_PUB_3024_ADM dm = (AD_PUB_3024_ADM)bdm;
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
		cstmt.setString(14, dm.mst_yn);
		cstmt.setString(15, dm.acct_trn_cnfm);
		cstmt.setString(16, dm.medi_cd);
		cstmt.setString(17, dm.pubc_occr_dt);
		cstmt.setString(18, dm.pubc_occr_seq);
		cstmt.setString(19, dm.incmg_pers_ip);
		cstmt.setString(20, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.pub.ds.AD_PUB_3024_ADataSet();
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
		System.out.println("mst_yn = [" + getMst_yn() + "]");
		System.out.println("acct_trn_cnfm = [" + getAcct_trn_cnfm() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("pubc_occr_dt = [" + getPubc_occr_dt() + "]");
		System.out.println("pubc_occr_seq = [" + getPubc_occr_seq() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

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
String mst_yn = req.getParameter("mst_yn");
if( mst_yn == null){
	System.out.println(this.toString+" : mst_yn is null" );
}else{
	System.out.println(this.toString+" : mst_yn is "+mst_yn );
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
Web Tier에서 req.getParameter() 처리시 사용하십시오.

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
String mst_yn = Util.checkString(req.getParameter("mst_yn"));
String acct_trn_cnfm = Util.checkString(req.getParameter("acct_trn_cnfm"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String pubc_occr_dt = Util.checkString(req.getParameter("pubc_occr_dt"));
String pubc_occr_seq = Util.checkString(req.getParameter("pubc_occr_seq"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

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
String mst_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("mst_yn")));
String acct_trn_cnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_trn_cnfm")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String pubc_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_occr_dt")));
String pubc_occr_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_occr_seq")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

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
dm.setMst_yn(mst_yn);
dm.setAcct_trn_cnfm(acct_trn_cnfm);
dm.setMedi_cd(medi_cd);
dm.setPubc_occr_dt(pubc_occr_dt);
dm.setPubc_occr_seq(pubc_occr_seq);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jan 31 18:47:36 KST 2012 */