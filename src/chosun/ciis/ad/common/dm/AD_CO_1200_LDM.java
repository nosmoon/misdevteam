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


package chosun.ciis.ad.common.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.common.ds.*;
import chosun.ciis.ad.common.rec.*;

/**
 * 
 */


public class AD_CO_1200_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String medi_clsf;
	public String dlco_no1;
	public String dlco_no2;
	public String dlco_nm;
	public String gnr_advcs_yn;
	public String arow_advcs_yn;
	public String agn_yn;
	public String advt_bo_yn;
	public String bo_bof_yn;

	public AD_CO_1200_LDM(){}
	public AD_CO_1200_LDM(String cmpy_cd, String medi_clsf, String dlco_no1, String dlco_no2, String dlco_nm, String gnr_advcs_yn, String arow_advcs_yn, String agn_yn, String advt_bo_yn, String bo_bof_yn){
		this.cmpy_cd = cmpy_cd;
		this.medi_clsf = medi_clsf;
		this.dlco_no1 = dlco_no1;
		this.dlco_no2 = dlco_no2;
		this.dlco_nm = dlco_nm;
		this.gnr_advcs_yn = gnr_advcs_yn;
		this.arow_advcs_yn = arow_advcs_yn;
		this.agn_yn = agn_yn;
		this.advt_bo_yn = advt_bo_yn;
		this.bo_bof_yn = bo_bof_yn;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMedi_clsf(String medi_clsf){
		this.medi_clsf = medi_clsf;
	}

	public void setDlco_no1(String dlco_no1){
		this.dlco_no1 = dlco_no1;
	}

	public void setDlco_no2(String dlco_no2){
		this.dlco_no2 = dlco_no2;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setGnr_advcs_yn(String gnr_advcs_yn){
		this.gnr_advcs_yn = gnr_advcs_yn;
	}

	public void setArow_advcs_yn(String arow_advcs_yn){
		this.arow_advcs_yn = arow_advcs_yn;
	}

	public void setAgn_yn(String agn_yn){
		this.agn_yn = agn_yn;
	}

	public void setAdvt_bo_yn(String advt_bo_yn){
		this.advt_bo_yn = advt_bo_yn;
	}

	public void setBo_bof_yn(String bo_bof_yn){
		this.bo_bof_yn = bo_bof_yn;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMedi_clsf(){
		return this.medi_clsf;
	}

	public String getDlco_no1(){
		return this.dlco_no1;
	}

	public String getDlco_no2(){
		return this.dlco_no2;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getGnr_advcs_yn(){
		return this.gnr_advcs_yn;
	}

	public String getArow_advcs_yn(){
		return this.arow_advcs_yn;
	}

	public String getAgn_yn(){
		return this.agn_yn;
	}

	public String getAdvt_bo_yn(){
		return this.advt_bo_yn;
	}

	public String getBo_bof_yn(){
		return this.bo_bof_yn;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_CO_1200_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_CO_1200_LDM dm = (AD_CO_1200_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.medi_clsf);
		cstmt.setString(5, dm.dlco_no1);
		cstmt.setString(6, dm.dlco_no2);
		cstmt.setString(7, dm.dlco_nm);
		cstmt.setString(8, dm.gnr_advcs_yn);
		cstmt.setString(9, dm.arow_advcs_yn);
		cstmt.setString(10, dm.agn_yn);
		cstmt.setString(11, dm.advt_bo_yn);
		cstmt.setString(12, dm.bo_bof_yn);
		cstmt.registerOutParameter(13, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.common.ds.AD_CO_1200_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("medi_clsf = [" + getMedi_clsf() + "]");
		System.out.println("dlco_no1 = [" + getDlco_no1() + "]");
		System.out.println("dlco_no2 = [" + getDlco_no2() + "]");
		System.out.println("dlco_nm = [" + getDlco_nm() + "]");
		System.out.println("gnr_advcs_yn = [" + getGnr_advcs_yn() + "]");
		System.out.println("arow_advcs_yn = [" + getArow_advcs_yn() + "]");
		System.out.println("agn_yn = [" + getAgn_yn() + "]");
		System.out.println("advt_bo_yn = [" + getAdvt_bo_yn() + "]");
		System.out.println("bo_bof_yn = [" + getBo_bof_yn() + "]");
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
String medi_clsf = req.getParameter("medi_clsf");
if( medi_clsf == null){
	System.out.println(this.toString+" : medi_clsf is null" );
}else{
	System.out.println(this.toString+" : medi_clsf is "+medi_clsf );
}
String dlco_no1 = req.getParameter("dlco_no1");
if( dlco_no1 == null){
	System.out.println(this.toString+" : dlco_no1 is null" );
}else{
	System.out.println(this.toString+" : dlco_no1 is "+dlco_no1 );
}
String dlco_no2 = req.getParameter("dlco_no2");
if( dlco_no2 == null){
	System.out.println(this.toString+" : dlco_no2 is null" );
}else{
	System.out.println(this.toString+" : dlco_no2 is "+dlco_no2 );
}
String dlco_nm = req.getParameter("dlco_nm");
if( dlco_nm == null){
	System.out.println(this.toString+" : dlco_nm is null" );
}else{
	System.out.println(this.toString+" : dlco_nm is "+dlco_nm );
}
String gnr_advcs_yn = req.getParameter("gnr_advcs_yn");
if( gnr_advcs_yn == null){
	System.out.println(this.toString+" : gnr_advcs_yn is null" );
}else{
	System.out.println(this.toString+" : gnr_advcs_yn is "+gnr_advcs_yn );
}
String arow_advcs_yn = req.getParameter("arow_advcs_yn");
if( arow_advcs_yn == null){
	System.out.println(this.toString+" : arow_advcs_yn is null" );
}else{
	System.out.println(this.toString+" : arow_advcs_yn is "+arow_advcs_yn );
}
String agn_yn = req.getParameter("agn_yn");
if( agn_yn == null){
	System.out.println(this.toString+" : agn_yn is null" );
}else{
	System.out.println(this.toString+" : agn_yn is "+agn_yn );
}
String advt_bo_yn = req.getParameter("advt_bo_yn");
if( advt_bo_yn == null){
	System.out.println(this.toString+" : advt_bo_yn is null" );
}else{
	System.out.println(this.toString+" : advt_bo_yn is "+advt_bo_yn );
}
String bo_bof_yn = req.getParameter("bo_bof_yn");
if( bo_bof_yn == null){
	System.out.println(this.toString+" : bo_bof_yn is null" );
}else{
	System.out.println(this.toString+" : bo_bof_yn is "+bo_bof_yn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String medi_clsf = Util.checkString(req.getParameter("medi_clsf"));
String dlco_no1 = Util.checkString(req.getParameter("dlco_no1"));
String dlco_no2 = Util.checkString(req.getParameter("dlco_no2"));
String dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
String gnr_advcs_yn = Util.checkString(req.getParameter("gnr_advcs_yn"));
String arow_advcs_yn = Util.checkString(req.getParameter("arow_advcs_yn"));
String agn_yn = Util.checkString(req.getParameter("agn_yn"));
String advt_bo_yn = Util.checkString(req.getParameter("advt_bo_yn"));
String bo_bof_yn = Util.checkString(req.getParameter("bo_bof_yn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String medi_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_clsf")));
String dlco_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no1")));
String dlco_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no2")));
String dlco_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_nm")));
String gnr_advcs_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("gnr_advcs_yn")));
String arow_advcs_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("arow_advcs_yn")));
String agn_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("agn_yn")));
String advt_bo_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_bo_yn")));
String bo_bof_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_bof_yn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMedi_clsf(medi_clsf);
dm.setDlco_no1(dlco_no1);
dm.setDlco_no2(dlco_no2);
dm.setDlco_nm(dlco_nm);
dm.setGnr_advcs_yn(gnr_advcs_yn);
dm.setArow_advcs_yn(arow_advcs_yn);
dm.setAgn_yn(agn_yn);
dm.setAdvt_bo_yn(advt_bo_yn);
dm.setBo_bof_yn(bo_bof_yn);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Dec 10 11:30:37 KST 2012 */