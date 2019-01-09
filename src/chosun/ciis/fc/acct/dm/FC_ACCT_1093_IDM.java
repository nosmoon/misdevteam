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


package chosun.ciis.fc.acct.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.ds.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_1093_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String seq;
	public long pay_amt_llmt;
	public long pay_amt_hlmt;
	public long mtrymm_llmt;
	public long mtrymm_hlmt;
	public long mtrydd_llmt;
	public long mtrydd_hlmt;
	public long note_amt_llmt;
	public long note_amt_hlmt;
	public long rem_cash_hlmt;
	public String chg_pers;
	public String incmg_pers_ipadd;
	public long lump_setoff_excl_yn;

	public FC_ACCT_1093_IDM(){}
	public FC_ACCT_1093_IDM(String cmpy_cd, String dlco_clsf_cd, String dlco_cd, String seq, long pay_amt_llmt, long pay_amt_hlmt, long mtrymm_llmt, long mtrymm_hlmt, long mtrydd_llmt, long mtrydd_hlmt, long note_amt_llmt, long note_amt_hlmt, long rem_cash_hlmt, String chg_pers, String incmg_pers_ipadd, long lump_setoff_excl_yn){
		this.cmpy_cd = cmpy_cd;
		this.dlco_clsf_cd = dlco_clsf_cd;
		this.dlco_cd = dlco_cd;
		this.seq = seq;
		this.pay_amt_llmt = pay_amt_llmt;
		this.pay_amt_hlmt = pay_amt_hlmt;
		this.mtrymm_llmt = mtrymm_llmt;
		this.mtrymm_hlmt = mtrymm_hlmt;
		this.mtrydd_llmt = mtrydd_llmt;
		this.mtrydd_hlmt = mtrydd_hlmt;
		this.note_amt_llmt = note_amt_llmt;
		this.note_amt_hlmt = note_amt_hlmt;
		this.rem_cash_hlmt = rem_cash_hlmt;
		this.chg_pers = chg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.lump_setoff_excl_yn = lump_setoff_excl_yn;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setPay_amt_llmt(long pay_amt_llmt){
		this.pay_amt_llmt = pay_amt_llmt;
	}

	public void setPay_amt_hlmt(long pay_amt_hlmt){
		this.pay_amt_hlmt = pay_amt_hlmt;
	}

	public void setMtrymm_llmt(long mtrymm_llmt){
		this.mtrymm_llmt = mtrymm_llmt;
	}

	public void setMtrymm_hlmt(long mtrymm_hlmt){
		this.mtrymm_hlmt = mtrymm_hlmt;
	}

	public void setMtrydd_llmt(long mtrydd_llmt){
		this.mtrydd_llmt = mtrydd_llmt;
	}

	public void setMtrydd_hlmt(long mtrydd_hlmt){
		this.mtrydd_hlmt = mtrydd_hlmt;
	}

	public void setNote_amt_llmt(long note_amt_llmt){
		this.note_amt_llmt = note_amt_llmt;
	}

	public void setNote_amt_hlmt(long note_amt_hlmt){
		this.note_amt_hlmt = note_amt_hlmt;
	}

	public void setRem_cash_hlmt(long rem_cash_hlmt){
		this.rem_cash_hlmt = rem_cash_hlmt;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setLump_setoff_excl_yn(long lump_setoff_excl_yn){
		this.lump_setoff_excl_yn = lump_setoff_excl_yn;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getSeq(){
		return this.seq;
	}

	public long getPay_amt_llmt(){
		return this.pay_amt_llmt;
	}

	public long getPay_amt_hlmt(){
		return this.pay_amt_hlmt;
	}

	public long getMtrymm_llmt(){
		return this.mtrymm_llmt;
	}

	public long getMtrymm_hlmt(){
		return this.mtrymm_hlmt;
	}

	public long getMtrydd_llmt(){
		return this.mtrydd_llmt;
	}

	public long getMtrydd_hlmt(){
		return this.mtrydd_hlmt;
	}

	public long getNote_amt_llmt(){
		return this.note_amt_llmt;
	}

	public long getNote_amt_hlmt(){
		return this.note_amt_hlmt;
	}

	public long getRem_cash_hlmt(){
		return this.rem_cash_hlmt;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public long getLump_setoff_excl_yn(){
		return this.lump_setoff_excl_yn;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_1093_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_1093_IDM dm = (FC_ACCT_1093_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.dlco_clsf_cd);
		cstmt.setString(5, dm.dlco_cd);
		cstmt.setString(6, dm.seq);
		cstmt.setLong(7, dm.pay_amt_llmt);
		cstmt.setLong(8, dm.pay_amt_hlmt);
		cstmt.setLong(9, dm.mtrymm_llmt);
		cstmt.setLong(10, dm.mtrymm_hlmt);
		cstmt.setLong(11, dm.mtrydd_llmt);
		cstmt.setLong(12, dm.mtrydd_hlmt);
		cstmt.setLong(13, dm.note_amt_llmt);
		cstmt.setLong(14, dm.note_amt_hlmt);
		cstmt.setLong(15, dm.rem_cash_hlmt);
		cstmt.setString(16, dm.chg_pers);
		cstmt.setString(17, dm.incmg_pers_ipadd);
		cstmt.setLong(18, dm.lump_setoff_excl_yn);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_1093_IDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("dlco_clsf_cd = " + getDlco_clsf_cd());
        System.out.println("dlco_cd = " + getDlco_cd());
        System.out.println("seq = " + getSeq());
        System.out.println("pay_amt_llmt = " + getPay_amt_llmt());
        System.out.println("pay_amt_hlmt = " + getPay_amt_hlmt());
        System.out.println("mtrymm_llmt = " + getMtrymm_llmt());
        System.out.println("mtrymm_hlmt = " + getMtrymm_hlmt());
        System.out.println("mtrydd_llmt = " + getMtrydd_llmt());
        System.out.println("mtrydd_hlmt = " + getMtrydd_hlmt());
        System.out.println("note_amt_llmt = " + getNote_amt_llmt());
        System.out.println("note_amt_hlmt = " + getNote_amt_hlmt());
        System.out.println("rem_cash_hlmt = " + getRem_cash_hlmt());
        System.out.println("chg_pers = " + getChg_pers());
        System.out.println("incmg_pers_ipadd = " + getIncmg_pers_ipadd());
        System.out.println("lump_setoff_excl_yn = " + getLump_setoff_excl_yn());
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
String dlco_clsf_cd = req.getParameter("dlco_clsf_cd");
if( dlco_clsf_cd == null){
	System.out.println(this.toString+" : dlco_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : dlco_clsf_cd is "+dlco_clsf_cd );
}
String dlco_cd = req.getParameter("dlco_cd");
if( dlco_cd == null){
	System.out.println(this.toString+" : dlco_cd is null" );
}else{
	System.out.println(this.toString+" : dlco_cd is "+dlco_cd );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String pay_amt_llmt = req.getParameter("pay_amt_llmt");
if( pay_amt_llmt == null){
	System.out.println(this.toString+" : pay_amt_llmt is null" );
}else{
	System.out.println(this.toString+" : pay_amt_llmt is "+pay_amt_llmt );
}
String pay_amt_hlmt = req.getParameter("pay_amt_hlmt");
if( pay_amt_hlmt == null){
	System.out.println(this.toString+" : pay_amt_hlmt is null" );
}else{
	System.out.println(this.toString+" : pay_amt_hlmt is "+pay_amt_hlmt );
}
String mtrymm_llmt = req.getParameter("mtrymm_llmt");
if( mtrymm_llmt == null){
	System.out.println(this.toString+" : mtrymm_llmt is null" );
}else{
	System.out.println(this.toString+" : mtrymm_llmt is "+mtrymm_llmt );
}
String mtrymm_hlmt = req.getParameter("mtrymm_hlmt");
if( mtrymm_hlmt == null){
	System.out.println(this.toString+" : mtrymm_hlmt is null" );
}else{
	System.out.println(this.toString+" : mtrymm_hlmt is "+mtrymm_hlmt );
}
String mtrydd_llmt = req.getParameter("mtrydd_llmt");
if( mtrydd_llmt == null){
	System.out.println(this.toString+" : mtrydd_llmt is null" );
}else{
	System.out.println(this.toString+" : mtrydd_llmt is "+mtrydd_llmt );
}
String mtrydd_hlmt = req.getParameter("mtrydd_hlmt");
if( mtrydd_hlmt == null){
	System.out.println(this.toString+" : mtrydd_hlmt is null" );
}else{
	System.out.println(this.toString+" : mtrydd_hlmt is "+mtrydd_hlmt );
}
String note_amt_llmt = req.getParameter("note_amt_llmt");
if( note_amt_llmt == null){
	System.out.println(this.toString+" : note_amt_llmt is null" );
}else{
	System.out.println(this.toString+" : note_amt_llmt is "+note_amt_llmt );
}
String note_amt_hlmt = req.getParameter("note_amt_hlmt");
if( note_amt_hlmt == null){
	System.out.println(this.toString+" : note_amt_hlmt is null" );
}else{
	System.out.println(this.toString+" : note_amt_hlmt is "+note_amt_hlmt );
}
String rem_cash_hlmt = req.getParameter("rem_cash_hlmt");
if( rem_cash_hlmt == null){
	System.out.println(this.toString+" : rem_cash_hlmt is null" );
}else{
	System.out.println(this.toString+" : rem_cash_hlmt is "+rem_cash_hlmt );
}
String chg_pers = req.getParameter("chg_pers");
if( chg_pers == null){
	System.out.println(this.toString+" : chg_pers is null" );
}else{
	System.out.println(this.toString+" : chg_pers is "+chg_pers );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
String lump_setoff_excl_yn = req.getParameter("lump_setoff_excl_yn");
if( lump_setoff_excl_yn == null){
	System.out.println(this.toString+" : lump_setoff_excl_yn is null" );
}else{
	System.out.println(this.toString+" : lump_setoff_excl_yn is "+lump_setoff_excl_yn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
String seq = Util.checkString(req.getParameter("seq"));
String pay_amt_llmt = Util.checkString(req.getParameter("pay_amt_llmt"));
String pay_amt_hlmt = Util.checkString(req.getParameter("pay_amt_hlmt"));
String mtrymm_llmt = Util.checkString(req.getParameter("mtrymm_llmt"));
String mtrymm_hlmt = Util.checkString(req.getParameter("mtrymm_hlmt"));
String mtrydd_llmt = Util.checkString(req.getParameter("mtrydd_llmt"));
String mtrydd_hlmt = Util.checkString(req.getParameter("mtrydd_hlmt"));
String note_amt_llmt = Util.checkString(req.getParameter("note_amt_llmt"));
String note_amt_hlmt = Util.checkString(req.getParameter("note_amt_hlmt"));
String rem_cash_hlmt = Util.checkString(req.getParameter("rem_cash_hlmt"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String lump_setoff_excl_yn = Util.checkString(req.getParameter("lump_setoff_excl_yn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String dlco_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf_cd")));
String dlco_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String pay_amt_llmt = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_amt_llmt")));
String pay_amt_hlmt = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_amt_hlmt")));
String mtrymm_llmt = Util.Uni2Ksc(Util.checkString(req.getParameter("mtrymm_llmt")));
String mtrymm_hlmt = Util.Uni2Ksc(Util.checkString(req.getParameter("mtrymm_hlmt")));
String mtrydd_llmt = Util.Uni2Ksc(Util.checkString(req.getParameter("mtrydd_llmt")));
String mtrydd_hlmt = Util.Uni2Ksc(Util.checkString(req.getParameter("mtrydd_hlmt")));
String note_amt_llmt = Util.Uni2Ksc(Util.checkString(req.getParameter("note_amt_llmt")));
String note_amt_hlmt = Util.Uni2Ksc(Util.checkString(req.getParameter("note_amt_hlmt")));
String rem_cash_hlmt = Util.Uni2Ksc(Util.checkString(req.getParameter("rem_cash_hlmt")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String lump_setoff_excl_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("lump_setoff_excl_yn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setDlco_clsf_cd(dlco_clsf_cd);
dm.setDlco_cd(dlco_cd);
dm.setSeq(seq);
dm.setPay_amt_llmt(pay_amt_llmt);
dm.setPay_amt_hlmt(pay_amt_hlmt);
dm.setMtrymm_llmt(mtrymm_llmt);
dm.setMtrymm_hlmt(mtrymm_hlmt);
dm.setMtrydd_llmt(mtrydd_llmt);
dm.setMtrydd_hlmt(mtrydd_hlmt);
dm.setNote_amt_llmt(note_amt_llmt);
dm.setNote_amt_hlmt(note_amt_hlmt);
dm.setRem_cash_hlmt(rem_cash_hlmt);
dm.setChg_pers(chg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setLump_setoff_excl_yn(lump_setoff_excl_yn);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Feb 26 17:33:21 KST 2009 */