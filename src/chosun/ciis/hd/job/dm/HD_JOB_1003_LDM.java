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


package chosun.ciis.hd.job.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.job.ds.*;
import chosun.ciis.hd.job.rec.*;

/**
 * 
 */


public class HD_JOB_1003_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String tm_frdt;

	public HD_JOB_1003_LDM(){}
	public HD_JOB_1003_LDM(String tm_frdt){
		this.tm_frdt = tm_frdt;
	}

	public void setTm_frdt(String tm_frdt){
		this.tm_frdt = tm_frdt;
	}

	public String getTm_frdt(){
		return this.tm_frdt;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_JOB_1003_L(? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_JOB_1003_LDM dm = (HD_JOB_1003_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.tm_frdt);
		cstmt.registerOutParameter(4, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.job.ds.HD_JOB_1003_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("tm_frdt = [" + getTm_frdt() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String tm_frdt = req.getParameter("tm_frdt");
if( tm_frdt == null){
	System.out.println(this.toString+" : tm_frdt is null" );
}else{
	System.out.println(this.toString+" : tm_frdt is "+tm_frdt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String tm_frdt = Util.checkString(req.getParameter("tm_frdt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String tm_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("tm_frdt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setTm_frdt(tm_frdt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jul 01 15:07:27 KST 2009 */