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


package chosun.ciis.ad.tax.dm;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import oracle.jdbc.driver.OracleTypes;
import somo.framework.db.BaseDM;
import somo.framework.db.BaseDataSet;

/**
 * 
 */


public class AD_TAX_1410_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String work_clsf;
	public String clos_year;

	public AD_TAX_1410_LDM(){}
	public AD_TAX_1410_LDM(String cmpy_cd, String work_clsf, String clos_year){
		this.cmpy_cd = cmpy_cd;
		this.work_clsf = work_clsf;
		this.clos_year = clos_year;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setWork_clsf(String work_clsf){
		this.work_clsf = work_clsf;
	}

	public void setClos_year(String clos_year){
		this.clos_year = clos_year;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getWork_clsf(){
		return this.work_clsf;
	}

	public String getClos_year(){
		return this.clos_year;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_TAX_1410_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_TAX_1410_LDM dm = (AD_TAX_1410_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.work_clsf);
		cstmt.setString(5, dm.clos_year);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.tax.ds.AD_TAX_1410_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("work_clsf = [" + getWork_clsf() + "]");
		System.out.println("clos_year = [" + getClos_year() + "]");
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
String work_clsf = req.getParameter("work_clsf");
if( work_clsf == null){
	System.out.println(this.toString+" : work_clsf is null" );
}else{
	System.out.println(this.toString+" : work_clsf is "+work_clsf );
}
String clos_year = req.getParameter("clos_year");
if( clos_year == null){
	System.out.println(this.toString+" : clos_year is null" );
}else{
	System.out.println(this.toString+" : clos_year is "+clos_year );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String work_clsf = Util.checkString(req.getParameter("work_clsf"));
String clos_year = Util.checkString(req.getParameter("clos_year"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String work_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("work_clsf")));
String clos_year = Util.Uni2Ksc(Util.checkString(req.getParameter("clos_year")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setWork_clsf(work_clsf);
dm.setClos_year(clos_year);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 01 12:21:35 KST 2009 */