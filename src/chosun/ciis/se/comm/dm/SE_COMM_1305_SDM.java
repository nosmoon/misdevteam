/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매시스템
* 작성일자 : 2009-02-18
* 작성자 : 배창희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.comm.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.comm.ds.*;
import chosun.ciis.se.comm.rec.*;

/**
 * 
 */


public class SE_COMM_1305_SDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String bo_head_prn;
	public String bo_head_nm;

	public SE_COMM_1305_SDM(){}
	public SE_COMM_1305_SDM(String cmpy_cd, String bo_head_prn, String bo_head_nm){
		this.cmpy_cd = cmpy_cd;
		this.bo_head_prn = bo_head_prn;
		this.bo_head_nm = bo_head_nm;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setBo_head_prn(String bo_head_prn){
		this.bo_head_prn = bo_head_prn;
	}

	public void setBo_head_nm(String bo_head_nm){
		this.bo_head_nm = bo_head_nm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getBo_head_prn(){
		return this.bo_head_prn;
	}

	public String getBo_head_nm(){
		return this.bo_head_nm;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_COMM_1305_S(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_COMM_1305_SDM dm = (SE_COMM_1305_SDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.bo_head_prn);
		cstmt.setString(5, dm.bo_head_nm);
		cstmt.registerOutParameter(6, Types.INTEGER);
		cstmt.registerOutParameter(7, Types.VARCHAR);
		cstmt.registerOutParameter(8, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.comm.ds.SE_COMM_1305_SDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("bo_head_prn = " + getBo_head_prn());
        System.out.println("bo_head_nm = " + getBo_head_nm());
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
String bo_head_prn = req.getParameter("bo_head_prn");
if( bo_head_prn == null){
	System.out.println(this.toString+" : bo_head_prn is null" );
}else{
	System.out.println(this.toString+" : bo_head_prn is "+bo_head_prn );
}
String bo_head_nm = req.getParameter("bo_head_nm");
if( bo_head_nm == null){
	System.out.println(this.toString+" : bo_head_nm is null" );
}else{
	System.out.println(this.toString+" : bo_head_nm is "+bo_head_nm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String bo_head_prn = Util.checkString(req.getParameter("bo_head_prn"));
String bo_head_nm = Util.checkString(req.getParameter("bo_head_nm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String bo_head_prn = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_head_prn")));
String bo_head_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_head_nm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setBo_head_prn(bo_head_prn);
dm.setBo_head_nm(bo_head_nm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Feb 23 13:56:07 KST 2009 */