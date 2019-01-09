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

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import oracle.jdbc.driver.OracleTypes;
import somo.framework.db.BaseDM;
import somo.framework.db.BaseDataSet;

/**
 * 
 */


public class AD_BAS_3320_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String dlco_nm;
	public String yn_no;
	public String dlco_no;
	public String cmpy_cd;

	public AD_BAS_3320_LDM(){}
	public AD_BAS_3320_LDM(String dlco_nm, String yn_no, String dlco_no, String cmpy_cd){
		this.dlco_nm = dlco_nm;
		this.yn_no = yn_no;
		this.dlco_no = dlco_no;
		this.cmpy_cd = cmpy_cd;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setYn_no(String yn_no){
		this.yn_no = yn_no;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getYn_no(){
		return this.yn_no;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_BAS_3320_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_BAS_3320_LDM dm = (AD_BAS_3320_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.dlco_nm);
		cstmt.setString(4, dm.yn_no);
		cstmt.setString(5, dm.dlco_no);
		cstmt.setString(6, dm.cmpy_cd);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.bas.ds.AD_BAS_3320_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("dlco_nm = [" + getDlco_nm() + "]");
		System.out.println("yn_no = [" + getYn_no() + "]");
		System.out.println("dlco_no = [" + getDlco_no() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String dlco_nm = req.getParameter("dlco_nm");
if( dlco_nm == null){
	System.out.println(this.toString+" : dlco_nm is null" );
}else{
	System.out.println(this.toString+" : dlco_nm is "+dlco_nm );
}
String yn_no = req.getParameter("yn_no");
if( yn_no == null){
	System.out.println(this.toString+" : yn_no is null" );
}else{
	System.out.println(this.toString+" : yn_no is "+yn_no );
}
String dlco_no = req.getParameter("dlco_no");
if( dlco_no == null){
	System.out.println(this.toString+" : dlco_no is null" );
}else{
	System.out.println(this.toString+" : dlco_no is "+dlco_no );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
String yn_no = Util.checkString(req.getParameter("yn_no"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String dlco_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_nm")));
String yn_no = Util.Uni2Ksc(Util.checkString(req.getParameter("yn_no")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setDlco_nm(dlco_nm);
dm.setYn_no(yn_no);
dm.setDlco_no(dlco_no);
dm.setCmpy_cd(cmpy_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 02 13:18:29 KST 2009 */