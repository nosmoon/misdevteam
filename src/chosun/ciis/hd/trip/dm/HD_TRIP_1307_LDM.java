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


public class HD_TRIP_1307_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String busi_trip_frdt;
	public String busi_trip_todt;

	public HD_TRIP_1307_LDM(){}
	public HD_TRIP_1307_LDM(String cmpy_cd, String busi_trip_frdt, String busi_trip_todt){
		this.cmpy_cd = cmpy_cd;
		this.busi_trip_frdt = busi_trip_frdt;
		this.busi_trip_todt = busi_trip_todt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setBusi_trip_frdt(String busi_trip_frdt){
		this.busi_trip_frdt = busi_trip_frdt;
	}

	public void setBusi_trip_todt(String busi_trip_todt){
		this.busi_trip_todt = busi_trip_todt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getBusi_trip_frdt(){
		return this.busi_trip_frdt;
	}

	public String getBusi_trip_todt(){
		return this.busi_trip_todt;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_TRIP_1307_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_TRIP_1307_LDM dm = (HD_TRIP_1307_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.busi_trip_frdt);
		cstmt.setString(5, dm.busi_trip_todt);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.trip.ds.HD_TRIP_1307_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("busi_trip_frdt = [" + getBusi_trip_frdt() + "]");
		System.out.println("busi_trip_todt = [" + getBusi_trip_todt() + "]");
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
String busi_trip_frdt = req.getParameter("busi_trip_frdt");
if( busi_trip_frdt == null){
	System.out.println(this.toString+" : busi_trip_frdt is null" );
}else{
	System.out.println(this.toString+" : busi_trip_frdt is "+busi_trip_frdt );
}
String busi_trip_todt = req.getParameter("busi_trip_todt");
if( busi_trip_todt == null){
	System.out.println(this.toString+" : busi_trip_todt is null" );
}else{
	System.out.println(this.toString+" : busi_trip_todt is "+busi_trip_todt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String busi_trip_frdt = Util.checkString(req.getParameter("busi_trip_frdt"));
String busi_trip_todt = Util.checkString(req.getParameter("busi_trip_todt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String busi_trip_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("busi_trip_frdt")));
String busi_trip_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("busi_trip_todt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setBusi_trip_frdt(busi_trip_frdt);
dm.setBusi_trip_todt(busi_trip_todt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Aug 22 13:16:50 KST 2009 */