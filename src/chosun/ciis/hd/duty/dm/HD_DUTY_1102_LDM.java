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


package chosun.ciis.hd.duty.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.duty.ds.*;
import chosun.ciis.hd.duty.rec.*;

/**
 * 
 */


public class HD_DUTY_1102_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String clndr_dt;

	public HD_DUTY_1102_LDM(){}
	public HD_DUTY_1102_LDM(String cmpy_cd, String clndr_dt){
		this.cmpy_cd = cmpy_cd;
		this.clndr_dt = clndr_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setClndr_dt(String clndr_dt){
		this.clndr_dt = clndr_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getClndr_dt(){
		return this.clndr_dt;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_DUTY_1102_L(? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_DUTY_1102_LDM dm = (HD_DUTY_1102_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.clndr_dt);
		cstmt.registerOutParameter(5, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.duty.ds.HD_DUTY_1102_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("clndr_dt = " + getClndr_dt());
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
String clndr_dt = req.getParameter("clndr_dt");
if( clndr_dt == null){
	System.out.println(this.toString+" : clndr_dt is null" );
}else{
	System.out.println(this.toString+" : clndr_dt is "+clndr_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String clndr_dt = Util.checkString(req.getParameter("clndr_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String clndr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("clndr_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setClndr_dt(clndr_dt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Mar 19 09:10:17 KST 2009 */