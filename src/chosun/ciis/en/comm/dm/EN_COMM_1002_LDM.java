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


package chosun.ciis.en.comm.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.en.comm.ds.*;
import chosun.ciis.en.comm.rec.*;

/**
 * 
 */


public class EN_COMM_1002_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String evnt_cd;
	public String evnt_nm;

	public EN_COMM_1002_LDM(){}
	public EN_COMM_1002_LDM(String cmpy_cd, String evnt_cd, String evnt_nm){
		this.cmpy_cd = cmpy_cd;
		this.evnt_cd = evnt_cd;
		this.evnt_nm = evnt_nm;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEvnt_cd(String evnt_cd){
		this.evnt_cd = evnt_cd;
	}

	public void setEvnt_nm(String evnt_nm){
		this.evnt_nm = evnt_nm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEvnt_cd(){
		return this.evnt_cd;
	}

	public String getEvnt_nm(){
		return this.evnt_nm;
	}

	public String getSQL(){
		 return "{ call MISENP.SP_EN_COMM_1002_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		EN_COMM_1002_LDM dm = (EN_COMM_1002_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.evnt_cd);
		cstmt.setString(5, dm.evnt_nm);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.en.comm.ds.EN_COMM_1002_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("evnt_cd = " + getEvnt_cd());
        System.out.println("evnt_nm = " + getEvnt_nm());
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
String evnt_cd = req.getParameter("evnt_cd");
if( evnt_cd == null){
	System.out.println(this.toString+" : evnt_cd is null" );
}else{
	System.out.println(this.toString+" : evnt_cd is "+evnt_cd );
}
String evnt_nm = req.getParameter("evnt_nm");
if( evnt_nm == null){
	System.out.println(this.toString+" : evnt_nm is null" );
}else{
	System.out.println(this.toString+" : evnt_nm is "+evnt_nm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
String evnt_nm = Util.checkString(req.getParameter("evnt_nm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String evnt_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_cd")));
String evnt_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_nm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEvnt_cd(evnt_cd);
dm.setEvnt_nm(evnt_nm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Feb 12 10:10:43 KST 2009 */