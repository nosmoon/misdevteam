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


package chosun.ciis.fc.func.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.func.ds.*;
import chosun.ciis.fc.func.rec.*;

/**
 * 
 */


public class FC_FUNC_1071_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String pch_cymd1fr;
	public String pch_cymd1to;

	public FC_FUNC_1071_LDM(){}
	public FC_FUNC_1071_LDM(String cmpy_cd, String pch_cymd1fr, String pch_cymd1to){
		this.cmpy_cd = cmpy_cd;
		this.pch_cymd1fr = pch_cymd1fr;
		this.pch_cymd1to = pch_cymd1to;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setPch_cymd1fr(String pch_cymd1fr){
		this.pch_cymd1fr = pch_cymd1fr;
	}

	public void setPch_cymd1to(String pch_cymd1to){
		this.pch_cymd1to = pch_cymd1to;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getPch_cymd1fr(){
		return this.pch_cymd1fr;
	}

	public String getPch_cymd1to(){
		return this.pch_cymd1to;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_FUNC_1071_L(? ,? ,? ,? ,? ,?) }";
		 
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_FUNC_1071_LDM dm = (FC_FUNC_1071_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.pch_cymd1fr);
		cstmt.setString(5, dm.pch_cymd1to);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.func.ds.FC_FUNC_1071_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("pch_cymd1fr = " + getPch_cymd1fr());
        System.out.println("pch_cymd1to = " + getPch_cymd1to());
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
String pch_cymd1fr = req.getParameter("pch_cymd1fr");
if( pch_cymd1fr == null){
	System.out.println(this.toString+" : pch_cymd1fr is null" );
}else{
	System.out.println(this.toString+" : pch_cymd1fr is "+pch_cymd1fr );
}
String pch_cymd1to = req.getParameter("pch_cymd1to");
if( pch_cymd1to == null){
	System.out.println(this.toString+" : pch_cymd1to is null" );
}else{
	System.out.println(this.toString+" : pch_cymd1to is "+pch_cymd1to );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String pch_cymd1fr = Util.checkString(req.getParameter("pch_cymd1fr"));
String pch_cymd1to = Util.checkString(req.getParameter("pch_cymd1to"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String pch_cymd1fr = Util.Uni2Ksc(Util.checkString(req.getParameter("pch_cymd1fr")));
String pch_cymd1to = Util.Uni2Ksc(Util.checkString(req.getParameter("pch_cymd1to")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setPch_cymd1fr(pch_cymd1fr);
dm.setPch_cymd1to(pch_cymd1to);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Feb 18 13:53:10 KST 2009 */