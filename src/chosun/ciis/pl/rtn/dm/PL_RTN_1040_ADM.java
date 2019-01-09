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


package chosun.ciis.pl.rtn.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pl.rtn.ds.*;
import chosun.ciis.pl.rtn.rec.*;

/**
 * 
 */


public class PL_RTN_1040_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String acc_flag;
	public String cmpy_cd;
	public String incmg_pers;
	public String incmg_pers_ip;
	public String deal_dt;
	public String deal_grp_seq;
	public String basi_yymm;
	public String basi_dt;
	public String dlco_cd;
	public String dlco_seq;
	public String qty_chk;
	public String mode_arr;
	public String deal_seq_arr;
	public String medi_cd_arr;
	public String medi_ser_no_arr;
	public String deal_qty_arr;
	public String deal_uprc_arr;
	public String dcrate_arr;
	public String deal_amt_arr;
	public String wh_cd_arr;
	public String remk_arr;

	public PL_RTN_1040_ADM(){}
	public PL_RTN_1040_ADM(String acc_flag, String cmpy_cd, String incmg_pers, String incmg_pers_ip, String deal_dt, String deal_grp_seq, String basi_yymm, String basi_dt, String dlco_cd, String dlco_seq, String qty_chk, String mode_arr, String deal_seq_arr, String medi_cd_arr, String medi_ser_no_arr, String deal_qty_arr, String deal_uprc_arr, String dcrate_arr, String deal_amt_arr, String wh_cd_arr, String remk_arr){
		this.acc_flag = acc_flag;
		this.cmpy_cd = cmpy_cd;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ip = incmg_pers_ip;
		this.deal_dt = deal_dt;
		this.deal_grp_seq = deal_grp_seq;
		this.basi_yymm = basi_yymm;
		this.basi_dt = basi_dt;
		this.dlco_cd = dlco_cd;
		this.dlco_seq = dlco_seq;
		this.qty_chk = qty_chk;
		this.mode_arr = mode_arr;
		this.deal_seq_arr = deal_seq_arr;
		this.medi_cd_arr = medi_cd_arr;
		this.medi_ser_no_arr = medi_ser_no_arr;
		this.deal_qty_arr = deal_qty_arr;
		this.deal_uprc_arr = deal_uprc_arr;
		this.dcrate_arr = dcrate_arr;
		this.deal_amt_arr = deal_amt_arr;
		this.wh_cd_arr = wh_cd_arr;
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

	public void setDeal_dt(String deal_dt){
		this.deal_dt = deal_dt;
	}

	public void setDeal_grp_seq(String deal_grp_seq){
		this.deal_grp_seq = deal_grp_seq;
	}

	public void setBasi_yymm(String basi_yymm){
		this.basi_yymm = basi_yymm;
	}

	public void setBasi_dt(String basi_dt){
		this.basi_dt = basi_dt;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setDlco_seq(String dlco_seq){
		this.dlco_seq = dlco_seq;
	}

	public void setQty_chk(String qty_chk){
		this.qty_chk = qty_chk;
	}

	public void setMode_arr(String mode_arr){
		this.mode_arr = mode_arr;
	}

	public void setDeal_seq_arr(String deal_seq_arr){
		this.deal_seq_arr = deal_seq_arr;
	}

	public void setMedi_cd_arr(String medi_cd_arr){
		this.medi_cd_arr = medi_cd_arr;
	}

	public void setMedi_ser_no_arr(String medi_ser_no_arr){
		this.medi_ser_no_arr = medi_ser_no_arr;
	}

	public void setDeal_qty_arr(String deal_qty_arr){
		this.deal_qty_arr = deal_qty_arr;
	}

	public void setDeal_uprc_arr(String deal_uprc_arr){
		this.deal_uprc_arr = deal_uprc_arr;
	}

	public void setDcrate_arr(String dcrate_arr){
		this.dcrate_arr = dcrate_arr;
	}

	public void setDeal_amt_arr(String deal_amt_arr){
		this.deal_amt_arr = deal_amt_arr;
	}

	public void setWh_cd_arr(String wh_cd_arr){
		this.wh_cd_arr = wh_cd_arr;
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

	public String getDeal_dt(){
		return this.deal_dt;
	}

	public String getDeal_grp_seq(){
		return this.deal_grp_seq;
	}

	public String getBasi_yymm(){
		return this.basi_yymm;
	}

	public String getBasi_dt(){
		return this.basi_dt;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getDlco_seq(){
		return this.dlco_seq;
	}

	public String getQty_chk(){
		return this.qty_chk;
	}

	public String getMode_arr(){
		return this.mode_arr;
	}

	public String getDeal_seq_arr(){
		return this.deal_seq_arr;
	}

	public String getMedi_cd_arr(){
		return this.medi_cd_arr;
	}

	public String getMedi_ser_no_arr(){
		return this.medi_ser_no_arr;
	}

	public String getDeal_qty_arr(){
		return this.deal_qty_arr;
	}

	public String getDeal_uprc_arr(){
		return this.deal_uprc_arr;
	}

	public String getDcrate_arr(){
		return this.dcrate_arr;
	}

	public String getDeal_amt_arr(){
		return this.deal_amt_arr;
	}

	public String getWh_cd_arr(){
		return this.wh_cd_arr;
	}

	public String getRemk_arr(){
		return this.remk_arr;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_PL_RTN_1040_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PL_RTN_1040_ADM dm = (PL_RTN_1040_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.acc_flag);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.incmg_pers);
		cstmt.setString(6, dm.incmg_pers_ip);
		cstmt.setString(7, dm.deal_dt);
		cstmt.setString(8, dm.deal_grp_seq);
		cstmt.setString(9, dm.basi_yymm);
		cstmt.setString(10, dm.basi_dt);
		cstmt.setString(11, dm.dlco_cd);
		cstmt.setString(12, dm.dlco_seq);
		cstmt.setString(13, dm.qty_chk);
		cstmt.setString(14, dm.mode_arr);
		cstmt.setString(15, dm.deal_seq_arr);
		cstmt.setString(16, dm.medi_cd_arr);
		cstmt.setString(17, dm.medi_ser_no_arr);
		cstmt.setString(18, dm.deal_qty_arr);
		cstmt.setString(19, dm.deal_uprc_arr);
		cstmt.setString(20, dm.dcrate_arr);
		cstmt.setString(21, dm.deal_amt_arr);
		cstmt.setString(22, dm.wh_cd_arr);
		cstmt.setString(23, dm.remk_arr);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.pl.rtn.ds.PL_RTN_1040_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("acc_flag = [" + getAcc_flag() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("deal_dt = [" + getDeal_dt() + "]");
		System.out.println("deal_grp_seq = [" + getDeal_grp_seq() + "]");
		System.out.println("basi_yymm = [" + getBasi_yymm() + "]");
		System.out.println("basi_dt = [" + getBasi_dt() + "]");
		System.out.println("dlco_cd = [" + getDlco_cd() + "]");
		System.out.println("dlco_seq = [" + getDlco_seq() + "]");
		System.out.println("qty_chk = [" + getQty_chk() + "]");
		System.out.println("mode_arr = [" + getMode_arr() + "]");
		System.out.println("deal_seq_arr = [" + getDeal_seq_arr() + "]");
		System.out.println("medi_cd_arr = [" + getMedi_cd_arr() + "]");
		System.out.println("medi_ser_no_arr = [" + getMedi_ser_no_arr() + "]");
		System.out.println("deal_qty_arr = [" + getDeal_qty_arr() + "]");
		System.out.println("deal_uprc_arr = [" + getDeal_uprc_arr() + "]");
		System.out.println("dcrate_arr = [" + getDcrate_arr() + "]");
		System.out.println("deal_amt_arr = [" + getDeal_amt_arr() + "]");
		System.out.println("wh_cd_arr = [" + getWh_cd_arr() + "]");
		System.out.println("remk_arr = [" + getRemk_arr() + "]");
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
String deal_dt = req.getParameter("deal_dt");
if( deal_dt == null){
	System.out.println(this.toString+" : deal_dt is null" );
}else{
	System.out.println(this.toString+" : deal_dt is "+deal_dt );
}
String deal_grp_seq = req.getParameter("deal_grp_seq");
if( deal_grp_seq == null){
	System.out.println(this.toString+" : deal_grp_seq is null" );
}else{
	System.out.println(this.toString+" : deal_grp_seq is "+deal_grp_seq );
}
String basi_yymm = req.getParameter("basi_yymm");
if( basi_yymm == null){
	System.out.println(this.toString+" : basi_yymm is null" );
}else{
	System.out.println(this.toString+" : basi_yymm is "+basi_yymm );
}
String basi_dt = req.getParameter("basi_dt");
if( basi_dt == null){
	System.out.println(this.toString+" : basi_dt is null" );
}else{
	System.out.println(this.toString+" : basi_dt is "+basi_dt );
}
String dlco_cd = req.getParameter("dlco_cd");
if( dlco_cd == null){
	System.out.println(this.toString+" : dlco_cd is null" );
}else{
	System.out.println(this.toString+" : dlco_cd is "+dlco_cd );
}
String dlco_seq = req.getParameter("dlco_seq");
if( dlco_seq == null){
	System.out.println(this.toString+" : dlco_seq is null" );
}else{
	System.out.println(this.toString+" : dlco_seq is "+dlco_seq );
}
String qty_chk = req.getParameter("qty_chk");
if( qty_chk == null){
	System.out.println(this.toString+" : qty_chk is null" );
}else{
	System.out.println(this.toString+" : qty_chk is "+qty_chk );
}
String mode_arr = req.getParameter("mode_arr");
if( mode_arr == null){
	System.out.println(this.toString+" : mode_arr is null" );
}else{
	System.out.println(this.toString+" : mode_arr is "+mode_arr );
}
String deal_seq_arr = req.getParameter("deal_seq_arr");
if( deal_seq_arr == null){
	System.out.println(this.toString+" : deal_seq_arr is null" );
}else{
	System.out.println(this.toString+" : deal_seq_arr is "+deal_seq_arr );
}
String medi_cd_arr = req.getParameter("medi_cd_arr");
if( medi_cd_arr == null){
	System.out.println(this.toString+" : medi_cd_arr is null" );
}else{
	System.out.println(this.toString+" : medi_cd_arr is "+medi_cd_arr );
}
String medi_ser_no_arr = req.getParameter("medi_ser_no_arr");
if( medi_ser_no_arr == null){
	System.out.println(this.toString+" : medi_ser_no_arr is null" );
}else{
	System.out.println(this.toString+" : medi_ser_no_arr is "+medi_ser_no_arr );
}
String deal_qty_arr = req.getParameter("deal_qty_arr");
if( deal_qty_arr == null){
	System.out.println(this.toString+" : deal_qty_arr is null" );
}else{
	System.out.println(this.toString+" : deal_qty_arr is "+deal_qty_arr );
}
String deal_uprc_arr = req.getParameter("deal_uprc_arr");
if( deal_uprc_arr == null){
	System.out.println(this.toString+" : deal_uprc_arr is null" );
}else{
	System.out.println(this.toString+" : deal_uprc_arr is "+deal_uprc_arr );
}
String dcrate_arr = req.getParameter("dcrate_arr");
if( dcrate_arr == null){
	System.out.println(this.toString+" : dcrate_arr is null" );
}else{
	System.out.println(this.toString+" : dcrate_arr is "+dcrate_arr );
}
String deal_amt_arr = req.getParameter("deal_amt_arr");
if( deal_amt_arr == null){
	System.out.println(this.toString+" : deal_amt_arr is null" );
}else{
	System.out.println(this.toString+" : deal_amt_arr is "+deal_amt_arr );
}
String wh_cd_arr = req.getParameter("wh_cd_arr");
if( wh_cd_arr == null){
	System.out.println(this.toString+" : wh_cd_arr is null" );
}else{
	System.out.println(this.toString+" : wh_cd_arr is "+wh_cd_arr );
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
String deal_dt = Util.checkString(req.getParameter("deal_dt"));
String deal_grp_seq = Util.checkString(req.getParameter("deal_grp_seq"));
String basi_yymm = Util.checkString(req.getParameter("basi_yymm"));
String basi_dt = Util.checkString(req.getParameter("basi_dt"));
String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
String dlco_seq = Util.checkString(req.getParameter("dlco_seq"));
String qty_chk = Util.checkString(req.getParameter("qty_chk"));
String mode_arr = Util.checkString(req.getParameter("mode_arr"));
String deal_seq_arr = Util.checkString(req.getParameter("deal_seq_arr"));
String medi_cd_arr = Util.checkString(req.getParameter("medi_cd_arr"));
String medi_ser_no_arr = Util.checkString(req.getParameter("medi_ser_no_arr"));
String deal_qty_arr = Util.checkString(req.getParameter("deal_qty_arr"));
String deal_uprc_arr = Util.checkString(req.getParameter("deal_uprc_arr"));
String dcrate_arr = Util.checkString(req.getParameter("dcrate_arr"));
String deal_amt_arr = Util.checkString(req.getParameter("deal_amt_arr"));
String wh_cd_arr = Util.checkString(req.getParameter("wh_cd_arr"));
String remk_arr = Util.checkString(req.getParameter("remk_arr"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String acc_flag = Util.Uni2Ksc(Util.checkString(req.getParameter("acc_flag")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String deal_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("deal_dt")));
String deal_grp_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("deal_grp_seq")));
String basi_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("basi_yymm")));
String basi_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("basi_dt")));
String dlco_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd")));
String dlco_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_seq")));
String qty_chk = Util.Uni2Ksc(Util.checkString(req.getParameter("qty_chk")));
String mode_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("mode_arr")));
String deal_seq_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("deal_seq_arr")));
String medi_cd_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd_arr")));
String medi_ser_no_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_ser_no_arr")));
String deal_qty_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("deal_qty_arr")));
String deal_uprc_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("deal_uprc_arr")));
String dcrate_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("dcrate_arr")));
String deal_amt_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("deal_amt_arr")));
String wh_cd_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("wh_cd_arr")));
String remk_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("remk_arr")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setAcc_flag(acc_flag);
dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setDeal_dt(deal_dt);
dm.setDeal_grp_seq(deal_grp_seq);
dm.setBasi_yymm(basi_yymm);
dm.setBasi_dt(basi_dt);
dm.setDlco_cd(dlco_cd);
dm.setDlco_seq(dlco_seq);
dm.setQty_chk(qty_chk);
dm.setMode_arr(mode_arr);
dm.setDeal_seq_arr(deal_seq_arr);
dm.setMedi_cd_arr(medi_cd_arr);
dm.setMedi_ser_no_arr(medi_ser_no_arr);
dm.setDeal_qty_arr(deal_qty_arr);
dm.setDeal_uprc_arr(deal_uprc_arr);
dm.setDcrate_arr(dcrate_arr);
dm.setDeal_amt_arr(deal_amt_arr);
dm.setWh_cd_arr(wh_cd_arr);
dm.setRemk_arr(remk_arr);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 31 20:51:14 KST 2009 */