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


public class MT_COMMATR_2220_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String matr_cd_list;
	public String dlco_eps_no;

	public MT_COMMATR_2220_LDM(){}
	public MT_COMMATR_2220_LDM(String cmpy_cd, String matr_cd_list, String dlco_eps_no){
		this.cmpy_cd = cmpy_cd;
		this.matr_cd_list = matr_cd_list;
		this.dlco_eps_no = dlco_eps_no;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMatr_cd_list(String matr_cd_list){
		this.matr_cd_list = matr_cd_list;
	}

	public void setDlco_eps_no(String dlco_eps_no){
		this.dlco_eps_no = dlco_eps_no;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMatr_cd_list(){
		return this.matr_cd_list;
	}

	public String getDlco_eps_no(){
		return this.dlco_eps_no;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_COMMATR_2220_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_COMMATR_2220_LDM dm = (MT_COMMATR_2220_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.matr_cd_list);
		cstmt.setString(5, dm.dlco_eps_no);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.commatr.ds.MT_COMMATR_2220_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("matr_cd_list = [" + getMatr_cd_list() + "]");
		System.out.println("dlco_eps_no = [" + getDlco_eps_no() + "]");
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
String matr_cd_list = req.getParameter("matr_cd_list");
if( matr_cd_list == null){
	System.out.println(this.toString+" : matr_cd_list is null" );
}else{
	System.out.println(this.toString+" : matr_cd_list is "+matr_cd_list );
}
String dlco_eps_no = req.getParameter("dlco_eps_no");
if( dlco_eps_no == null){
	System.out.println(this.toString+" : dlco_eps_no is null" );
}else{
	System.out.println(this.toString+" : dlco_eps_no is "+dlco_eps_no );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String matr_cd_list = Util.checkString(req.getParameter("matr_cd_list"));
String dlco_eps_no = Util.checkString(req.getParameter("dlco_eps_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String matr_cd_list = Util.Uni2Ksc(Util.checkString(req.getParameter("matr_cd_list")));
String dlco_eps_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_eps_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMatr_cd_list(matr_cd_list);
dm.setDlco_eps_no(dlco_eps_no);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jul 07 22:28:23 KST 2009 */