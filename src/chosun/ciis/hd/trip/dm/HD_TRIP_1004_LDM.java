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


package chosun.ciis.hd.trip.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.trip.ds.*;
import chosun.ciis.hd.trip.rec.*;

/**
 * 
 */


public class HD_TRIP_1004_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String fr_dt;
	public String to_dt;

	public HD_TRIP_1004_LDM(){}
	public HD_TRIP_1004_LDM(String cmpy_cd, String fr_dt, String to_dt){
		this.cmpy_cd = cmpy_cd;
		this.fr_dt = fr_dt;
		this.to_dt = to_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFr_dt(String fr_dt){
		this.fr_dt = fr_dt;
	}

	public void setTo_dt(String to_dt){
		this.to_dt = to_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFr_dt(){
		return this.fr_dt;
	}

	public String getTo_dt(){
		return this.to_dt;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_TRIP_1004_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_TRIP_1004_LDM dm = (HD_TRIP_1004_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.fr_dt);
		cstmt.setString(5, dm.to_dt);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.trip.ds.HD_TRIP_1004_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("fr_dt = [" + getFr_dt() + "]");
		System.out.println("to_dt = [" + getTo_dt() + "]");
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
String fr_dt = req.getParameter("fr_dt");
if( fr_dt == null){
	System.out.println(this.toString+" : fr_dt is null" );
}else{
	System.out.println(this.toString+" : fr_dt is "+fr_dt );
}
String to_dt = req.getParameter("to_dt");
if( to_dt == null){
	System.out.println(this.toString+" : to_dt is null" );
}else{
	System.out.println(this.toString+" : to_dt is "+to_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String fr_dt = Util.checkString(req.getParameter("fr_dt"));
String to_dt = Util.checkString(req.getParameter("to_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String fr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("fr_dt")));
String to_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("to_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFr_dt(fr_dt);
dm.setTo_dt(to_dt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Jul 18 18:41:18 KST 2009 */