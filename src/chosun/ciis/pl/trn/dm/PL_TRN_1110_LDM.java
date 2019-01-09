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


package chosun.ciis.pl.trn.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pl.trn.ds.*;
import chosun.ciis.pl.trn.rec.*;

/**
 * 
 */


public class PL_TRN_1110_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String incmg_pers;
	public String basi_dt_fr;
	public String basi_dt_to;
	public String medi_cd;
	public String medi_ser_no;

	public PL_TRN_1110_LDM(){}
	public PL_TRN_1110_LDM(String cmpy_cd, String incmg_pers, String basi_dt_fr, String basi_dt_to, String medi_cd, String medi_ser_no){
		this.cmpy_cd = cmpy_cd;
		this.incmg_pers = incmg_pers;
		this.basi_dt_fr = basi_dt_fr;
		this.basi_dt_to = basi_dt_to;
		this.medi_cd = medi_cd;
		this.medi_ser_no = medi_ser_no;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setBasi_dt_fr(String basi_dt_fr){
		this.basi_dt_fr = basi_dt_fr;
	}

	public void setBasi_dt_to(String basi_dt_to){
		this.basi_dt_to = basi_dt_to;
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

	public String getBasi_dt_fr(){
		return this.basi_dt_fr;
	}

	public String getBasi_dt_to(){
		return this.basi_dt_to;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getMedi_ser_no(){
		return this.medi_ser_no;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_PL_TRN_1110_L(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PL_TRN_1110_LDM dm = (PL_TRN_1110_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.incmg_pers);
		cstmt.setString(5, dm.basi_dt_fr);
		cstmt.setString(6, dm.basi_dt_to);
		cstmt.setString(7, dm.medi_cd);
		cstmt.setString(8, dm.medi_ser_no);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.pl.trn.ds.PL_TRN_1110_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("basi_dt_fr = [" + getBasi_dt_fr() + "]");
		System.out.println("basi_dt_to = [" + getBasi_dt_to() + "]");
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
String basi_dt_fr = req.getParameter("basi_dt_fr");
if( basi_dt_fr == null){
	System.out.println(this.toString+" : basi_dt_fr is null" );
}else{
	System.out.println(this.toString+" : basi_dt_fr is "+basi_dt_fr );
}
String basi_dt_to = req.getParameter("basi_dt_to");
if( basi_dt_to == null){
	System.out.println(this.toString+" : basi_dt_to is null" );
}else{
	System.out.println(this.toString+" : basi_dt_to is "+basi_dt_to );
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
String basi_dt_fr = Util.checkString(req.getParameter("basi_dt_fr"));
String basi_dt_to = Util.checkString(req.getParameter("basi_dt_to"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String medi_ser_no = Util.checkString(req.getParameter("medi_ser_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String basi_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("basi_dt_fr")));
String basi_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("basi_dt_to")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String medi_ser_no = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_ser_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_pers(incmg_pers);
dm.setBasi_dt_fr(basi_dt_fr);
dm.setBasi_dt_to(basi_dt_to);
dm.setMedi_cd(medi_cd);
dm.setMedi_ser_no(medi_ser_no);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 01 16:59:58 KST 2009 */