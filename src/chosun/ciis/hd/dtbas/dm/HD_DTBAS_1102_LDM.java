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


package chosun.ciis.hd.dtbas.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.dtbas.ds.*;
import chosun.ciis.hd.dtbas.rec.*;

/**
 * 
 */


public class HD_DTBAS_1102_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String search_bgn;
	public String search_end;
	public String duty_alon_cd;

	public HD_DTBAS_1102_LDM(){}
	public HD_DTBAS_1102_LDM(String cmpy_cd, String search_bgn, String search_end, String duty_alon_cd){
		this.cmpy_cd = cmpy_cd;
		this.search_bgn = search_bgn;
		this.search_end = search_end;
		this.duty_alon_cd = duty_alon_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSearch_bgn(String search_bgn){
		this.search_bgn = search_bgn;
	}

	public void setSearch_end(String search_end){
		this.search_end = search_end;
	}

	public void setDuty_alon_cd(String duty_alon_cd){
		this.duty_alon_cd = duty_alon_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSearch_bgn(){
		return this.search_bgn;
	}

	public String getSearch_end(){
		return this.search_end;
	}

	public String getDuty_alon_cd(){
		return this.duty_alon_cd;
	}

	public String getSQL(){
		 return "{ call SP_HD_DTBAS_1102_L( ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_DTBAS_1102_LDM dm = (HD_DTBAS_1102_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.search_bgn);
		cstmt.setString(5, dm.search_end);
		cstmt.setString(6, dm.duty_alon_cd);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.dtbas.ds.HD_DTBAS_1102_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("search_bgn = " + getSearch_bgn());
        System.out.println("search_end = " + getSearch_end());
        System.out.println("duty_alon_cd = " + getDuty_alon_cd());
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
String search_bgn = req.getParameter("search_bgn");
if( search_bgn == null){
	System.out.println(this.toString+" : search_bgn is null" );
}else{
	System.out.println(this.toString+" : search_bgn is "+search_bgn );
}
String search_end = req.getParameter("search_end");
if( search_end == null){
	System.out.println(this.toString+" : search_end is null" );
}else{
	System.out.println(this.toString+" : search_end is "+search_end );
}
String duty_alon_cd = req.getParameter("duty_alon_cd");
if( duty_alon_cd == null){
	System.out.println(this.toString+" : duty_alon_cd is null" );
}else{
	System.out.println(this.toString+" : duty_alon_cd is "+duty_alon_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String search_bgn = Util.checkString(req.getParameter("search_bgn"));
String search_end = Util.checkString(req.getParameter("search_end"));
String duty_alon_cd = Util.checkString(req.getParameter("duty_alon_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String search_bgn = Util.Uni2Ksc(Util.checkString(req.getParameter("search_bgn")));
String search_end = Util.Uni2Ksc(Util.checkString(req.getParameter("search_end")));
String duty_alon_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("duty_alon_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSearch_bgn(search_bgn);
dm.setSearch_end(search_end);
dm.setDuty_alon_cd(duty_alon_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Feb 14 18:03:27 KST 2009 */