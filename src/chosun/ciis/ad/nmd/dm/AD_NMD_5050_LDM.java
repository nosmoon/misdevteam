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


package chosun.ciis.ad.nmd.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.nmd.ds.*;
import chosun.ciis.ad.nmd.rec.*;

/**
 * 
 */


public class AD_NMD_5050_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String medi_cd;
	public String frdt;
	public String todt;
	public String dlco_no;
	public String user_id;
	public String hndl_clsf;
	public String chrg_pers;
	public String advt_clas1;
	public String advt_clas2;

	public AD_NMD_5050_LDM(){}
	public AD_NMD_5050_LDM(String cmpy_cd, String medi_cd, String frdt, String todt, String dlco_no, String user_id, String hndl_clsf, String chrg_pers, String advt_clas1, String advt_clas2){
		this.cmpy_cd = cmpy_cd;
		this.medi_cd = medi_cd;
		this.frdt = frdt;
		this.todt = todt;
		this.dlco_no = dlco_no;
		this.user_id = user_id;
		this.hndl_clsf = hndl_clsf;
		this.chrg_pers = chrg_pers;
		this.advt_clas1 = advt_clas1;
		this.advt_clas2 = advt_clas2;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setUser_id(String user_id){
		this.user_id = user_id;
	}

	public void setHndl_clsf(String hndl_clsf){
		this.hndl_clsf = hndl_clsf;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setAdvt_clas1(String advt_clas1){
		this.advt_clas1 = advt_clas1;
	}

	public void setAdvt_clas2(String advt_clas2){
		this.advt_clas2 = advt_clas2;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getUser_id(){
		return this.user_id;
	}

	public String getHndl_clsf(){
		return this.hndl_clsf;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getAdvt_clas1(){
		return this.advt_clas1;
	}

	public String getAdvt_clas2(){
		return this.advt_clas2;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_NMD_5050_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_NMD_5050_LDM dm = (AD_NMD_5050_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.medi_cd);
		cstmt.setString(5, dm.frdt);
		cstmt.setString(6, dm.todt);
		cstmt.setString(7, dm.dlco_no);
		cstmt.setString(8, dm.user_id);
		cstmt.setString(9, dm.hndl_clsf);
		cstmt.setString(10, dm.chrg_pers);
		cstmt.setString(11, dm.advt_clas1);
		cstmt.setString(12, dm.advt_clas2);
		cstmt.registerOutParameter(13, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.nmd.ds.AD_NMD_5050_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("frdt = [" + getFrdt() + "]");
		System.out.println("todt = [" + getTodt() + "]");
		System.out.println("dlco_no = [" + getDlco_no() + "]");
		System.out.println("user_id = [" + getUser_id() + "]");
		System.out.println("hndl_clsf = [" + getHndl_clsf() + "]");
		System.out.println("chrg_pers = [" + getChrg_pers() + "]");
		System.out.println("advt_clas1 = [" + getAdvt_clas1() + "]");
		System.out.println("advt_clas2 = [" + getAdvt_clas2() + "]");
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
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String frdt = req.getParameter("frdt");
if( frdt == null){
	System.out.println(this.toString+" : frdt is null" );
}else{
	System.out.println(this.toString+" : frdt is "+frdt );
}
String todt = req.getParameter("todt");
if( todt == null){
	System.out.println(this.toString+" : todt is null" );
}else{
	System.out.println(this.toString+" : todt is "+todt );
}
String dlco_no = req.getParameter("dlco_no");
if( dlco_no == null){
	System.out.println(this.toString+" : dlco_no is null" );
}else{
	System.out.println(this.toString+" : dlco_no is "+dlco_no );
}
String user_id = req.getParameter("user_id");
if( user_id == null){
	System.out.println(this.toString+" : user_id is null" );
}else{
	System.out.println(this.toString+" : user_id is "+user_id );
}
String hndl_clsf = req.getParameter("hndl_clsf");
if( hndl_clsf == null){
	System.out.println(this.toString+" : hndl_clsf is null" );
}else{
	System.out.println(this.toString+" : hndl_clsf is "+hndl_clsf );
}
String chrg_pers = req.getParameter("chrg_pers");
if( chrg_pers == null){
	System.out.println(this.toString+" : chrg_pers is null" );
}else{
	System.out.println(this.toString+" : chrg_pers is "+chrg_pers );
}
String advt_clas1 = req.getParameter("advt_clas1");
if( advt_clas1 == null){
	System.out.println(this.toString+" : advt_clas1 is null" );
}else{
	System.out.println(this.toString+" : advt_clas1 is "+advt_clas1 );
}
String advt_clas2 = req.getParameter("advt_clas2");
if( advt_clas2 == null){
	System.out.println(this.toString+" : advt_clas2 is null" );
}else{
	System.out.println(this.toString+" : advt_clas2 is "+advt_clas2 );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
String user_id = Util.checkString(req.getParameter("user_id"));
String hndl_clsf = Util.checkString(req.getParameter("hndl_clsf"));
String chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
String advt_clas1 = Util.checkString(req.getParameter("advt_clas1"));
String advt_clas2 = Util.checkString(req.getParameter("advt_clas2"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
String user_id = Util.Uni2Ksc(Util.checkString(req.getParameter("user_id")));
String hndl_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("hndl_clsf")));
String chrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_pers")));
String advt_clas1 = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_clas1")));
String advt_clas2 = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_clas2")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMedi_cd(medi_cd);
dm.setFrdt(frdt);
dm.setTodt(todt);
dm.setDlco_no(dlco_no);
dm.setUser_id(user_id);
dm.setHndl_clsf(hndl_clsf);
dm.setChrg_pers(chrg_pers);
dm.setAdvt_clas1(advt_clas1);
dm.setAdvt_clas2(advt_clas2);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 22 18:24:52 KST 2014 */