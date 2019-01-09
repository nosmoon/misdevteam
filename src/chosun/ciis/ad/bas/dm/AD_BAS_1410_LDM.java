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


package chosun.ciis.ad.bas.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.bas.ds.*;
import chosun.ciis.ad.bas.rec.*;

/**
 * 
 */


public class AD_BAS_1410_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mchrg_pers;
	public String mchrg_nm;
	public String chrg_clsf;
	public String cmpy_cd;
	public String dlco_no;

	public AD_BAS_1410_LDM(){}
	public AD_BAS_1410_LDM(String mchrg_pers, String mchrg_nm, String chrg_clsf, String cmpy_cd, String dlco_no){
		this.mchrg_pers = mchrg_pers;
		this.mchrg_nm = mchrg_nm;
		this.chrg_clsf = chrg_clsf;
		this.cmpy_cd = cmpy_cd;
		this.dlco_no = dlco_no;
	}

	public void setMchrg_pers(String mchrg_pers){
		this.mchrg_pers = mchrg_pers;
	}

	public void setMchrg_nm(String mchrg_nm){
		this.mchrg_nm = mchrg_nm;
	}

	public void setChrg_clsf(String chrg_clsf){
		this.chrg_clsf = chrg_clsf;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public String getMchrg_pers(){
		return this.mchrg_pers;
	}

	public String getMchrg_nm(){
		return this.mchrg_nm;
	}

	public String getChrg_clsf(){
		return this.chrg_clsf;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_BAS_1410_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_BAS_1410_LDM dm = (AD_BAS_1410_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mchrg_pers);
		cstmt.setString(4, dm.mchrg_nm);
		cstmt.setString(5, dm.chrg_clsf);
		cstmt.setString(6, dm.cmpy_cd);
		cstmt.setString(7, dm.dlco_no);
		cstmt.registerOutParameter(8, Types.INTEGER);
		cstmt.registerOutParameter(9, Types.INTEGER);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.bas.ds.AD_BAS_1410_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mchrg_pers = [" + getMchrg_pers() + "]");
		System.out.println("mchrg_nm = [" + getMchrg_nm() + "]");
		System.out.println("chrg_clsf = [" + getChrg_clsf() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("dlco_no = [" + getDlco_no() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String mchrg_pers = req.getParameter("mchrg_pers");
if( mchrg_pers == null){
	System.out.println(this.toString+" : mchrg_pers is null" );
}else{
	System.out.println(this.toString+" : mchrg_pers is "+mchrg_pers );
}
String mchrg_nm = req.getParameter("mchrg_nm");
if( mchrg_nm == null){
	System.out.println(this.toString+" : mchrg_nm is null" );
}else{
	System.out.println(this.toString+" : mchrg_nm is "+mchrg_nm );
}
String chrg_clsf = req.getParameter("chrg_clsf");
if( chrg_clsf == null){
	System.out.println(this.toString+" : chrg_clsf is null" );
}else{
	System.out.println(this.toString+" : chrg_clsf is "+chrg_clsf );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String dlco_no = req.getParameter("dlco_no");
if( dlco_no == null){
	System.out.println(this.toString+" : dlco_no is null" );
}else{
	System.out.println(this.toString+" : dlco_no is "+dlco_no );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String mchrg_pers = Util.checkString(req.getParameter("mchrg_pers"));
String mchrg_nm = Util.checkString(req.getParameter("mchrg_nm"));
String chrg_clsf = Util.checkString(req.getParameter("chrg_clsf"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mchrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("mchrg_pers")));
String mchrg_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("mchrg_nm")));
String chrg_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_clsf")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMchrg_pers(mchrg_pers);
dm.setMchrg_nm(mchrg_nm);
dm.setChrg_clsf(chrg_clsf);
dm.setCmpy_cd(cmpy_cd);
dm.setDlco_no(dlco_no);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 18 10:42:20 KST 2018 */