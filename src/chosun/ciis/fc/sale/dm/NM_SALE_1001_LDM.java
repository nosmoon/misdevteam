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


package chosun.ciis.fc.sale.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.sale.ds.*;
import chosun.ciis.fc.sale.rec.*;

/**
 * 
 */


public class NM_SALE_1001_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String bgn_yymm;
	public String end_yymm;
	public String incmg_pers;

	public NM_SALE_1001_LDM(){}
	public NM_SALE_1001_LDM(String cmpy_cd, String bgn_yymm, String end_yymm, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.bgn_yymm = bgn_yymm;
		this.end_yymm = end_yymm;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setBgn_yymm(String bgn_yymm){
		this.bgn_yymm = bgn_yymm;
	}

	public void setEnd_yymm(String end_yymm){
		this.end_yymm = end_yymm;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getBgn_yymm(){
		return this.bgn_yymm;
	}

	public String getEnd_yymm(){
		return this.end_yymm;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_NM_SALE_1001_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		NM_SALE_1001_LDM dm = (NM_SALE_1001_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.bgn_yymm);
		cstmt.setString(5, dm.end_yymm);
		cstmt.setString(6, dm.incmg_pers);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.sale.ds.NM_SALE_1001_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("bgn_yymm = [" + getBgn_yymm() + "]");
		System.out.println("end_yymm = [" + getEnd_yymm() + "]");
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
String bgn_yymm = req.getParameter("bgn_yymm");
if( bgn_yymm == null){
	System.out.println(this.toString+" : bgn_yymm is null" );
}else{
	System.out.println(this.toString+" : bgn_yymm is "+bgn_yymm );
}
String end_yymm = req.getParameter("end_yymm");
if( end_yymm == null){
	System.out.println(this.toString+" : end_yymm is null" );
}else{
	System.out.println(this.toString+" : end_yymm is "+end_yymm );
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
String bgn_yymm = Util.checkString(req.getParameter("bgn_yymm"));
String end_yymm = Util.checkString(req.getParameter("end_yymm"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String bgn_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("bgn_yymm")));
String end_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("end_yymm")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setBgn_yymm(bgn_yymm);
dm.setEnd_yymm(end_yymm);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jun 21 11:31:13 KST 2013 */