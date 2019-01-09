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


package chosun.ciis.sp.sal.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.sp.sal.ds.*;
import chosun.ciis.sp.sal.rec.*;

/**
 * 
 */


public class SP_SAL_1710_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String fr_sale_yymm;
	public String to_sale_yymm;
	public String incmg_pers;

	public SP_SAL_1710_LDM(){}
	public SP_SAL_1710_LDM(String cmpy_cd, String fr_sale_yymm, String to_sale_yymm, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.fr_sale_yymm = fr_sale_yymm;
		this.to_sale_yymm = to_sale_yymm;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFr_sale_yymm(String fr_sale_yymm){
		this.fr_sale_yymm = fr_sale_yymm;
	}

	public void setTo_sale_yymm(String to_sale_yymm){
		this.to_sale_yymm = to_sale_yymm;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFr_sale_yymm(){
		return this.fr_sale_yymm;
	}

	public String getTo_sale_yymm(){
		return this.to_sale_yymm;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_SP_SAL_1710_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SP_SAL_1710_LDM dm = (SP_SAL_1710_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.fr_sale_yymm);
		cstmt.setString(5, dm.to_sale_yymm);
		cstmt.setString(6, dm.incmg_pers);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.sp.sal.ds.SP_SAL_1710_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("fr_sale_yymm = [" + getFr_sale_yymm() + "]");
		System.out.println("to_sale_yymm = [" + getTo_sale_yymm() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
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
String fr_sale_yymm = req.getParameter("fr_sale_yymm");
if( fr_sale_yymm == null){
	System.out.println(this.toString+" : fr_sale_yymm is null" );
}else{
	System.out.println(this.toString+" : fr_sale_yymm is "+fr_sale_yymm );
}
String to_sale_yymm = req.getParameter("to_sale_yymm");
if( to_sale_yymm == null){
	System.out.println(this.toString+" : to_sale_yymm is null" );
}else{
	System.out.println(this.toString+" : to_sale_yymm is "+to_sale_yymm );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String fr_sale_yymm = Util.checkString(req.getParameter("fr_sale_yymm"));
String to_sale_yymm = Util.checkString(req.getParameter("to_sale_yymm"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String fr_sale_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("fr_sale_yymm")));
String to_sale_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("to_sale_yymm")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFr_sale_yymm(fr_sale_yymm);
dm.setTo_sale_yymm(to_sale_yymm);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jul 19 19:48:11 KST 2012 */