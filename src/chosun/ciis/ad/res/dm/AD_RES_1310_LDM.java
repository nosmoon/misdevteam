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


package chosun.ciis.ad.res.dm;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import oracle.jdbc.driver.OracleTypes;
import somo.framework.db.BaseDM;
import somo.framework.db.BaseDataSet;

/**
 * 
 */


public class AD_RES_1310_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String medi_cd;
	public String approval;
	public String frdt;
	public String todt;
	public String slcrg_pers;
	public String dlco_no;
	public String dept_cd;
	public String incmg_pers;
	public String dis_agre_yn;

	public AD_RES_1310_LDM(){}
	public AD_RES_1310_LDM(String cmpy_cd, String medi_cd, String approval, String frdt, String todt, String slcrg_pers, String dlco_no, String dept_cd, String incmg_pers, String dis_agre_yn){
		this.cmpy_cd = cmpy_cd;
		this.medi_cd = medi_cd;
		this.approval = approval;
		this.frdt = frdt;
		this.todt = todt;
		this.slcrg_pers = slcrg_pers;
		this.dlco_no = dlco_no;
		this.dept_cd = dept_cd;
		this.incmg_pers = incmg_pers;
		this.dis_agre_yn = dis_agre_yn;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setApproval(String approval){
		this.approval = approval;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setSlcrg_pers(String slcrg_pers){
		this.slcrg_pers = slcrg_pers;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setDis_agre_yn(String dis_agre_yn){
		this.dis_agre_yn = dis_agre_yn;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getApproval(){
		return this.approval;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getSlcrg_pers(){
		return this.slcrg_pers;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getDis_agre_yn(){
		return this.dis_agre_yn;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_RES_1310_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_RES_1310_LDM dm = (AD_RES_1310_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.medi_cd);
		cstmt.setString(5, dm.approval);
		cstmt.setString(6, dm.frdt);
		cstmt.setString(7, dm.todt);
		cstmt.setString(8, dm.slcrg_pers);
		cstmt.setString(9, dm.dlco_no);
		cstmt.setString(10, dm.dept_cd);
		cstmt.setString(11, dm.incmg_pers);
		cstmt.setString(12, dm.dis_agre_yn);
		cstmt.registerOutParameter(13, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.res.ds.AD_RES_1310_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("approval = [" + getApproval() + "]");
		System.out.println("frdt = [" + getFrdt() + "]");
		System.out.println("todt = [" + getTodt() + "]");
		System.out.println("slcrg_pers = [" + getSlcrg_pers() + "]");
		System.out.println("dlco_no = [" + getDlco_no() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("dis_agre_yn = [" + getDis_agre_yn() + "]");
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
String approval = req.getParameter("approval");
if( approval == null){
	System.out.println(this.toString+" : approval is null" );
}else{
	System.out.println(this.toString+" : approval is "+approval );
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
String slcrg_pers = req.getParameter("slcrg_pers");
if( slcrg_pers == null){
	System.out.println(this.toString+" : slcrg_pers is null" );
}else{
	System.out.println(this.toString+" : slcrg_pers is "+slcrg_pers );
}
String dlco_no = req.getParameter("dlco_no");
if( dlco_no == null){
	System.out.println(this.toString+" : dlco_no is null" );
}else{
	System.out.println(this.toString+" : dlco_no is "+dlco_no );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String approval = Util.checkString(req.getParameter("approval"));
String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
String slcrg_pers = Util.checkString(req.getParameter("slcrg_pers"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String approval = Util.Uni2Ksc(Util.checkString(req.getParameter("approval")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String slcrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("slcrg_pers")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMedi_cd(medi_cd);
dm.setApproval(approval);
dm.setFrdt(frdt);
dm.setTodt(todt);
dm.setSlcrg_pers(slcrg_pers);
dm.setDlco_no(dlco_no);
dm.setDept_cd(dept_cd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Jul 11 13:38:28 KST 2009 */
