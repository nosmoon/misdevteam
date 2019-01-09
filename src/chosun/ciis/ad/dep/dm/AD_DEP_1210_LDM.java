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


package chosun.ciis.ad.dep.dm;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import oracle.jdbc.driver.OracleTypes;
import somo.framework.db.BaseDM;
import somo.framework.db.BaseDataSet;

/**
 * 
 */


public class AD_DEP_1210_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String slip_clsf_cd;
	public String clos_fryy;
	public String clos_toyy;

	public AD_DEP_1210_LDM(){}
	public AD_DEP_1210_LDM(String cmpy_cd, String slip_clsf_cd, String clos_fryy, String clos_toyy){
		this.cmpy_cd = cmpy_cd;
		this.slip_clsf_cd = slip_clsf_cd;
		this.clos_fryy = clos_fryy;
		this.clos_toyy = clos_toyy;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setClos_fryy(String clos_fryy){
		this.clos_fryy = clos_fryy;
	}

	public void setClos_toyy(String clos_toyy){
		this.clos_toyy = clos_toyy;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getClos_fryy(){
		return this.clos_fryy;
	}

	public String getClos_toyy(){
		return this.clos_toyy;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_DEP_1210_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_DEP_1210_LDM dm = (AD_DEP_1210_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.slip_clsf_cd);
		cstmt.setString(5, dm.clos_fryy);
		cstmt.setString(6, dm.clos_toyy);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.dep.ds.AD_DEP_1210_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("slip_clsf_cd = [" + getSlip_clsf_cd() + "]");
		System.out.println("clos_fryy = [" + getClos_fryy() + "]");
		System.out.println("clos_toyy = [" + getClos_toyy() + "]");
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
String slip_clsf_cd = req.getParameter("slip_clsf_cd");
if( slip_clsf_cd == null){
	System.out.println(this.toString+" : slip_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : slip_clsf_cd is "+slip_clsf_cd );
}
String clos_fryy = req.getParameter("clos_fryy");
if( clos_fryy == null){
	System.out.println(this.toString+" : clos_fryy is null" );
}else{
	System.out.println(this.toString+" : clos_fryy is "+clos_fryy );
}
String clos_toyy = req.getParameter("clos_toyy");
if( clos_toyy == null){
	System.out.println(this.toString+" : clos_toyy is null" );
}else{
	System.out.println(this.toString+" : clos_toyy is "+clos_toyy );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
String clos_fryy = Util.checkString(req.getParameter("clos_fryy"));
String clos_toyy = Util.checkString(req.getParameter("clos_toyy"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String slip_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf_cd")));
String clos_fryy = Util.Uni2Ksc(Util.checkString(req.getParameter("clos_fryy")));
String clos_toyy = Util.Uni2Ksc(Util.checkString(req.getParameter("clos_toyy")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSlip_clsf_cd(slip_clsf_cd);
dm.setClos_fryy(clos_fryy);
dm.setClos_toyy(clos_toyy);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jun 08 11:09:01 KST 2009 */