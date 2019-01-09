/***************************************************************************************************
* 파일명 : CO_DLCO_1003_LDM.java
* 기능 : 공통-공통거래처
* 작성일자 : 2009-04-13
* 작성자 : 양정녕
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.co.dlco.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.co.dlco.ds.*;
import chosun.ciis.co.dlco.rec.*;

/**
 * 
 */


public class CO_DLCO_1003_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String ern;
	public String dlco_nm;
	public String dlco_abrv_nm;
	public String presi_nm;
	public String zip_1;
	public String zip_2;

	public CO_DLCO_1003_LDM(){}
	public CO_DLCO_1003_LDM(String ern, String dlco_nm, String dlco_abrv_nm, String presi_nm, String zip_1, String zip_2){
		this.ern = ern;
		this.dlco_nm = dlco_nm;
		this.dlco_abrv_nm = dlco_abrv_nm;
		this.presi_nm = presi_nm;
		this.zip_1 = zip_1;
		this.zip_2 = zip_2;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setDlco_abrv_nm(String dlco_abrv_nm){
		this.dlco_abrv_nm = dlco_abrv_nm;
	}

	public void setPresi_nm(String presi_nm){
		this.presi_nm = presi_nm;
	}

	public void setZip_1(String zip_1){
		this.zip_1 = zip_1;
	}

	public void setZip_2(String zip_2){
		this.zip_2 = zip_2;
	}

	public String getErn(){
		return this.ern;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getDlco_abrv_nm(){
		return this.dlco_abrv_nm;
	}

	public String getPresi_nm(){
		return this.presi_nm;
	}

	public String getZip_1(){
		return this.zip_1;
	}

	public String getZip_2(){
		return this.zip_2;
	}

	public String getSQL(){
		 return "{ call SP_CO_DLCO_1003_L( ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		CO_DLCO_1003_LDM dm = (CO_DLCO_1003_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.ern);
		cstmt.setString(4, dm.dlco_nm);
		cstmt.setString(5, dm.dlco_abrv_nm);
		cstmt.setString(6, dm.presi_nm);
		cstmt.setString(7, dm.zip_1);
		cstmt.setString(8, dm.zip_2);
		cstmt.registerOutParameter(9, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.co.dlco.ds.CO_DLCO_1003_LDataSet();
	}



    public void print(){
        System.out.println("ern = " + getErn());
        System.out.println("dlco_nm = " + getDlco_nm());
        System.out.println("dlco_abrv_nm = " + getDlco_abrv_nm());
        System.out.println("presi_nm = " + getPresi_nm());
        System.out.println("zip_1 = " + getZip_1());
        System.out.println("zip_2 = " + getZip_2());
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String ern = req.getParameter("ern");
if( ern == null){
	System.out.println(this.toString+" : ern is null" );
}else{
	System.out.println(this.toString+" : ern is "+ern );
}
String dlco_nm = req.getParameter("dlco_nm");
if( dlco_nm == null){
	System.out.println(this.toString+" : dlco_nm is null" );
}else{
	System.out.println(this.toString+" : dlco_nm is "+dlco_nm );
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
String zip_1 = req.getParameter("zip_1");
if( zip_1 == null){
	System.out.println(this.toString+" : zip_1 is null" );
}else{
	System.out.println(this.toString+" : zip_1 is "+zip_1 );
}
String zip_2 = req.getParameter("zip_2");
if( zip_2 == null){
	System.out.println(this.toString+" : zip_2 is null" );
}else{
	System.out.println(this.toString+" : zip_2 is "+zip_2 );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String ern = Util.checkString(req.getParameter("ern"));
String dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
String dlco_abrv_nm = Util.checkString(req.getParameter("dlco_abrv_nm"));
String presi_nm = Util.checkString(req.getParameter("presi_nm"));
String zip_1 = Util.checkString(req.getParameter("zip_1"));
String zip_2 = Util.checkString(req.getParameter("zip_2"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String ern = Util.Uni2Ksc(Util.checkString(req.getParameter("ern")));
String dlco_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_nm")));
String dlco_abrv_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_abrv_nm")));
String presi_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("presi_nm")));
String zip_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("zip_1")));
String zip_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("zip_2")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setErn(ern);
dm.setDlco_nm(dlco_nm);
dm.setDlco_abrv_nm(dlco_abrv_nm);
dm.setPresi_nm(presi_nm);
dm.setZip_1(zip_1);
dm.setZip_2(zip_2);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 08 22:53:20 KST 2009 */