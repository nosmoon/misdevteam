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


package chosun.ciis.ad.common.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.common.ds.*;
import chosun.ciis.ad.common.rec.*;

/**
 * 
 */


public class AD_CO_1700_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String medi_cd;
	public String pubc_dt;
	public String gb_cd;
	public String gb_cd2;

	public AD_CO_1700_LDM(){}
	public AD_CO_1700_LDM(String cmpy_cd, String medi_cd, String pubc_dt, String gb_cd, String gb_cd2){
		this.cmpy_cd = cmpy_cd;
		this.medi_cd = medi_cd;
		this.pubc_dt = pubc_dt;
		this.gb_cd = gb_cd;
		this.gb_cd2 = gb_cd2;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setPubc_dt(String pubc_dt){
		this.pubc_dt = pubc_dt;
	}

	public void setGb_cd(String gb_cd){
		this.gb_cd = gb_cd;
	}

	public void setGb_cd2(String gb_cd2){
		this.gb_cd2 = gb_cd2;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getPubc_dt(){
		return this.pubc_dt;
	}

	public String getGb_cd(){
		return this.gb_cd;
	}

	public String getGb_cd2(){
		return this.gb_cd2;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_CO_1700_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_CO_1700_LDM dm = (AD_CO_1700_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.medi_cd);
		cstmt.setString(5, dm.pubc_dt);
		cstmt.setString(6, dm.gb_cd);
		cstmt.setString(7, dm.gb_cd2);
		cstmt.registerOutParameter(8, Types.VARCHAR);
		cstmt.registerOutParameter(9, Types.VARCHAR);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new AD_CO_1700_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("pubc_dt = [" + getPubc_dt() + "]");
		System.out.println("gb_cd = [" + getGb_cd() + "]");
		System.out.println("gb_cd2 = [" + getGb_cd2() + "]");
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
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String pubc_dt = req.getParameter("pubc_dt");
if( pubc_dt == null){
	System.out.println(this.toString+" : pubc_dt is null" );
}else{
	System.out.println(this.toString+" : pubc_dt is "+pubc_dt );
}
String gb_cd = req.getParameter("gb_cd");
if( gb_cd == null){
	System.out.println(this.toString+" : gb_cd is null" );
}else{
	System.out.println(this.toString+" : gb_cd is "+gb_cd );
}
String gb_cd2 = req.getParameter("gb_cd2");
if( gb_cd2 == null){
	System.out.println(this.toString+" : gb_cd2 is null" );
}else{
	System.out.println(this.toString+" : gb_cd2 is "+gb_cd2 );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String pubc_dt = Util.checkString(req.getParameter("pubc_dt"));
String gb_cd = Util.checkString(req.getParameter("gb_cd"));
String gb_cd2 = Util.checkString(req.getParameter("gb_cd2"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String pubc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_dt")));
String gb_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("gb_cd")));
String gb_cd2 = Util.Uni2Ksc(Util.checkString(req.getParameter("gb_cd2")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMedi_cd(medi_cd);
dm.setPubc_dt(pubc_dt);
dm.setGb_cd(gb_cd);
dm.setGb_cd2(gb_cd2);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue May 03 11:24:03 KST 2016 */