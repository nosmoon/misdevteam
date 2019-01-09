/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 : 
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.tn.bas.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.bas.ds.*;
import chosun.ciis.tn.bas.rec.*;

/**
 * 
 */


public class TN_BAS_1001_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String organidx;

	public TN_BAS_1001_LDM(){}
	public TN_BAS_1001_LDM(String cmpy_cd, String organidx){
		this.cmpy_cd = cmpy_cd;
		this.organidx = organidx;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOrganidx(String organidx){
		this.organidx = organidx;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOrganidx(){
		return this.organidx;
	}

	public String getSQL(){
		 return "{ call MISTNN.SP_TN_BAS_1001_L(? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		TN_BAS_1001_LDM dm = (TN_BAS_1001_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.organidx);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.tn.bas.ds.TN_BAS_1001_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("organidx = [" + getOrganidx() + "]");
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
String organidx = req.getParameter("organidx");
if( organidx == null){
	System.out.println(this.toString+" : organidx is null" );
}else{
	System.out.println(this.toString+" : organidx is "+organidx );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String organidx = Util.checkString(req.getParameter("organidx"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String organidx = Util.Uni2Ksc(Util.checkString(req.getParameter("organidx")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setOrganidx(organidx);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jul 26 14:59:59 KST 2016 */