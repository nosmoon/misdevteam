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


package chosun.ciis.pl.lst.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pl.lst.ds.*;
import chosun.ciis.pl.lst.rec.*;

/**
 * 
 */


public class PL_LST_1710_PDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String incmg_pers;
	public String fr_dt;
	public String to_dt;
	public String kyobo_yn;
	public String wh_cd;
	public String deal_clsf;
	public String issu_cmpy;
	public String dlco_cd;
	public String dlco_seq;
	public String medi_cd;
	public String medi_ser_no;

	public PL_LST_1710_PDM(){}
	public PL_LST_1710_PDM(String cmpy_cd, String incmg_pers, String fr_dt, String to_dt, String kyobo_yn, String wh_cd, String deal_clsf, String issu_cmpy, String dlco_cd, String dlco_seq, String medi_cd, String medi_ser_no){
		this.cmpy_cd = cmpy_cd;
		this.incmg_pers = incmg_pers;
		this.fr_dt = fr_dt;
		this.to_dt = to_dt;
		this.kyobo_yn = kyobo_yn;
		this.wh_cd = wh_cd;
		this.deal_clsf = deal_clsf;
		this.issu_cmpy = issu_cmpy;
		this.dlco_cd = dlco_cd;
		this.dlco_seq = dlco_seq;
		this.medi_cd = medi_cd;
		this.medi_ser_no = medi_ser_no;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setFr_dt(String fr_dt){
		this.fr_dt = fr_dt;
	}

	public void setTo_dt(String to_dt){
		this.to_dt = to_dt;
	}

	public void setKyobo_yn(String kyobo_yn){
		this.kyobo_yn = kyobo_yn;
	}

	public void setWh_cd(String wh_cd){
		this.wh_cd = wh_cd;
	}

	public void setDeal_clsf(String deal_clsf){
		this.deal_clsf = deal_clsf;
	}

	public void setIssu_cmpy(String issu_cmpy){
		this.issu_cmpy = issu_cmpy;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setDlco_seq(String dlco_seq){
		this.dlco_seq = dlco_seq;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMedi_ser_no(String medi_ser_no){
		this.medi_ser_no = medi_ser_no;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getFr_dt(){
		return this.fr_dt;
	}

	public String getTo_dt(){
		return this.to_dt;
	}

	public String getKyobo_yn(){
		return this.kyobo_yn;
	}

	public String getWh_cd(){
		return this.wh_cd;
	}

	public String getDeal_clsf(){
		return this.deal_clsf;
	}

	public String getIssu_cmpy(){
		return this.issu_cmpy;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getDlco_seq(){
		return this.dlco_seq;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getMedi_ser_no(){
		return this.medi_ser_no;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_PL_LST_1710_P(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PL_LST_1710_PDM dm = (PL_LST_1710_PDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.incmg_pers);
		cstmt.setString(5, dm.fr_dt);
		cstmt.setString(6, dm.to_dt);
		cstmt.setString(7, dm.kyobo_yn);
		cstmt.setString(8, dm.wh_cd);
		cstmt.setString(9, dm.deal_clsf);
		cstmt.setString(10, dm.issu_cmpy);
		cstmt.setString(11, dm.dlco_cd);
		cstmt.setString(12, dm.dlco_seq);
		cstmt.setString(13, dm.medi_cd);
		cstmt.setString(14, dm.medi_ser_no);
		cstmt.registerOutParameter(15, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.pl.lst.ds.PL_LST_1710_PDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("fr_dt = [" + getFr_dt() + "]");
		System.out.println("to_dt = [" + getTo_dt() + "]");
		System.out.println("kyobo_yn = [" + getKyobo_yn() + "]");
		System.out.println("wh_cd = [" + getWh_cd() + "]");
		System.out.println("deal_clsf = [" + getDeal_clsf() + "]");
		System.out.println("issu_cmpy = [" + getIssu_cmpy() + "]");
		System.out.println("dlco_cd = [" + getDlco_cd() + "]");
		System.out.println("dlco_seq = [" + getDlco_seq() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("medi_ser_no = [" + getMedi_ser_no() + "]");
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
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String fr_dt = req.getParameter("fr_dt");
if( fr_dt == null){
	System.out.println(this.toString+" : fr_dt is null" );
}else{
	System.out.println(this.toString+" : fr_dt is "+fr_dt );
}
String to_dt = req.getParameter("to_dt");
if( to_dt == null){
	System.out.println(this.toString+" : to_dt is null" );
}else{
	System.out.println(this.toString+" : to_dt is "+to_dt );
}
String kyobo_yn = req.getParameter("kyobo_yn");
if( kyobo_yn == null){
	System.out.println(this.toString+" : kyobo_yn is null" );
}else{
	System.out.println(this.toString+" : kyobo_yn is "+kyobo_yn );
}
String wh_cd = req.getParameter("wh_cd");
if( wh_cd == null){
	System.out.println(this.toString+" : wh_cd is null" );
}else{
	System.out.println(this.toString+" : wh_cd is "+wh_cd );
}
String deal_clsf = req.getParameter("deal_clsf");
if( deal_clsf == null){
	System.out.println(this.toString+" : deal_clsf is null" );
}else{
	System.out.println(this.toString+" : deal_clsf is "+deal_clsf );
}
String issu_cmpy = req.getParameter("issu_cmpy");
if( issu_cmpy == null){
	System.out.println(this.toString+" : issu_cmpy is null" );
}else{
	System.out.println(this.toString+" : issu_cmpy is "+issu_cmpy );
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
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String medi_ser_no = req.getParameter("medi_ser_no");
if( medi_ser_no == null){
	System.out.println(this.toString+" : medi_ser_no is null" );
}else{
	System.out.println(this.toString+" : medi_ser_no is "+medi_ser_no );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String fr_dt = Util.checkString(req.getParameter("fr_dt"));
String to_dt = Util.checkString(req.getParameter("to_dt"));
String kyobo_yn = Util.checkString(req.getParameter("kyobo_yn"));
String wh_cd = Util.checkString(req.getParameter("wh_cd"));
String deal_clsf = Util.checkString(req.getParameter("deal_clsf"));
String issu_cmpy = Util.checkString(req.getParameter("issu_cmpy"));
String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
String dlco_seq = Util.checkString(req.getParameter("dlco_seq"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String medi_ser_no = Util.checkString(req.getParameter("medi_ser_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String fr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("fr_dt")));
String to_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("to_dt")));
String kyobo_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("kyobo_yn")));
String wh_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("wh_cd")));
String deal_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("deal_clsf")));
String issu_cmpy = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_cmpy")));
String dlco_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd")));
String dlco_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_seq")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String medi_ser_no = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_ser_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_pers(incmg_pers);
dm.setFr_dt(fr_dt);
dm.setTo_dt(to_dt);
dm.setKyobo_yn(kyobo_yn);
dm.setWh_cd(wh_cd);
dm.setDeal_clsf(deal_clsf);
dm.setIssu_cmpy(issu_cmpy);
dm.setDlco_cd(dlco_cd);
dm.setDlco_seq(dlco_seq);
dm.setMedi_cd(medi_cd);
dm.setMedi_ser_no(medi_ser_no);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jun 26 18:47:04 KST 2013 */