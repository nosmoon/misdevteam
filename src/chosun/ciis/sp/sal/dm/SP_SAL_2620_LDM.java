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


public class SP_SAL_2620_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String sale_yymm_fr;
	public String sale_yymm_to;
	public String hdqt_sell_dept_cd;
	public String hdqt_sell_sub_dept_cd;
	public String hdqt_sell_area_cd;
	public String sale_item_cd;

	public SP_SAL_2620_LDM(){}
	public SP_SAL_2620_LDM(String cmpy_cd, String sale_yymm_fr, String sale_yymm_to, String hdqt_sell_dept_cd, String hdqt_sell_sub_dept_cd, String hdqt_sell_area_cd, String sale_item_cd){
		this.cmpy_cd = cmpy_cd;
		this.sale_yymm_fr = sale_yymm_fr;
		this.sale_yymm_to = sale_yymm_to;
		this.hdqt_sell_dept_cd = hdqt_sell_dept_cd;
		this.hdqt_sell_sub_dept_cd = hdqt_sell_sub_dept_cd;
		this.hdqt_sell_area_cd = hdqt_sell_area_cd;
		this.sale_item_cd = sale_item_cd;
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

	public void setHdqt_sell_dept_cd(String hdqt_sell_dept_cd){
		this.hdqt_sell_dept_cd = hdqt_sell_dept_cd;
	}

	public void setHdqt_sell_sub_dept_cd(String hdqt_sell_sub_dept_cd){
		this.hdqt_sell_sub_dept_cd = hdqt_sell_sub_dept_cd;
	}

	public void setHdqt_sell_area_cd(String hdqt_sell_area_cd){
		this.hdqt_sell_area_cd = hdqt_sell_area_cd;
	}

	public void setSale_item_cd(String sale_item_cd){
		this.sale_item_cd = sale_item_cd;
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

	public String getHdqt_sell_dept_cd(){
		return this.hdqt_sell_dept_cd;
	}

	public String getHdqt_sell_sub_dept_cd(){
		return this.hdqt_sell_sub_dept_cd;
	}

	public String getHdqt_sell_area_cd(){
		return this.hdqt_sell_area_cd;
	}

	public String getSale_item_cd(){
		return this.sale_item_cd;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_SP_SAL_2620_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SP_SAL_2620_LDM dm = (SP_SAL_2620_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.sale_yymm_fr);
		cstmt.setString(5, dm.sale_yymm_to);
		cstmt.setString(6, dm.hdqt_sell_dept_cd);
		cstmt.setString(7, dm.hdqt_sell_sub_dept_cd);
		cstmt.setString(8, dm.hdqt_sell_area_cd);
		cstmt.setString(9, dm.sale_item_cd);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.sp.sal.ds.SP_SAL_2620_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("sale_yymm_fr = [" + getSale_yymm_fr() + "]");
		System.out.println("sale_yymm_to = [" + getSale_yymm_to() + "]");
		System.out.println("hdqt_sell_dept_cd = [" + getHdqt_sell_dept_cd() + "]");
		System.out.println("hdqt_sell_sub_dept_cd = [" + getHdqt_sell_sub_dept_cd() + "]");
		System.out.println("hdqt_sell_area_cd = [" + getHdqt_sell_area_cd() + "]");
		System.out.println("sale_item_cd = [" + getSale_item_cd() + "]");
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
String hdqt_sell_dept_cd = req.getParameter("hdqt_sell_dept_cd");
if( hdqt_sell_dept_cd == null){
	System.out.println(this.toString+" : hdqt_sell_dept_cd is null" );
}else{
	System.out.println(this.toString+" : hdqt_sell_dept_cd is "+hdqt_sell_dept_cd );
}
String hdqt_sell_sub_dept_cd = req.getParameter("hdqt_sell_sub_dept_cd");
if( hdqt_sell_sub_dept_cd == null){
	System.out.println(this.toString+" : hdqt_sell_sub_dept_cd is null" );
}else{
	System.out.println(this.toString+" : hdqt_sell_sub_dept_cd is "+hdqt_sell_sub_dept_cd );
}
String hdqt_sell_area_cd = req.getParameter("hdqt_sell_area_cd");
if( hdqt_sell_area_cd == null){
	System.out.println(this.toString+" : hdqt_sell_area_cd is null" );
}else{
	System.out.println(this.toString+" : hdqt_sell_area_cd is "+hdqt_sell_area_cd );
}
String sale_item_cd = req.getParameter("sale_item_cd");
if( sale_item_cd == null){
	System.out.println(this.toString+" : sale_item_cd is null" );
}else{
	System.out.println(this.toString+" : sale_item_cd is "+sale_item_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String sale_yymm_fr = Util.checkString(req.getParameter("sale_yymm_fr"));
String sale_yymm_to = Util.checkString(req.getParameter("sale_yymm_to"));
String hdqt_sell_dept_cd = Util.checkString(req.getParameter("hdqt_sell_dept_cd"));
String hdqt_sell_sub_dept_cd = Util.checkString(req.getParameter("hdqt_sell_sub_dept_cd"));
String hdqt_sell_area_cd = Util.checkString(req.getParameter("hdqt_sell_area_cd"));
String sale_item_cd = Util.checkString(req.getParameter("sale_item_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String sale_yymm_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_yymm_fr")));
String sale_yymm_to = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_yymm_to")));
String hdqt_sell_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("hdqt_sell_dept_cd")));
String hdqt_sell_sub_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("hdqt_sell_sub_dept_cd")));
String hdqt_sell_area_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("hdqt_sell_area_cd")));
String sale_item_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_item_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSale_yymm_fr(sale_yymm_fr);
dm.setSale_yymm_to(sale_yymm_to);
dm.setHdqt_sell_dept_cd(hdqt_sell_dept_cd);
dm.setHdqt_sell_sub_dept_cd(hdqt_sell_sub_dept_cd);
dm.setHdqt_sell_area_cd(hdqt_sell_area_cd);
dm.setSale_item_cd(sale_item_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Aug 21 20:12:43 KST 2012 */