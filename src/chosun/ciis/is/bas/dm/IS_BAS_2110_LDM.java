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


package chosun.ciis.is.bas.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.bas.ds.*;
import chosun.ciis.is.bas.rec.*;

/**
 * 
 */


public class IS_BAS_2110_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String fr_reg_dt;
	public String to_reg_dt;
	public String chrg_pers;

	public IS_BAS_2110_LDM(){}
	public IS_BAS_2110_LDM(String cmpy_cd, String fr_reg_dt, String to_reg_dt, String chrg_pers){
		this.cmpy_cd = cmpy_cd;
		this.fr_reg_dt = fr_reg_dt;
		this.to_reg_dt = to_reg_dt;
		this.chrg_pers = chrg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFr_reg_dt(String fr_reg_dt){
		this.fr_reg_dt = fr_reg_dt;
	}

	public void setTo_reg_dt(String to_reg_dt){
		this.to_reg_dt = to_reg_dt;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFr_reg_dt(){
		return this.fr_reg_dt;
	}

	public String getTo_reg_dt(){
		return this.to_reg_dt;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_IS_BAS_2110_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		IS_BAS_2110_LDM dm = (IS_BAS_2110_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.fr_reg_dt);
		cstmt.setString(5, dm.to_reg_dt);
		cstmt.setString(6, dm.chrg_pers);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.is.bas.ds.IS_BAS_2110_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("fr_reg_dt = [" + getFr_reg_dt() + "]");
		System.out.println("to_reg_dt = [" + getTo_reg_dt() + "]");
		System.out.println("chrg_pers = [" + getChrg_pers() + "]");
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
String fr_reg_dt = req.getParameter("fr_reg_dt");
if( fr_reg_dt == null){
	System.out.println(this.toString+" : fr_reg_dt is null" );
}else{
	System.out.println(this.toString+" : fr_reg_dt is "+fr_reg_dt );
}
String to_reg_dt = req.getParameter("to_reg_dt");
if( to_reg_dt == null){
	System.out.println(this.toString+" : to_reg_dt is null" );
}else{
	System.out.println(this.toString+" : to_reg_dt is "+to_reg_dt );
}
String chrg_pers = req.getParameter("chrg_pers");
if( chrg_pers == null){
	System.out.println(this.toString+" : chrg_pers is null" );
}else{
	System.out.println(this.toString+" : chrg_pers is "+chrg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String fr_reg_dt = Util.checkString(req.getParameter("fr_reg_dt"));
String to_reg_dt = Util.checkString(req.getParameter("to_reg_dt"));
String chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String fr_reg_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("fr_reg_dt")));
String to_reg_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("to_reg_dt")));
String chrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFr_reg_dt(fr_reg_dt);
dm.setTo_reg_dt(to_reg_dt);
dm.setChrg_pers(chrg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 25 16:31:59 KST 2012 */