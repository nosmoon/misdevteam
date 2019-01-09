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


public class SP_SAL_2710_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String sale_yymm_fr;
	public String sale_yymm_to;

	public SP_SAL_2710_LDM(){}
	public SP_SAL_2710_LDM(String cmpy_cd, String sale_yymm_fr, String sale_yymm_to){
		this.cmpy_cd = cmpy_cd;
		this.sale_yymm_fr = sale_yymm_fr;
		this.sale_yymm_to = sale_yymm_to;
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

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSale_yymm_fr(){
		return this.sale_yymm_fr;
	}

	public String getSale_yymm_to(){
		return this.sale_yymm_to;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_SP_SAL_2710_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SP_SAL_2710_LDM dm = (SP_SAL_2710_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.sale_yymm_fr);
		cstmt.setString(5, dm.sale_yymm_to);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.sp.sal.ds.SP_SAL_2710_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("sale_yymm_fr = [" + getSale_yymm_fr() + "]");
		System.out.println("sale_yymm_to = [" + getSale_yymm_to() + "]");
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String sale_yymm_fr = Util.checkString(req.getParameter("sale_yymm_fr"));
String sale_yymm_to = Util.checkString(req.getParameter("sale_yymm_to"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String sale_yymm_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_yymm_fr")));
String sale_yymm_to = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_yymm_to")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSale_yymm_fr(sale_yymm_fr);
dm.setSale_yymm_to(sale_yymm_to);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Aug 21 20:50:05 KST 2012 */