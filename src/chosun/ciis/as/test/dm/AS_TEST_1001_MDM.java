/***************************************************************************************************
* 파일명 : .java
* 기능 : 발송관리 - 발송비청구
* 작성일자 : 2009-11-11
* 작성자 : 이민효
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.as.test.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.test.ds.*;
import chosun.ciis.as.test.rec.*;

/**
 * 
 */


public class AS_TEST_1001_MDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String sche_name;
	public String proc_like;
	public String incmg_pers; 
	public AS_TEST_1001_MDM(){}
	public AS_TEST_1001_MDM(String cmpy_cd, String sche_name, String proc_like, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.sche_name = sche_name;
		this.proc_like = proc_like;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSche_name(String sche_name){
		this.sche_name = sche_name;
	}

	public void setProc_like(String proc_like){
		this.proc_like = proc_like;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSche_name(){
		return this.sche_name;
	}

	public String getProc_like(){
		return this.proc_like;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISAST.SP_AS_TEST_1001_M( ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AS_TEST_1001_MDM dm = (AS_TEST_1001_MDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.sche_name);
		cstmt.setString(5, dm.proc_like);
		cstmt.setString(6, dm.incmg_pers);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.as.test.ds.AS_TEST_1001_MDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("incmg_pers = " + getIncmg_pers());
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 06 16:04:38 KST 2010 */