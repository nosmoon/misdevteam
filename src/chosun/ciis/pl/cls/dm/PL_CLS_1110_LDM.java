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


package chosun.ciis.pl.cls.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pl.cls.ds.*;
import chosun.ciis.pl.cls.rec.*;

/**
 * 
 */


public class PL_CLS_1110_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String incmg_pers;
	public String medi_clsf;
	public String basi_dt_fr;
	public String basi_dt_to;

	public PL_CLS_1110_LDM(){}
	public PL_CLS_1110_LDM(String cmpy_cd, String incmg_pers, String medi_clsf, String basi_dt_fr, String basi_dt_to){
		this.cmpy_cd = cmpy_cd;
		this.incmg_pers = incmg_pers;
		this.medi_clsf = medi_clsf;
		this.basi_dt_fr = basi_dt_fr;
		this.basi_dt_to = basi_dt_to;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setMedi_clsf(String medi_clsf){
		this.medi_clsf = medi_clsf;
	}

	public void setBasi_dt_fr(String basi_dt_fr){
		this.basi_dt_fr = basi_dt_fr;
	}

	public void setBasi_dt_to(String basi_dt_to){
		this.basi_dt_to = basi_dt_to;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getMedi_clsf(){
		return this.medi_clsf;
	}

	public String getBasi_dt_fr(){
		return this.basi_dt_fr;
	}

	public String getBasi_dt_to(){
		return this.basi_dt_to;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_PL_CLS_1110_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PL_CLS_1110_LDM dm = (PL_CLS_1110_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.incmg_pers);
		cstmt.setString(5, dm.medi_clsf);
		cstmt.setString(6, dm.basi_dt_fr);
		cstmt.setString(7, dm.basi_dt_to);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.pl.cls.ds.PL_CLS_1110_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("medi_clsf = [" + getMedi_clsf() + "]");
		System.out.println("basi_dt_fr = [" + getBasi_dt_fr() + "]");
		System.out.println("basi_dt_to = [" + getBasi_dt_to() + "]");
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
String medi_clsf = req.getParameter("medi_clsf");
if( medi_clsf == null){
	System.out.println(this.toString+" : medi_clsf is null" );
}else{
	System.out.println(this.toString+" : medi_clsf is "+medi_clsf );
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String medi_clsf = Util.checkString(req.getParameter("medi_clsf"));
String basi_dt_fr = Util.checkString(req.getParameter("basi_dt_fr"));
String basi_dt_to = Util.checkString(req.getParameter("basi_dt_to"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String medi_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_clsf")));
String basi_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("basi_dt_fr")));
String basi_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("basi_dt_to")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_pers(incmg_pers);
dm.setMedi_clsf(medi_clsf);
dm.setBasi_dt_fr(basi_dt_fr);
dm.setBasi_dt_to(basi_dt_to);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 11 20:35:50 KST 2009 */