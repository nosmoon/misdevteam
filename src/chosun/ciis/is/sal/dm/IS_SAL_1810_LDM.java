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


package chosun.ciis.is.sal.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.sal.ds.*;
import chosun.ciis.is.sal.rec.*;

/**
 * 
 */


public class IS_SAL_1810_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String purc_frdt;
	public String purc_todt;
	public String erplace_cd;
	public String asnt_dstc_cd;
	public String purc_clsf;
	public String dlco_clsf_cd_seq;
	public String trc_yn;
	public String type;
	public String incmg_pers;

	public IS_SAL_1810_LDM(){}
	public IS_SAL_1810_LDM(String cmpy_cd, String purc_frdt, String purc_todt, String erplace_cd, String asnt_dstc_cd, String purc_clsf, String dlco_clsf_cd_seq, String trc_yn, String type, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.purc_frdt = purc_frdt;
		this.purc_todt = purc_todt;
		this.erplace_cd = erplace_cd;
		this.asnt_dstc_cd = asnt_dstc_cd;
		this.purc_clsf = purc_clsf;
		this.dlco_clsf_cd_seq = dlco_clsf_cd_seq;
		this.trc_yn = trc_yn;
		this.type = type;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setPurc_frdt(String purc_frdt){
		this.purc_frdt = purc_frdt;
	}

	public void setPurc_todt(String purc_todt){
		this.purc_todt = purc_todt;
	}

	public void setErplace_cd(String erplace_cd){
		this.erplace_cd = erplace_cd;
	}

	public void setAsnt_dstc_cd(String asnt_dstc_cd){
		this.asnt_dstc_cd = asnt_dstc_cd;
	}

	public void setPurc_clsf(String purc_clsf){
		this.purc_clsf = purc_clsf;
	}

	public void setDlco_clsf_cd_seq(String dlco_clsf_cd_seq){
		this.dlco_clsf_cd_seq = dlco_clsf_cd_seq;
	}

	public void setTrc_yn(String trc_yn){
		this.trc_yn = trc_yn;
	}

	public void setType(String type){
		this.type = type;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getPurc_frdt(){
		return this.purc_frdt;
	}

	public String getPurc_todt(){
		return this.purc_todt;
	}

	public String getErplace_cd(){
		return this.erplace_cd;
	}

	public String getAsnt_dstc_cd(){
		return this.asnt_dstc_cd;
	}

	public String getPurc_clsf(){
		return this.purc_clsf;
	}

	public String getDlco_clsf_cd_seq(){
		return this.dlco_clsf_cd_seq;
	}

	public String getTrc_yn(){
		return this.trc_yn;
	}

	public String getType(){
		return this.type;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_IS_SAL_1810_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		IS_SAL_1810_LDM dm = (IS_SAL_1810_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.purc_frdt);
		cstmt.setString(5, dm.purc_todt);
		cstmt.setString(6, dm.erplace_cd);
		cstmt.setString(7, dm.asnt_dstc_cd);
		cstmt.setString(8, dm.purc_clsf);
		cstmt.setString(9, dm.dlco_clsf_cd_seq);
		cstmt.setString(10, dm.trc_yn);
		cstmt.setString(11, dm.type);
		cstmt.setString(12, dm.incmg_pers);
		cstmt.registerOutParameter(13, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.is.sal.ds.IS_SAL_1810_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("purc_frdt = [" + getPurc_frdt() + "]");
		System.out.println("purc_todt = [" + getPurc_todt() + "]");
		System.out.println("erplace_cd = [" + getErplace_cd() + "]");
		System.out.println("asnt_dstc_cd = [" + getAsnt_dstc_cd() + "]");
		System.out.println("purc_clsf = [" + getPurc_clsf() + "]");
		System.out.println("dlco_clsf_cd_seq = [" + getDlco_clsf_cd_seq() + "]");
		System.out.println("trc_yn = [" + getTrc_yn() + "]");
		System.out.println("type = [" + getType() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
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
String purc_frdt = req.getParameter("purc_frdt");
if( purc_frdt == null){
	System.out.println(this.toString+" : purc_frdt is null" );
}else{
	System.out.println(this.toString+" : purc_frdt is "+purc_frdt );
}
String purc_todt = req.getParameter("purc_todt");
if( purc_todt == null){
	System.out.println(this.toString+" : purc_todt is null" );
}else{
	System.out.println(this.toString+" : purc_todt is "+purc_todt );
}
String erplace_cd = req.getParameter("erplace_cd");
if( erplace_cd == null){
	System.out.println(this.toString+" : erplace_cd is null" );
}else{
	System.out.println(this.toString+" : erplace_cd is "+erplace_cd );
}
String asnt_dstc_cd = req.getParameter("asnt_dstc_cd");
if( asnt_dstc_cd == null){
	System.out.println(this.toString+" : asnt_dstc_cd is null" );
}else{
	System.out.println(this.toString+" : asnt_dstc_cd is "+asnt_dstc_cd );
}
String purc_clsf = req.getParameter("purc_clsf");
if( purc_clsf == null){
	System.out.println(this.toString+" : purc_clsf is null" );
}else{
	System.out.println(this.toString+" : purc_clsf is "+purc_clsf );
}
String dlco_clsf_cd_seq = req.getParameter("dlco_clsf_cd_seq");
if( dlco_clsf_cd_seq == null){
	System.out.println(this.toString+" : dlco_clsf_cd_seq is null" );
}else{
	System.out.println(this.toString+" : dlco_clsf_cd_seq is "+dlco_clsf_cd_seq );
}
String trc_yn = req.getParameter("trc_yn");
if( trc_yn == null){
	System.out.println(this.toString+" : trc_yn is null" );
}else{
	System.out.println(this.toString+" : trc_yn is "+trc_yn );
}
String type = req.getParameter("type");
if( type == null){
	System.out.println(this.toString+" : type is null" );
}else{
	System.out.println(this.toString+" : type is "+type );
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
String purc_frdt = Util.checkString(req.getParameter("purc_frdt"));
String purc_todt = Util.checkString(req.getParameter("purc_todt"));
String erplace_cd = Util.checkString(req.getParameter("erplace_cd"));
String asnt_dstc_cd = Util.checkString(req.getParameter("asnt_dstc_cd"));
String purc_clsf = Util.checkString(req.getParameter("purc_clsf"));
String dlco_clsf_cd_seq = Util.checkString(req.getParameter("dlco_clsf_cd_seq"));
String trc_yn = Util.checkString(req.getParameter("trc_yn"));
String type = Util.checkString(req.getParameter("type"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String purc_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("purc_frdt")));
String purc_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("purc_todt")));
String erplace_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("erplace_cd")));
String asnt_dstc_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("asnt_dstc_cd")));
String purc_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("purc_clsf")));
String dlco_clsf_cd_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf_cd_seq")));
String trc_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("trc_yn")));
String type = Util.Uni2Ksc(Util.checkString(req.getParameter("type")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setPurc_frdt(purc_frdt);
dm.setPurc_todt(purc_todt);
dm.setErplace_cd(erplace_cd);
dm.setAsnt_dstc_cd(asnt_dstc_cd);
dm.setPurc_clsf(purc_clsf);
dm.setDlco_clsf_cd_seq(dlco_clsf_cd_seq);
dm.setTrc_yn(trc_yn);
dm.setType(type);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue May 15 17:09:01 KST 2012 */