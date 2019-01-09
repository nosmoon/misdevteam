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


package chosun.ciis.as.leas.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.leas.ds.*;
import chosun.ciis.as.leas.rec.*;

/**
 * 
 */


public class AS_LEAS_1001_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String fr_aset_no;
	public String to_aset_no;
	public String aset_nm;
	public String leas_bldg_cd;
	public String leas_obj_good_yn;

	public AS_LEAS_1001_LDM(){}
	public AS_LEAS_1001_LDM(String cmpy_cd, String fr_aset_no, String to_aset_no, String aset_nm, String leas_bldg_cd, String leas_obj_good_yn){
		this.cmpy_cd = cmpy_cd;
		this.fr_aset_no = fr_aset_no;
		this.to_aset_no = to_aset_no;
		this.aset_nm = aset_nm;
		this.leas_bldg_cd = leas_bldg_cd;
		this.leas_obj_good_yn = leas_obj_good_yn;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFr_aset_no(String fr_aset_no){
		this.fr_aset_no = fr_aset_no;
	}

	public void setTo_aset_no(String to_aset_no){
		this.to_aset_no = to_aset_no;
	}

	public void setAset_nm(String aset_nm){
		this.aset_nm = aset_nm;
	}

	public void setLeas_bldg_cd(String leas_bldg_cd){
		this.leas_bldg_cd = leas_bldg_cd;
	}

	public void setLeas_obj_good_yn(String leas_obj_good_yn){
		this.leas_obj_good_yn = leas_obj_good_yn;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFr_aset_no(){
		return this.fr_aset_no;
	}

	public String getTo_aset_no(){
		return this.to_aset_no;
	}

	public String getAset_nm(){
		return this.aset_nm;
	}

	public String getLeas_bldg_cd(){
		return this.leas_bldg_cd;
	}

	public String getLeas_obj_good_yn(){
		return this.leas_obj_good_yn;
	}

	public String getSQL(){
		 return "{ call MISAST.SP_AS_LEAS_1001_L(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AS_LEAS_1001_LDM dm = (AS_LEAS_1001_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.fr_aset_no);
		cstmt.setString(5, dm.to_aset_no);
		cstmt.setString(6, dm.aset_nm);
		cstmt.setString(7, dm.leas_bldg_cd);
		cstmt.setString(8, dm.leas_obj_good_yn);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.as.leas.ds.AS_LEAS_1001_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("fr_aset_no = [" + getFr_aset_no() + "]");
		System.out.println("to_aset_no = [" + getTo_aset_no() + "]");
		System.out.println("aset_nm = [" + getAset_nm() + "]");
		System.out.println("leas_bldg_cd = [" + getLeas_bldg_cd() + "]");
		System.out.println("leas_obj_good_yn = [" + getLeas_obj_good_yn() + "]");
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
String fr_aset_no = req.getParameter("fr_aset_no");
if( fr_aset_no == null){
	System.out.println(this.toString+" : fr_aset_no is null" );
}else{
	System.out.println(this.toString+" : fr_aset_no is "+fr_aset_no );
}
String to_aset_no = req.getParameter("to_aset_no");
if( to_aset_no == null){
	System.out.println(this.toString+" : to_aset_no is null" );
}else{
	System.out.println(this.toString+" : to_aset_no is "+to_aset_no );
}
String aset_nm = req.getParameter("aset_nm");
if( aset_nm == null){
	System.out.println(this.toString+" : aset_nm is null" );
}else{
	System.out.println(this.toString+" : aset_nm is "+aset_nm );
}
String leas_bldg_cd = req.getParameter("leas_bldg_cd");
if( leas_bldg_cd == null){
	System.out.println(this.toString+" : leas_bldg_cd is null" );
}else{
	System.out.println(this.toString+" : leas_bldg_cd is "+leas_bldg_cd );
}
String leas_obj_good_yn = req.getParameter("leas_obj_good_yn");
if( leas_obj_good_yn == null){
	System.out.println(this.toString+" : leas_obj_good_yn is null" );
}else{
	System.out.println(this.toString+" : leas_obj_good_yn is "+leas_obj_good_yn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String fr_aset_no = Util.checkString(req.getParameter("fr_aset_no"));
String to_aset_no = Util.checkString(req.getParameter("to_aset_no"));
String aset_nm = Util.checkString(req.getParameter("aset_nm"));
String leas_bldg_cd = Util.checkString(req.getParameter("leas_bldg_cd"));
String leas_obj_good_yn = Util.checkString(req.getParameter("leas_obj_good_yn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String fr_aset_no = Util.Uni2Ksc(Util.checkString(req.getParameter("fr_aset_no")));
String to_aset_no = Util.Uni2Ksc(Util.checkString(req.getParameter("to_aset_no")));
String aset_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("aset_nm")));
String leas_bldg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("leas_bldg_cd")));
String leas_obj_good_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("leas_obj_good_yn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFr_aset_no(fr_aset_no);
dm.setTo_aset_no(to_aset_no);
dm.setAset_nm(aset_nm);
dm.setLeas_bldg_cd(leas_bldg_cd);
dm.setLeas_obj_good_yn(leas_obj_good_yn);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 07 10:54:36 KST 2009 */