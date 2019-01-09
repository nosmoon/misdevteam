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


package chosun.ciis.as.base.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.base.ds.*;
import chosun.ciis.as.base.rec.*;

/**
 * 
 */


public class AS_BASE_1002_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String item_cd;
	public String item_nm;
	public String budg_cd;

	public AS_BASE_1002_LDM(){}
	public AS_BASE_1002_LDM(String cmpy_cd, String item_cd, String item_nm, String budg_cd){
		this.cmpy_cd = cmpy_cd;
		this.item_cd = item_cd;
		this.item_nm = item_nm;
		this.budg_cd = budg_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setItem_cd(String item_cd){
		this.item_cd = item_cd;
	}

	public void setItem_nm(String item_nm){
		this.item_nm = item_nm;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getItem_cd(){
		return this.item_cd;
	}

	public String getItem_nm(){
		return this.item_nm;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getSQL(){
		 return "{ call MISAST.SP_AS_BASE_1002_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AS_BASE_1002_LDM dm = (AS_BASE_1002_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.item_cd);
		cstmt.setString(5, dm.item_nm);
		cstmt.setString(6, dm.budg_cd);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.as.base.ds.AS_BASE_1002_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("item_cd = " + getItem_cd());
        System.out.println("item_nm = " + getItem_nm());
        System.out.println("budg_cd = " + getBudg_cd());
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
String item_cd = req.getParameter("item_cd");
if( item_cd == null){
	System.out.println(this.toString+" : item_cd is null" );
}else{
	System.out.println(this.toString+" : item_cd is "+item_cd );
}
String item_nm = req.getParameter("item_nm");
if( item_nm == null){
	System.out.println(this.toString+" : item_nm is null" );
}else{
	System.out.println(this.toString+" : item_nm is "+item_nm );
}
String budg_cd = req.getParameter("budg_cd");
if( budg_cd == null){
	System.out.println(this.toString+" : budg_cd is null" );
}else{
	System.out.println(this.toString+" : budg_cd is "+budg_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String item_cd = Util.checkString(req.getParameter("item_cd"));
String item_nm = Util.checkString(req.getParameter("item_nm"));
String budg_cd = Util.checkString(req.getParameter("budg_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String item_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("item_cd")));
String item_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("item_nm")));
String budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setItem_cd(item_cd);
dm.setItem_nm(item_nm);
dm.setBudg_cd(budg_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Feb 19 20:00:59 KST 2009 */