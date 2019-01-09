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


package chosun.ciis.mt.submatrout.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.submatrout.ds.*;
import chosun.ciis.mt.submatrout.rec.*;

/**
 * 
 */


public class MT_SUBMATROUT_3205_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String matr_nm;
	public String matr_cd;

	public MT_SUBMATROUT_3205_LDM(){}
	public MT_SUBMATROUT_3205_LDM(String cmpy_cd, String matr_nm, String matr_cd){
		this.cmpy_cd = cmpy_cd;
		this.matr_nm = matr_nm;
		this.matr_cd = matr_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMatr_nm(String matr_nm){
		this.matr_nm = matr_nm;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMatr_nm(){
		return this.matr_nm;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_SUBMATROUT_3205_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_SUBMATROUT_3205_LDM dm = (MT_SUBMATROUT_3205_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.matr_nm);
		cstmt.setString(5, dm.matr_cd);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.submatrout.ds.MT_SUBMATROUT_3205_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("matr_nm = [" + getMatr_nm() + "]");
		System.out.println("matr_cd = [" + getMatr_cd() + "]");
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
String matr_nm = req.getParameter("matr_nm");
if( matr_nm == null){
	System.out.println(this.toString+" : matr_nm is null" );
}else{
	System.out.println(this.toString+" : matr_nm is "+matr_nm );
}
String matr_cd = req.getParameter("matr_cd");
if( matr_cd == null){
	System.out.println(this.toString+" : matr_cd is null" );
}else{
	System.out.println(this.toString+" : matr_cd is "+matr_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String matr_nm = Util.checkString(req.getParameter("matr_nm"));
String matr_cd = Util.checkString(req.getParameter("matr_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String matr_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("matr_nm")));
String matr_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("matr_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMatr_nm(matr_nm);
dm.setMatr_cd(matr_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 06 20:26:41 KST 2009 */