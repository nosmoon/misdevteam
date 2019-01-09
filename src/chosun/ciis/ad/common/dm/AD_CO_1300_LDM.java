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


package chosun.ciis.ad.common.dm;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import oracle.jdbc.driver.OracleTypes;
import somo.framework.db.BaseDM;
import somo.framework.db.BaseDataSet;

/**
 * 
 */


public class AD_CO_1300_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String dlco_no1;
	public String dlco_no2;
	public String dlco_nm;
	public String ern;
	public String dlco_abrv_nm;
	public String presi_nm;

	public AD_CO_1300_LDM(){}
	public AD_CO_1300_LDM(String cmpy_cd, String dlco_no1, String dlco_no2, String dlco_nm, String ern, String dlco_abrv_nm, String presi_nm){
		this.cmpy_cd = cmpy_cd;
		this.dlco_no1 = dlco_no1;
		this.dlco_no2 = dlco_no2;
		this.dlco_nm = dlco_nm;
		this.ern = ern;
		this.dlco_abrv_nm = dlco_abrv_nm;
		this.presi_nm = presi_nm;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDlco_no1(String dlco_no1){
		this.dlco_no1 = dlco_no1;
	}

	public void setDlco_no2(String dlco_no2){
		this.dlco_no2 = dlco_no2;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setDlco_abrv_nm(String dlco_abrv_nm){
		this.dlco_abrv_nm = dlco_abrv_nm;
	}

	public void setPresi_nm(String presi_nm){
		this.presi_nm = presi_nm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDlco_no1(){
		return this.dlco_no1;
	}

	public String getDlco_no2(){
		return this.dlco_no2;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getErn(){
		return this.ern;
	}

	public String getDlco_abrv_nm(){
		return this.dlco_abrv_nm;
	}

	public String getPresi_nm(){
		return this.presi_nm;
	}

	public String getSQL(){
		 return "{ call SP_AD_CO_1300_L( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_CO_1300_LDM dm = (AD_CO_1300_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.dlco_no1);
		cstmt.setString(5, dm.dlco_no2);
		cstmt.setString(6, dm.dlco_nm);
		cstmt.setString(7, dm.ern);
		cstmt.setString(8, dm.dlco_abrv_nm);
		cstmt.setString(9, dm.presi_nm);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.common.ds.AD_CO_1300_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("dlco_no1 = " + getDlco_no1());
        System.out.println("dlco_no2 = " + getDlco_no2());
        System.out.println("dlco_nm = " + getDlco_nm());
        System.out.println("ern = " + getErn());
        System.out.println("dlco_abrv_nm = " + getDlco_abrv_nm());
        System.out.println("presi_nm = " + getPresi_nm());
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
String dlco_no1 = req.getParameter("dlco_no1");
if( dlco_no1 == null){
	System.out.println(this.toString+" : dlco_no1 is null" );
}else{
	System.out.println(this.toString+" : dlco_no1 is "+dlco_no1 );
}
String dlco_no2 = req.getParameter("dlco_no2");
if( dlco_no2 == null){
	System.out.println(this.toString+" : dlco_no2 is null" );
}else{
	System.out.println(this.toString+" : dlco_no2 is "+dlco_no2 );
}
String dlco_nm = req.getParameter("dlco_nm");
if( dlco_nm == null){
	System.out.println(this.toString+" : dlco_nm is null" );
}else{
	System.out.println(this.toString+" : dlco_nm is "+dlco_nm );
}
String ern = req.getParameter("ern");
if( ern == null){
	System.out.println(this.toString+" : ern is null" );
}else{
	System.out.println(this.toString+" : ern is "+ern );
}
String dlco_abrv_nm = req.getParameter("dlco_abrv_nm");
if( dlco_abrv_nm == null){
	System.out.println(this.toString+" : dlco_abrv_nm is null" );
}else{
	System.out.println(this.toString+" : dlco_abrv_nm is "+dlco_abrv_nm );
}
String presi_nm = req.getParameter("presi_nm");
if( presi_nm == null){
	System.out.println(this.toString+" : presi_nm is null" );
}else{
	System.out.println(this.toString+" : presi_nm is "+presi_nm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String dlco_no1 = Util.checkString(req.getParameter("dlco_no1"));
String dlco_no2 = Util.checkString(req.getParameter("dlco_no2"));
String dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
String ern = Util.checkString(req.getParameter("ern"));
String dlco_abrv_nm = Util.checkString(req.getParameter("dlco_abrv_nm"));
String presi_nm = Util.checkString(req.getParameter("presi_nm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String dlco_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no1")));
String dlco_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no2")));
String dlco_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_nm")));
String ern = Util.Uni2Ksc(Util.checkString(req.getParameter("ern")));
String dlco_abrv_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_abrv_nm")));
String presi_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("presi_nm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setDlco_no1(dlco_no1);
dm.setDlco_no2(dlco_no2);
dm.setDlco_nm(dlco_nm);
dm.setErn(ern);
dm.setDlco_abrv_nm(dlco_abrv_nm);
dm.setPresi_nm(presi_nm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Feb 02 16:31:07 KST 2009 */