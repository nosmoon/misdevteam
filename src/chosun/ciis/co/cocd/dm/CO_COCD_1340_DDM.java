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


package chosun.ciis.co.cocd.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.co.cocd.ds.*;
import chosun.ciis.co.cocd.rec.*;

/**
 * 
 */


public class CO_COCD_1340_DDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String pgm_id;
	public String var_nm;

	public CO_COCD_1340_DDM(){}
	public CO_COCD_1340_DDM(String cmpy_cd, String pgm_id, String var_nm){
		this.cmpy_cd = cmpy_cd;
		this.pgm_id = pgm_id;
		this.var_nm = var_nm;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setPgm_id(String pgm_id){
		this.pgm_id = pgm_id;
	}

	public void setVar_nm(String var_nm){
		this.var_nm = var_nm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getPgm_id(){
		return this.pgm_id;
	}

	public String getVar_nm(){
		return this.var_nm;
	}

	public String getSQL(){
		 return "{ call MISCOM.SP_CO_COCD_1340_D(? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		CO_COCD_1340_DDM dm = (CO_COCD_1340_DDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.pgm_id);
		cstmt.setString(5, dm.var_nm);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.co.cocd.ds.CO_COCD_1340_DDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("pgm_id = [" + getPgm_id() + "]");
		System.out.println("var_nm = [" + getVar_nm() + "]");
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
String pgm_id = req.getParameter("pgm_id");
if( pgm_id == null){
	System.out.println(this.toString+" : pgm_id is null" );
}else{
	System.out.println(this.toString+" : pgm_id is "+pgm_id );
}
String var_nm = req.getParameter("var_nm");
if( var_nm == null){
	System.out.println(this.toString+" : var_nm is null" );
}else{
	System.out.println(this.toString+" : var_nm is "+var_nm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String pgm_id = Util.checkString(req.getParameter("pgm_id"));
String var_nm = Util.checkString(req.getParameter("var_nm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String pgm_id = Util.Uni2Ksc(Util.checkString(req.getParameter("pgm_id")));
String var_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("var_nm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setPgm_id(pgm_id);
dm.setVar_nm(var_nm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Dec 26 15:44:34 KST 2011 */