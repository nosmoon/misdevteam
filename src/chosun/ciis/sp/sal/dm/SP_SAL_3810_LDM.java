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


public class SP_SAL_3810_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String sale_yymm_fr;
	public String sale_yymm_to;
	public String sale_item_cd;
	public String dlco_clsf_cd_seq;
	public String incmg_dept_cd;
	public String incmg_pers;

	public SP_SAL_3810_LDM(){}
	public SP_SAL_3810_LDM(String cmpy_cd, String sale_yymm_fr, String sale_yymm_to, String sale_item_cd, String dlco_clsf_cd_seq, String incmg_dept_cd, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.sale_yymm_fr = sale_yymm_fr;
		this.sale_yymm_to = sale_yymm_to;
		this.sale_item_cd = sale_item_cd;
		this.dlco_clsf_cd_seq = dlco_clsf_cd_seq;
		this.incmg_dept_cd = incmg_dept_cd;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSale_yymm_fr(String sale_yymm_fr){
		this.sale_yymm_fr = sale_yymm_fr;
	}

	public void setSale_yymm_to(String sale_yymm_to){
		this.sale_yymm_to = sale_yymm_to;
	}

	public void setSale_item_cd(String sale_item_cd){
		this.sale_item_cd = sale_item_cd;
	}

	public void setDlco_clsf_cd_seq(String dlco_clsf_cd_seq){
		this.dlco_clsf_cd_seq = dlco_clsf_cd_seq;
	}

	public void setIncmg_dept_cd(String incmg_dept_cd){
		this.incmg_dept_cd = incmg_dept_cd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSale_yymm_fr(){
		return this.sale_yymm_fr;
	}

	public String getSale_yymm_to(){
		return this.sale_yymm_to;
	}

	public String getSale_item_cd(){
		return this.sale_item_cd;
	}

	public String getDlco_clsf_cd_seq(){
		return this.dlco_clsf_cd_seq;
	}

	public String getIncmg_dept_cd(){
		return this.incmg_dept_cd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_SP_SAL_3810_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SP_SAL_3810_LDM dm = (SP_SAL_3810_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.sale_yymm_fr);
		cstmt.setString(5, dm.sale_yymm_to);
		cstmt.setString(6, dm.sale_item_cd);
		cstmt.setString(7, dm.dlco_clsf_cd_seq);
		cstmt.setString(8, dm.incmg_dept_cd);
		cstmt.setString(9, dm.incmg_pers);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.sp.sal.ds.SP_SAL_3810_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("sale_yymm_fr = [" + getSale_yymm_fr() + "]");
		System.out.println("sale_yymm_to = [" + getSale_yymm_to() + "]");
		System.out.println("sale_item_cd = [" + getSale_item_cd() + "]");
		System.out.println("dlco_clsf_cd_seq = [" + getDlco_clsf_cd_seq() + "]");
		System.out.println("incmg_dept_cd = [" + getIncmg_dept_cd() + "]");
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
String sale_yymm_fr = req.getParameter("sale_yymm_fr");
if( sale_yymm_fr == null){
	System.out.println(this.toString+" : sale_yymm_fr is null" );
}else{
	System.out.println(this.toString+" : sale_yymm_fr is "+sale_yymm_fr );
}
String sale_yymm_to = req.getParameter("sale_yymm_to");
if( sale_yymm_to == null){
	System.out.println(this.toString+" : sale_yymm_to is null" );
}else{
	System.out.println(this.toString+" : sale_yymm_to is "+sale_yymm_to );
}
String sale_item_cd = req.getParameter("sale_item_cd");
if( sale_item_cd == null){
	System.out.println(this.toString+" : sale_item_cd is null" );
}else{
	System.out.println(this.toString+" : sale_item_cd is "+sale_item_cd );
}
String dlco_clsf_cd_seq = req.getParameter("dlco_clsf_cd_seq");
if( dlco_clsf_cd_seq == null){
	System.out.println(this.toString+" : dlco_clsf_cd_seq is null" );
}else{
	System.out.println(this.toString+" : dlco_clsf_cd_seq is "+dlco_clsf_cd_seq );
}
String incmg_dept_cd = req.getParameter("incmg_dept_cd");
if( incmg_dept_cd == null){
	System.out.println(this.toString+" : incmg_dept_cd is null" );
}else{
	System.out.println(this.toString+" : incmg_dept_cd is "+incmg_dept_cd );
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
String sale_yymm_fr = Util.checkString(req.getParameter("sale_yymm_fr"));
String sale_yymm_to = Util.checkString(req.getParameter("sale_yymm_to"));
String sale_item_cd = Util.checkString(req.getParameter("sale_item_cd"));
String dlco_clsf_cd_seq = Util.checkString(req.getParameter("dlco_clsf_cd_seq"));
String incmg_dept_cd = Util.checkString(req.getParameter("incmg_dept_cd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String sale_yymm_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_yymm_fr")));
String sale_yymm_to = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_yymm_to")));
String sale_item_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_item_cd")));
String dlco_clsf_cd_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf_cd_seq")));
String incmg_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_dept_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSale_yymm_fr(sale_yymm_fr);
dm.setSale_yymm_to(sale_yymm_to);
dm.setSale_item_cd(sale_item_cd);
dm.setDlco_clsf_cd_seq(dlco_clsf_cd_seq);
dm.setIncmg_dept_cd(incmg_dept_cd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Aug 02 17:04:49 KST 2012 */