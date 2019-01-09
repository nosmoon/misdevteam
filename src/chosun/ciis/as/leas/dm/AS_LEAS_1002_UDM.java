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


public class AS_LEAS_1002_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String aset_no;
	public String leas_obj_good_yn;
	public String leas_bldg_cd;
	public String leas_ern_no;
	public String leas_ref_aset_no;
	public String chg_pers;

	public AS_LEAS_1002_UDM(){}
	public AS_LEAS_1002_UDM(String cmpy_cd, String aset_no, String leas_obj_good_yn, String leas_bldg_cd, String leas_ern_no, String leas_ref_aset_no, String chg_pers){
		this.cmpy_cd = cmpy_cd;
		this.aset_no = aset_no;
		this.leas_obj_good_yn = leas_obj_good_yn;
		this.leas_bldg_cd = leas_bldg_cd;
		this.leas_ern_no = leas_ern_no;
		this.leas_ref_aset_no = leas_ref_aset_no;
		this.chg_pers = chg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAset_no(String aset_no){
		this.aset_no = aset_no;
	}

	public void setLeas_obj_good_yn(String leas_obj_good_yn){
		this.leas_obj_good_yn = leas_obj_good_yn;
	}

	public void setLeas_bldg_cd(String leas_bldg_cd){
		this.leas_bldg_cd = leas_bldg_cd;
	}

	public void setLeas_ern_no(String leas_ern_no){
		this.leas_ern_no = leas_ern_no;
	}

	public void setLeas_ref_aset_no(String leas_ref_aset_no){
		this.leas_ref_aset_no = leas_ref_aset_no;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAset_no(){
		return this.aset_no;
	}

	public String getLeas_obj_good_yn(){
		return this.leas_obj_good_yn;
	}

	public String getLeas_bldg_cd(){
		return this.leas_bldg_cd;
	}

	public String getLeas_ern_no(){
		return this.leas_ern_no;
	}

	public String getLeas_ref_aset_no(){
		return this.leas_ref_aset_no;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getSQL(){
		 return "{ call MISAST.SP_AS_LEAS_1002_U(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AS_LEAS_1002_UDM dm = (AS_LEAS_1002_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.aset_no);
		cstmt.setString(5, dm.leas_obj_good_yn);
		cstmt.setString(6, dm.leas_bldg_cd);
		cstmt.setString(7, dm.leas_ern_no);
		cstmt.setString(8, dm.leas_ref_aset_no);
		cstmt.setString(9, dm.chg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.as.leas.ds.AS_LEAS_1002_UDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("aset_no = [" + getAset_no() + "]");
		System.out.println("leas_obj_good_yn = [" + getLeas_obj_good_yn() + "]");
		System.out.println("leas_bldg_cd = [" + getLeas_bldg_cd() + "]");
		System.out.println("leas_ern_no = [" + getLeas_ern_no() + "]");
		System.out.println("leas_ref_aset_no = [" + getLeas_ref_aset_no() + "]");
		System.out.println("chg_pers = [" + getChg_pers() + "]");
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
String aset_no = req.getParameter("aset_no");
if( aset_no == null){
	System.out.println(this.toString+" : aset_no is null" );
}else{
	System.out.println(this.toString+" : aset_no is "+aset_no );
}
String leas_obj_good_yn = req.getParameter("leas_obj_good_yn");
if( leas_obj_good_yn == null){
	System.out.println(this.toString+" : leas_obj_good_yn is null" );
}else{
	System.out.println(this.toString+" : leas_obj_good_yn is "+leas_obj_good_yn );
}
String leas_bldg_cd = req.getParameter("leas_bldg_cd");
if( leas_bldg_cd == null){
	System.out.println(this.toString+" : leas_bldg_cd is null" );
}else{
	System.out.println(this.toString+" : leas_bldg_cd is "+leas_bldg_cd );
}
String leas_ern_no = req.getParameter("leas_ern_no");
if( leas_ern_no == null){
	System.out.println(this.toString+" : leas_ern_no is null" );
}else{
	System.out.println(this.toString+" : leas_ern_no is "+leas_ern_no );
}
String leas_ref_aset_no = req.getParameter("leas_ref_aset_no");
if( leas_ref_aset_no == null){
	System.out.println(this.toString+" : leas_ref_aset_no is null" );
}else{
	System.out.println(this.toString+" : leas_ref_aset_no is "+leas_ref_aset_no );
}
String chg_pers = req.getParameter("chg_pers");
if( chg_pers == null){
	System.out.println(this.toString+" : chg_pers is null" );
}else{
	System.out.println(this.toString+" : chg_pers is "+chg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String aset_no = Util.checkString(req.getParameter("aset_no"));
String leas_obj_good_yn = Util.checkString(req.getParameter("leas_obj_good_yn"));
String leas_bldg_cd = Util.checkString(req.getParameter("leas_bldg_cd"));
String leas_ern_no = Util.checkString(req.getParameter("leas_ern_no"));
String leas_ref_aset_no = Util.checkString(req.getParameter("leas_ref_aset_no"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String aset_no = Util.Uni2Ksc(Util.checkString(req.getParameter("aset_no")));
String leas_obj_good_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("leas_obj_good_yn")));
String leas_bldg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("leas_bldg_cd")));
String leas_ern_no = Util.Uni2Ksc(Util.checkString(req.getParameter("leas_ern_no")));
String leas_ref_aset_no = Util.Uni2Ksc(Util.checkString(req.getParameter("leas_ref_aset_no")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setAset_no(aset_no);
dm.setLeas_obj_good_yn(leas_obj_good_yn);
dm.setLeas_bldg_cd(leas_bldg_cd);
dm.setLeas_ern_no(leas_ern_no);
dm.setLeas_ref_aset_no(leas_ref_aset_no);
dm.setChg_pers(chg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Apr 10 20:08:56 KST 2009 */