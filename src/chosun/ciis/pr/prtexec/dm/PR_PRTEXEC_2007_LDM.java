/***************************************************************************************************
* 파일명 : PR_PRTEXEC_2007_LDM.java
* 기능 : 공정관리-주간발행계획
* 작성일자 : 2009-04-22
* 작성자 : 양정녕
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.pr.prtexec.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pr.prtexec.ds.*;
import chosun.ciis.pr.prtexec.rec.*;

/**
 * 
 */


public class PR_PRTEXEC_2007_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_yy;

	public PR_PRTEXEC_2007_LDM(){}
	public PR_PRTEXEC_2007_LDM(String cmpy_cd, String occr_yy){
		this.cmpy_cd = cmpy_cd;
		this.occr_yy = occr_yy;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_yy(String occr_yy){
		this.occr_yy = occr_yy;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOccr_yy(){
		return this.occr_yy;
	}

	public String getSQL(){
		 return "{ call SP_PR_PRTEXEC_2007_L( ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PR_PRTEXEC_2007_LDM dm = (PR_PRTEXEC_2007_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.occr_yy);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.pr.prtexec.ds.PR_PRTEXEC_2007_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("occr_yy = " + getOccr_yy());
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
String occr_yy = req.getParameter("occr_yy");
if( occr_yy == null){
	System.out.println(this.toString+" : occr_yy is null" );
}else{
	System.out.println(this.toString+" : occr_yy is "+occr_yy );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String occr_yy = Util.checkString(req.getParameter("occr_yy"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String occr_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_yy")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setOccr_yy(occr_yy);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Apr 18 14:25:28 KST 2009 */