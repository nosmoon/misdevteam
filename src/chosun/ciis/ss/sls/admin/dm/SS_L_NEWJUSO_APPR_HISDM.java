/***************************************************************************************************
* 파일명 : 
* 기능 : 
* 작성일자 : 2017-01-05
* 작성자 : 민 기 홍
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 :  
* 수정일자 : 
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.admin.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.admin.ds.*;
import chosun.ciis.ss.sls.admin.rec.*;


/**
 * 
 */


public class SS_L_NEWJUSO_APPR_HISDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bldmngnn;

	public SS_L_NEWJUSO_APPR_HISDM(){}
	public SS_L_NEWJUSO_APPR_HISDM(String bldmngnn){
		this.bldmngnn = bldmngnn;
	}

	public void setBldmngnn(String bldmngnn){
		this.bldmngnn = bldmngnn;
	}

	public String getBldmngnn(){
		return this.bldmngnn;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_NEWJUSO_APPR_HIS( ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_NEWJUSO_APPR_HISDM dm = (SS_L_NEWJUSO_APPR_HISDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bldmngnn);
		cstmt.registerOutParameter(4, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.admin.ds.SS_L_NEWJUSO_APPR_HISDataSet();
	}



    public void print(){
        System.out.println("bldmngnn = " + getBldmngnn());
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String bldmngnn = req.getParameter("bldmngnn");
if( bldmngnn == null){
	System.out.println(this.toString+" : bldmngnn is null" );
}else{
	System.out.println(this.toString+" : bldmngnn is "+bldmngnn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String bldmngnn = Util.checkString(req.getParameter("bldmngnn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String bldmngnn = Util.Uni2Ksc(Util.checkString(req.getParameter("bldmngnn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setBldmngnn(bldmngnn);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Oct 17 16:48:22 KST 2017 */