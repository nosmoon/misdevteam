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


package chosun.ciis.hd.corr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.corr.ds.*;
import chosun.ciis.hd.corr.rec.*;

/**
 * 
 */


public class HD_CORR_1400_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String appmt_dt;
	public String real_reinst_return_dt;
	public String natn_cd;
	public String duty_area;

	public HD_CORR_1400_LDM(){}
	public HD_CORR_1400_LDM(String cmpy_cd, String appmt_dt, String real_reinst_return_dt, String natn_cd, String duty_area){
		this.cmpy_cd = cmpy_cd;
		this.appmt_dt = appmt_dt;
		this.real_reinst_return_dt = real_reinst_return_dt;
		this.natn_cd = natn_cd;
		this.duty_area = duty_area;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAppmt_dt(String appmt_dt){
		this.appmt_dt = appmt_dt;
	}

	public void setReal_reinst_return_dt(String real_reinst_return_dt){
		this.real_reinst_return_dt = real_reinst_return_dt;
	}

	public void setNatn_cd(String natn_cd){
		this.natn_cd = natn_cd;
	}

	public void setDuty_area(String duty_area){
		this.duty_area = duty_area;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAppmt_dt(){
		return this.appmt_dt;
	}

	public String getReal_reinst_return_dt(){
		return this.real_reinst_return_dt;
	}

	public String getNatn_cd(){
		return this.natn_cd;
	}

	public String getDuty_area(){
		return this.duty_area;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_CORR_1400_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_CORR_1400_LDM dm = (HD_CORR_1400_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.appmt_dt);
		cstmt.setString(5, dm.real_reinst_return_dt);
		cstmt.setString(6, dm.natn_cd);
		cstmt.setString(7, dm.duty_area);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.corr.ds.HD_CORR_1400_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("appmt_dt = [" + getAppmt_dt() + "]");
		System.out.println("real_reinst_return_dt = [" + getReal_reinst_return_dt() + "]");
		System.out.println("natn_cd = [" + getNatn_cd() + "]");
		System.out.println("duty_area = [" + getDuty_area() + "]");
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
String appmt_dt = req.getParameter("appmt_dt");
if( appmt_dt == null){
	System.out.println(this.toString+" : appmt_dt is null" );
}else{
	System.out.println(this.toString+" : appmt_dt is "+appmt_dt );
}
String real_reinst_return_dt = req.getParameter("real_reinst_return_dt");
if( real_reinst_return_dt == null){
	System.out.println(this.toString+" : real_reinst_return_dt is null" );
}else{
	System.out.println(this.toString+" : real_reinst_return_dt is "+real_reinst_return_dt );
}
String natn_cd = req.getParameter("natn_cd");
if( natn_cd == null){
	System.out.println(this.toString+" : natn_cd is null" );
}else{
	System.out.println(this.toString+" : natn_cd is "+natn_cd );
}
String duty_area = req.getParameter("duty_area");
if( duty_area == null){
	System.out.println(this.toString+" : duty_area is null" );
}else{
	System.out.println(this.toString+" : duty_area is "+duty_area );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String appmt_dt = Util.checkString(req.getParameter("appmt_dt"));
String real_reinst_return_dt = Util.checkString(req.getParameter("real_reinst_return_dt"));
String natn_cd = Util.checkString(req.getParameter("natn_cd"));
String duty_area = Util.checkString(req.getParameter("duty_area"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String appmt_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("appmt_dt")));
String real_reinst_return_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("real_reinst_return_dt")));
String natn_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("natn_cd")));
String duty_area = Util.Uni2Ksc(Util.checkString(req.getParameter("duty_area")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setAppmt_dt(appmt_dt);
dm.setReal_reinst_return_dt(real_reinst_return_dt);
dm.setNatn_cd(natn_cd);
dm.setDuty_area(duty_area);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 09 15:33:11 KST 2009 */