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

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.res.ds.*;
import chosun.ciis.ad.res.rec.*;

/**
 * 
 */


public class AD_RES_1610_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String medi_cd;
	public String frdt;
	public String todt;
	public String slcrg_pers;
	public String pubc_clsf;
	public String indt_clsf;
	public String hndl_clsf;
	public String dlco_no;
	public String hndl_plac_cd;
	public String grp_cmpy_cd;

	public AD_RES_1610_LDM(){}
	public AD_RES_1610_LDM(String cmpy_cd, String medi_cd, String frdt, String todt, String slcrg_pers, String pubc_clsf, String indt_clsf, String hndl_clsf, String dlco_no, String hndl_plac_cd, String grp_cmpy_cd){
		this.cmpy_cd = cmpy_cd;
		this.medi_cd = medi_cd;
		this.frdt = frdt;
		this.todt = todt;
		this.slcrg_pers = slcrg_pers;
		this.pubc_clsf = pubc_clsf;
		this.indt_clsf = indt_clsf;
		this.hndl_clsf = hndl_clsf;
		this.dlco_no = dlco_no;
		this.hndl_plac_cd = hndl_plac_cd;
		this.grp_cmpy_cd = grp_cmpy_cd;
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

	public void setSlcrg_pers(String slcrg_pers){
		this.slcrg_pers = slcrg_pers;
	}

	public void setPubc_clsf(String pubc_clsf){
		this.pubc_clsf = pubc_clsf;
	}

	public void setIndt_clsf(String indt_clsf){
		this.indt_clsf = indt_clsf;
	}

	public void setHndl_clsf(String hndl_clsf){
		this.hndl_clsf = hndl_clsf;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setHndl_plac_cd(String hndl_plac_cd){
		this.hndl_plac_cd = hndl_plac_cd;
	}

	public void setGrp_cmpy_cd(String grp_cmpy_cd){
		this.grp_cmpy_cd = grp_cmpy_cd;
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

	public String getSlcrg_pers(){
		return this.slcrg_pers;
	}

	public String getPubc_clsf(){
		return this.pubc_clsf;
	}

	public String getIndt_clsf(){
		return this.indt_clsf;
	}

	public String getHndl_clsf(){
		return this.hndl_clsf;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getHndl_plac_cd(){
		return this.hndl_plac_cd;
	}

	public String getGrp_cmpy_cd(){
		return this.grp_cmpy_cd;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_RES_1610_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_RES_1610_LDM dm = (AD_RES_1610_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.medi_cd);
		cstmt.setString(5, dm.frdt);
		cstmt.setString(6, dm.todt);
		cstmt.setString(7, dm.slcrg_pers);
		cstmt.setString(8, dm.pubc_clsf);
		cstmt.setString(9, dm.indt_clsf);
		cstmt.setString(10, dm.hndl_clsf);
		cstmt.setString(11, dm.dlco_no);
		cstmt.setString(12, dm.hndl_plac_cd);
		cstmt.setString(13, dm.grp_cmpy_cd);
		cstmt.registerOutParameter(14, Types.VARCHAR);
		cstmt.registerOutParameter(15, Types.VARCHAR);
		cstmt.registerOutParameter(16, Types.VARCHAR);
		cstmt.registerOutParameter(17, Types.VARCHAR);
		cstmt.registerOutParameter(18, Types.VARCHAR);
		cstmt.registerOutParameter(19, Types.VARCHAR);
		cstmt.registerOutParameter(20, Types.VARCHAR);
		cstmt.registerOutParameter(21, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.res.ds.AD_RES_1610_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("frdt = [" + getFrdt() + "]");
		System.out.println("todt = [" + getTodt() + "]");
		System.out.println("slcrg_pers = [" + getSlcrg_pers() + "]");
		System.out.println("pubc_clsf = [" + getPubc_clsf() + "]");
		System.out.println("indt_clsf = [" + getIndt_clsf() + "]");
		System.out.println("hndl_clsf = [" + getHndl_clsf() + "]");
		System.out.println("dlco_no = [" + getDlco_no() + "]");
		System.out.println("hndl_plac_cd = [" + getHndl_plac_cd() + "]");
		System.out.println("grp_cmpy_cd = [" + getGrp_cmpy_cd() + "]");
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
String slcrg_pers = req.getParameter("slcrg_pers");
if( slcrg_pers == null){
	System.out.println(this.toString+" : slcrg_pers is null" );
}else{
	System.out.println(this.toString+" : slcrg_pers is "+slcrg_pers );
}
String pubc_clsf = req.getParameter("pubc_clsf");
if( pubc_clsf == null){
	System.out.println(this.toString+" : pubc_clsf is null" );
}else{
	System.out.println(this.toString+" : pubc_clsf is "+pubc_clsf );
}
String indt_clsf = req.getParameter("indt_clsf");
if( indt_clsf == null){
	System.out.println(this.toString+" : indt_clsf is null" );
}else{
	System.out.println(this.toString+" : indt_clsf is "+indt_clsf );
}
String hndl_clsf = req.getParameter("hndl_clsf");
if( hndl_clsf == null){
	System.out.println(this.toString+" : hndl_clsf is null" );
}else{
	System.out.println(this.toString+" : hndl_clsf is "+hndl_clsf );
}
String dlco_no = req.getParameter("dlco_no");
if( dlco_no == null){
	System.out.println(this.toString+" : dlco_no is null" );
}else{
	System.out.println(this.toString+" : dlco_no is "+dlco_no );
}
String hndl_plac_cd = req.getParameter("hndl_plac_cd");
if( hndl_plac_cd == null){
	System.out.println(this.toString+" : hndl_plac_cd is null" );
}else{
	System.out.println(this.toString+" : hndl_plac_cd is "+hndl_plac_cd );
}
String grp_cmpy_cd = req.getParameter("grp_cmpy_cd");
if( grp_cmpy_cd == null){
	System.out.println(this.toString+" : grp_cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : grp_cmpy_cd is "+grp_cmpy_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
String slcrg_pers = Util.checkString(req.getParameter("slcrg_pers"));
String pubc_clsf = Util.checkString(req.getParameter("pubc_clsf"));
String indt_clsf = Util.checkString(req.getParameter("indt_clsf"));
String hndl_clsf = Util.checkString(req.getParameter("hndl_clsf"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
String hndl_plac_cd = Util.checkString(req.getParameter("hndl_plac_cd"));
String grp_cmpy_cd = Util.checkString(req.getParameter("grp_cmpy_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String slcrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("slcrg_pers")));
String pubc_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_clsf")));
String indt_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("indt_clsf")));
String hndl_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("hndl_clsf")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
String hndl_plac_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("hndl_plac_cd")));
String grp_cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("grp_cmpy_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMedi_cd(medi_cd);
dm.setFrdt(frdt);
dm.setTodt(todt);
dm.setSlcrg_pers(slcrg_pers);
dm.setPubc_clsf(pubc_clsf);
dm.setIndt_clsf(indt_clsf);
dm.setHndl_clsf(hndl_clsf);
dm.setDlco_no(dlco_no);
dm.setHndl_plac_cd(hndl_plac_cd);
dm.setGrp_cmpy_cd(grp_cmpy_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jul 14 14:28:11 KST 2017 */