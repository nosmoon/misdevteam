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


public class TN_LNK_2030_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String aplc_clsf;
	public String cmsstatus;
	public String proof_stat;
	public String result_stat;
	public String search_clsf;
	public String search_nm;

	public TN_LNK_2030_LDM(){}
	public TN_LNK_2030_LDM(String cmpy_cd, String aplc_clsf, String cmsstatus, String proof_stat, String result_stat, String search_clsf, String search_nm){
		this.cmpy_cd = cmpy_cd;
		this.aplc_clsf = aplc_clsf;
		this.cmsstatus = cmsstatus;
		this.proof_stat = proof_stat;
		this.result_stat = result_stat;
		this.search_clsf = search_clsf;
		this.search_nm = search_nm;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
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

	public String getCmpy_cd(){
		return this.cmpy_cd;
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

	public String getSQL(){
		 return "{ call MISTNN.SP_TN_LNK_2030_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		TN_LNK_2030_LDM dm = (TN_LNK_2030_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.aplc_clsf);
		cstmt.setString(5, dm.cmsstatus);
		cstmt.setString(6, dm.proof_stat);
		cstmt.setString(7, dm.result_stat);
		cstmt.setString(8, dm.search_clsf);
		cstmt.setString(9, dm.search_nm);
		cstmt.registerOutParameter(10, Types.INTEGER);
		cstmt.registerOutParameter(11, Types.INTEGER);
		cstmt.registerOutParameter(12, Types.INTEGER);
		cstmt.registerOutParameter(13, Types.INTEGER);
		cstmt.registerOutParameter(14, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.tn.lnk.ds.TN_LNK_2030_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("aplc_clsf = [" + getAplc_clsf() + "]");
		System.out.println("cmsstatus = [" + getCmsstatus() + "]");
		System.out.println("proof_stat = [" + getProof_stat() + "]");
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String aplc_clsf = Util.checkString(req.getParameter("aplc_clsf"));
String cmsstatus = Util.checkString(req.getParameter("cmsstatus"));
String proof_stat = Util.checkString(req.getParameter("proof_stat"));
String result_stat = Util.checkString(req.getParameter("result_stat"));
String search_clsf = Util.checkString(req.getParameter("search_clsf"));
String search_nm = Util.checkString(req.getParameter("search_nm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String aplc_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("aplc_clsf")));
String cmsstatus = Util.Uni2Ksc(Util.checkString(req.getParameter("cmsstatus")));
String proof_stat = Util.Uni2Ksc(Util.checkString(req.getParameter("proof_stat")));
String result_stat = Util.Uni2Ksc(Util.checkString(req.getParameter("result_stat")));
String search_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("search_clsf")));
String search_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("search_nm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setAplc_clsf(aplc_clsf);
dm.setCmsstatus(cmsstatus);
dm.setProof_stat(proof_stat);
dm.setResult_stat(result_stat);
dm.setSearch_clsf(search_clsf);
dm.setSearch_nm(search_nm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jul 14 16:29:09 KST 2016 */