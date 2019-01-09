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


package chosun.ciis.pl.sal.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pl.sal.ds.*;
import chosun.ciis.pl.sal.rec.*;

/**
 * 
 */


public class PL_SAL_3110_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String incmg_pers;
	public String basi_dt;
	public String medi_clsf;
	public String basi_yymm;
	public String medi_cd;
	public String medi_ser_no;
	public String sendclsf;
	public String dlco_clsf;
	public String dlco_cd;
	public String dlco_seq;

	public PL_SAL_3110_LDM(){}
	public PL_SAL_3110_LDM(String cmpy_cd, String incmg_pers, String basi_dt, String medi_clsf, String basi_yymm, String medi_cd, String medi_ser_no, String sendclsf, String dlco_clsf, String dlco_cd, String dlco_seq){
		this.cmpy_cd = cmpy_cd;
		this.incmg_pers = incmg_pers;
		this.basi_dt = basi_dt;
		this.medi_clsf = medi_clsf;
		this.basi_yymm = basi_yymm;
		this.medi_cd = medi_cd;
		this.medi_ser_no = medi_ser_no;
		this.sendclsf = sendclsf;
		this.dlco_clsf = dlco_clsf;
		this.dlco_cd = dlco_cd;
		this.dlco_seq = dlco_seq;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setBasi_dt(String basi_dt){
		this.basi_dt = basi_dt;
	}

	public void setMedi_clsf(String medi_clsf){
		this.medi_clsf = medi_clsf;
	}

	public void setBasi_yymm(String basi_yymm){
		this.basi_yymm = basi_yymm;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMedi_ser_no(String medi_ser_no){
		this.medi_ser_no = medi_ser_no;
	}

	public void setSendclsf(String sendclsf){
		this.sendclsf = sendclsf;
	}

	public void setDlco_clsf(String dlco_clsf){
		this.dlco_clsf = dlco_clsf;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setDlco_seq(String dlco_seq){
		this.dlco_seq = dlco_seq;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getBasi_dt(){
		return this.basi_dt;
	}

	public String getMedi_clsf(){
		return this.medi_clsf;
	}

	public String getBasi_yymm(){
		return this.basi_yymm;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getMedi_ser_no(){
		return this.medi_ser_no;
	}

	public String getSendclsf(){
		return this.sendclsf;
	}

	public String getDlco_clsf(){
		return this.dlco_clsf;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getDlco_seq(){
		return this.dlco_seq;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_PL_SAL_3110_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PL_SAL_3110_LDM dm = (PL_SAL_3110_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.incmg_pers);
		cstmt.setString(5, dm.basi_dt);
		cstmt.setString(6, dm.medi_clsf);
		cstmt.setString(7, dm.basi_yymm);
		cstmt.setString(8, dm.medi_cd);
		cstmt.setString(9, dm.medi_ser_no);
		cstmt.setString(10, dm.sendclsf);
		cstmt.setString(11, dm.dlco_clsf);
		cstmt.setString(12, dm.dlco_cd);
		cstmt.setString(13, dm.dlco_seq);
		cstmt.registerOutParameter(14, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.pl.sal.ds.PL_SAL_3110_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("basi_dt = [" + getBasi_dt() + "]");
		System.out.println("medi_clsf = [" + getMedi_clsf() + "]");
		System.out.println("basi_yymm = [" + getBasi_yymm() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("medi_ser_no = [" + getMedi_ser_no() + "]");
		System.out.println("sendclsf = [" + getSendclsf() + "]");
		System.out.println("dlco_clsf = [" + getDlco_clsf() + "]");
		System.out.println("dlco_cd = [" + getDlco_cd() + "]");
		System.out.println("dlco_seq = [" + getDlco_seq() + "]");
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
String basi_dt = req.getParameter("basi_dt");
if( basi_dt == null){
	System.out.println(this.toString+" : basi_dt is null" );
}else{
	System.out.println(this.toString+" : basi_dt is "+basi_dt );
}
String medi_clsf = req.getParameter("medi_clsf");
if( medi_clsf == null){
	System.out.println(this.toString+" : medi_clsf is null" );
}else{
	System.out.println(this.toString+" : medi_clsf is "+medi_clsf );
}
String basi_yymm = req.getParameter("basi_yymm");
if( basi_yymm == null){
	System.out.println(this.toString+" : basi_yymm is null" );
}else{
	System.out.println(this.toString+" : basi_yymm is "+basi_yymm );
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
String sendclsf = req.getParameter("sendclsf");
if( sendclsf == null){
	System.out.println(this.toString+" : sendclsf is null" );
}else{
	System.out.println(this.toString+" : sendclsf is "+sendclsf );
}
String dlco_clsf = req.getParameter("dlco_clsf");
if( dlco_clsf == null){
	System.out.println(this.toString+" : dlco_clsf is null" );
}else{
	System.out.println(this.toString+" : dlco_clsf is "+dlco_clsf );
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String basi_dt = Util.checkString(req.getParameter("basi_dt"));
String medi_clsf = Util.checkString(req.getParameter("medi_clsf"));
String basi_yymm = Util.checkString(req.getParameter("basi_yymm"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String medi_ser_no = Util.checkString(req.getParameter("medi_ser_no"));
String sendclsf = Util.checkString(req.getParameter("sendclsf"));
String dlco_clsf = Util.checkString(req.getParameter("dlco_clsf"));
String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
String dlco_seq = Util.checkString(req.getParameter("dlco_seq"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String basi_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("basi_dt")));
String medi_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_clsf")));
String basi_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("basi_yymm")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String medi_ser_no = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_ser_no")));
String sendclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("sendclsf")));
String dlco_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf")));
String dlco_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd")));
String dlco_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_seq")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_pers(incmg_pers);
dm.setBasi_dt(basi_dt);
dm.setMedi_clsf(medi_clsf);
dm.setBasi_yymm(basi_yymm);
dm.setMedi_cd(medi_cd);
dm.setMedi_ser_no(medi_ser_no);
dm.setSendclsf(sendclsf);
dm.setDlco_clsf(dlco_clsf);
dm.setDlco_cd(dlco_cd);
dm.setDlco_seq(dlco_seq);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 08 18:05:51 KST 2009 */