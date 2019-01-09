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


package chosun.ciis.mt.commatr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.commatr.ds.*;
import chosun.ciis.mt.commatr.rec.*;

/**
 * 
 */


public class MT_COMMATR_6510_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String issu_yy_fr;
	public String issu_yy_to;
	public String search_gubun;

	public MT_COMMATR_6510_LDM(){}
	public MT_COMMATR_6510_LDM(String cmpy_cd, String issu_yy_fr, String search_gubun){
		this.cmpy_cd = cmpy_cd;
		this.issu_yy_fr = issu_yy_fr;
		this.issu_yy_to = issu_yy_to;
		this.search_gubun = search_gubun;
	}
	

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIssu_yy_fr(String issu_yy_fr){
		this.issu_yy_fr = issu_yy_fr;
	}
	
	public void setIssu_yy_to(String issu_yy_to){
		this.issu_yy_to = issu_yy_to;
	}

	public void setSearch_gubun(String search_gubun){
		this.search_gubun = search_gubun;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIssu_yy_fr(){
		return this.issu_yy_fr;
	}
	
	public String getIssu_yy_to(){
		return this.issu_yy_to;
	}

	public String getSearch_gubun(){
		return this.search_gubun;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_COMMATR_6510_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_COMMATR_6510_LDM dm = (MT_COMMATR_6510_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.issu_yy_fr);
		cstmt.setString(5, dm.issu_yy_to);
		cstmt.setString(6, dm.search_gubun);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.commatr.ds.MT_COMMATR_6510_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("issu_yy_fr = [" + getIssu_yy_fr() + "]");
		System.out.println("issu_yy_to = [" + getIssu_yy_to() + "]");
		System.out.println("search_gubun = [" + getSearch_gubun() + "]");
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
String driv_mm = req.getParameter("driv_mm");
if( driv_mm == null){
	System.out.println(this.toString+" : driv_mm is null" );
}else{
	System.out.println(this.toString+" : driv_mm is "+driv_mm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String driv_mm = Util.checkString(req.getParameter("driv_mm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String driv_mm = Util.Uni2Ksc(Util.checkString(req.getParameter("driv_mm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setDriv_mm(driv_mm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Sep 12 14:17:27 KST 2013 */