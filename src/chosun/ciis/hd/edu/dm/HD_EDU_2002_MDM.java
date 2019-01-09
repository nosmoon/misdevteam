/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 :
* 작성자 :
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.edu.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.edu.ds.*;
import chosun.ciis.hd.edu.rec.*;

/**
 * 
 */


public class HD_EDU_2002_MDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String cour_lng_cd;

	public HD_EDU_2002_MDM(){}
	public HD_EDU_2002_MDM(String cmpy_cd, String cour_lng_cd){
		this.cmpy_cd = cmpy_cd;
		this.cour_lng_cd = cour_lng_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setCour_lng_cd(String cour_lng_cd){
		this.cour_lng_cd = cour_lng_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getCour_lng_cd(){
		return this.cour_lng_cd;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_EDU_2002_M(? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_EDU_2002_MDM dm = (HD_EDU_2002_MDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.cour_lng_cd);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.edu.ds.HD_EDU_2002_MDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("cour_lng_cd = [" + getCour_lng_cd() + "]");
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
String cour_lng_cd = req.getParameter("cour_lng_cd");
if( cour_lng_cd == null){
	System.out.println(this.toString+" : cour_lng_cd is null" );
}else{
	System.out.println(this.toString+" : cour_lng_cd is "+cour_lng_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String cour_lng_cd = Util.checkString(req.getParameter("cour_lng_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String cour_lng_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cour_lng_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setCour_lng_cd(cour_lng_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Oct 25 11:25:28 KST 2011 */