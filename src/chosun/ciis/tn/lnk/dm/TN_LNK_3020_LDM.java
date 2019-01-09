/***************************************************************************************************
* 파일명 : .java
* 기능 : 	   
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.tn.lnk.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.lnk.ds.*;
import chosun.ciis.tn.lnk.rec.*;

/**
 * 
 */


public class TN_LNK_3020_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String pymtmm;
	public String pymtdd;
	public String cmsidx;
	public String deptidx;
	public String supp_clsf;
	public String result_stat;
	public String search_clsf;
	public String search_nm;

	public TN_LNK_3020_LDM(){}
	public TN_LNK_3020_LDM(String cmpy_cd, String pymtmm, String pymtdd, String cmsidx, String deptidx, String supp_clsf, String result_stat, String search_clsf, String search_nm){
		this.cmpy_cd = cmpy_cd;
		this.pymtmm = pymtmm;
		this.pymtdd = pymtdd;
		this.cmsidx = cmsidx;
		this.deptidx = deptidx;
		this.supp_clsf = supp_clsf;
		this.result_stat = result_stat;
		this.search_clsf = search_clsf;
		this.search_nm = search_nm;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setPymtmm(String pymtmm){
		this.pymtmm = pymtmm;
	}

	public void setPymtdd(String pymtdd){
		this.pymtdd = pymtdd;
	}

	public void setCmsidx(String cmsidx){
		this.cmsidx = cmsidx;
	}

	public void setDeptidx(String deptidx){
		this.deptidx = deptidx;
	}

	public void setSupp_clsf(String supp_clsf){
		this.supp_clsf = supp_clsf;
	}

	public void setResult_stat(String result_stat){
		this.result_stat = result_stat;
	}

	public void setSearch_clsf(String search_clsf){
		this.search_clsf = search_clsf;
	}

	public void setSearch_nm(String search_nm){
		this.search_nm = search_nm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getPymtmm(){
		return this.pymtmm;
	}

	public String getPymtdd(){
		return this.pymtdd;
	}

	public String getCmsidx(){
		return this.cmsidx;
	}

	public String getDeptidx(){
		return this.deptidx;
	}

	public String getSupp_clsf(){
		return this.supp_clsf;
	}

	public String getResult_stat(){
		return this.result_stat;
	}

	public String getSearch_clsf(){
		return this.search_clsf;
	}

	public String getSearch_nm(){
		return this.search_nm;
	}

	public String getSQL(){
		 return "{ call MISTNN.SP_TN_LNK_3020_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		TN_LNK_3020_LDM dm = (TN_LNK_3020_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.pymtmm);
		cstmt.setString(5, dm.pymtdd);
		cstmt.setString(6, dm.cmsidx);
		cstmt.setString(7, dm.deptidx);
		cstmt.setString(8, dm.supp_clsf);
		cstmt.setString(9, dm.result_stat);
		cstmt.setString(10, dm.search_clsf);
		cstmt.setString(11, dm.search_nm);
		cstmt.registerOutParameter(12, Types.INTEGER);
		cstmt.registerOutParameter(13, Types.INTEGER);
		cstmt.registerOutParameter(14, Types.INTEGER);
		cstmt.registerOutParameter(15, Types.INTEGER);
		cstmt.registerOutParameter(16, Types.INTEGER);
		cstmt.registerOutParameter(17, Types.INTEGER);
		cstmt.registerOutParameter(18, Types.INTEGER);
		cstmt.registerOutParameter(19, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.tn.lnk.ds.TN_LNK_3020_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("pymtmm = [" + getPymtmm() + "]");
		System.out.println("pymtdd = [" + getPymtdd() + "]");
		System.out.println("cmsidx = [" + getCmsidx() + "]");
		System.out.println("deptidx = [" + getDeptidx() + "]");
		System.out.println("supp_clsf = [" + getSupp_clsf() + "]");
		System.out.println("result_stat = [" + getResult_stat() + "]");
		System.out.println("search_clsf = [" + getSearch_clsf() + "]");
		System.out.println("search_nm = [" + getSearch_nm() + "]");
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
String pymtmm = req.getParameter("pymtmm");
if( pymtmm == null){
	System.out.println(this.toString+" : pymtmm is null" );
}else{
	System.out.println(this.toString+" : pymtmm is "+pymtmm );
}
String pymtdd = req.getParameter("pymtdd");
if( pymtdd == null){
	System.out.println(this.toString+" : pymtdd is null" );
}else{
	System.out.println(this.toString+" : pymtdd is "+pymtdd );
}
String cmsidx = req.getParameter("cmsidx");
if( cmsidx == null){
	System.out.println(this.toString+" : cmsidx is null" );
}else{
	System.out.println(this.toString+" : cmsidx is "+cmsidx );
}
String deptidx = req.getParameter("deptidx");
if( deptidx == null){
	System.out.println(this.toString+" : deptidx is null" );
}else{
	System.out.println(this.toString+" : deptidx is "+deptidx );
}
String supp_clsf = req.getParameter("supp_clsf");
if( supp_clsf == null){
	System.out.println(this.toString+" : supp_clsf is null" );
}else{
	System.out.println(this.toString+" : supp_clsf is "+supp_clsf );
}
String result_stat = req.getParameter("result_stat");
if( result_stat == null){
	System.out.println(this.toString+" : result_stat is null" );
}else{
	System.out.println(this.toString+" : result_stat is "+result_stat );
}
String search_clsf = req.getParameter("search_clsf");
if( search_clsf == null){
	System.out.println(this.toString+" : search_clsf is null" );
}else{
	System.out.println(this.toString+" : search_clsf is "+search_clsf );
}
String search_nm = req.getParameter("search_nm");
if( search_nm == null){
	System.out.println(this.toString+" : search_nm is null" );
}else{
	System.out.println(this.toString+" : search_nm is "+search_nm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String pymtmm = Util.checkString(req.getParameter("pymtmm"));
String pymtdd = Util.checkString(req.getParameter("pymtdd"));
String cmsidx = Util.checkString(req.getParameter("cmsidx"));
String deptidx = Util.checkString(req.getParameter("deptidx"));
String supp_clsf = Util.checkString(req.getParameter("supp_clsf"));
String result_stat = Util.checkString(req.getParameter("result_stat"));
String search_clsf = Util.checkString(req.getParameter("search_clsf"));
String search_nm = Util.checkString(req.getParameter("search_nm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String pymtmm = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtmm")));
String pymtdd = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtdd")));
String cmsidx = Util.Uni2Ksc(Util.checkString(req.getParameter("cmsidx")));
String deptidx = Util.Uni2Ksc(Util.checkString(req.getParameter("deptidx")));
String supp_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("supp_clsf")));
String result_stat = Util.Uni2Ksc(Util.checkString(req.getParameter("result_stat")));
String search_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("search_clsf")));
String search_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("search_nm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setPymtmm(pymtmm);
dm.setPymtdd(pymtdd);
dm.setCmsidx(cmsidx);
dm.setDeptidx(deptidx);
dm.setSupp_clsf(supp_clsf);
dm.setResult_stat(result_stat);
dm.setSearch_clsf(search_clsf);
dm.setSearch_nm(search_nm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Aug 19 11:34:02 KST 2016 */