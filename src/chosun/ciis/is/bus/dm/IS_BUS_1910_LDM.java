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


package chosun.ciis.is.bus.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.bus.ds.*;
import chosun.ciis.is.bus.rec.*;

/**
 * 
 */


public class IS_BUS_1910_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String preng_dt;
	public String spcsale_clsf;

	public IS_BUS_1910_LDM(){}
	public IS_BUS_1910_LDM(String cmpy_cd, String preng_dt, String spcsale_clsf){
		this.cmpy_cd = cmpy_cd;
		this.preng_dt = preng_dt;
		this.spcsale_clsf = spcsale_clsf;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setPreng_dt(String preng_dt){
		this.preng_dt = preng_dt;
	}

	public void setSpcsale_clsf(String spcsale_clsf){
		this.spcsale_clsf = spcsale_clsf;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getPreng_dt(){
		return this.preng_dt;
	}

	public String getSpcsale_clsf(){
		return this.spcsale_clsf;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_IS_BUS_1910_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		IS_BUS_1910_LDM dm = (IS_BUS_1910_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.preng_dt);
		cstmt.setString(5, dm.spcsale_clsf);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.is.bus.ds.IS_BUS_1910_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("preng_dt = [" + getPreng_dt() + "]");
		System.out.println("spcsale_clsf = [" + getSpcsale_clsf() + "]");
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
String preng_dt = req.getParameter("preng_dt");
if( preng_dt == null){
	System.out.println(this.toString+" : preng_dt is null" );
}else{
	System.out.println(this.toString+" : preng_dt is "+preng_dt );
}
String spcsale_clsf = req.getParameter("spcsale_clsf");
if( spcsale_clsf == null){
	System.out.println(this.toString+" : spcsale_clsf is null" );
}else{
	System.out.println(this.toString+" : spcsale_clsf is "+spcsale_clsf );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String preng_dt = Util.checkString(req.getParameter("preng_dt"));
String spcsale_clsf = Util.checkString(req.getParameter("spcsale_clsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String preng_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("preng_dt")));
String spcsale_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("spcsale_clsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setPreng_dt(preng_dt);
dm.setSpcsale_clsf(spcsale_clsf);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jun 20 21:32:03 KST 2012 */