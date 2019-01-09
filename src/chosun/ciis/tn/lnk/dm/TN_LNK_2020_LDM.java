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


public class TN_LNK_2020_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String cmsidx;
	public String aplc_path;
	public String request_dt;
	public String result_dt;
	public String aplc_clsf;
	public String cmsstatus;
	public String proof_stat;
	public String result_stat;
	public String search_clsf;
	public String search_nm;
	public String errorcode;

	public TN_LNK_2020_LDM(){}
	public TN_LNK_2020_LDM(String cmpy_cd, String cmsidx, String aplc_path, String request_dt, String result_dt, String aplc_clsf, String cmsstatus, String proof_stat, String result_stat, String search_clsf, String search_nm, String errorcode){
		this.cmpy_cd = cmpy_cd;
		this.cmsidx = cmsidx;
		this.aplc_path = aplc_path;
		this.request_dt = request_dt;
		this.result_dt = result_dt;
		this.aplc_clsf = aplc_clsf;
		this.cmsstatus = cmsstatus;
		this.proof_stat = proof_stat;
		this.result_stat = result_stat;
		this.search_clsf = search_clsf;
		this.search_nm = search_nm;
		this.errorcode = errorcode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setCmsidx(String cmsidx){
		this.cmsidx = cmsidx;
	}

	public void setAplc_path(String aplc_path){
		this.aplc_path = aplc_path;
	}

	public void setRequest_dt(String request_dt){
		this.request_dt = request_dt;
	}

	public void setResult_dt(String result_dt){
		this.result_dt = result_dt;
	}

	public void setAplc_clsf(String aplc_clsf){
		this.aplc_clsf = aplc_clsf;
	}

	public void setCmsstatus(String cmsstatus){
		this.cmsstatus = cmsstatus;
	}

	public void setProof_stat(String proof_stat){
		this.proof_stat = proof_stat;
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

	public void setErrorcode(String errorcode){
		this.errorcode = errorcode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getCmsidx(){
		return this.cmsidx;
	}

	public String getAplc_path(){
		return this.aplc_path;
	}

	public String getRequest_dt(){
		return this.request_dt;
	}

	public String getResult_dt(){
		return this.result_dt;
	}

	public String getAplc_clsf(){
		return this.aplc_clsf;
	}

	public String getCmsstatus(){
		return this.cmsstatus;
	}

	public String getProof_stat(){
		return this.proof_stat;
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

	public String getErrorcode(){
		return this.errorcode;
	}

	public String getSQL(){
		 return "{ call MISTNN.SP_TN_LNK_2020_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		TN_LNK_2020_LDM dm = (TN_LNK_2020_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.cmsidx);
		cstmt.setString(5, dm.aplc_path);
		cstmt.setString(6, dm.request_dt);
		cstmt.setString(7, dm.result_dt);
		cstmt.setString(8, dm.aplc_clsf);
		cstmt.setString(9, dm.cmsstatus);
		cstmt.setString(10, dm.proof_stat);
		cstmt.setString(11, dm.result_stat);
		cstmt.setString(12, dm.search_clsf);
		cstmt.setString(13, dm.search_nm);
		cstmt.setString(14, dm.errorcode);
		cstmt.registerOutParameter(15, Types.INTEGER);
		cstmt.registerOutParameter(16, Types.INTEGER);
		cstmt.registerOutParameter(17, Types.INTEGER);
		cstmt.registerOutParameter(18, Types.INTEGER);
		cstmt.registerOutParameter(19, Types.INTEGER);
		cstmt.registerOutParameter(20, Types.INTEGER);
		cstmt.registerOutParameter(21, Types.INTEGER);
		cstmt.registerOutParameter(22, Types.INTEGER);
		cstmt.registerOutParameter(23, Types.INTEGER);
		cstmt.registerOutParameter(24, Types.INTEGER);
		cstmt.registerOutParameter(25, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.tn.lnk.ds.TN_LNK_2020_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("cmsidx = [" + getCmsidx() + "]");
		System.out.println("aplc_path = [" + getAplc_path() + "]");
		System.out.println("request_dt = [" + getRequest_dt() + "]");
		System.out.println("result_dt = [" + getResult_dt() + "]");
		System.out.println("aplc_clsf = [" + getAplc_clsf() + "]");
		System.out.println("cmsstatus = [" + getCmsstatus() + "]");
		System.out.println("proof_stat = [" + getProof_stat() + "]");
		System.out.println("result_stat = [" + getResult_stat() + "]");
		System.out.println("search_clsf = [" + getSearch_clsf() + "]");
		System.out.println("search_nm = [" + getSearch_nm() + "]");
		System.out.println("errorcode = [" + getErrorcode() + "]");
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
String cmsidx = req.getParameter("cmsidx");
if( cmsidx == null){
	System.out.println(this.toString+" : cmsidx is null" );
}else{
	System.out.println(this.toString+" : cmsidx is "+cmsidx );
}
String aplc_path = req.getParameter("aplc_path");
if( aplc_path == null){
	System.out.println(this.toString+" : aplc_path is null" );
}else{
	System.out.println(this.toString+" : aplc_path is "+aplc_path );
}
String request_dt = req.getParameter("request_dt");
if( request_dt == null){
	System.out.println(this.toString+" : request_dt is null" );
}else{
	System.out.println(this.toString+" : request_dt is "+request_dt );
}
String result_dt = req.getParameter("result_dt");
if( result_dt == null){
	System.out.println(this.toString+" : result_dt is null" );
}else{
	System.out.println(this.toString+" : result_dt is "+result_dt );
}
String aplc_clsf = req.getParameter("aplc_clsf");
if( aplc_clsf == null){
	System.out.println(this.toString+" : aplc_clsf is null" );
}else{
	System.out.println(this.toString+" : aplc_clsf is "+aplc_clsf );
}
String cmsstatus = req.getParameter("cmsstatus");
if( cmsstatus == null){
	System.out.println(this.toString+" : cmsstatus is null" );
}else{
	System.out.println(this.toString+" : cmsstatus is "+cmsstatus );
}
String proof_stat = req.getParameter("proof_stat");
if( proof_stat == null){
	System.out.println(this.toString+" : proof_stat is null" );
}else{
	System.out.println(this.toString+" : proof_stat is "+proof_stat );
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
String errorcode = req.getParameter("errorcode");
if( errorcode == null){
	System.out.println(this.toString+" : errorcode is null" );
}else{
	System.out.println(this.toString+" : errorcode is "+errorcode );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String cmsidx = Util.checkString(req.getParameter("cmsidx"));
String aplc_path = Util.checkString(req.getParameter("aplc_path"));
String request_dt = Util.checkString(req.getParameter("request_dt"));
String result_dt = Util.checkString(req.getParameter("result_dt"));
String aplc_clsf = Util.checkString(req.getParameter("aplc_clsf"));
String cmsstatus = Util.checkString(req.getParameter("cmsstatus"));
String proof_stat = Util.checkString(req.getParameter("proof_stat"));
String result_stat = Util.checkString(req.getParameter("result_stat"));
String search_clsf = Util.checkString(req.getParameter("search_clsf"));
String search_nm = Util.checkString(req.getParameter("search_nm"));
String errorcode = Util.checkString(req.getParameter("errorcode"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String cmsidx = Util.Uni2Ksc(Util.checkString(req.getParameter("cmsidx")));
String aplc_path = Util.Uni2Ksc(Util.checkString(req.getParameter("aplc_path")));
String request_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("request_dt")));
String result_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("result_dt")));
String aplc_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("aplc_clsf")));
String cmsstatus = Util.Uni2Ksc(Util.checkString(req.getParameter("cmsstatus")));
String proof_stat = Util.Uni2Ksc(Util.checkString(req.getParameter("proof_stat")));
String result_stat = Util.Uni2Ksc(Util.checkString(req.getParameter("result_stat")));
String search_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("search_clsf")));
String search_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("search_nm")));
String errorcode = Util.Uni2Ksc(Util.checkString(req.getParameter("errorcode")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setCmsidx(cmsidx);
dm.setAplc_path(aplc_path);
dm.setRequest_dt(request_dt);
dm.setResult_dt(result_dt);
dm.setAplc_clsf(aplc_clsf);
dm.setCmsstatus(cmsstatus);
dm.setProof_stat(proof_stat);
dm.setResult_stat(result_stat);
dm.setSearch_clsf(search_clsf);
dm.setSearch_nm(search_nm);
dm.setErrorcode(errorcode);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Oct 13 15:18:18 KST 2016 */