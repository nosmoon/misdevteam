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


package chosun.ciis.ad.pub.dm;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import oracle.jdbc.driver.OracleTypes;
import somo.framework.db.BaseDM;
import somo.framework.db.BaseDataSet;

/**
 * 
 */


public class AD_PUB_2610_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String pubc_dt_st;
	public String pubc_dt_ed;
	public String medi_cd;
	public String dlco_no;
	public String sec_no;

	public AD_PUB_2610_LDM(){}
	public AD_PUB_2610_LDM(String cmpy_cd, String pubc_dt_st, String pubc_dt_ed, String medi_cd, String dlco_no, String sec_no){
		this.cmpy_cd = cmpy_cd;
		this.pubc_dt_st = pubc_dt_st;
		this.pubc_dt_ed = pubc_dt_ed;
		this.medi_cd = medi_cd;
		this.dlco_no = dlco_no;
		this.sec_no = sec_no;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setPubc_dt_st(String pubc_dt_st){
		this.pubc_dt_st = pubc_dt_st;
	}

	public void setPubc_dt_ed(String pubc_dt_ed){
		this.pubc_dt_ed = pubc_dt_ed;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setSec_no(String sec_no){
		this.sec_no = sec_no;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getPubc_dt_st(){
		return this.pubc_dt_st;
	}

	public String getPubc_dt_ed(){
		return this.pubc_dt_ed;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getSec_no(){
		return this.sec_no;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_PUB_2610_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_PUB_2610_LDM dm = (AD_PUB_2610_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.pubc_dt_st);
		cstmt.setString(5, dm.pubc_dt_ed);
		cstmt.setString(6, dm.medi_cd);
		cstmt.setString(7, dm.dlco_no);
		cstmt.setString(8, dm.sec_no);
		cstmt.registerOutParameter(9, Types.VARCHAR);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.pub.ds.AD_PUB_2610_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("pubc_dt_st = [" + getPubc_dt_st() + "]");
		System.out.println("pubc_dt_ed = [" + getPubc_dt_ed() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("dlco_no = [" + getDlco_no() + "]");
		System.out.println("sec_no = [" + getSec_no() + "]");
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
String pubc_dt_st = req.getParameter("pubc_dt_st");
if( pubc_dt_st == null){
	System.out.println(this.toString+" : pubc_dt_st is null" );
}else{
	System.out.println(this.toString+" : pubc_dt_st is "+pubc_dt_st );
}
String pubc_dt_ed = req.getParameter("pubc_dt_ed");
if( pubc_dt_ed == null){
	System.out.println(this.toString+" : pubc_dt_ed is null" );
}else{
	System.out.println(this.toString+" : pubc_dt_ed is "+pubc_dt_ed );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String dlco_no = req.getParameter("dlco_no");
if( dlco_no == null){
	System.out.println(this.toString+" : dlco_no is null" );
}else{
	System.out.println(this.toString+" : dlco_no is "+dlco_no );
}
String sec_no = req.getParameter("sec_no");
if( sec_no == null){
	System.out.println(this.toString+" : sec_no is null" );
}else{
	System.out.println(this.toString+" : sec_no is "+sec_no );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String pubc_dt_st = Util.checkString(req.getParameter("pubc_dt_st"));
String pubc_dt_ed = Util.checkString(req.getParameter("pubc_dt_ed"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
String sec_no = Util.checkString(req.getParameter("sec_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String pubc_dt_st = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_dt_st")));
String pubc_dt_ed = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_dt_ed")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
String sec_no = Util.Uni2Ksc(Util.checkString(req.getParameter("sec_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setPubc_dt_st(pubc_dt_st);
dm.setPubc_dt_ed(pubc_dt_ed);
dm.setMedi_cd(medi_cd);
dm.setDlco_no(dlco_no);
dm.setSec_no(sec_no);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Mar 27 19:29:17 KST 2009 */