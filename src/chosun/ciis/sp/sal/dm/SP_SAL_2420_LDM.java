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


package chosun.ciis.sp.sal.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.sp.sal.ds.*;
import chosun.ciis.sp.sal.rec.*;

/**
 * 
 */


public class SP_SAL_2420_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mappli;
	public String sale_item_cd;
	public String purc_dlco_clsf_cd_seq;
	public String incmg_pers;

	public SP_SAL_2420_LDM(){}
	public SP_SAL_2420_LDM(String cmpy_cd, String mappli, String sale_item_cd, String purc_dlco_clsf_cd_seq, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.mappli = mappli;
		this.sale_item_cd = sale_item_cd;
		this.purc_dlco_clsf_cd_seq = purc_dlco_clsf_cd_seq;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMappli(String mappli){
		this.mappli = mappli;
	}

	public void setSale_item_cd(String sale_item_cd){
		this.sale_item_cd = sale_item_cd;
	}

	public void setPurc_dlco_clsf_cd_seq(String purc_dlco_clsf_cd_seq){
		this.purc_dlco_clsf_cd_seq = purc_dlco_clsf_cd_seq;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMappli(){
		return this.mappli;
	}

	public String getSale_item_cd(){
		return this.sale_item_cd;
	}

	public String getPurc_dlco_clsf_cd_seq(){
		return this.purc_dlco_clsf_cd_seq;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_SP_SAL_2420_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SP_SAL_2420_LDM dm = (SP_SAL_2420_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mappli);
		cstmt.setString(5, dm.sale_item_cd);
		cstmt.setString(6, dm.purc_dlco_clsf_cd_seq);
		cstmt.setString(7, dm.incmg_pers);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.sp.sal.ds.SP_SAL_2420_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("mappli = [" + getMappli() + "]");
		System.out.println("sale_item_cd = [" + getSale_item_cd() + "]");
		System.out.println("purc_dlco_clsf_cd_seq = [" + getPurc_dlco_clsf_cd_seq() + "]");
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
String mappli = req.getParameter("mappli");
if( mappli == null){
	System.out.println(this.toString+" : mappli is null" );
}else{
	System.out.println(this.toString+" : mappli is "+mappli );
}
String sale_item_cd = req.getParameter("sale_item_cd");
if( sale_item_cd == null){
	System.out.println(this.toString+" : sale_item_cd is null" );
}else{
	System.out.println(this.toString+" : sale_item_cd is "+sale_item_cd );
}
String purc_dlco_clsf_cd_seq = req.getParameter("purc_dlco_clsf_cd_seq");
if( purc_dlco_clsf_cd_seq == null){
	System.out.println(this.toString+" : purc_dlco_clsf_cd_seq is null" );
}else{
	System.out.println(this.toString+" : purc_dlco_clsf_cd_seq is "+purc_dlco_clsf_cd_seq );
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
String mappli = Util.checkString(req.getParameter("mappli"));
String sale_item_cd = Util.checkString(req.getParameter("sale_item_cd"));
String purc_dlco_clsf_cd_seq = Util.checkString(req.getParameter("purc_dlco_clsf_cd_seq"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mappli = Util.Uni2Ksc(Util.checkString(req.getParameter("mappli")));
String sale_item_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_item_cd")));
String purc_dlco_clsf_cd_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("purc_dlco_clsf_cd_seq")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMappli(mappli);
dm.setSale_item_cd(sale_item_cd);
dm.setPurc_dlco_clsf_cd_seq(purc_dlco_clsf_cd_seq);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jul 18 14:18:33 KST 2012 */