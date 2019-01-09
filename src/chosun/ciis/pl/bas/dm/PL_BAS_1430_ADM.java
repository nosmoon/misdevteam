/***************************************************************************************************
* 파일명 : 
* 기능 : 
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.pl.bas.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pl.bas.ds.*;
import chosun.ciis.pl.bas.rec.*;

/**
 * 
 */


public class PL_BAS_1430_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String acc_flag;
	public String cmpy_cd;
	public String incmg_pers;
	public String incmg_pers_ip;
	public String mode_arr;
	public String reg_dt_arr;
	public String reg_seq_arr;
	public String dlco_cd_arr;
	public String dlco_seq_arr;
	public String medi_clsf_arr;
	public String meda_clsf_arr;
	public String setup_dt_arr;
	public String basi_yymm_arr;
	public String setup_amt_arr;
	public String dd_clos_yn_arr;
	public String remk_arr;

	public PL_BAS_1430_ADM(){}
	public PL_BAS_1430_ADM(String acc_flag, String cmpy_cd, String incmg_pers, String incmg_pers_ip, String mode_arr, String reg_dt_arr, String reg_seq_arr, String dlco_cd_arr, String dlco_seq_arr, String medi_clsf_arr, String meda_clsf_arr, String setup_dt_arr, String basi_yymm_arr, String setup_amt_arr, String dd_clos_yn_arr, String remk_arr){
		this.acc_flag = acc_flag;
		this.cmpy_cd = cmpy_cd;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ip = incmg_pers_ip;
		this.mode_arr = mode_arr;
		this.reg_dt_arr = reg_dt_arr;
		this.reg_seq_arr = reg_seq_arr;
		this.dlco_cd_arr = dlco_cd_arr;
		this.dlco_seq_arr = dlco_seq_arr;
		this.medi_clsf_arr = medi_clsf_arr;
		this.meda_clsf_arr = meda_clsf_arr;
		this.setup_dt_arr = setup_dt_arr;
		this.basi_yymm_arr = basi_yymm_arr;
		this.setup_amt_arr = setup_amt_arr;
		this.dd_clos_yn_arr = dd_clos_yn_arr;
		this.remk_arr = remk_arr;
	}

	public void setAcc_flag(String acc_flag){
		this.acc_flag = acc_flag;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setMode_arr(String mode_arr){
		this.mode_arr = mode_arr;
	}

	public void setReg_dt_arr(String reg_dt_arr){
		this.reg_dt_arr = reg_dt_arr;
	}

	public void setReg_seq_arr(String reg_seq_arr){
		this.reg_seq_arr = reg_seq_arr;
	}

	public void setDlco_cd_arr(String dlco_cd_arr){
		this.dlco_cd_arr = dlco_cd_arr;
	}

	public void setDlco_seq_arr(String dlco_seq_arr){
		this.dlco_seq_arr = dlco_seq_arr;
	}

	public void setMedi_clsf_arr(String medi_clsf_arr){
		this.medi_clsf_arr = medi_clsf_arr;
	}

	public void setMeda_clsf_arr(String meda_clsf_arr){
		this.meda_clsf_arr = meda_clsf_arr;
	}

	public void setSetup_dt_arr(String setup_dt_arr){
		this.setup_dt_arr = setup_dt_arr;
	}

	public void setBasi_yymm_arr(String basi_yymm_arr){
		this.basi_yymm_arr = basi_yymm_arr;
	}

	public void setSetup_amt_arr(String setup_amt_arr){
		this.setup_amt_arr = setup_amt_arr;
	}

	public void setDd_clos_yn_arr(String dd_clos_yn_arr){
		this.dd_clos_yn_arr = dd_clos_yn_arr;
	}

	public void setRemk_arr(String remk_arr){
		this.remk_arr = remk_arr;
	}

	public String getAcc_flag(){
		return this.acc_flag;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getMode_arr(){
		return this.mode_arr;
	}

	public String getReg_dt_arr(){
		return this.reg_dt_arr;
	}

	public String getReg_seq_arr(){
		return this.reg_seq_arr;
	}

	public String getDlco_cd_arr(){
		return this.dlco_cd_arr;
	}

	public String getDlco_seq_arr(){
		return this.dlco_seq_arr;
	}

	public String getMedi_clsf_arr(){
		return this.medi_clsf_arr;
	}

	public String getMeda_clsf_arr(){
		return this.meda_clsf_arr;
	}

	public String getSetup_dt_arr(){
		return this.setup_dt_arr;
	}

	public String getBasi_yymm_arr(){
		return this.basi_yymm_arr;
	}

	public String getSetup_amt_arr(){
		return this.setup_amt_arr;
	}

	public String getDd_clos_yn_arr(){
		return this.dd_clos_yn_arr;
	}

	public String getRemk_arr(){
		return this.remk_arr;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_PL_BAS_1430_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PL_BAS_1430_ADM dm = (PL_BAS_1430_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.acc_flag);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.incmg_pers);
		cstmt.setString(6, dm.incmg_pers_ip);
		cstmt.setString(7, dm.mode_arr);
		cstmt.setString(8, dm.reg_dt_arr);
		cstmt.setString(9, dm.reg_seq_arr);
		cstmt.setString(10, dm.dlco_cd_arr);
		cstmt.setString(11, dm.dlco_seq_arr);
		cstmt.setString(12, dm.medi_clsf_arr);
		cstmt.setString(13, dm.meda_clsf_arr);
		cstmt.setString(14, dm.setup_dt_arr);
		cstmt.setString(15, dm.basi_yymm_arr);
		cstmt.setString(16, dm.setup_amt_arr);
		cstmt.setString(17, dm.dd_clos_yn_arr);
		cstmt.setString(18, dm.remk_arr);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.pl.bas.ds.PL_BAS_1430_ADataSet();
	}



    public void print(){
        System.out.println("acc_flag = " + getAcc_flag());
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("incmg_pers = " + getIncmg_pers());
        System.out.println("incmg_pers_ip = " + getIncmg_pers_ip());
        System.out.println("mode_arr = " + getMode_arr());
        System.out.println("reg_dt_arr = " + getReg_dt_arr());
        System.out.println("reg_seq_arr = " + getReg_seq_arr());
        System.out.println("dlco_cd_arr = " + getDlco_cd_arr());
        System.out.println("dlco_seq_arr = " + getDlco_seq_arr());
        System.out.println("medi_clsf_arr = " + getMedi_clsf_arr());
        System.out.println("meda_clsf_arr = " + getMeda_clsf_arr());
        System.out.println("setup_dt_arr = " + getSetup_dt_arr());
        System.out.println("basi_yymm_arr = " + getBasi_yymm_arr());
        System.out.println("setup_amt_arr = " + getSetup_amt_arr());
        System.out.println("dd_clos_yn_arr = " + getDd_clos_yn_arr());
        System.out.println("remk_arr = " + getRemk_arr());
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String acc_flag = req.getParameter("acc_flag");
if( acc_flag == null){
	System.out.println(this.toString+" : acc_flag is null" );
}else{
	System.out.println(this.toString+" : acc_flag is "+acc_flag );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
}
String mode_arr = req.getParameter("mode_arr");
if( mode_arr == null){
	System.out.println(this.toString+" : mode_arr is null" );
}else{
	System.out.println(this.toString+" : mode_arr is "+mode_arr );
}
String reg_dt_arr = req.getParameter("reg_dt_arr");
if( reg_dt_arr == null){
	System.out.println(this.toString+" : reg_dt_arr is null" );
}else{
	System.out.println(this.toString+" : reg_dt_arr is "+reg_dt_arr );
}
String reg_seq_arr = req.getParameter("reg_seq_arr");
if( reg_seq_arr == null){
	System.out.println(this.toString+" : reg_seq_arr is null" );
}else{
	System.out.println(this.toString+" : reg_seq_arr is "+reg_seq_arr );
}
String dlco_cd_arr = req.getParameter("dlco_cd_arr");
if( dlco_cd_arr == null){
	System.out.println(this.toString+" : dlco_cd_arr is null" );
}else{
	System.out.println(this.toString+" : dlco_cd_arr is "+dlco_cd_arr );
}
String dlco_seq_arr = req.getParameter("dlco_seq_arr");
if( dlco_seq_arr == null){
	System.out.println(this.toString+" : dlco_seq_arr is null" );
}else{
	System.out.println(this.toString+" : dlco_seq_arr is "+dlco_seq_arr );
}
String medi_clsf_arr = req.getParameter("medi_clsf_arr");
if( medi_clsf_arr == null){
	System.out.println(this.toString+" : medi_clsf_arr is null" );
}else{
	System.out.println(this.toString+" : medi_clsf_arr is "+medi_clsf_arr );
}
String meda_clsf_arr = req.getParameter("meda_clsf_arr");
if( meda_clsf_arr == null){
	System.out.println(this.toString+" : meda_clsf_arr is null" );
}else{
	System.out.println(this.toString+" : meda_clsf_arr is "+meda_clsf_arr );
}
String setup_dt_arr = req.getParameter("setup_dt_arr");
if( setup_dt_arr == null){
	System.out.println(this.toString+" : setup_dt_arr is null" );
}else{
	System.out.println(this.toString+" : setup_dt_arr is "+setup_dt_arr );
}
String basi_yymm_arr = req.getParameter("basi_yymm_arr");
if( basi_yymm_arr == null){
	System.out.println(this.toString+" : basi_yymm_arr is null" );
}else{
	System.out.println(this.toString+" : basi_yymm_arr is "+basi_yymm_arr );
}
String setup_amt_arr = req.getParameter("setup_amt_arr");
if( setup_amt_arr == null){
	System.out.println(this.toString+" : setup_amt_arr is null" );
}else{
	System.out.println(this.toString+" : setup_amt_arr is "+setup_amt_arr );
}
String dd_clos_yn_arr = req.getParameter("dd_clos_yn_arr");
if( dd_clos_yn_arr == null){
	System.out.println(this.toString+" : dd_clos_yn_arr is null" );
}else{
	System.out.println(this.toString+" : dd_clos_yn_arr is "+dd_clos_yn_arr );
}
String remk_arr = req.getParameter("remk_arr");
if( remk_arr == null){
	System.out.println(this.toString+" : remk_arr is null" );
}else{
	System.out.println(this.toString+" : remk_arr is "+remk_arr );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String acc_flag = Util.checkString(req.getParameter("acc_flag"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String mode_arr = Util.checkString(req.getParameter("mode_arr"));
String reg_dt_arr = Util.checkString(req.getParameter("reg_dt_arr"));
String reg_seq_arr = Util.checkString(req.getParameter("reg_seq_arr"));
String dlco_cd_arr = Util.checkString(req.getParameter("dlco_cd_arr"));
String dlco_seq_arr = Util.checkString(req.getParameter("dlco_seq_arr"));
String medi_clsf_arr = Util.checkString(req.getParameter("medi_clsf_arr"));
String meda_clsf_arr = Util.checkString(req.getParameter("meda_clsf_arr"));
String setup_dt_arr = Util.checkString(req.getParameter("setup_dt_arr"));
String basi_yymm_arr = Util.checkString(req.getParameter("basi_yymm_arr"));
String setup_amt_arr = Util.checkString(req.getParameter("setup_amt_arr"));
String dd_clos_yn_arr = Util.checkString(req.getParameter("dd_clos_yn_arr"));
String remk_arr = Util.checkString(req.getParameter("remk_arr"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String acc_flag = Util.Uni2Ksc(Util.checkString(req.getParameter("acc_flag")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String mode_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("mode_arr")));
String reg_dt_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("reg_dt_arr")));
String reg_seq_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("reg_seq_arr")));
String dlco_cd_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd_arr")));
String dlco_seq_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_seq_arr")));
String medi_clsf_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_clsf_arr")));
String meda_clsf_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("meda_clsf_arr")));
String setup_dt_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("setup_dt_arr")));
String basi_yymm_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("basi_yymm_arr")));
String setup_amt_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("setup_amt_arr")));
String dd_clos_yn_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("dd_clos_yn_arr")));
String remk_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("remk_arr")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setAcc_flag(acc_flag);
dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setMode_arr(mode_arr);
dm.setReg_dt_arr(reg_dt_arr);
dm.setReg_seq_arr(reg_seq_arr);
dm.setDlco_cd_arr(dlco_cd_arr);
dm.setDlco_seq_arr(dlco_seq_arr);
dm.setMedi_clsf_arr(medi_clsf_arr);
dm.setMeda_clsf_arr(meda_clsf_arr);
dm.setSetup_dt_arr(setup_dt_arr);
dm.setBasi_yymm_arr(basi_yymm_arr);
dm.setSetup_amt_arr(setup_amt_arr);
dm.setDd_clos_yn_arr(dd_clos_yn_arr);
dm.setRemk_arr(remk_arr);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Mar 05 19:55:11 KST 2009 */