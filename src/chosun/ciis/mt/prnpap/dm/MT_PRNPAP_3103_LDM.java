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


package chosun.ciis.mt.prnpap.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.prnpap.ds.*;
import chosun.ciis.mt.prnpap.rec.*;

/**
 * 
 */


public class MT_PRNPAP_3103_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String paper_cmpy;

	public MT_PRNPAP_3103_LDM(){}
	public MT_PRNPAP_3103_LDM(String cmpy_cd, String paper_cmpy){
		this.cmpy_cd = cmpy_cd;
		this.paper_cmpy = paper_cmpy;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setPaper_cmpy(String paper_cmpy){
		this.paper_cmpy = paper_cmpy;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getPaper_cmpy(){
		return this.paper_cmpy;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_PRNPAP_3103_L(? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_PRNPAP_3103_LDM dm = (MT_PRNPAP_3103_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.paper_cmpy);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.prnpap.ds.MT_PRNPAP_3103_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("paper_cmpy = [" + getPaper_cmpy() + "]");
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
String paper_cmpy = req.getParameter("paper_cmpy");
if( paper_cmpy == null){
	System.out.println(this.toString+" : paper_cmpy is null" );
}else{
	System.out.println(this.toString+" : paper_cmpy is "+paper_cmpy );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String paper_cmpy = Util.checkString(req.getParameter("paper_cmpy"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String paper_cmpy = Util.Uni2Ksc(Util.checkString(req.getParameter("paper_cmpy")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setPaper_cmpy(paper_cmpy);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jun 18 17:21:01 KST 2009 */