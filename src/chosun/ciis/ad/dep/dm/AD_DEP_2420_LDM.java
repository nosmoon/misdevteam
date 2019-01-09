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


package chosun.ciis.ad.dep.dm;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import oracle.jdbc.driver.OracleTypes;
import somo.framework.db.BaseDM;
import somo.framework.db.BaseDataSet;

/**
 * 
 */


public class AD_DEP_2420_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String work_cd;
	public String dis_account;
	public String handle_clsf;
	public String frdt;
	public String todt;
	public String dlco_clsf;
	public String dlco_no;

	public AD_DEP_2420_LDM(){}
	public AD_DEP_2420_LDM(String cmpy_cd, String work_cd, String dis_account, String handle_clsf, String frdt, String todt, String dlco_clsf, String dlco_no){
		this.cmpy_cd = cmpy_cd;
		this.work_cd = work_cd;
		this.dis_account = dis_account;
		this.handle_clsf = handle_clsf;
		this.frdt = frdt;
		this.todt = todt;
		this.dlco_clsf = dlco_clsf;
		this.dlco_no = dlco_no;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setWork_cd(String work_cd){
		this.work_cd = work_cd;
	}

	public void setDis_account(String dis_account){
		this.dis_account = dis_account;
	}

	public void setHandle_clsf(String handle_clsf){
		this.handle_clsf = handle_clsf;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setDlco_clsf(String dlco_clsf){
		this.dlco_clsf = dlco_clsf;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getWork_cd(){
		return this.work_cd;
	}

	public String getDis_account(){
		return this.dis_account;
	}

	public String getHandle_clsf(){
		return this.handle_clsf;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getDlco_clsf(){
		return this.dlco_clsf;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_DEP_2420_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_DEP_2420_LDM dm = (AD_DEP_2420_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.work_cd);
		cstmt.setString(5, dm.dis_account);
		cstmt.setString(6, dm.handle_clsf);
		cstmt.setString(7, dm.frdt);
		cstmt.setString(8, dm.todt);
		cstmt.setString(9, dm.dlco_clsf);
		cstmt.setString(10, dm.dlco_no);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.dep.ds.AD_DEP_2420_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("work_cd = [" + getWork_cd() + "]");
		System.out.println("dis_account = [" + getDis_account() + "]");
		System.out.println("handle_clsf = [" + getHandle_clsf() + "]");
		System.out.println("frdt = [" + getFrdt() + "]");
		System.out.println("todt = [" + getTodt() + "]");
		System.out.println("dlco_clsf = [" + getDlco_clsf() + "]");
		System.out.println("dlco_no = [" + getDlco_no() + "]");
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
String work_cd = req.getParameter("work_cd");
if( work_cd == null){
	System.out.println(this.toString+" : work_cd is null" );
}else{
	System.out.println(this.toString+" : work_cd is "+work_cd );
}
String dis_account = req.getParameter("dis_account");
if( dis_account == null){
	System.out.println(this.toString+" : dis_account is null" );
}else{
	System.out.println(this.toString+" : dis_account is "+dis_account );
}
String handle_clsf = req.getParameter("handle_clsf");
if( handle_clsf == null){
	System.out.println(this.toString+" : handle_clsf is null" );
}else{
	System.out.println(this.toString+" : handle_clsf is "+handle_clsf );
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
String dlco_clsf = req.getParameter("dlco_clsf");
if( dlco_clsf == null){
	System.out.println(this.toString+" : dlco_clsf is null" );
}else{
	System.out.println(this.toString+" : dlco_clsf is "+dlco_clsf );
}
String dlco_no = req.getParameter("dlco_no");
if( dlco_no == null){
	System.out.println(this.toString+" : dlco_no is null" );
}else{
	System.out.println(this.toString+" : dlco_no is "+dlco_no );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String work_cd = Util.checkString(req.getParameter("work_cd"));
String dis_account = Util.checkString(req.getParameter("dis_account"));
String handle_clsf = Util.checkString(req.getParameter("handle_clsf"));
String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
String dlco_clsf = Util.checkString(req.getParameter("dlco_clsf"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String work_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("work_cd")));
String dis_account = Util.Uni2Ksc(Util.checkString(req.getParameter("dis_account")));
String handle_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("handle_clsf")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String dlco_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setWork_cd(work_cd);
dm.setDis_account(dis_account);
dm.setHandle_clsf(handle_clsf);
dm.setFrdt(frdt);
dm.setTodt(todt);
dm.setDlco_clsf(dlco_clsf);
dm.setDlco_no(dlco_no);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jun 26 09:23:19 KST 2009 */