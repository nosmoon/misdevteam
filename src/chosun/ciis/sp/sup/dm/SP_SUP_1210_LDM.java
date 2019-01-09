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


package chosun.ciis.sp.sup.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.sp.sup.ds.*;
import chosun.ciis.sp.sup.rec.*;

/**
 * 
 */


public class SP_SUP_1210_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String chrg_pers_clsf;
	public String sp_comp_chrg_pers_emp_no;
	public String area_cd;
	public String adms_dstc_cd;

	public SP_SUP_1210_LDM(){}
	public SP_SUP_1210_LDM(String cmpy_cd, String chrg_pers_clsf, String sp_comp_chrg_pers_emp_no, String area_cd, String adms_dstc_cd){
		this.cmpy_cd = cmpy_cd;
		this.chrg_pers_clsf = chrg_pers_clsf;
		this.sp_comp_chrg_pers_emp_no = sp_comp_chrg_pers_emp_no;
		this.area_cd = area_cd;
		this.adms_dstc_cd = adms_dstc_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setChrg_pers_clsf(String chrg_pers_clsf){
		this.chrg_pers_clsf = chrg_pers_clsf;
	}

	public void setSp_comp_chrg_pers_emp_no(String sp_comp_chrg_pers_emp_no){
		this.sp_comp_chrg_pers_emp_no = sp_comp_chrg_pers_emp_no;
	}

	public void setArea_cd(String area_cd){
		this.area_cd = area_cd;
	}

	public void setAdms_dstc_cd(String adms_dstc_cd){
		this.adms_dstc_cd = adms_dstc_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getChrg_pers_clsf(){
		return this.chrg_pers_clsf;
	}

	public String getSp_comp_chrg_pers_emp_no(){
		return this.sp_comp_chrg_pers_emp_no;
	}

	public String getArea_cd(){
		return this.area_cd;
	}

	public String getAdms_dstc_cd(){
		return this.adms_dstc_cd;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_SP_SUP_1210_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SP_SUP_1210_LDM dm = (SP_SUP_1210_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.chrg_pers_clsf);
		cstmt.setString(5, dm.sp_comp_chrg_pers_emp_no);
		cstmt.setString(6, dm.area_cd);
		cstmt.setString(7, dm.adms_dstc_cd);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.sp.sup.ds.SP_SUP_1210_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("chrg_pers_clsf = [" + getChrg_pers_clsf() + "]");
		System.out.println("sp_comp_chrg_pers_emp_no = [" + getSp_comp_chrg_pers_emp_no() + "]");
		System.out.println("area_cd = [" + getArea_cd() + "]");
		System.out.println("adms_dstc_cd = [" + getAdms_dstc_cd() + "]");
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
String chrg_pers_clsf = req.getParameter("chrg_pers_clsf");
if( chrg_pers_clsf == null){
	System.out.println(this.toString+" : chrg_pers_clsf is null" );
}else{
	System.out.println(this.toString+" : chrg_pers_clsf is "+chrg_pers_clsf );
}
String sp_comp_chrg_pers_emp_no = req.getParameter("sp_comp_chrg_pers_emp_no");
if( sp_comp_chrg_pers_emp_no == null){
	System.out.println(this.toString+" : sp_comp_chrg_pers_emp_no is null" );
}else{
	System.out.println(this.toString+" : sp_comp_chrg_pers_emp_no is "+sp_comp_chrg_pers_emp_no );
}
String area_cd = req.getParameter("area_cd");
if( area_cd == null){
	System.out.println(this.toString+" : area_cd is null" );
}else{
	System.out.println(this.toString+" : area_cd is "+area_cd );
}
String adms_dstc_cd = req.getParameter("adms_dstc_cd");
if( adms_dstc_cd == null){
	System.out.println(this.toString+" : adms_dstc_cd is null" );
}else{
	System.out.println(this.toString+" : adms_dstc_cd is "+adms_dstc_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String chrg_pers_clsf = Util.checkString(req.getParameter("chrg_pers_clsf"));
String sp_comp_chrg_pers_emp_no = Util.checkString(req.getParameter("sp_comp_chrg_pers_emp_no"));
String area_cd = Util.checkString(req.getParameter("area_cd"));
String adms_dstc_cd = Util.checkString(req.getParameter("adms_dstc_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String chrg_pers_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_pers_clsf")));
String sp_comp_chrg_pers_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("sp_comp_chrg_pers_emp_no")));
String area_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("area_cd")));
String adms_dstc_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("adms_dstc_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setChrg_pers_clsf(chrg_pers_clsf);
dm.setSp_comp_chrg_pers_emp_no(sp_comp_chrg_pers_emp_no);
dm.setArea_cd(area_cd);
dm.setAdms_dstc_cd(adms_dstc_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jul 20 14:57:33 KST 2012 */