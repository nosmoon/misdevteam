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


public class PL_BAS_1530_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String acc_flag;
	public String cmpy_cd;
	public String incmg_pers;
	public String incmg_pers_ip;
	public String yy;
	public String medi_cd;
	public String medi_cd_arr;
	public String dlco_clsf_arr;
	public String basi_yymm_arr;
	public String trgt_qty_arr;
	public String trgt_amt_arr;

	public PL_BAS_1530_ADM(){}
	public PL_BAS_1530_ADM(String acc_flag, String cmpy_cd, String incmg_pers, String incmg_pers_ip, String yy, String medi_cd, String medi_cd_arr, String dlco_clsf_arr, String basi_yymm_arr, String trgt_qty_arr, String trgt_amt_arr){
		this.acc_flag = acc_flag;
		this.cmpy_cd = cmpy_cd;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ip = incmg_pers_ip;
		this.yy = yy;
		this.medi_cd = medi_cd;
		this.medi_cd_arr = medi_cd_arr;
		this.dlco_clsf_arr = dlco_clsf_arr;
		this.basi_yymm_arr = basi_yymm_arr;
		this.trgt_qty_arr = trgt_qty_arr;
		this.trgt_amt_arr = trgt_amt_arr;
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

	public void setYy(String yy){
		this.yy = yy;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMedi_cd_arr(String medi_cd_arr){
		this.medi_cd_arr = medi_cd_arr;
	}

	public void setDlco_clsf_arr(String dlco_clsf_arr){
		this.dlco_clsf_arr = dlco_clsf_arr;
	}

	public void setBasi_yymm_arr(String basi_yymm_arr){
		this.basi_yymm_arr = basi_yymm_arr;
	}

	public void setTrgt_qty_arr(String trgt_qty_arr){
		this.trgt_qty_arr = trgt_qty_arr;
	}

	public void setTrgt_amt_arr(String trgt_amt_arr){
		this.trgt_amt_arr = trgt_amt_arr;
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

	public String getYy(){
		return this.yy;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getMedi_cd_arr(){
		return this.medi_cd_arr;
	}

	public String getDlco_clsf_arr(){
		return this.dlco_clsf_arr;
	}

	public String getBasi_yymm_arr(){
		return this.basi_yymm_arr;
	}

	public String getTrgt_qty_arr(){
		return this.trgt_qty_arr;
	}

	public String getTrgt_amt_arr(){
		return this.trgt_amt_arr;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_PL_BAS_1530_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PL_BAS_1530_ADM dm = (PL_BAS_1530_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.acc_flag);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.incmg_pers);
		cstmt.setString(6, dm.incmg_pers_ip);
		cstmt.setString(7, dm.yy);
		cstmt.setString(8, dm.medi_cd);
		cstmt.setString(9, dm.medi_cd_arr);
		cstmt.setString(10, dm.dlco_clsf_arr);
		cstmt.setString(11, dm.basi_yymm_arr);
		cstmt.setString(12, dm.trgt_qty_arr);
		cstmt.setString(13, dm.trgt_amt_arr);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.pl.bas.ds.PL_BAS_1530_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("acc_flag = [" + getAcc_flag() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("yy = [" + getYy() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("medi_cd_arr = [" + getMedi_cd_arr() + "]");
		System.out.println("dlco_clsf_arr = [" + getDlco_clsf_arr() + "]");
		System.out.println("basi_yymm_arr = [" + getBasi_yymm_arr() + "]");
		System.out.println("trgt_qty_arr = [" + getTrgt_qty_arr() + "]");
		System.out.println("trgt_amt_arr = [" + getTrgt_amt_arr() + "]");
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
String yy = req.getParameter("yy");
if( yy == null){
	System.out.println(this.toString+" : yy is null" );
}else{
	System.out.println(this.toString+" : yy is "+yy );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String medi_cd_arr = req.getParameter("medi_cd_arr");
if( medi_cd_arr == null){
	System.out.println(this.toString+" : medi_cd_arr is null" );
}else{
	System.out.println(this.toString+" : medi_cd_arr is "+medi_cd_arr );
}
String dlco_clsf_arr = req.getParameter("dlco_clsf_arr");
if( dlco_clsf_arr == null){
	System.out.println(this.toString+" : dlco_clsf_arr is null" );
}else{
	System.out.println(this.toString+" : dlco_clsf_arr is "+dlco_clsf_arr );
}
String basi_yymm_arr = req.getParameter("basi_yymm_arr");
if( basi_yymm_arr == null){
	System.out.println(this.toString+" : basi_yymm_arr is null" );
}else{
	System.out.println(this.toString+" : basi_yymm_arr is "+basi_yymm_arr );
}
String trgt_qty_arr = req.getParameter("trgt_qty_arr");
if( trgt_qty_arr == null){
	System.out.println(this.toString+" : trgt_qty_arr is null" );
}else{
	System.out.println(this.toString+" : trgt_qty_arr is "+trgt_qty_arr );
}
String trgt_amt_arr = req.getParameter("trgt_amt_arr");
if( trgt_amt_arr == null){
	System.out.println(this.toString+" : trgt_amt_arr is null" );
}else{
	System.out.println(this.toString+" : trgt_amt_arr is "+trgt_amt_arr );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String acc_flag = Util.checkString(req.getParameter("acc_flag"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String yy = Util.checkString(req.getParameter("yy"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String medi_cd_arr = Util.checkString(req.getParameter("medi_cd_arr"));
String dlco_clsf_arr = Util.checkString(req.getParameter("dlco_clsf_arr"));
String basi_yymm_arr = Util.checkString(req.getParameter("basi_yymm_arr"));
String trgt_qty_arr = Util.checkString(req.getParameter("trgt_qty_arr"));
String trgt_amt_arr = Util.checkString(req.getParameter("trgt_amt_arr"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String acc_flag = Util.Uni2Ksc(Util.checkString(req.getParameter("acc_flag")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String yy = Util.Uni2Ksc(Util.checkString(req.getParameter("yy")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String medi_cd_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd_arr")));
String dlco_clsf_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf_arr")));
String basi_yymm_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("basi_yymm_arr")));
String trgt_qty_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("trgt_qty_arr")));
String trgt_amt_arr = Util.Uni2Ksc(Util.checkString(req.getParameter("trgt_amt_arr")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setAcc_flag(acc_flag);
dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setYy(yy);
dm.setMedi_cd(medi_cd);
dm.setMedi_cd_arr(medi_cd_arr);
dm.setDlco_clsf_arr(dlco_clsf_arr);
dm.setBasi_yymm_arr(basi_yymm_arr);
dm.setTrgt_qty_arr(trgt_qty_arr);
dm.setTrgt_amt_arr(trgt_amt_arr);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 30 14:29:47 KST 2009 */