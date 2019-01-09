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


package chosun.ciis.hd.lvcmpy.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.lvcmpy.ds.*;
import chosun.ciis.hd.lvcmpy.rec.*;

/**
 * 
 */


public class HD_LVCMPY_1002_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_dt;

	public HD_LVCMPY_1002_LDM(){}
	public HD_LVCMPY_1002_LDM(String cmpy_dt){
		this.cmpy_dt = cmpy_dt;
	}

	public void setCmpy_dt(String cmpy_dt){
		this.cmpy_dt = cmpy_dt;
	}

	public String getCmpy_dt(){
		return this.cmpy_dt;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_LVCMPY_1002_L(? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_LVCMPY_1002_LDM dm = (HD_LVCMPY_1002_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_dt);
		cstmt.registerOutParameter(4, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.lvcmpy.ds.HD_LVCMPY_1002_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_dt = " + getCmpy_dt());
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String cmpy_dt = req.getParameter("cmpy_dt");
if( cmpy_dt == null){
	System.out.println(this.toString+" : cmpy_dt is null" );
}else{
	System.out.println(this.toString+" : cmpy_dt is "+cmpy_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_dt = Util.checkString(req.getParameter("cmpy_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_dt(cmpy_dt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 27 18:42:35 KST 2009 */