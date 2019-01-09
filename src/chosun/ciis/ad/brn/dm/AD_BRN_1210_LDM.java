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


package chosun.ciis.ad.brn.dm;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import oracle.jdbc.driver.OracleTypes;
import somo.framework.db.BaseDM;
import somo.framework.db.BaseDataSet;

/**
 * 
 */


public class AD_BRN_1210_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String preng_advt_bo;
	public String medi_cd;
	public String frdt;
	public String todt;
	public String dlco_no;
	public String make_dt;

	public AD_BRN_1210_LDM(){}
	public AD_BRN_1210_LDM(String cmpy_cd, String preng_advt_bo, String medi_cd, String frdt, String todt, String dlco_no, String make_dt){
		this.cmpy_cd = cmpy_cd;
		this.preng_advt_bo = preng_advt_bo;
		this.medi_cd = medi_cd;
		this.frdt = frdt;
		this.todt = todt;
		this.dlco_no = dlco_no;
		this.make_dt = make_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setPreng_advt_bo(String preng_advt_bo){
		this.preng_advt_bo = preng_advt_bo;
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

	public void setMake_dt(String make_dt){
		this.make_dt = make_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getPreng_advt_bo(){
		return this.preng_advt_bo;
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

	public String getMake_dt(){
		return this.make_dt;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_BRN_1210_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_BRN_1210_LDM dm = (AD_BRN_1210_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.preng_advt_bo);
		cstmt.setString(5, dm.medi_cd);
		cstmt.setString(6, dm.frdt);
		cstmt.setString(7, dm.todt);
		cstmt.setString(8, dm.dlco_no);
		cstmt.setString(9, dm.make_dt);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.brn.ds.AD_BRN_1210_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("preng_advt_bo = [" + getPreng_advt_bo() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("frdt = [" + getFrdt() + "]");
		System.out.println("todt = [" + getTodt() + "]");
		System.out.println("dlco_no = [" + getDlco_no() + "]");
		System.out.println("make_dt = [" + getMake_dt() + "]");
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
String preng_advt_bo = req.getParameter("preng_advt_bo");
if( preng_advt_bo == null){
	System.out.println(this.toString+" : preng_advt_bo is null" );
}else{
	System.out.println(this.toString+" : preng_advt_bo is "+preng_advt_bo );
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
String make_dt = req.getParameter("make_dt");
if( make_dt == null){
	System.out.println(this.toString+" : make_dt is null" );
}else{
	System.out.println(this.toString+" : make_dt is "+make_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String preng_advt_bo = Util.checkString(req.getParameter("preng_advt_bo"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
String make_dt = Util.checkString(req.getParameter("make_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String preng_advt_bo = Util.Uni2Ksc(Util.checkString(req.getParameter("preng_advt_bo")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
String make_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("make_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setPreng_advt_bo(preng_advt_bo);
dm.setMedi_cd(medi_cd);
dm.setFrdt(frdt);
dm.setTodt(todt);
dm.setDlco_no(dlco_no);
dm.setMake_dt(make_dt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Jul 11 14:38:38 KST 2009 */