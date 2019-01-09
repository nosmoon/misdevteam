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

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.dep.ds.*;
import chosun.ciis.ad.dep.rec.*;

/**
 * 
 */


public class AD_DEP_2610_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String hndl_clsf;
	public String medi_cd;
	public String frdt;
	public String todt;
	public String basic_dt;
	public String security_dt;
	public String misu_clsf;

	public AD_DEP_2610_LDM(){}
	public AD_DEP_2610_LDM(String cmpy_cd, String hndl_clsf, String medi_cd, String frdt, String todt, String basic_dt, String security_dt, String misu_clsf){
		this.cmpy_cd = cmpy_cd;
		this.hndl_clsf = hndl_clsf;
		this.medi_cd = medi_cd;
		this.frdt = frdt;
		this.todt = todt;
		this.basic_dt = basic_dt;
		this.security_dt = security_dt;
		this.misu_clsf = misu_clsf;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setHndl_clsf(String hndl_clsf){
		this.hndl_clsf = hndl_clsf;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setBasic_dt(String basic_dt){
		this.basic_dt = basic_dt;
	}

	public void setSecurity_dt(String security_dt){
		this.security_dt = security_dt;
	}

	public void setMisu_clsf(String misu_clsf){
		this.misu_clsf = misu_clsf;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getHndl_clsf(){
		return this.hndl_clsf;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getBasic_dt(){
		return this.basic_dt;
	}

	public String getSecurity_dt(){
		return this.security_dt;
	}

	public String getMisu_clsf(){
		return this.misu_clsf;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_DEP_2610_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_DEP_2610_LDM dm = (AD_DEP_2610_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.hndl_clsf);
		cstmt.setString(5, dm.medi_cd);
		cstmt.setString(6, dm.frdt);
		cstmt.setString(7, dm.todt);
		cstmt.setString(8, dm.basic_dt);
		cstmt.setString(9, dm.security_dt);
		cstmt.setString(10, dm.misu_clsf);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.dep.ds.AD_DEP_2610_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("hndl_clsf = [" + getHndl_clsf() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("frdt = [" + getFrdt() + "]");
		System.out.println("todt = [" + getTodt() + "]");
		System.out.println("basic_dt = [" + getBasic_dt() + "]");
		System.out.println("security_dt = [" + getSecurity_dt() + "]");
		System.out.println("misu_clsf = [" + getMisu_clsf() + "]");
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
String hndl_clsf = req.getParameter("hndl_clsf");
if( hndl_clsf == null){
	System.out.println(this.toString+" : hndl_clsf is null" );
}else{
	System.out.println(this.toString+" : hndl_clsf is "+hndl_clsf );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
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
String basic_dt = req.getParameter("basic_dt");
if( basic_dt == null){
	System.out.println(this.toString+" : basic_dt is null" );
}else{
	System.out.println(this.toString+" : basic_dt is "+basic_dt );
}
String security_dt = req.getParameter("security_dt");
if( security_dt == null){
	System.out.println(this.toString+" : security_dt is null" );
}else{
	System.out.println(this.toString+" : security_dt is "+security_dt );
}
String misu_clsf = req.getParameter("misu_clsf");
if( misu_clsf == null){
	System.out.println(this.toString+" : misu_clsf is null" );
}else{
	System.out.println(this.toString+" : misu_clsf is "+misu_clsf );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String hndl_clsf = Util.checkString(req.getParameter("hndl_clsf"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
String basic_dt = Util.checkString(req.getParameter("basic_dt"));
String security_dt = Util.checkString(req.getParameter("security_dt"));
String misu_clsf = Util.checkString(req.getParameter("misu_clsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String hndl_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("hndl_clsf")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String basic_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("basic_dt")));
String security_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("security_dt")));
String misu_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("misu_clsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setHndl_clsf(hndl_clsf);
dm.setMedi_cd(medi_cd);
dm.setFrdt(frdt);
dm.setTodt(todt);
dm.setBasic_dt(basic_dt);
dm.setSecurity_dt(security_dt);
dm.setMisu_clsf(misu_clsf);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Feb 25 17:59:00 KST 2015 */