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


package chosun.ciis.is.bus.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.bus.ds.*;
import chosun.ciis.is.bus.rec.*;

/**
 * 
 */


public class IS_BUS_2010_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String feed_frdt;
	public String feed_todt;
	public String dept_cd;
	public String sub_dept_cd;
	public String purc_dlco_no;
	public String sido;
	public String gu;
	public String incmg_pers_clsf_010;
	public String incmg_pers_clsf_020;
	public String incmg_pers_clsf_030;
	public String incmg_pers;

	public IS_BUS_2010_LDM(){}
	public IS_BUS_2010_LDM(String cmpy_cd, String feed_frdt, String feed_todt, String dept_cd, String sub_dept_cd, String purc_dlco_no, String sido, String gu, String incmg_pers_clsf_010, String incmg_pers_clsf_020, String incmg_pers_clsf_030, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.feed_frdt = feed_frdt;
		this.feed_todt = feed_todt;
		this.dept_cd = dept_cd;
		this.sub_dept_cd = sub_dept_cd;
		this.purc_dlco_no = purc_dlco_no;
		this.sido = sido;
		this.gu = gu;
		this.incmg_pers_clsf_010 = incmg_pers_clsf_010;
		this.incmg_pers_clsf_020 = incmg_pers_clsf_020;
		this.incmg_pers_clsf_030 = incmg_pers_clsf_030;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFeed_frdt(String feed_frdt){
		this.feed_frdt = feed_frdt;
	}

	public void setFeed_todt(String feed_todt){
		this.feed_todt = feed_todt;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setSub_dept_cd(String sub_dept_cd){
		this.sub_dept_cd = sub_dept_cd;
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

	public void setIncmg_pers_clsf_010(String incmg_pers_clsf_010){
		this.incmg_pers_clsf_010 = incmg_pers_clsf_010;
	}

	public void setIncmg_pers_clsf_020(String incmg_pers_clsf_020){
		this.incmg_pers_clsf_020 = incmg_pers_clsf_020;
	}

	public void setIncmg_pers_clsf_030(String incmg_pers_clsf_030){
		this.incmg_pers_clsf_030 = incmg_pers_clsf_030;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFeed_frdt(){
		return this.feed_frdt;
	}

	public String getFeed_todt(){
		return this.feed_todt;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getSub_dept_cd(){
		return this.sub_dept_cd;
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

	public String getIncmg_pers_clsf_010(){
		return this.incmg_pers_clsf_010;
	}

	public String getIncmg_pers_clsf_020(){
		return this.incmg_pers_clsf_020;
	}

	public String getIncmg_pers_clsf_030(){
		return this.incmg_pers_clsf_030;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_IS_BUS_2010_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		IS_BUS_2010_LDM dm = (IS_BUS_2010_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.feed_frdt);
		cstmt.setString(5, dm.feed_todt);
		cstmt.setString(6, dm.dept_cd);
		cstmt.setString(7, dm.sub_dept_cd);
		cstmt.setString(8, dm.purc_dlco_no);
		cstmt.setString(9, dm.sido);
		cstmt.setString(10, dm.gu);
		cstmt.setString(11, dm.incmg_pers_clsf_010);
		cstmt.setString(12, dm.incmg_pers_clsf_020);
		cstmt.setString(13, dm.incmg_pers_clsf_030);
		cstmt.setString(14, dm.incmg_pers);
		cstmt.registerOutParameter(15, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.is.bus.ds.IS_BUS_2010_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("feed_frdt = [" + getFeed_frdt() + "]");
		System.out.println("feed_todt = [" + getFeed_todt() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("sub_dept_cd = [" + getSub_dept_cd() + "]");
		System.out.println("purc_dlco_no = [" + getPurc_dlco_no() + "]");
		System.out.println("sido = [" + getSido() + "]");
		System.out.println("gu = [" + getGu() + "]");
		System.out.println("incmg_pers_clsf_010 = [" + getIncmg_pers_clsf_010() + "]");
		System.out.println("incmg_pers_clsf_020 = [" + getIncmg_pers_clsf_020() + "]");
		System.out.println("incmg_pers_clsf_030 = [" + getIncmg_pers_clsf_030() + "]");
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
String feed_frdt = req.getParameter("feed_frdt");
if( feed_frdt == null){
	System.out.println(this.toString+" : feed_frdt is null" );
}else{
	System.out.println(this.toString+" : feed_frdt is "+feed_frdt );
}
String feed_todt = req.getParameter("feed_todt");
if( feed_todt == null){
	System.out.println(this.toString+" : feed_todt is null" );
}else{
	System.out.println(this.toString+" : feed_todt is "+feed_todt );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String sub_dept_cd = req.getParameter("sub_dept_cd");
if( sub_dept_cd == null){
	System.out.println(this.toString+" : sub_dept_cd is null" );
}else{
	System.out.println(this.toString+" : sub_dept_cd is "+sub_dept_cd );
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
String incmg_pers_clsf_010 = req.getParameter("incmg_pers_clsf_010");
if( incmg_pers_clsf_010 == null){
	System.out.println(this.toString+" : incmg_pers_clsf_010 is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_clsf_010 is "+incmg_pers_clsf_010 );
}
String incmg_pers_clsf_020 = req.getParameter("incmg_pers_clsf_020");
if( incmg_pers_clsf_020 == null){
	System.out.println(this.toString+" : incmg_pers_clsf_020 is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_clsf_020 is "+incmg_pers_clsf_020 );
}
String incmg_pers_clsf_030 = req.getParameter("incmg_pers_clsf_030");
if( incmg_pers_clsf_030 == null){
	System.out.println(this.toString+" : incmg_pers_clsf_030 is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_clsf_030 is "+incmg_pers_clsf_030 );
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
String feed_frdt = Util.checkString(req.getParameter("feed_frdt"));
String feed_todt = Util.checkString(req.getParameter("feed_todt"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
String purc_dlco_no = Util.checkString(req.getParameter("purc_dlco_no"));
String sido = Util.checkString(req.getParameter("sido"));
String gu = Util.checkString(req.getParameter("gu"));
String incmg_pers_clsf_010 = Util.checkString(req.getParameter("incmg_pers_clsf_010"));
String incmg_pers_clsf_020 = Util.checkString(req.getParameter("incmg_pers_clsf_020"));
String incmg_pers_clsf_030 = Util.checkString(req.getParameter("incmg_pers_clsf_030"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String feed_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("feed_frdt")));
String feed_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("feed_todt")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String sub_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sub_dept_cd")));
String purc_dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("purc_dlco_no")));
String sido = Util.Uni2Ksc(Util.checkString(req.getParameter("sido")));
String gu = Util.Uni2Ksc(Util.checkString(req.getParameter("gu")));
String incmg_pers_clsf_010 = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_clsf_010")));
String incmg_pers_clsf_020 = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_clsf_020")));
String incmg_pers_clsf_030 = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_clsf_030")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFeed_frdt(feed_frdt);
dm.setFeed_todt(feed_todt);
dm.setDept_cd(dept_cd);
dm.setSub_dept_cd(sub_dept_cd);
dm.setPurc_dlco_no(purc_dlco_no);
dm.setSido(sido);
dm.setGu(gu);
dm.setIncmg_pers_clsf_010(incmg_pers_clsf_010);
dm.setIncmg_pers_clsf_020(incmg_pers_clsf_020);
dm.setIncmg_pers_clsf_030(incmg_pers_clsf_030);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jun 21 11:31:21 KST 2012 */