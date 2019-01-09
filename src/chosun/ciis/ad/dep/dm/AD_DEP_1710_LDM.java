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


package chosun.ciis.ad.dep.dm;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import oracle.jdbc.driver.OracleTypes;
import somo.framework.db.BaseDM;
import somo.framework.db.BaseDataSet;

/**
 * 
 */


public class AD_DEP_1710_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String dealmedicd;
	public String medi_cd;
	public String hndl_clsf;
	public String dlco_no;
	public String frdt;
	public String todt;
	public String fr_rcpm_shet_no;
	public String to_rcpm_shet_no;
	public String acct_cd;
	public String rmtt_dt;
	public String rmtt_amt;
	public String rmtt_plac;
	public String proc_clsf;

	public AD_DEP_1710_LDM(){}
	public AD_DEP_1710_LDM(String cmpy_cd, String dealmedicd, String medi_cd, String hndl_clsf, String dlco_no, String frdt, String todt, String fr_rcpm_shet_no, String to_rcpm_shet_no, String acct_cd, String rmtt_dt, String rmtt_amt, String rmtt_plac, String proc_clsf){
		this.cmpy_cd = cmpy_cd;
		this.dealmedicd = dealmedicd;
		this.medi_cd = medi_cd;
		this.hndl_clsf = hndl_clsf;
		this.dlco_no = dlco_no;
		this.frdt = frdt;
		this.todt = todt;
		this.fr_rcpm_shet_no = fr_rcpm_shet_no;
		this.to_rcpm_shet_no = to_rcpm_shet_no;
		this.acct_cd = acct_cd;
		this.rmtt_dt = rmtt_dt;
		this.rmtt_amt = rmtt_amt;
		this.rmtt_plac = rmtt_plac;
		this.proc_clsf = proc_clsf;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDealmedicd(String dealmedicd){
		this.dealmedicd = dealmedicd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setHndl_clsf(String hndl_clsf){
		this.hndl_clsf = hndl_clsf;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setFr_rcpm_shet_no(String fr_rcpm_shet_no){
		this.fr_rcpm_shet_no = fr_rcpm_shet_no;
	}

	public void setTo_rcpm_shet_no(String to_rcpm_shet_no){
		this.to_rcpm_shet_no = to_rcpm_shet_no;
	}

	public void setAcct_cd(String acct_cd){
		this.acct_cd = acct_cd;
	}

	public void setRmtt_dt(String rmtt_dt){
		this.rmtt_dt = rmtt_dt;
	}

	public void setRmtt_amt(String rmtt_amt){
		this.rmtt_amt = rmtt_amt;
	}

	public void setRmtt_plac(String rmtt_plac){
		this.rmtt_plac = rmtt_plac;
	}

	public void setProc_clsf(String proc_clsf){
		this.proc_clsf = proc_clsf;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDealmedicd(){
		return this.dealmedicd;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getHndl_clsf(){
		return this.hndl_clsf;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getFr_rcpm_shet_no(){
		return this.fr_rcpm_shet_no;
	}

	public String getTo_rcpm_shet_no(){
		return this.to_rcpm_shet_no;
	}

	public String getAcct_cd(){
		return this.acct_cd;
	}

	public String getRmtt_dt(){
		return this.rmtt_dt;
	}

	public String getRmtt_amt(){
		return this.rmtt_amt;
	}

	public String getRmtt_plac(){
		return this.rmtt_plac;
	}

	public String getProc_clsf(){
		return this.proc_clsf;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_DEP_1710_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_DEP_1710_LDM dm = (AD_DEP_1710_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.dealmedicd);
		cstmt.setString(5, dm.medi_cd);
		cstmt.setString(6, dm.hndl_clsf);
		cstmt.setString(7, dm.dlco_no);
		cstmt.setString(8, dm.frdt);
		cstmt.setString(9, dm.todt);
		cstmt.setString(10, dm.fr_rcpm_shet_no);
		cstmt.setString(11, dm.to_rcpm_shet_no);
		cstmt.setString(12, dm.acct_cd);
		cstmt.setString(13, dm.rmtt_dt);
		cstmt.setString(14, dm.rmtt_amt);
		cstmt.setString(15, dm.rmtt_plac);
		cstmt.setString(16, dm.proc_clsf);
		cstmt.registerOutParameter(17, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.dep.ds.AD_DEP_1710_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("dealmedicd = [" + getDealmedicd() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("hndl_clsf = [" + getHndl_clsf() + "]");
		System.out.println("dlco_no = [" + getDlco_no() + "]");
		System.out.println("frdt = [" + getFrdt() + "]");
		System.out.println("todt = [" + getTodt() + "]");
		System.out.println("fr_rcpm_shet_no = [" + getFr_rcpm_shet_no() + "]");
		System.out.println("to_rcpm_shet_no = [" + getTo_rcpm_shet_no() + "]");
		System.out.println("acct_cd = [" + getAcct_cd() + "]");
		System.out.println("rmtt_dt = [" + getRmtt_dt() + "]");
		System.out.println("rmtt_amt = [" + getRmtt_amt() + "]");
		System.out.println("rmtt_plac = [" + getRmtt_plac() + "]");
		System.out.println("proc_clsf = [" + getProc_clsf() + "]");
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
String dealmedicd = req.getParameter("dealmedicd");
if( dealmedicd == null){
	System.out.println(this.toString+" : dealmedicd is null" );
}else{
	System.out.println(this.toString+" : dealmedicd is "+dealmedicd );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String hndl_clsf = req.getParameter("hndl_clsf");
if( hndl_clsf == null){
	System.out.println(this.toString+" : hndl_clsf is null" );
}else{
	System.out.println(this.toString+" : hndl_clsf is "+hndl_clsf );
}
String dlco_no = req.getParameter("dlco_no");
if( dlco_no == null){
	System.out.println(this.toString+" : dlco_no is null" );
}else{
	System.out.println(this.toString+" : dlco_no is "+dlco_no );
}
String frdt = req.getParameter("frdt");
if( frdt == null){
	System.out.println(this.toString+" : frdt is null" );
}else{
	System.out.println(this.toString+" : frdt is "+frdt );
}
String todt = req.getParameter("todt");
if( todt == null){
	System.out.println(this.toString+" : todt is null" );
}else{
	System.out.println(this.toString+" : todt is "+todt );
}
String fr_rcpm_shet_no = req.getParameter("fr_rcpm_shet_no");
if( fr_rcpm_shet_no == null){
	System.out.println(this.toString+" : fr_rcpm_shet_no is null" );
}else{
	System.out.println(this.toString+" : fr_rcpm_shet_no is "+fr_rcpm_shet_no );
}
String to_rcpm_shet_no = req.getParameter("to_rcpm_shet_no");
if( to_rcpm_shet_no == null){
	System.out.println(this.toString+" : to_rcpm_shet_no is null" );
}else{
	System.out.println(this.toString+" : to_rcpm_shet_no is "+to_rcpm_shet_no );
}
String acct_cd = req.getParameter("acct_cd");
if( acct_cd == null){
	System.out.println(this.toString+" : acct_cd is null" );
}else{
	System.out.println(this.toString+" : acct_cd is "+acct_cd );
}
String rmtt_dt = req.getParameter("rmtt_dt");
if( rmtt_dt == null){
	System.out.println(this.toString+" : rmtt_dt is null" );
}else{
	System.out.println(this.toString+" : rmtt_dt is "+rmtt_dt );
}
String rmtt_amt = req.getParameter("rmtt_amt");
if( rmtt_amt == null){
	System.out.println(this.toString+" : rmtt_amt is null" );
}else{
	System.out.println(this.toString+" : rmtt_amt is "+rmtt_amt );
}
String rmtt_plac = req.getParameter("rmtt_plac");
if( rmtt_plac == null){
	System.out.println(this.toString+" : rmtt_plac is null" );
}else{
	System.out.println(this.toString+" : rmtt_plac is "+rmtt_plac );
}
String proc_clsf = req.getParameter("proc_clsf");
if( proc_clsf == null){
	System.out.println(this.toString+" : proc_clsf is null" );
}else{
	System.out.println(this.toString+" : proc_clsf is "+proc_clsf );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String dealmedicd = Util.checkString(req.getParameter("dealmedicd"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String hndl_clsf = Util.checkString(req.getParameter("hndl_clsf"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
String fr_rcpm_shet_no = Util.checkString(req.getParameter("fr_rcpm_shet_no"));
String to_rcpm_shet_no = Util.checkString(req.getParameter("to_rcpm_shet_no"));
String acct_cd = Util.checkString(req.getParameter("acct_cd"));
String rmtt_dt = Util.checkString(req.getParameter("rmtt_dt"));
String rmtt_amt = Util.checkString(req.getParameter("rmtt_amt"));
String rmtt_plac = Util.checkString(req.getParameter("rmtt_plac"));
String proc_clsf = Util.checkString(req.getParameter("proc_clsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String dealmedicd = Util.Uni2Ksc(Util.checkString(req.getParameter("dealmedicd")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String hndl_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("hndl_clsf")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String fr_rcpm_shet_no = Util.Uni2Ksc(Util.checkString(req.getParameter("fr_rcpm_shet_no")));
String to_rcpm_shet_no = Util.Uni2Ksc(Util.checkString(req.getParameter("to_rcpm_shet_no")));
String acct_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_cd")));
String rmtt_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("rmtt_dt")));
String rmtt_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("rmtt_amt")));
String rmtt_plac = Util.Uni2Ksc(Util.checkString(req.getParameter("rmtt_plac")));
String proc_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_clsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setDealmedicd(dealmedicd);
dm.setMedi_cd(medi_cd);
dm.setHndl_clsf(hndl_clsf);
dm.setDlco_no(dlco_no);
dm.setFrdt(frdt);
dm.setTodt(todt);
dm.setFr_rcpm_shet_no(fr_rcpm_shet_no);
dm.setTo_rcpm_shet_no(to_rcpm_shet_no);
dm.setAcct_cd(acct_cd);
dm.setRmtt_dt(rmtt_dt);
dm.setRmtt_amt(rmtt_amt);
dm.setRmtt_plac(rmtt_plac);
dm.setProc_clsf(proc_clsf);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Mar 26 18:09:51 KST 2009 */