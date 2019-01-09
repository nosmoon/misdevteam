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


package chosun.ciis.is.rpt.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.rpt.ds.*;
import chosun.ciis.is.rpt.rec.*;

/**
 * 
 */


public class IS_RPT_2420_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String yyyy;
	public String purc_dlco_no;
	public String sido;
	public String gu;
	public String asnt_dstc_cd;
	public String sale_clsf;
	public String spc_sale_clsf;
	public String spc_sale_clsf_n;
	public String type;
	public String incmg_pers;
	public String incmg_pers_ip;

	public IS_RPT_2420_LDM(){}
	public IS_RPT_2420_LDM(String cmpy_cd, String yyyy, String purc_dlco_no, String sido, String gu, String asnt_dstc_cd, String sale_clsf, String spc_sale_clsf, String spc_sale_clsf_n, String type, String incmg_pers, String incmg_pers_ip){
		this.cmpy_cd = cmpy_cd;
		this.yyyy = yyyy;
		this.purc_dlco_no = purc_dlco_no;
		this.sido = sido;
		this.gu = gu;
		this.asnt_dstc_cd = asnt_dstc_cd;
		this.sale_clsf = sale_clsf;
		this.spc_sale_clsf = spc_sale_clsf;
		this.spc_sale_clsf_n = spc_sale_clsf_n;
		this.type = type;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setYyyy(String yyyy){
		this.yyyy = yyyy;
	}

	public void setPurc_dlco_no(String purc_dlco_no){
		this.purc_dlco_no = purc_dlco_no;
	}

	public void setSido(String sido){
		this.sido = sido;
	}

	public void setGu(String gu){
		this.gu = gu;
	}

	public void setAsnt_dstc_cd(String asnt_dstc_cd){
		this.asnt_dstc_cd = asnt_dstc_cd;
	}

	public void setSale_clsf(String sale_clsf){
		this.sale_clsf = sale_clsf;
	}

	public void setSpc_sale_clsf(String spc_sale_clsf){
		this.spc_sale_clsf = spc_sale_clsf;
	}

	public void setSpc_sale_clsf_n(String spc_sale_clsf_n){
		this.spc_sale_clsf_n = spc_sale_clsf_n;
	}

	public void setType(String type){
		this.type = type;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getYyyy(){
		return this.yyyy;
	}

	public String getPurc_dlco_no(){
		return this.purc_dlco_no;
	}

	public String getSido(){
		return this.sido;
	}

	public String getGu(){
		return this.gu;
	}

	public String getAsnt_dstc_cd(){
		return this.asnt_dstc_cd;
	}

	public String getSale_clsf(){
		return this.sale_clsf;
	}

	public String getSpc_sale_clsf(){
		return this.spc_sale_clsf;
	}

	public String getSpc_sale_clsf_n(){
		return this.spc_sale_clsf_n;
	}

	public String getType(){
		return this.type;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_IS_RPT_2420_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		IS_RPT_2420_LDM dm = (IS_RPT_2420_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.yyyy);
		cstmt.setString(5, dm.purc_dlco_no);
		cstmt.setString(6, dm.sido);
		cstmt.setString(7, dm.gu);
		cstmt.setString(8, dm.asnt_dstc_cd);
		cstmt.setString(9, dm.sale_clsf);
		cstmt.setString(10, dm.spc_sale_clsf);
		cstmt.setString(11, dm.spc_sale_clsf_n);
		cstmt.setString(12, dm.type);
		cstmt.setString(13, dm.incmg_pers);
		cstmt.setString(14, dm.incmg_pers_ip);
		cstmt.registerOutParameter(15, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.is.rpt.ds.IS_RPT_2420_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("yyyy = [" + getYyyy() + "]");
		System.out.println("purc_dlco_no = [" + getPurc_dlco_no() + "]");
		System.out.println("sido = [" + getSido() + "]");
		System.out.println("gu = [" + getGu() + "]");
		System.out.println("asnt_dstc_cd = [" + getAsnt_dstc_cd() + "]");
		System.out.println("sale_clsf = [" + getSale_clsf() + "]");
		System.out.println("spc_sale_clsf = [" + getSpc_sale_clsf() + "]");
		System.out.println("spc_sale_clsf_n = [" + getSpc_sale_clsf_n() + "]");
		System.out.println("type = [" + getType() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
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
String yyyy = req.getParameter("yyyy");
if( yyyy == null){
	System.out.println(this.toString+" : yyyy is null" );
}else{
	System.out.println(this.toString+" : yyyy is "+yyyy );
}
String purc_dlco_no = req.getParameter("purc_dlco_no");
if( purc_dlco_no == null){
	System.out.println(this.toString+" : purc_dlco_no is null" );
}else{
	System.out.println(this.toString+" : purc_dlco_no is "+purc_dlco_no );
}
String sido = req.getParameter("sido");
if( sido == null){
	System.out.println(this.toString+" : sido is null" );
}else{
	System.out.println(this.toString+" : sido is "+sido );
}
String gu = req.getParameter("gu");
if( gu == null){
	System.out.println(this.toString+" : gu is null" );
}else{
	System.out.println(this.toString+" : gu is "+gu );
}
String asnt_dstc_cd = req.getParameter("asnt_dstc_cd");
if( asnt_dstc_cd == null){
	System.out.println(this.toString+" : asnt_dstc_cd is null" );
}else{
	System.out.println(this.toString+" : asnt_dstc_cd is "+asnt_dstc_cd );
}
String sale_clsf = req.getParameter("sale_clsf");
if( sale_clsf == null){
	System.out.println(this.toString+" : sale_clsf is null" );
}else{
	System.out.println(this.toString+" : sale_clsf is "+sale_clsf );
}
String spc_sale_clsf = req.getParameter("spc_sale_clsf");
if( spc_sale_clsf == null){
	System.out.println(this.toString+" : spc_sale_clsf is null" );
}else{
	System.out.println(this.toString+" : spc_sale_clsf is "+spc_sale_clsf );
}
String spc_sale_clsf_n = req.getParameter("spc_sale_clsf_n");
if( spc_sale_clsf_n == null){
	System.out.println(this.toString+" : spc_sale_clsf_n is null" );
}else{
	System.out.println(this.toString+" : spc_sale_clsf_n is "+spc_sale_clsf_n );
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
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String yyyy = Util.checkString(req.getParameter("yyyy"));
String purc_dlco_no = Util.checkString(req.getParameter("purc_dlco_no"));
String sido = Util.checkString(req.getParameter("sido"));
String gu = Util.checkString(req.getParameter("gu"));
String asnt_dstc_cd = Util.checkString(req.getParameter("asnt_dstc_cd"));
String sale_clsf = Util.checkString(req.getParameter("sale_clsf"));
String spc_sale_clsf = Util.checkString(req.getParameter("spc_sale_clsf"));
String spc_sale_clsf_n = Util.checkString(req.getParameter("spc_sale_clsf_n"));
String type = Util.checkString(req.getParameter("type"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String yyyy = Util.Uni2Ksc(Util.checkString(req.getParameter("yyyy")));
String purc_dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("purc_dlco_no")));
String sido = Util.Uni2Ksc(Util.checkString(req.getParameter("sido")));
String gu = Util.Uni2Ksc(Util.checkString(req.getParameter("gu")));
String asnt_dstc_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("asnt_dstc_cd")));
String sale_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_clsf")));
String spc_sale_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("spc_sale_clsf")));
String spc_sale_clsf_n = Util.Uni2Ksc(Util.checkString(req.getParameter("spc_sale_clsf_n")));
String type = Util.Uni2Ksc(Util.checkString(req.getParameter("type")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setYyyy(yyyy);
dm.setPurc_dlco_no(purc_dlco_no);
dm.setSido(sido);
dm.setGu(gu);
dm.setAsnt_dstc_cd(asnt_dstc_cd);
dm.setSale_clsf(sale_clsf);
dm.setSpc_sale_clsf(spc_sale_clsf);
dm.setSpc_sale_clsf_n(spc_sale_clsf_n);
dm.setType(type);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jun 28 15:54:07 KST 2012 */